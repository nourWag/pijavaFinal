package com.esprit.GUI;
import com.esprit.adapters.BoutiqueAdapter;
import com.esprit.IDAO.BoutiqueDao;
import com.esprit.IDAO.IDao;
import com.esprit.entites.Boutique;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author pc
 */

public class Page_resp_2 extends javax.swing.JFrame {
    /**
     * Creates new form DisplayBoutique
     */
    public Page_resp_2() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boutique = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boutique.setModel(new BoutiqueAdapter()
        );
        boutique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutiqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(boutique);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 480, 230));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 128, 47));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 401, 200, 30));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 164, 200, 20));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 200, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 200, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 200, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 200, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 160, 40));

        jButton4.setBackground(new java.awt.Color(255, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 100, 50));

        jButton3.setMaximumSize(new java.awt.Dimension(27, 27));
        jButton3.setMinimumSize(new java.awt.Dimension(27, 27));
        jButton3.setPreferredSize(new java.awt.Dimension(27, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, 49));

        jLabel2.setText("nom:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel3.setText("categorie");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel4.setText("Fax:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel5.setText("num_tel");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel7.setText("Promotion:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/resp2.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, 566));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //        Boutique depot = new Boutique();
        //        BoutiqueDao depotDao = new BoutiqueDao();
        //        depotDao.delete(jTextField1.getText());

        BoutiqueDao agdao = new BoutiqueDao();
        new BoutiqueDao().removeById(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        boutique.setModel(new BoutiqueAdapter());
        JOptionPane.showMessageDialog(null, "Agent supprimé avec succes", ":D", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Boutique depot = new Boutique();
        depot.setId(Integer.parseInt(boutique.getValueAt(boutique.getSelectedRow(), 0).toString()));
        depot.setNom(jTextField2.getText());
        depot.setCategorie(jTextField3.getText());
        depot.setFax(jTextField4.getText());
        depot.setNumero_telephone(jTextField5.getText());
        depot.setEmail(jTextField6.getText());
        depot.setPromotion(jTextField7.getText());
        System.out.println(depot);
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.update1(depot);
    //JOptionPane.showMessageDialog(null, "Agent supprimé avec succes", ":D", JOptionPane.INFORMATION_MESSAGE);
   new Page_resp_2().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void boutiqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutiqueMouseClicked
 int row=boutique.getSelectedRow();
       String Table_click1=boutique.getModel().getValueAt(row, 0).toString();
       String Table_click2=boutique.getModel().getValueAt(row, 1).toString();
       String Table_click3=boutique.getModel().getValueAt(row, 2).toString();
       String Table_click4=boutique.getModel().getValueAt(row, 3).toString();
       String Table_click5=boutique.getModel().getValueAt(row, 4).toString();
       String Table_click6=boutique.getModel().getValueAt(row, 5).toString();
       String Table_click7=boutique.getModel().getValueAt(row, 6).toString();
      // System.out.println(Table_click1+""+Table_click2+""+Table_click3);
        IDao p=new BoutiqueDao();
//        int Table_click5=Integer.parseInt(produit.getModel().getValueAt(row,5).toString());
//        //categ.setText(String.valueOf(p.findById2(Table_click5)));
//         jLabel7.setText(String.valueOf(p.findById2(Table_click5))); 
        //jTextField1.setText(Table_click1);
        jTextField2.setText(Table_click2);
        jTextField3.setText(Table_click3);
        jTextField4.setText(Table_click4);
        jTextField5.setText(Table_click5);
        jTextField6.setText(Table_click6);
        jTextField7.setText(Table_click7);
    }//GEN-LAST:event_boutiqueMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Boutique depot = new Boutique();
        depot.setNom(jTextField2.getText());
        depot.setCategorie(jTextField3.getText());
        depot.setFax(jTextField4.getText());
        depot.setNumero_telephone(jTextField5.getText());
        depot.setEmail(jTextField6.getText());
        depot.setPromotion(jTextField7.getText());
        BoutiqueDao depotDao = new BoutiqueDao();
        depotDao.insert(depot);
         new Page_resp_2().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
//              }
             UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            } 
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Page_resp_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_resp_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_resp_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_resp_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Page_resp_2 es=new Page_resp_2();
                es.setSize(1308,566);
                es.setLocationRelativeTo(null);
                es.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable boutique;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
