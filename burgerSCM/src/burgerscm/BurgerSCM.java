/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgerscm;

import controllers.controllerMain;
import javax.swing.UnsupportedLookAndFeelException;
import models.modelMain;
import views.viewMain;

/**
 *
 * @author ANGGAA
 */
public class BurgerSCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        new controllerMain(new modelMain(), new viewMain(),25,20);
    }
    
}
