/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author ANGGAA
 */
public class modelBurgerVegetables extends BaseModel{

    @Override
    protected double[] forecasting(double permintaan, double ramalan) {
        return super.forecasting(permintaan, ramalan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected ArrayList<Integer> customer(int customer) {
        return super.customer(customer); //To change body of generated methods, choose Tools | Templates.
    }
    
}
