/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Modele;



import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Client
 */
public class Vehicule extends javax.swing.JFrame {

    java.sql.Connection con;
PreparedStatement pst ;
ResultSet rs;
    public Vehicule() {
        initComponents();
    }
    
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitre = new javax.swing.JLabel();
        jLabelcouleur = new javax.swing.JLabel();
        jLabelnbcylindre = new javax.swing.JLabel();
        jLabelmarque = new javax.swing.JLabel();
        jLabelnummat = new javax.swing.JLabel();
        jTextFieldnummat = new javax.swing.JTextField();
        jTextFieldcouleur = new javax.swing.JTextField();
        jTextFieldnbcylindre = new javax.swing.JTextField();
        jTextFieldmarque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonmodifier = new javax.swing.JButton();
        jButtonsupprimer = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();
        jButtonajouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabeltitre.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabeltitre.setForeground(new java.awt.Color(255, 153, 153));
        jLabeltitre.setText("fiche vehicule");

        jLabelcouleur.setText("couleur                :");

        jLabelnbcylindre.setText("nombre de cylindre   :");

        jLabelmarque.setText("marque          :");

        jLabelnummat.setText("numéro matricule           :");

        jTextFieldcouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcouleurActionPerformed(evt);
            }
        });

        jTextFieldnbcylindre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnbcylindreActionPerformed(evt);
            }
        });

        jTextFieldmarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmarqueActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "matriqule", "couleur", "nbcylindre", "couleur"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonmodifier.setText("modifier");
        jButtonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodifierActionPerformed(evt);
            }
        });

        jButtonsupprimer.setText("supprimer");
        jButtonsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsupprimerActionPerformed(evt);
            }
        });

        jButtonexit.setText("fermer");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });

        jButtonajouter.setText("ajouter");
        jButtonajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonajouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonsupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelmarque, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldmarque, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelnummat, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldnummat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabeltitre, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelnbcylindre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnbcylindre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabeltitre, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnummat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnummat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnbcylindre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldnbcylindre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmarque, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldmarque, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcouleurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcouleurActionPerformed

    private void jTextFieldnbcylindreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnbcylindreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnbcylindreActionPerformed

    private void jTextFieldmarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldmarqueActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
        Vehicule.super.dispose();
        MenuePrincipale men=new MenuePrincipale ();
        men.setVisible(true);
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jButtonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonajouterActionPerformed
     try{  
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false","root","admin");
String sql= "insert into vehicule(matriqule,couleur,nbcylindre,marque)values (?,?,?,?) ";
pst=con.prepareStatement (sql);
pst.setString(1,jTextFieldnummat.getText());
pst.setString(2,jTextFieldcouleur.getText());
pst.setString(3,jTextFieldnbcylindre.getText());
pst.setString(4,jTextFieldmarque.getText());
pst.execute();
con.close();
JOptionPane.showMessageDialog(null, "véhicule bien  ajouter");
}catch (Exception e){
JOptionPane.showMessageDialog(null, "erreur ici" +e.getMessage());}

    }//GEN-LAST:event_jButtonajouterActionPerformed

    private void jButtonsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsupprimerActionPerformed
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false","root","admin");
String sql= "DELETE FROM vehicule WHERE matriqule=? AND couleur=? AND nbcylindre=? AND marque=?";
pst=con.prepareStatement (sql);
pst.setString(1,jTextFieldnummat.getText());
pst.setString(2,jTextFieldcouleur.getText());
pst.setString(3,jTextFieldnbcylindre.getText());
pst.setString(4,jTextFieldmarque.getText());
int rowsDeleted = pst.executeUpdate();
con.close();
if (rowsDeleted > 0) {
JOptionPane.showMessageDialog(null, "La ligne a été supprimée avec succès.");
} else {
JOptionPane.showMessageDialog(null, "Aucune ligne n'a été supprimée.");
}
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "erreur ici" +e.getMessage());
}    }//GEN-LAST:event_jButtonsupprimerActionPerformed

    private void jButtonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodifierActionPerformed
try{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/voiture?autoReconnect=true&useSSL=false","root","admin");
String sql= "UPDATE vehicule SET couleur=?, nbcylindre=?, marque=? WHERE matriqule=?";
pst=con.prepareStatement (sql);
pst.setString(1,jTextFieldcouleur.getText());
pst.setString(2,jTextFieldnbcylindre.getText());
pst.setString(3,jTextFieldmarque.getText());
pst.setString(4,jTextFieldnummat.getText());
int rowsUpdated = pst.executeUpdate();
con.close();
if (rowsUpdated > 0) {
JOptionPane.showMessageDialog(null, "La ligne a été modifiée avec succès.");
} else {
JOptionPane.showMessageDialog(null, "Aucune ligne n'a été modifiée.");
}
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "erreur ici" +e.getMessage());
}    }//GEN-LAST:event_jButtonmodifierActionPerformed

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
            java.util.logging.Logger.getLogger(Vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonajouter;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonmodifier;
    private javax.swing.JButton jButtonsupprimer;
    private javax.swing.JLabel jLabelcouleur;
    private javax.swing.JLabel jLabelmarque;
    private javax.swing.JLabel jLabelnbcylindre;
    private javax.swing.JLabel jLabelnummat;
    private javax.swing.JLabel jLabeltitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldcouleur;
    private javax.swing.JTextField jTextFieldmarque;
    private javax.swing.JTextField jTextFieldnbcylindre;
    private javax.swing.JTextField jTextFieldnummat;
    // End of variables declaration//GEN-END:variables

    
    }

   


