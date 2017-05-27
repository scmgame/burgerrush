/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import models.modelMain;
import models.modelToko;
import views.viewMain;
import views.viewToko;

/**
 *
 * @author ANGGAA
 */
public class controllerMain {
    
    private modelMain theModel;
    private viewMain theView;
    public static double permintaanBeef = 0;
    public static double ramalanBeef = 0;
    private int customersplitBeef[];
    private int jumlahcustomerBeef = 0;
    
     public static double permintaanVegetables = 0;
    public static double ramalanVegetables = 0;
    private int customersplitVegetables[];
    private int jumlahcustomerVegetables = 0;
    
    public static double uangcustomer = 0.00;

    public controllerMain(modelMain theModel, viewMain theView, double permintaan, double ramalan) {
        this.theModel = theModel;
        this.theView = theView;
        this.jumlahcustomerBeef = jumlahcustomerBeef;
        this.customersplitBeef = customersplitBeef;
        this.jumlahcustomerVegetables = jumlahcustomerVegetables;
        this.customersplitVegetables = customersplitVegetables;
        
        theView.setVisible(true);
        theView.disableBuyStock(false);
        theView.showMessage("Selamat Bermain"+"\n"+"Penghasilan anda Rp0,00");
        theView.setUang(0.00);
        theView.addBuyListener(new buyListener());
        theView.addBeefListener(new beefListener());
        theView.addVegetablesListener(new vegetablesListener());
        
        //=================Burger Beef=====================//
        for (double a : theModel.forecastingBeefBurger(permintaan,ramalan)) {
            if (permintaanBeef == 0) {
                this.permintaanBeef = a;
                theModel.setDataBeef((int) a);
            }else if (ramalanBeef == 0){
                this.ramalanBeef = a;
            }
        }
        
        System.out.println(this.permintaanBeef);
        
        ArrayList<Integer> randomcustomerBeef = theModel.customerBeefBurger((int) this.permintaanBeef);
        
        this.jumlahcustomerBeef = randomcustomerBeef.size();
        this.customersplitBeef = new int[randomcustomerBeef.size()];
        
        for (int i = 0; i < randomcustomerBeef.size(); i++) {
            customersplitBeef[i] = randomcustomerBeef.get(i);
        }
        
        for (int a : customersplitBeef) {
            System.out.println(a);
        }
        
        theView.setBeef(customersplitBeef[jumlahcustomerBeef-1]);
        
        System.out.print("sekarang => "+jumlahcustomerBeef);
        
        //===============================================//
        
        
        //=================Burger Vegetables=====================//
        for (double a : theModel.forecastingBeefBurger(permintaan,ramalan)) {
            if (permintaanVegetables == 0) {
                this.permintaanVegetables = a;
                theModel.setDataVegetables((int) a);
            }else if (ramalanVegetables == 0){
                this.ramalanVegetables = a;
            }
        }
        
        System.out.println(this.permintaanVegetables);
        
        ArrayList<Integer> randomcustomerVegetables = theModel.customerBeefBurger((int) this.permintaanVegetables);
        
        this.jumlahcustomerVegetables = randomcustomerVegetables.size();
        this.customersplitVegetables = new int[randomcustomerVegetables.size()];
        
        for (int i = 0; i < randomcustomerVegetables.size(); i++) {
            customersplitVegetables[i] = randomcustomerVegetables.get(i);
        }
        
        for (int a : customersplitVegetables) {
            System.out.println(a);
        }
        
        theView.setVegetables(customersplitVegetables[jumlahcustomerVegetables-1]);
        
        System.out.print("sekarang => "+jumlahcustomerVegetables);
        
        //===============================================//
    }

    private class vegetablesListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("sekarang ya => "+jumlahcustomerVegetables+"\n");
            jumlahcustomerVegetables -= 1;
            uangcustomer += (double) 40.00*customersplitVegetables[jumlahcustomerVegetables];
            if (jumlahcustomerVegetables != 0) {
                theView.setVegetables(customersplitVegetables[jumlahcustomerVegetables-1]);
                System.out.print("selanjutnya => "+jumlahcustomerVegetables+"\n");
            } else if (jumlahcustomerVegetables == 0){
                theView.disableVegetables(false);
                jumlahcustomerVegetables = 0;
                theView.showMessage("Pesanan 'Vegetables Burger' sudah habis !"+"\n"+"Penghasilan saat ini Rp"+uangcustomer+"\n Lanjutkan");
            }
            
            if (jumlahcustomerBeef <= 0 && jumlahcustomerVegetables <= 0) {
                theView.showMessage("Pesanan sudah habis !"+"\n"+"Penghasilan saat ini Rp"+uangcustomer+"\n Selanjutnya klik 'Buy Stock'");
                theView.disableBuyStock(true);
            }
            
            System.out.println(uangcustomer);
            theView.setUang((double)uangcustomer);
        }
    }

    private class beefListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("sekarang ya => "+jumlahcustomerBeef+"\n");
            jumlahcustomerBeef -= 1;
            uangcustomer += (double) 50.00*customersplitBeef[jumlahcustomerBeef];
            if (jumlahcustomerBeef != 0) {
                theView.setBeef(customersplitBeef[jumlahcustomerBeef-1]);
                System.out.print("selanjutnya => "+jumlahcustomerBeef+"\n");
            } else if (jumlahcustomerBeef == 0){
                theView.disableBeef(false);
                jumlahcustomerBeef = 0;
                theView.showMessage("Pesanan 'Beef Burger' sudah habis !"+"\n"+"Penghasilan saat ini Rp"+uangcustomer+"\n Lanjutkan");
            }
            
            if (jumlahcustomerBeef <= 0 && jumlahcustomerVegetables <= 0) {
                theView.showMessage("Pesanan sudah habis !"+"\n"+"Penghasilan saat ini Rp"+uangcustomer+"\n Selanjutnya klik 'Buy Stock'");
                theView.disableBuyStock(true);
            }
            
            System.out.println(uangcustomer);
            theView.setUang((double)uangcustomer);
            
            
        }
    }

    private class buyListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerToko(new modelToko(), new viewToko());
            theView.dispose();
        }
    }
    
    
}
