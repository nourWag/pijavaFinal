

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.esprit.GUI;


//import static com.esprit.GUI.Authentification.personne;
import com.esprit.DAO.AdminDAO;
import com.esprit.DAO.register;
//import static com.esprit.GUI.Authentification.personne;
//import com.esprit.GUI.Form1;
//import com.esprit.GUI.Form2;
//import com.esprit.Util.Parameter;
import com.esprit.Util.db_connection;
//import com.esprit.entities.Personne;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login extends javax.swing.JFrame {
  db_connection conn=new db_connection();
     Statement stm;
    ResultSet rs;
 String   profile;
 static String a ;
     private Connection cnx;
    /**
     * Creates new form Login
     */
    public Login() {
   // String  profile = txt_mail.getText();       
   initComponents();
       profile = txt_mail.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_mail = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        register1 = new javax.swing.JButton();
        forgetpassword = new javax.swing.JButton();
        fb = new javax.swing.JButton();
        twitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 340, 50));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 340, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/layout login.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 243, 50, 30));

        register1.setText("signup");
        register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ActionPerformed(evt);
            }
        });
        getContentPane().add(register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        forgetpassword.setText("forget password");
        forgetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(forgetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 40));

        fb.setText("fb");
        fb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbActionPerformed(evt);
            }
        });
        getContentPane().add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 100, 30));

        twitter.setText("twter");
        twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twitterActionPerformed(evt);
            }
        });
        getContentPane().add(twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
          AdminDAO d = new AdminDAO();
        d.verfier_autentification(txt_mail.getText(),register.md5(txt_password.getPassword())) ;
         } catch (SQLException ex) {
            Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);}
  // d.nom(txt_mail.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register1ActionPerformed
        // TODO add your handling code here:
         Register1 r=new Register1();
            r.setVisible(true);
            this.hide();
      
    }//GEN-LAST:event_register1ActionPerformed

    private void forgetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetpasswordActionPerformed
        // TODO add your handling code here:
        Mot_passe_oublier r=new Mot_passe_oublier();
            r.setVisible(true);
            this.hide();
        
    }//GEN-LAST:event_forgetpasswordActionPerformed

    private void fbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbActionPerformed
        // TODO add your handling code here:
        String accessToken="";
System.setProperty("webdriver.chrome.driver","D:\\security\\chromedriver.exe");



        
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://graph.facebook.com/oauth/authorize?type=user_agent&client_id=182538538804902&redirect_uri=https://www.google.tn/&scope=user_about_me,"
                + "user_actions.books,user_actions.fitness,user_actions.music,user_actions.news,user_actions.video,user_activities,user_birthday,user_education_history,"
                + "user_events,user_friends,user_games_activity,user_groups,user_hometown,user_interests,user_likes,user_location,user_photos,user_relationship_details,"
                + "user_relationships,user_religion_politics,user_status,user_tagged_places,user_videos,user_website,user_work_history,ads_management,ads_read,email,"
                + "manage_notifications,manage_pages,publish_actions,read_friendlists,read_insights,read_mailbox,read_page_mailboxes,read_stream,rsvp_event");
        
        
        
        while(true){
        if(!driver.getCurrentUrl().contains("facebook.com")){
        
        String url = driver.getCurrentUrl();
        int state =0;
        for(int i = 0 ;i<url.length();i++){
        
            switch(state){
            case(0):{
            if(url.charAt(i)=='='){ state = 1; } 
            } break;
            case(1):{
                
            if(url.charAt(i)=='&'){ state = 2; }
            else{ accessToken+=url.charAt(i); }
            
            }break;
            case(2):{ }break;
            }
            
        }
        
        driver.quit();
        System.out.println(accessToken);
        
        FacebookClient fbClient = new DefaultFacebookClient(accessToken);

        User me = fbClient.fetchObject("me",User.class);
        
      
          txt_password.setText(me.getName()); 
          txt_mail.setText(me.getId());
          
        
        
        }
        }
        
        
        
        
        
    }//GEN-LAST:event_fbActionPerformed

    private void twitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twitterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twitterActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed
  public String mailprofil(){


return a;
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
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fb;
    private javax.swing.JButton forgetpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton register1;
    private javax.swing.JButton twitter;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
