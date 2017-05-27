/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANGGAA
 */
public class modelPenjualan {
    
    
    public DefaultTableModel getTableModelBeef(ArrayList<Integer> beef){
        Object[] header = {"Permintaan"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);
        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        
        String kolom[] = new String[1];
        for (int i = 0; i < beef.size(); i++) {
            kolom[i] = String.valueOf(beef.get(i));
        }
        
        tableModel.addRow(kolom);
       
        return tableModel;
    }
    
    public DefaultTableModel getTableModelVegetables(ArrayList<Integer> vegetables){
        Object[] header = {"Permintaan"};
        DefaultTableModel tableModel = new DefaultTableModel(null, header);
        
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
        
        String kolom[] = new String[1];
        for (int i = 0; i < vegetables.size(); i++) {
            kolom[i] = String.valueOf(vegetables.get(i));
        }
        
        tableModel.addRow(kolom);
       
        return tableModel;
    }
}
