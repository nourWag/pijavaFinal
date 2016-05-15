/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;


import chart.BarChart_AWT;
import com.esprit.Util.MyConnexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;


/**
 *
 * @author Mariem
 */
public class BarChartcartefid extends javax.swing.JFrame {
 private Connection connection;
int a142,b777,c300,d120;
    /**
     * Creates new form PieChart
     */
    public BarChartcartefid() {
        initComponents();
        setSize(600,600);
    setResizable(false);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }

    public CategoryDataset createDataset() {
        // 0. Création d'un diagramme.
   
    connection = MyConnexion.getInstance();
          String requete = "SELECT COUNT(nombrePointFidele) FROM cartefidelite where nombrePointFidele='142'";
          String requete2 = "SELECT COUNT(nombrePointFidele) FROM cartefidelite where nombrePointFidele='777'";
         String requete1 = "SELECT COUNT(nombrePointFidele) FROM cartefidelite where nombrePointFidele='300'";
          String requete3 = "SELECT COUNT(nombrePointFidele) FROM cartefidelite where nombrePointFidele='120'";
             try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
           while ((resultat.next())) { a142 = resultat.getInt(1);
             }} catch (SQLException ex) {System.out.println("erreur lors du chargement des depots " + ex.getMessage());}
             try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat1 = statement.executeQuery(requete1);
           while ((resultat1.next())) {b777=resultat1.getInt(1);
             }} catch (SQLException ex) {System.out.println("erreur lors du chargement des depots " + ex.getMessage());}
       try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat1 = statement.executeQuery(requete2);
           while ((resultat1.next())) {c300=resultat1.getInt(1);
             }} catch (SQLException ex) {System.out.println("erreur lors du chargement des depots " + ex.getMessage());}
    try {
            Statement statement = connection
                    .createStatement();
            ResultSet resultat1 = statement.executeQuery(requete3);
           while ((resultat1.next())) {d120=resultat1.getInt(1);
             }} catch (SQLException ex) {System.out.println("erreur lors du chargement des depots " + ex.getMessage());}
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       //Valeurs statiques
        dataset.addValue(a142, "A", " ");
        dataset.addValue(b777, "B", " ");
         dataset.addValue(c300, "C", " ");
          dataset.addValue(d120, "D", " ");
       return dataset;
    }
	public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart3D(
                " le taux des cartes", // chart title
                "type", // domain axis label
                "  nombre", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

 final CategoryPlot plot = chart.getCategoryPlot();
        final org.jfree.chart.axis.CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(BarChartlivraison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarChartlivraison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarChartlivraison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarChartlivraison.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               final BarChartcartefid demo = new BarChartcartefid();
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}