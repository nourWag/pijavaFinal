/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.GUI;



import com.esprit.DAO.livraisonfDAO;
import static com.esprit.GUI.affich.adresse1;
import static com.esprit.GUI.affich.telephone1;
import com.esprit.entites.liraisonf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author lenovo
 */
public class livraisonf extends javax.swing.JFrame {
protected static int id_modif;
    protected static String nom1;
    protected static String prenom1;
    protected static String username1;
    protected static String email1;
    protected static String password1;
    /**
     * Creates new form livraisonf
     */
    public livraisonf() {
        initComponents();
    }
private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
//        2.setText(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
   
        //combo1.setSelectedItem(jTable4.getValueAt(jTable4.getSelectedRow(), 8).toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        quitter = new javax.swing.JButton();
        choix = new javax.swing.JComboBox();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        adr = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modifier = new javax.swing.JButton();
        Afficher = new javax.swing.JButton();
        Ajout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionForeground"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(null);

        quitter.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/quitter.png"))); // NOI18N
        quitter.setText("quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        jPanel5.add(quitter);
        quitter.setBounds(950, 390, 110, 30);

        choix.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        choix.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "à domicile", "dans le Mall", " " }));
        choix.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choixItemStateChanged(evt);
            }
        });
        choix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixActionPerformed(evt);
            }
        });
        jPanel5.add(choix);
        choix.setBounds(910, 190, 130, 30);

        type.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        type.setText("Type:");
        jPanel5.add(type);
        type.setBounds(820, 200, 46, 25);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Nom :");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });
        jPanel5.add(jLabel1);
        jLabel1.setBounds(670, 60, 57, 25);

        nom.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                nomComponentShown(evt);
            }
        });
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel5.add(nom);
        nom.setBounds(760, 60, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Prenom:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(660, 130, 73, 25);

        prenom.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                prenomComponentShown(evt);
            }
        });
        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel5.add(prenom);
        prenom.setBounds(760, 120, 100, 30);

        adr.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adrComponentShown(evt);
            }
        });
        adr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrActionPerformed(evt);
            }
        });
        jPanel5.add(adr);
        adr.setBounds(1020, 120, 100, 30);

        tel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                telComponentShown(evt);
            }
        });
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel5.add(tel);
        tel.setBounds(1020, 60, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setText("Telephone:");
        jLabel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel4ComponentShown(evt);
            }
        });
        jPanel5.add(jLabel4);
        jLabel4.setBounds(880, 60, 94, 25);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setText("Adresse:");
        jLabel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel3ComponentShown(evt);
            }
        });
        jPanel5.add(jLabel3);
        jLabel3.setBounds(900, 120, 70, 25);

        modifier.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping_basket_accept_32.png"))); // NOI18N
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        jPanel5.add(modifier);
        modifier.setBounds(620, 390, 130, 30);

        Afficher.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Afficher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/voir.png"))); // NOI18N
        Afficher.setText("Afficher");
        Afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficherActionPerformed(evt);
            }
        });
        jPanel5.add(Afficher);
        Afficher.setBounds(790, 390, 110, 30);

        Ajout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Ajout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ajouter-icone-5107-32.png"))); // NOI18N
        Ajout.setText("Ajouter");
        Ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutActionPerformed(evt);
            }
        });
        jPanel5.add(Ajout);
        Ajout.setBounds(435, 390, 140, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/slide3.gif"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel7.setMaximumSize(new java.awt.Dimension(1432, 986));
        jLabel7.setMinimumSize(new java.awt.Dimension(1436, 986));
        jPanel5.add(jLabel7);
        jLabel7.setBounds(0, 0, 1530, 1000);
        jLabel7.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 1170, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tunisiamall2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        liraisonf p = new liraisonf();
        livraisonfDAO dao = new livraisonfDAO();

        //        p.setId(id.getInt());
        p.setNom(prenom.getText());
        p.setPrenom(nom.getText());
        p.setAdresse(adr.getText());
        p.setTelephone(tel.getText());

        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING", dialogButton);
        if(dialogButton == JOptionPane.NO_OPTION) {
            //remove(dialogButton);
        }
        if(dialogButton == JOptionPane.YES_OPTION) {
            dao.updatelivraison(p, id_modif);

            JOptionPane.showMessageDialog(null, "Votre compte a été modifié avec succés!"
                ,"Félicitations",JOptionPane.INFORMATION_MESSAGE);

            affich e = new affich();
            setVisible(false);
            e.setVisible(true);
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void AjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutActionPerformed
        // TODO add your handling code here:
        liraisonf l = new liraisonf();
        l.setNom(prenom.getText());
        l.setPrenom(nom.getText());
        l.setAdresse(adr.getText());
        l.setTelephone(tel.getText());

        livraisonfDAO lo = new livraisonfDAO();
        lo.insertLivraison(l);
    }//GEN-LAST:event_AjoutActionPerformed

    private void AfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficherActionPerformed
        // TODO add your handling code here:
        //         affichecommande a = new affichecommande();
        affich a = new affich();
        setVisible(false);
        a.setVisible(true);

    }//GEN-LAST:event_AfficherActionPerformed

    private void jLabel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel3ComponentShown
        // TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_jLabel3ComponentShown

    private void jLabel4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel4ComponentShown
        // TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_jLabel4ComponentShown

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void telComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_telComponentShown
        // TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_telComponentShown

    private void adrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrActionPerformed

    private void adrComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adrComponentShown
        // TODO add your handling code here:
        //              prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_adrComponentShown

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_prenomActionPerformed

    private void prenomComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_prenomComponentShown
        // TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_prenomComponentShown

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nomActionPerformed

    private void nomComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_nomComponentShown
        //         TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_nomComponentShown

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
        ////        // TODO add your handling code here:
        prenom.setText((String)prenom1);
        nom.setText((String)nom1);
        adr.setText((String)adresse1);
        tel.setText((String)telephone1);
    }//GEN-LAST:event_jLabel1ComponentShown

    private void choixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choixActionPerformed

    private void choixItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choixItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_choixItemStateChanged

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitterActionPerformed
 
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
            java.util.logging.Logger.getLogger(livraisonf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(livraisonf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(livraisonf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(livraisonf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  livraisonf es1=    new livraisonf();
            es1.setSize(1308,566);
          
            es1.setLocationRelativeTo(null);
            
                        es1.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afficher;
    private javax.swing.JButton Ajout;
    private javax.swing.JTextField adr;
    private javax.swing.JComboBox choix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JButton quitter;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
