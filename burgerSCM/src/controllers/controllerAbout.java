/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.viewAbout;
import views.viewPlay;

/**
 *
 * @author ANGGAA
 */
public class controllerAbout {
    
    private viewAbout theView;

    public controllerAbout(viewAbout theView) {
        this.theView = theView;
        theView.setVisible(true);
        
        theView.addOKListener(new aboutListener());
    }

    private class aboutListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            new controllerPlay(new viewPlay());
            theView.dispose();
        }
    }
    
    
}
