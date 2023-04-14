package AdminPanel;

import UserInterface.MainMenu;
import DatabaseDetails.AdopteeDView;
import DatabaseDetails.OrphanDView;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MianPanel = new javax.swing.JPanel();
        OrphanRegisteryB = new javax.swing.JButton();
        AdopteeRegisteryB = new javax.swing.JButton();
        OrphanDetailsB = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        LogoutB = new javax.swing.JButton();
        AdopteDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MianPanel.setBackground(new java.awt.Color(255, 255, 255));
        MianPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRATORs PANEL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 36))); // NOI18N

        OrphanRegisteryB.setBackground(new java.awt.Color(255, 255, 255));
        OrphanRegisteryB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OrphanRegisteryB.setText("New Orphan Registery");
        OrphanRegisteryB.setBorder(null);
        OrphanRegisteryB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrphanRegisteryBActionPerformed(evt);
            }
        });

        AdopteeRegisteryB.setBackground(new java.awt.Color(255, 255, 255));
        AdopteeRegisteryB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AdopteeRegisteryB.setText("Adoptee Registery");
        AdopteeRegisteryB.setBorder(null);
        AdopteeRegisteryB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdopteeRegisteryBActionPerformed(evt);
            }
        });

        OrphanDetailsB.setBackground(new java.awt.Color(255, 255, 255));
        OrphanDetailsB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OrphanDetailsB.setText("Available Orphan Details");
        OrphanDetailsB.setBorder(null);
        OrphanDetailsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrphanDetailsBActionPerformed(evt);
            }
        });

        EXITB.setBackground(new java.awt.Color(255, 255, 255));
        EXITB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EXITB.setForeground(new java.awt.Color(255, 51, 51));
        EXITB.setText("EXIT");
        EXITB.setBorder(null);
        EXITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBActionPerformed(evt);
            }
        });

        LogoutB.setBackground(new java.awt.Color(255, 255, 255));
        LogoutB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        LogoutB.setText("LOGOUT");
        LogoutB.setBorder(null);
        LogoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBActionPerformed(evt);
            }
        });

        AdopteDetails.setBackground(new java.awt.Color(255, 255, 255));
        AdopteDetails.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AdopteDetails.setText("Adoptee Details");
        AdopteDetails.setBorder(null);
        AdopteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdopteDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MianPanelLayout = new javax.swing.GroupLayout(MianPanel);
        MianPanel.setLayout(MianPanelLayout);
        MianPanelLayout.setHorizontalGroup(
            MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MianPanelLayout.createSequentialGroup()
                .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MianPanelLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrphanDetailsB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdopteeRegisteryB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrphanRegisteryB, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdopteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MianPanelLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogoutB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXITB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        MianPanelLayout.setVerticalGroup(
            MianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MianPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(OrphanRegisteryB)
                .addGap(20, 20, 20)
                .addComponent(AdopteeRegisteryB)
                .addGap(19, 19, 19)
                .addComponent(OrphanDetailsB)
                .addGap(18, 18, 18)
                .addComponent(AdopteDetails)
                .addGap(59, 59, 59)
                .addComponent(LogoutB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EXITB)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrphanRegisteryBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrphanRegisteryBActionPerformed
        AdopteeRegistery res = new AdopteeRegistery();
        res.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrphanRegisteryBActionPerformed

    private void AdopteeRegisteryBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdopteeRegisteryBActionPerformed
        AdopteeRegistery ARes = new AdopteeRegistery();
        ARes.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdopteeRegisteryBActionPerformed

    private void OrphanDetailsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrphanDetailsBActionPerformed
        OrphanDView OView = new OrphanDView();
        OView.setVisible(true);
        dispose();
    }//GEN-LAST:event_OrphanDetailsBActionPerformed

    private void EXITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITBActionPerformed

    private void LogoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutBActionPerformed

    private void AdopteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdopteDetailsActionPerformed
        AdopteeDView AView = new AdopteeDView();
        AView.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdopteDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdopteDetails;
    private javax.swing.JButton AdopteeRegisteryB;
    private javax.swing.JButton EXITB;
    private javax.swing.JButton LogoutB;
    private javax.swing.JPanel MianPanel;
    private javax.swing.JButton OrphanDetailsB;
    private javax.swing.JButton OrphanRegisteryB;
    // End of variables declaration//GEN-END:variables
}
