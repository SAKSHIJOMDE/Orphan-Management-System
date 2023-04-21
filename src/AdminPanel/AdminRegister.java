
package AdminPanel;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class AdminRegister extends javax.swing.JFrame {

    public AdminRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPAnel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ONAME = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DES = new javax.swing.JTextArea();
        SUBMIT = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AGE1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ONAME1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Pass1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPAnel.setBackground(new java.awt.Color(255, 255, 255));
        MainPAnel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORPHAN REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("USER - ID*");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("USER NAME*");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("ADDRESS*");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("MOBILE NO.*");

        ID.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setText("ID -");

        ONAME.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ONAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AGE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AGE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DES.setColumns(20);
        DES.setRows(5);
        jScrollPane1.setViewportView(DES);

        SUBMIT.setBackground(new java.awt.Color(255, 255, 255));
        SUBMIT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        SUBMIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/sendadd.png"))); // NOI18N
        SUBMIT.setText("SUBMIT");
        SUBMIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUBMITMouseClicked(evt);
            }
        });
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });

        EXITB.setBackground(new java.awt.Color(255, 255, 255));
        EXITB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EXITB.setForeground(new java.awt.Color(255, 0, 0));
        EXITB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/exit.png"))); // NOI18N
        EXITB.setText("EXIT");
        EXITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setText("PASSWORD");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setText("EMAIL ID*");

        AGE1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AGE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setText("+ 91");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("ADMIN USERNAME");

        ONAME1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ONAME1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setText("CONFIRM PASSWORD");

        Pass.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N

        Pass1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N

        javax.swing.GroupLayout MainPAnelLayout = new javax.swing.GroupLayout(MainPAnel);
        MainPAnel.setLayout(MainPAnelLayout);
        MainPAnelLayout.setHorizontalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(SUBMIT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPAnelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)))
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EXITB)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ONAME, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AGE1)))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ONAME1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPAnelLayout.setVerticalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ONAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ONAME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUBMIT)
                    .addComponent(EXITB))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SUBMITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUBMITMouseClicked
        SUBMIT.setBackground(Color.green);
    }//GEN-LAST:event_SUBMITMouseClicked

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement pst = con.prepareStatement("INSERT INTO Orphan.usercredentials (ID, NAME, GENDER, DOB, AGE, DESCRIPTION, PY_CHALLENGED, ORPHAN_PARENTS) \n" +
                "VALUES (?,?,?,?,?,?,?,?)");
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "RECORD ADDED SUCCESSFULLY!!");
            ID.setText(null);
            
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_SUBMITActionPerformed

    private void EXITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To GO BACK?", "BACK to DashBoard", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            DashBoard dash = new DashBoard();
            dash.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_EXITBActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTextField AGE1;
    private javax.swing.JTextArea DES;
    private javax.swing.JButton EXITB;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel MainPAnel;
    private javax.swing.JTextField ONAME;
    private javax.swing.JTextField ONAME1;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPasswordField Pass1;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
