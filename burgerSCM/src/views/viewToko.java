/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ANGGAA
 */
public class viewToko extends javax.swing.JFrame {

    /**
     * Creates new form viewMain
     */
    public viewToko() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.btnOK.setOpaque(false);
        this.btnOK.setContentAreaFilled(false);
        this.btnOK.setBorderPainted(false);
        
    }

    public void setTxtBurgerDaging(int BurgerDaging) {
        this.txtBurgerDaging.setText(String.valueOf(BurgerDaging));
    }

    public void setTxtBurgerSayur(int BurgerSayur) {
        this.txtBurgerSayur.setText(String.valueOf(BurgerSayur));
    }
    
    public void addPenjualanListener(ActionListener listener){
        this.btnPenjualan.addActionListener(listener);
    }
    
    public void addDagingtxtListener(KeyListener listener){
        this.txtDaging.addKeyListener((KeyListener) listener);
    }
    
    public void addSayurtxtListener(KeyListener listener){
        this.txtSayur.addKeyListener((KeyListener) listener);
    }
    
    public void addOKListener(ActionListener listener){
        this.btnOK.addActionListener(listener);
    }

    public void setLblUang(String lblUang) {
        this.lblUang.setText(lblUang);
    }

    public String getLblUang() {
        return lblUang.getText();
    }

    public void setTxtRotiDaging(String txtRotiDaging) {
        this.txtRotiDaging.setText(txtRotiDaging);
    }
    
    public void setTxtRotiSayur(String txtRotiSayur) {
        this.txtRotiSayur.setText(txtRotiSayur);
    }

    public String getTxtDaging() {
        return txtDaging.getText();
    }

    public String getTxtSayur() {
        return txtSayur.getText();
    }

    public String getTxtJumlah() {
        return txtJumlah.getText();
    }    

    public void setTxtJumlah(String txtJumlah) {
        this.txtJumlah.setText(txtJumlah);
    }
    
    
    
    //tampilkan pesan
    public void showMessage(String pesan){
        JOptionPane.showMessageDialog(this, pesan, "Pemberitahuan", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gambarForecast1 = new codingGambar.gambarForecast();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBurgerDaging = new javax.swing.JLabel();
        txtBurgerSayur = new javax.swing.JLabel();
        btnPenjualan = new javax.swing.JButton();
        txtDaging = new javax.swing.JTextField();
        txtRotiDaging = new javax.swing.JTextField();
        txtSayur = new javax.swing.JTextField();
        txtRotiSayur = new javax.swing.JTextField();
        lblUang = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        txtJumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Burger Daging");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Burger Sayur");

        txtBurgerDaging.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        txtBurgerSayur.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        btnPenjualan.setBackground(new java.awt.Color(0, 51, 255));
        btnPenjualan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        btnPenjualan.setText("Data Penjualan");

        txtRotiDaging.setEditable(false);

        txtRotiSayur.setEditable(false);

        lblUang.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        lblUang.setForeground(new java.awt.Color(204, 204, 0));

        btnOK.setOpaque(false);

        txtJumlah.setEditable(false);
        txtJumlah.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        javax.swing.GroupLayout gambarForecast1Layout = new javax.swing.GroupLayout(gambarForecast1);
        gambarForecast1.setLayout(gambarForecast1Layout);
        gambarForecast1Layout.setHorizontalGroup(
            gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gambarForecast1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gambarForecast1Layout.createSequentialGroup()
                        .addComponent(btnPenjualan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(gambarForecast1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtBurgerSayur, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gambarForecast1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(txtBurgerDaging, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gambarForecast1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))))
                    .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDaging, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtRotiDaging)
                    .addComponent(txtRotiSayur)
                    .addComponent(txtSayur))
                .addGap(23, 23, 23))
            .addGroup(gambarForecast1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblUang, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gambarForecast1Layout.setVerticalGroup(
            gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gambarForecast1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gambarForecast1Layout.createSequentialGroup()
                        .addComponent(lblUang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnPenjualan)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBurgerDaging, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBurgerSayur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSayur, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtRotiSayur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gambarForecast1Layout.createSequentialGroup()
                        .addComponent(txtDaging, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gambarForecast1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRotiDaging, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gambarForecast1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(gambarForecast1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambarForecast1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gambarForecast1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewToko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPenjualan;
    private codingGambar.gambarForecast gambarForecast1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblUang;
    private javax.swing.JLabel txtBurgerDaging;
    private javax.swing.JLabel txtBurgerSayur;
    private javax.swing.JTextField txtDaging;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtRotiDaging;
    private javax.swing.JTextField txtRotiSayur;
    private javax.swing.JTextField txtSayur;
    // End of variables declaration//GEN-END:variables
}
