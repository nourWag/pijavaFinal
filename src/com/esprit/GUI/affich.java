/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;

import com.esprit.DAO.livraisonfDAO;
import com.esprit.entites.liraisonf;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Util;

import java.awt.BorderLayout;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import wshop.mail.MailJframe;
/**
 *
 * @author lenovo
 */
public class affich extends javax.swing.JFrame {
//    private Object nom;
//    private Object prenom;
//    private Object adr;
//    private  Object tel;
    protected static int id_modif;
    protected static String nom1;
    protected static String prenom1;
    protected static String adresse1;
    protected static String telephone1;
    private Object panel;
    

    /**
     * Creates new form affich
     */
    public affich() {
         initComponents();
         findPropriete();
       
    }
     public Connection getConnection() { 
        Connection con = null;
        try{ 
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdtunisiamall","root","");
        }catch(Exception ex){ System.out.println(ex.getMessage()); } 
        return con; }
    
     public ArrayList<liraisonf> ListUsers(String ValToSearch) { 
        ArrayList<liraisonf> usersList = new ArrayList<liraisonf>();
        Statement st; 
        ResultSet rs; 
        try{ Connection con = getConnection(); 
        st = con.createStatement(); 
        String searchQuery = "SELECT `id`, `Nom`,`Prenom`,`Adresse`,`Telephone` FROM `liraisonf` WHERE CONCAT(`id`, `Nom`,  `Prenom`,`Adresse`,`Telephone`) LIKE '%"+ValToSearch+"%'"; 
        rs = st.executeQuery(searchQuery);
        liraisonf user; 
        /*Propriete p =new Propriete();
        int id_prop;
       id_prop =p.getIdprop();*/
        while(rs.next()) { 
            user = new liraisonf ( rs.getInt("id"), rs.getString("Nom"), rs.getString("Prenom"),rs.getString("Adresse"),rs.getString("Telephone"));
            usersList.add(user); } }
        catch(Exception ex){ System.out.println(ex.getMessage()); } 
        return usersList; 
    }
    
     public void findPropriete() { 
        ArrayList<liraisonf> users = ListUsers(jText_Search.getText());
        DefaultTableModel model = new DefaultTableModel(); 
        model.setColumnIdentifiers(new Object[]{"Nom","Prenom","Adresse","Telephone"});
        Object[] row = new Object[6];
        for(int i = 0; i < users.size(); i++) {
//            row[0] = users.get(i).getId();
            row[0] = users.get(i).getNom(); 
          
            row[1] = users.get(i).getPrenom(); 
            row[2] = users.get(i).getAdresse();
            row[3] = users.get(i).getTelephone();
//        
            model.addRow(row); }
        jTable3.setModel(model); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rechercher = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        mail = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jText_Search = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rechercher.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        rechercher.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\sprintjava\\pidevimen\\icons\\search_32x32.png")); // NOI18N
        rechercher.setText("Rechercher");
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });
        getContentPane().add(rechercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 150, 30));

        Supprimer.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/panier-supprimer-icone-4936-32.png"))); // NOI18N
        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(Supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 150, 30));

        Retour.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Retour.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\sprintjava\\pidevimen\\icons\\Icons\\PNG\\32x32\\consutArbitre.png")); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 150, 30));

        mail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        mail.setText("Send Mail");
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 100, -1));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping_basket_accept_32.png"))); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 140, 30));
        getContentPane().add(jText_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 140, 30));

        jTable3.setModel(new Modelliraisonf()
        );
        jTable3.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable3ComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jTable3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 350, 260));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Liste des livraisons");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 450, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/slide3.gif"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setDoubleBuffered(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel2ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1200, 420));

        jPanel2.setPreferredSize(new java.awt.Dimension(1318, 566));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tunisiamall2.jpg"))); // NOI18N
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        livraisonfDAO lfDAO = new livraisonfDAO();
        if(jTable3.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner une livraison !!"
                ,"Message",JOptionPane.INFORMATION_MESSAGE);

        }
         else{
            lfDAO.deleteLivraison((String) jTable3.getValueAt(jTable3.getSelectedRow(),0));
            affich e = new affich();
            setVisible(false);
            e.setVisible(true);  
        }
    }//GEN-LAST:event_SupprimerActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
        livraisonf a = new livraisonf();
this.setVisible(false);
a.setVisible(true);
    }//GEN-LAST:event_RetourActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        // TODO add your handling code here:
        findPropriete();
    }//GEN-LAST:event_rechercherActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
livraisonfDAO lfDAO = new livraisonfDAO();
        if(jTable3.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un compte a modifier !!"
                ,"Message",JOptionPane.INFORMATION_MESSAGE);

        }
         else{
//            id_modif = (int)jTable3.getValueAt(jTable3.getSelectedRow(),0);
            nom1 = (String)jTable3.getValueAt(jTable3.getSelectedRow(),0);
            prenom1 = (String)jTable3.getValueAt(jTable3.getSelectedRow(),1);
            adresse1 = (String)jTable3.getValueAt(jTable3.getSelectedRow(),2);
            telephone1 = (String)jTable3.getValueAt(jTable3.getSelectedRow(),3);
//            password1 = (String)jTable3.getValueAt(jTable3.getSelectedRow(),5);
//            System.out.println("id = "+id_modif);
            System.out.println("nom = "+nom1);
            System.out.println("prenom = "+prenom1);
            System.out.println("adresse = "+adresse1);
            System.out.println("telephone = "+telephone1);
            
            
            livraisonf a = new livraisonf();
            setVisible(false);
            a.setVisible(true);
        }
    }                                        

    private void ActualierActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        affich a = new affich();
        setVisible(false);
        a.setVisible(true);
    }                                         

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
         livraisonfDAO lfDAO = new livraisonfDAO();
        if(jTable3.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un compte a supprimer !!"
                ,"Message",JOptionPane.INFORMATION_MESSAGE);

        }
         else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            dialogButton = JOptionPane.showConfirmDialog (null, "Vous êtes sur de vouloir supprimer?","Avertissement", dialogButton);
            if(dialogButton == JOptionPane.NO_OPTION) {
                  //remove(dialogButton);
                }
            if(dialogButton == JOptionPane.YES_OPTION) {
                lfDAO.deleteLivraison((String) jTable3.getValueAt(jTable3.getSelectedRow(),0));
                livraisonf e = new livraisonf();
                setVisible(false);
                e.setVisible(true);  
            }
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentShown

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable3ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable3ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3ComponentAdded

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
//         MailJframe forgottenEmailFrame = new MailJframe(this.email.getText());
  new MailJframe().setVisible(true);
//        MailJframe.setVisible(true);
//        MailJframe.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_mailActionPerformed

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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(affich.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               affich es=    new affich();
            es.setSize(1308,566);
          
            es.setLocationRelativeTo(null);
            
                        es.setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify 
 private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jText_Search;
    private javax.swing.JButton mail;
    private javax.swing.JButton rechercher;
    // End of variables declaration//GEN-END:variables




    
}