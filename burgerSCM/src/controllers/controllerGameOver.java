/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.viewGameOver;

/**
 *
 * @author ANGGAA
 */
public class controllerGameOver {
    
    private viewGameOver theView;

    public controllerGameOver(viewGameOver theView, String hasil) {
        this.theView = theView;
        theView.setVisible(true);
        theView.setTxtHasil(hasil);
        
        theView.addOkListener(new okListener());
    }

    private class okListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    
}
