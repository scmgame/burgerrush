/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ANGGAA
 */
public class modelToko {
    
    public double[] forecastingBeefBurger(double permintaan, double ramalan) {
        modelBurgerBeef forecastBeef = new modelBurgerBeef();
        return forecastBeef.forecasting(permintaan, ramalan);
    }

    public double[] forecastingVegetablesBurger(double permintaan, double ramalan) {
        modelBurgerVegetables forecastVegetables = new modelBurgerVegetables();
        return forecastVegetables.forecasting(permintaan, ramalan);
    }
}
