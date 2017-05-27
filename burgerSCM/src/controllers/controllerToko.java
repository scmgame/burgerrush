/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.modelPenjualan;
import models.modelToko;
import views.viewPenjualan;
import views.viewToko;

/**
 *
 * @author ANGGAA
 */
public class controllerToko {
    
    private modelToko theModel;
    private viewToko theView;

    public controllerToko(modelToko theModel, viewToko theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
        
        theView.setTxtBurgerDaging((int) controllerMain.permintaanBeef);
        theView.setTxtBurgerSayur((int) controllerMain.permintaanVegetables);
        theView.addPenjualanListener(new penjualanListener());
    }

    private class penjualanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerPenjualan(new modelPenjualan(), new viewPenjualan());
            theView.dispose();
        }
    }
    
    
}
