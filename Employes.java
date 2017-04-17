/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

/**
 *
 * @author MT98
 */
public class Employes extends javax.swing.JFrame {

    /**
     * Creates new form Employes
     */
    public Employes() {
        initComponents();
        panelHistorique.setVisible(false);
        panelFacturer.setVisible(false);
    }

    public Employes(String login, String pwd, String nomPharm) {
        initComponents();
        nomPharma = nomPharm;
        loginConnecter = login;
        pwdConnecter = pwd;
        panelHistorique.setVisible(false);
        panelFacturer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEmploye = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        labelLogoPharm = new javax.swing.JLabel();
        labelFacturer = new javax.swing.JLabel();
        labelHistorique = new javax.swing.JLabel();
        labelStatistique = new javax.swing.JLabel();
        labelDeconnecter = new javax.swing.JLabel();
        labelConteneur = new javax.swing.JLabel();
        panelFacturer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelHistorique = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEmploye.setBackground(new java.awt.Color(255, 255, 255));
        panelEmploye.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogoPharm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/phar.png"))); // NOI18N
        panelHeader.add(labelLogoPharm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 4, 162, 120));

        labelFacturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/facturer.png"))); // NOI18N
        labelFacturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFacturerMouseClicked(evt);
            }
        });
        panelHeader.add(labelFacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 130, 50));

        labelHistorique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/historique.png"))); // NOI18N
        labelHistorique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHistoriqueMouseClicked(evt);
            }
        });
        panelHeader.add(labelHistorique, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 130, 50));

        labelStatistique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/statistique.png"))); // NOI18N
        panelHeader.add(labelStatistique, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 130, 50));

        labelDeconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/deconnecter.png"))); // NOI18N
        panelHeader.add(labelDeconnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 130, 50));

        labelConteneur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/conteneurPhar.png"))); // NOI18N
        panelHeader.add(labelConteneur, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 570, 90));

        panelEmploye.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 130));

        panelFacturer.setBackground(new java.awt.Color(0, 204, 204));
        panelFacturer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelFacturer.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 5, -1, -1));

        jButton2.setText("jButton2");
        panelFacturer.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 5, -1, -1));

        jTextField1.setText("jTextField1");
        panelFacturer.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFacturer.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFacturer.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        jTextField2.setText("jTextField2");
        panelFacturer.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jTextField3.setText("jTextField3");
        panelFacturer.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jTextField4.setText("jTextField4");
        panelFacturer.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jTextField5.setText("jTextField5");
        panelFacturer.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jTextField6.setText("jTextField6");
        panelFacturer.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jTextField7.setText("jTextField7");
        panelFacturer.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jButton3.setText("jButton3");
        panelFacturer.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFacturer.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jTextField8.setText("jTextField8");
        panelFacturer.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        jButton4.setText("jButton4");
        panelFacturer.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panelFacturer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 380, 120));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelFacturer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 430, 130));

        panelEmploye.add(panelFacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 1110, 510));

        panelHistorique.setBackground(new java.awt.Color(0, 204, 204));
        panelHistorique.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        panelHistorique.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 5, 420, 140));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        panelHistorique.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 470, 120));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelHistorique.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        jButton5.setText("jButton5");
        panelHistorique.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelHistorique.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jButton6.setText("jButton6");
        panelHistorique.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jTextField9.setText("jTextField9");
        panelHistorique.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        panelEmploye.add(panelHistorique, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 1120, 450));

        getContentPane().add(panelEmploye, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelFacturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFacturerMouseClicked
        // TODO add your handling code here:
        panelHistorique.setVisible(false);
        panelFacturer.setVisible(true);

    }//GEN-LAST:event_labelFacturerMouseClicked

    private void labelHistoriqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHistoriqueMouseClicked
        // TODO add your handling code here:
        panelHistorique.setVisible(true);
        panelFacturer.setVisible(false);
    }//GEN-LAST:event_labelHistoriqueMouseClicked

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
            java.util.logging.Logger.getLogger(Employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelConteneur;
    private javax.swing.JLabel labelDeconnecter;
    private javax.swing.JLabel labelFacturer;
    private javax.swing.JLabel labelHistorique;
    private javax.swing.JLabel labelLogoPharm;
    private javax.swing.JLabel labelStatistique;
    private javax.swing.JPanel panelEmploye;
    private javax.swing.JPanel panelFacturer;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHistorique;
    // End of variables declaration//GEN-END:variables
    private String loginConnecter;
    private String pwdConnecter;
    private String nomPharma;
}
