package UserInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Donation extends javax.swing.JFrame {

    public Donation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FNAME = new javax.swing.JTextField();
        LNAME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AMOUNT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FEEDBACK = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PHONE = new javax.swing.JTextField();
        SENDB = new javax.swing.JButton();
        STREET1 = new javax.swing.JTextField();
        STREET2 = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        REGION = new javax.swing.JTextField();
        ZIP = new javax.swing.JTextField();
        COUNTRY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(8, 159, 143));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DONATION FORM", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("ADDRESS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 145, -1, 27));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("DONAR NAME");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 57, -1, 33));

        FNAME.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        FNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FNAME.setText("FIRST");
        jPanel3.add(FNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 96, 151, 31));

        LNAME.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LNAME.setText("LAST");
        jPanel3.add(LNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 96, 178, 31));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL AMOUNT ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 376, -1, 27));

        AMOUNT.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel3.add(AMOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 409, 146, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("FEEDBACK ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 451, -1, -1));

        FEEDBACK.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel3.add(FEEDBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 475, 339, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("PHONE  NO ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 310, -1, -1));

        PHONE.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        PHONE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(PHONE, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 334, 176, -1));

        SENDB.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        SENDB.setText("SEND");
        SENDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDBActionPerformed(evt);
            }
        });
        jPanel3.add(SENDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 517, 127, 38));

        STREET1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        STREET1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        STREET1.setText("Street Address");
        jPanel3.add(STREET1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 178, 339, -1));

        STREET2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        STREET2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        STREET2.setText("Street Address Line 2");
        jPanel3.add(STREET2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 208, 339, -1));

        CITY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CITY.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CITY.setText("City");
        jPanel3.add(CITY, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 238, 161, -1));

        REGION.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        REGION.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        REGION.setText("Region");
        jPanel3.add(REGION, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 238, 160, -1));

        ZIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ZIP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ZIP.setText("ZIP Code");
        jPanel3.add(ZIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 268, 161, -1));

        COUNTRY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        COUNTRY.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        COUNTRY.setText("Country");
        jPanel3.add(COUNTRY, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 268, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SENDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDBActionPerformed
        try{
            Connection con = DriverManager.getConnection("","","");
        } catch(SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INCORRECT DETAILS");
        }
    }//GEN-LAST:event_SENDBActionPerformed

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
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMOUNT;
    private javax.swing.JTextField CITY;
    private javax.swing.JTextField COUNTRY;
    private javax.swing.JTextField FEEDBACK;
    private javax.swing.JTextField FNAME;
    private javax.swing.JTextField LNAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField REGION;
    private javax.swing.JButton SENDB;
    private javax.swing.JTextField STREET1;
    private javax.swing.JTextField STREET2;
    private javax.swing.JTextField ZIP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
