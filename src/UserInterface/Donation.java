package UserInterface;

import AdminPanel.QRCODE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("ADDRESS");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("DONAR NAME");

        FNAME.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        FNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LNAME.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LNAME.setToolTipText("");
        LNAME.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL AMOUNT ");

        AMOUNT.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("FEEDBACK ");

        FEEDBACK.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("PHONE  NO ");

        PHONE.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        PHONE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SENDB.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        SENDB.setText("SEND");
        SENDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDBActionPerformed(evt);
            }
        });

        STREET1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        STREET1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        STREET1.setText("Street Address");

        STREET2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        STREET2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        STREET2.setText("Street Address Line 2");

        CITY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CITY.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CITY.setText("City");

        REGION.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        REGION.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        REGION.setText("Region");

        ZIP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ZIP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ZIP.setText("ZIP Code");

        COUNTRY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        COUNTRY.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        COUNTRY.setText("Country");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(LNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(STREET1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STREET2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CITY, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(REGION, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(COUNTRY, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(SENDB)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(STREET1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(STREET2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REGION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COUNTRY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(AMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(FEEDBACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SENDB)
                .addContainerGap())
        );

        LNAME.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SENDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDBActionPerformed
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement pst = con.prepareStatement("INSERT INTO Orphan.DONATION (FNAME, LNAME, STREET1, STREET2, CITY, REGION, ZIPCODE, COUNTRY, PHONE, AMOUNT, FEEDBACK) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, FNAME.getText());
            pst.setString(2,LNAME.getText());
            pst.setString(3,STREET1.getText());
            pst.setString(4,STREET2.getText());
            pst.setString(5,CITY.getText());
            pst.setString(6,REGION.getText());
            pst.setString(7,ZIP.getText());
            pst.setString(8,COUNTRY.getText());
            pst.setString(9,PHONE.getText());
            pst.setString(10,AMOUNT.getText());
            pst.setString(11,FEEDBACK.getText());            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "DETAILS SAVED SUCCESSFULLY!!");
            QRCODE code = new QRCODE();
            code.setVisible(true);
            dispose();
        } catch(SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "INCORRECT DETAILS");
        }
    }//GEN-LAST:event_SENDBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Donation().setVisible(true);
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
