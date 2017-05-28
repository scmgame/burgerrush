/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.modelMain;
import views.viewAbout;
import views.viewMain;
import views.viewPlay;

/**
 *
 * @author ANGGAA
 */
public class controllerPlay {
    
    private viewPlay theView;

    public controllerPlay(viewPlay theView) {
        this.theView = theView;
        theView.setVisible(true);
        
        theView.addExitListener(new exitListener());
        theView.addAboutListener(new aboutListener());
        theView.addPlayListener(new playListener());
    }

    private class playListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerMain(new modelMain(), new viewMain(),25,20,25,20);
            theView.dispose();
        }

    }

    private class aboutListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerAbout(new viewAbout());
            theView.dispose();
        }
    }

    private class exitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);      
        }
    }
    
    
}
