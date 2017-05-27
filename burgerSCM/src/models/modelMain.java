/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.controllerMain;
import java.util.ArrayList;

/**
 *
 * @author ANGGAA
 */
public class modelMain {

    public static ArrayList<Integer> beefData = new ArrayList<>();
    public static ArrayList<Integer> vegetablesData = new ArrayList<>();
    
    public double[] forecastingBeefBurger(double permintaan, double ramalan) {
        modelBurgerBeef forecastBeef = new modelBurgerBeef();
        return forecastBeef.forecasting(permintaan, ramalan);
    }

    public ArrayList<Integer> customerBeefBurger(int customer) {
        modelBurgerBeef customersBeef = new modelBurgerBeef();
        return customersBeef.customer(customer);
    }

    public double[] forecastingVegetablesBurger(double permintaan, double ramalan) {
        modelBurgerVegetables forecastVegetables = new modelBurgerVegetables();
        return forecastVegetables.forecasting(permintaan, ramalan);
    }

    public ArrayList<Integer> customerVegetablesBurger(int customer) {
        modelBurgerVegetables customerVegetables = new modelBurgerVegetables();
        return customerVegetables.customer(customer);
    }
    
    public void setDataBeef(int datapermintaan){
        this.beefData.add(datapermintaan);
    }
    
    public void setDataVegetables(int datapermintaan){
        this.vegetablesData.add(datapermintaan);
    }

}
