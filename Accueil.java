/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpharmacie;

import com.tmbd.pharmacie.TmbdRequests;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MT98
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        panelConnecter.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAccueil = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        labelPharmacie = new javax.swing.JLabel();
        labelConnecter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        panelConnecter = new javax.swing.JPanel();
        panelConHeader = new javax.swing.JPanel();
        textLogin = new javax.swing.JTextField();
        labelSeConnecter = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lispharma = new javax.swing.JComboBox<>();
        suiEmp = new javax.swing.JCheckBox();
        labelCadre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAccueil.setBackground(new java.awt.Color(255, 255, 255));
        panelAccueil.setPreferredSize(new java.awt.Dimension(1380, 740));
        panelAccueil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPharmacie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/phar.png"))); // NOI18N
        panelHeader.add(labelPharmacie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, 162, 120));

        labelConnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/connecter.png"))); // NOI18N
        labelConnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConnecterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelConnecterMouseEntered(evt);
            }
        });
        panelHeader.add(labelConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 25, 200, 80));

        panelAccueil.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1340, 130));

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 153, 153));
        jTextArea1.setText("Bienvenue dans Gestion de Pharmacie.\n\nCette application est spécialement faite pour gérer\n vos stocks dans les moindres détails.");
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        panelAccueil.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 470, 250));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setText("By TMBD, Fatou && TERMINATOR.");
        panelAccueil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 290, 30));

        getContentPane().add(panelAccueil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        panelConnecter.setBackground(new java.awt.Color(255, 255, 255));
        panelConnecter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelConHeader.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelConHeaderLayout = new javax.swing.GroupLayout(panelConHeader);
        panelConHeader.setLayout(panelConHeaderLayout);
        panelConHeaderLayout.setHorizontalGroup(
            panelConHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1340, Short.MAX_VALUE)
        );
        panelConHeaderLayout.setVerticalGroup(
            panelConHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panelConnecter.add(panelConHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 60));

        textLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textLogin.setText("login");
        textLogin.setToolTipText("");
        textLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textLogin.setName(""); // NOI18N
        panelConnecter.add(textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 260, 50));

        labelSeConnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/seConnecter.png"))); // NOI18N
        labelSeConnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSeConnecterMouseClicked(evt);
            }
        });
        panelConnecter.add(labelSeConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 180, 50));

        password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        panelConnecter.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 260, 50));

        lispharma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelConnecter.add(lispharma, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 80, 30));

        suiEmp.setText("je suis un employe");
        suiEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suiEmpMouseClicked(evt);
            }
        });
        panelConnecter.add(suiEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        labelCadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionpharmacie/cadreConnexion.png"))); // NOI18N
        labelCadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        panelConnecter.add(labelCadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 420, 480));

        getContentPane().add(panelConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelConnecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConnecterMouseClicked
        // TODO add your handling code here:
        panelAccueil.setVisible(false);
        panelConnecter.setVisible(true);
        
        lispharma.removeAllItems();
        try {
            TmbdRequests reqDyn = new TmbdRequests();
            ResultSet pharms = reqDyn.queryAllPharmacies();
            ListeFonctions lf = new ListeFonctions();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model = lf.chargerComboSingle(pharms,"nom");
            lispharma.setModel(model);
            /*while(pharms.next()){
                lispharma.addItem(pharms.getString("nom"));
            }*/
        } catch (Exception ex) {
            Logger.getLogger(AdministrateurPharmacie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelConnecterMouseClicked

    private void labelConnecterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConnecterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelConnecterMouseEntered

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void labelSeConnecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSeConnecterMouseClicked
        // TODO add your handling code here:
        ListeFonctions fonctions = new ListeFonctions();
        String who="";
        try {
            who = fonctions.whoIsConnected(textLogin.getText(), password.getText(),lispharma.getSelectedItem().toString());
        } catch (Exception ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        switch (who) {
            case "employe":
                new Employes(textLogin.getText(), password.getText(),lispharma.getSelectedItem().toString()).setVisible(true);
                break;
            case "gerant":
                new AdministrateurPharmacie(textLogin.getText(), password.getText(),lispharma.getSelectedItem().toString()).setVisible(true);
                break;
            case "admin":
                new AdministrateurGeneral(textLogin.getText(), password.getText()).setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "votre email et password sont incorrectes");
                break;
        }
    }//GEN-LAST:event_labelSeConnecterMouseClicked

    private void suiEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suiEmpMouseClicked
        if(suiEmp.isSelected()){
            lispharma.setVisible(true);           
        }
        else lispharma.setVisible(false);
    }//GEN-LAST:event_suiEmpMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lispharma.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCadre;
    private javax.swing.JLabel labelConnecter;
    private javax.swing.JLabel labelPharmacie;
    private javax.swing.JLabel labelSeConnecter;
    private javax.swing.JComboBox<String> lispharma;
    private javax.swing.JPanel panelAccueil;
    private javax.swing.JPanel panelConHeader;
    private javax.swing.JPanel panelConnecter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox suiEmp;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables
}