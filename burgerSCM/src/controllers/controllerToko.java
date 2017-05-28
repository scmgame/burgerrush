/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import models.modelMain;
import models.modelPenjualan;
import models.modelToko;
import views.viewGameOver;
import views.viewMain;
import views.viewPenjualan;
import views.viewToko;

/**
 *
 * @author ANGGAA
 */
public class controllerToko {

    private modelToko theModel;
    private viewToko theView;
    private static double uangnya = 0.00;

    public static double harga = 0.00;

    public controllerToko(modelToko theModel, viewToko theView) {
        this.theModel = theModel;
        this.theView = theView;
        this.uangnya = uangnya;
        theView.setVisible(true);

        uangnya = controllerMain.uangcustomer;
        theView.setLblUang(String.valueOf(controllerMain.uangcustomer));
        theView.setTxtBurgerDaging((int) modelMain.beefData.get(modelMain.beefData.size() - 1));
        theView.setTxtBurgerSayur((int) modelMain.vegetablesData.get(modelMain.vegetablesData.size() - 1));
        theView.addPenjualanListener(new penjualanListener());
        theView.addDagingtxtListener(new dagingListener());
        theView.addSayurtxtListener(new sayurListener());
        theView.addOKListener(new okListener());
    }

    private class okListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Double.valueOf(theView.getTxtJumlah()) >= Double.valueOf(theView.getLblUang())) {
                theView.showMessage("Maaf uang tidak mencukupi dan tidak boleh selisih 0");
            } else {
                int daging;
                int sayur;
                double permintaanBeefnew = 0.00;
                double ramalanBeefnew = 0.00;
                double permintaanVegetablesnew = 0.00;
                double ramalanVegetablesnew = 0.00;
                permintaanBeefnew = 0.00;
                ramalanBeefnew = 0.00;
                permintaanVegetablesnew = 0.00;
                ramalanVegetablesnew = 0.00;
                controllerMain.customerpermintaanBeef = 0;
                controllerMain.customerpermintaanVegetables = 0;
                try {
                    daging = Integer.valueOf(theView.getTxtDaging());
                    sayur = Integer.valueOf(theView.getTxtSayur());

                    if (daging <= 0 || sayur <= 0 || daging <= 20 || sayur <= 20) {
                        theView.showMessage("Pembelian stock daging=" + daging + "\n sayur=" + sayur + "\n tidak masuk akal");
                    } else {
                        //=====Beef Burger===//
                        for (double a : theModel.forecastingBeefBurger(controllerMain.permintaanBeef, controllerMain.ramalanBeef)) {
                            if (permintaanBeefnew == 0) {
                                permintaanBeefnew = a;
                            } else if (ramalanBeefnew == 0) {
                                ramalanBeefnew = a;
                            }
                        }

                        System.out.println(permintaanBeefnew + "," + ramalanBeefnew);

                        if (daging < permintaanBeefnew) {
                            controllerMain.customerpermintaanBeef = daging;
                            modelMain.beefData.add(daging);
                        } else {
                            controllerMain.permintaanBeef = permintaanBeefnew;
                            modelMain.beefData.add((int) permintaanBeefnew);
                            if (daging > permintaanBeefnew) {
                                controllerMain.sisarotiBeef += daging - permintaanBeefnew;
                            }
                        }

                        controllerMain.ramalanBeef = ramalanBeefnew;
                        //===================//

                        //=====Vegetables Burger===//
                        for (double a : theModel.forecastingVegetablesBurger(controllerMain.permintaanVegetables, controllerMain.ramalanVegetables)) {
                            if (permintaanVegetablesnew == 0) {
                                permintaanVegetablesnew = a;
                            } else if (ramalanBeefnew == 0) {
                                ramalanVegetablesnew = a;
                            }
                        }

                        System.out.println(permintaanVegetablesnew + "," + ramalanVegetablesnew);

                        if (sayur < permintaanVegetablesnew) {
                            controllerMain.customerpermintaanVegetables = sayur;
                            modelMain.vegetablesData.add(sayur);
                        } else {
                            controllerMain.permintaanVegetables = permintaanVegetablesnew;
                            modelMain.vegetablesData.add((int) permintaanVegetablesnew);
                            if (sayur > permintaanVegetablesnew) {
                                controllerMain.sisarotiVegetables += sayur - permintaanVegetablesnew;
                            }
                        }

                        controllerMain.ramalanVegetables = ramalanVegetablesnew;
                        //===================//

                        controllerMain.uangcustomer = uangnya - Double.valueOf(theView.getTxtJumlah());

                        //reset
                        permintaanBeefnew = 0.00;
                        ramalanBeefnew = 0.00;
                        permintaanVegetablesnew = 0.00;
                        ramalanVegetablesnew = 0.00;

                        if (controllerMain.sisarotiBeef > 10 || controllerMain.sisarotiVegetables > 10) {
                            new controllerGameOver(new viewGameOver(), "Sisa Beef Burger = " + controllerMain.sisarotiBeef + "\nSisa Vagetables Burger = " + controllerMain.sisarotiVegetables);
                            theView.dispose();
                        } else {
                            //pindah controllerMain
                            controllerMain.statustoko = true;
                            new controllerMain(new modelMain(), new viewMain(), permintaanBeefnew, ramalanBeefnew, permintaanVegetablesnew, ramalanVegetablesnew);
                            theView.dispose();
                        }

                    }
                } catch (NumberFormatException a) {
                    theView.showMessage("Inputan tidak benar");
                }
            }
        }
    }

    private class sayurListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            theView.setTxtRotiSayur(theView.getTxtSayur());
            if (theView.getTxtDaging().equalsIgnoreCase("") || theView.getTxtSayur().equalsIgnoreCase("")) {

            } else {
                try {
                    harga = (Double.valueOf(theView.getTxtSayur()) * 5 + Double.valueOf(theView.getTxtSayur()) * 6) + (Double.valueOf(theView.getTxtDaging()) * 6 + Double.valueOf(theView.getTxtDaging()) * 6);
                    theView.setTxtJumlah(String.valueOf(harga));
                } catch (NumberFormatException a) {
                    theView.showMessage("Inputkan angka dengan benar !");
                }
            }
        }

    }

    private class dagingListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            theView.setTxtRotiDaging(theView.getTxtDaging());
            if (theView.getTxtDaging().equalsIgnoreCase("") || theView.getTxtSayur().equalsIgnoreCase("")) {

            } else {
                try {
                    harga = (Double.valueOf(theView.getTxtSayur()) * 5 + Double.valueOf(theView.getTxtSayur()) * 6) + (Double.valueOf(theView.getTxtDaging()) * 6 + Double.valueOf(theView.getTxtDaging()) * 6);
                    theView.setTxtJumlah(String.valueOf(harga));
                    
                } catch (NumberFormatException a) {
                    theView.showMessage("Inputkan angka dengan benar !");
                }
            }
        }
    }

    private class penjualanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerPenjualan(new modelPenjualan(), new viewPenjualan());
            theView.dispose();
        }
    }

}
