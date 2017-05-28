/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.modelMain;
import models.modelPenjualan;
import models.modelToko;
import views.viewPenjualan;
import views.viewToko;

/**
 *
 * @author ANGGAA
 */
public class controllerPenjualan {
    
    private modelPenjualan theModel;
    private viewPenjualan theView;

    public controllerPenjualan(modelPenjualan theModel, viewPenjualan theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
        
        System.out.println(modelMain.beefData);
        System.out.println(modelMain.vegetablesData);
        
        theView.setTabelBeef(modelMain.beefData);
        theView.setTabelVegetables(modelMain.vegetablesData);
        theView.addBackListener(new backListener());
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerToko(new modelToko(), new viewToko());
            theView.dispose();
        }
    }
    
    
}
