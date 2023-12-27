/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modele;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Client
 */
public class Clients extends javax.swing.JFrame {

    

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Clients() {
     initComponents();
    
    }
     
    
   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitre = new javax.swing.JLabel();
        jLabelnumclient = new javax.swing.JLabel();
        jTextFieldnumclient = new javax.swing.JTextField();
        jLabelnom = new javax.swing.JLabel();
        jTextFieldnom = new javax.swing.JTextField();
        jLabelnumpermis = new javax.swing.JLabel();
        jTextFieldnumpermis = new javax.swing.JTextField();
        jLabeladresse = new javax.swing.JLabel();
        jTextFieldadress = new javax.swing.JTextField();
        jLabelnumtel = new javax.swing.JLabel();
        jTextFieldnumtel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonajouter = new javax.swing.JButton();
        jButtonsupprimer = new javax.swing.JButton();
        jButtonmodifier = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabeltitre.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabeltitre.setForeground(new java.awt.Color(255, 153, 153));
        jLabeltitre.setText("fiche client");

        jLabelnumclient.setText("numéro client  :");

        jLabelnom.setText("nom et prénom   :");

        jTextFieldnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnomActionPerformed(evt);
            }
        });

        jLabelnumpermis.setText("numéro permis  :");

        jLabeladresse.setText("adresse client  :");

        jLabelnumtel.setText(" numéro téléphone  :");

        jButtonajouter.setText("ajouter");
        jButtonajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonajouterActionPerformed(evt);
            }
        });

        jButtonsupprimer.setText("supprimer");
        jButtonsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsupprimerActionPerformed(evt);
            }
        });

        jButtonmodifier.setText("modifier");
        jButtonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodifierActionPerformed(evt);
            }
        });

        jButtonexit.setText("fermer");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "numclient", "nom", "numpermis", "adresse", "numtel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabeltitre, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnumclient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnumpermis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldnumpermis)
                            .addComponent(jTextFieldnom)
                            .addComponent(jTextFieldnumclient)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeladresse, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnumtel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldnumtel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldadress, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabeltitre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnumclient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnumclient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnumpermis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnumpermis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeladresse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldadress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnumtel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnumtel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        setBounds(0, 0, 779, 617);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonajouterActionPerformed
        try{  
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false","root","admin");
String sql= "insert into client(numclient,nom ,numpermis,adresse,numtel) values (?,?,?,?,?) ";
pst=con.prepareStatement (sql);
pst.setString(1,jTextFieldnumclient.getText());
pst.setString(2,jTextFieldnom.getText());
pst.setString(3,jTextFieldnumpermis.getText());
pst.setString(4,jTextFieldadress.getText());
pst.setString(5,jTextFieldnumtel.getText());
pst.execute();
con.close();

JOptionPane.showMessageDialog(null, "Client bien ajouter");
}catch (Exception e){
JOptionPane.showMessageDialog(null, "erreur ici" +e.getMessage());}
        
    }//GEN-LAST:event_jButtonajouterActionPerformed


    private void jButtonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodifierActionPerformed
try {
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false", "root", "admin");
    String sql = "UPDATE client SET nom=?, numpermis=?, adresse=?, numtel=? WHERE numclient=?";
    pst = con.prepareStatement(sql);
    pst.setString(1, jTextFieldnom.getText());
    pst.setString(2, jTextFieldnumpermis.getText());
    pst.setString(3, jTextFieldadress.getText());
    pst.setString(4, jTextFieldnumtel.getText());
    pst.setString(5, jTextFieldnumclient.getText());
    int rowsUpdated = pst.executeUpdate();
    con.close();
    if (rowsUpdated > 0) {
        JOptionPane.showMessageDialog(null, "Les informations du client ont été modifiées avec succès.");
    } else {
        JOptionPane.showMessageDialog(null, "Aucune information n'a été modifiée.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());
}    }//GEN-LAST:event_jButtonmodifierActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
       Clients.super.dispose();
       MenuePrincipale men=new MenuePrincipale();
       men.setVisible(true);
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jTextFieldnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnomActionPerformed

    private void jButtonsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsupprimerActionPerformed
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false", "root", "admin");
    String sql = "DELETE FROM client WHERE numclient=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, jTextFieldnumclient.getText());
    int rowsDeleted = pst.executeUpdate();
    con.close();
    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, "Le client a été supprimé avec succès.");
    } else {
        JOptionPane.showMessageDialog(null, "Aucun client n'a été supprimé.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Erreur: " + e.getMessage());
}    }//GEN-LAST:event_jButtonsupprimerActionPerformed
 
public void table() { // method names should start with lowercase letters, and use camelCase
    String[] client = {""}; // unnecessary array with only one empty string
    String[] ajouter = new String[4]; // should be 4 instead of 5, as only 4 columns are retrieved from the database
    DefaultTableModel model = new DefaultTableModel(null, client); // typo corrected
    try {
        Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false", "root", "admin");
       PreparedStatement pst = (PreparedStatement) con.createStatement();
        ResultSet rs = pst.executeQuery("SELECT * FROM client"); // typo corrected
        while (rs.next()) {
            ajouter[0] = Integer.toString(rs.getInt("id")); // cast int to String, and use correct column name
            ajouter[1] = rs.getString("name");
            ajouter[2] = rs.getString("address"); // corrected column name
            ajouter[3] = rs.getString("phone"); // corrected column name
            model.addRow(ajouter); // corrected method name
        }
        jTable1.setModel(model);
    } catch (Exception e) { // use more specific exception type, and print error message
        e.printStackTrace();
    }
}
    
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
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void  run() {
                new Clients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonajouter;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonmodifier;
    private javax.swing.JButton jButtonsupprimer;
    private javax.swing.JLabel jLabeladresse;
    private javax.swing.JLabel jLabelnom;
    private javax.swing.JLabel jLabelnumclient;
    private javax.swing.JLabel jLabelnumpermis;
    private javax.swing.JLabel jLabelnumtel;
    private javax.swing.JLabel jLabeltitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldadress;
    private javax.swing.JTextField jTextFieldnom;
    private javax.swing.JTextField jTextFieldnumclient;
    private javax.swing.JTextField jTextFieldnumpermis;
    private javax.swing.JTextField jTextFieldnumtel;
    // End of variables declaration//GEN-END:variables

}



