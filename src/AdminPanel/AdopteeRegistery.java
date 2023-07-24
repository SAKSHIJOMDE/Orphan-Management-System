package AdminPanel;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class AdopteeRegistery extends javax.swing.JFrame {

       public AdopteeRegistery() {
     initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPAnel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        CONTACT = new javax.swing.JTextField();
        EMAIL = new javax.swing.JTextField();
        iN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADDRESS = new javax.swing.JTextArea();
        DATE = new com.toedter.calendar.JDateChooser();
        MALEF = new javax.swing.JRadioButton();
        FEMALEF = new javax.swing.JRadioButton();
        OTHERF = new javax.swing.JRadioButton();
        BACK = new javax.swing.JButton();
        SEARCHB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DESCRIPTION = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        ZIP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CITY = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        OCCUPATION = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPAnel.setBackground(new java.awt.Color(51, 51, 51));
        MainPAnel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADOPTEE REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 24), new java.awt.Color(51, 255, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADOPTEE-ID");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADOPTEE NAME");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS");

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTACT");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-MAIL ID");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE OF BIRTH");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENDER");

        ID.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID -");

        NAME.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        NAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CONTACT.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        CONTACT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CONTACT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CONTACTKeyPressed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        EMAIL.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        iN.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        iN.setForeground(new java.awt.Color(255, 255, 255));
        iN.setText("+ 91");

        ADDRESS.setColumns(20);
        ADDRESS.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        ADDRESS.setLineWrap(true);
        ADDRESS.setRows(5);
        ADDRESS.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ADDRESS);

        MALEF.setBackground(new java.awt.Color(51, 51, 51));
        MALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MALEF.setForeground(new java.awt.Color(255, 255, 255));
        MALEF.setText("MALE");

        FEMALEF.setBackground(new java.awt.Color(51, 51, 51));
        FEMALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        FEMALEF.setForeground(new java.awt.Color(255, 255, 255));
        FEMALEF.setText("FEMALE");

        OTHERF.setBackground(new java.awt.Color(51, 51, 51));
        OTHERF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OTHERF.setForeground(new java.awt.Color(255, 255, 255));
        OTHERF.setText("OTHER");

        BACK.setBackground(new java.awt.Color(255, 255, 255));
        BACK.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 0, 0));
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/exit.png"))); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        SEARCHB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        SEARCHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/sendadd.png"))); // NOI18N
        SEARCHB.setText("SUBMIT");
        SEARCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DESCRIPTION");

        DESCRIPTION.setColumns(20);
        DESCRIPTION.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        DESCRIPTION.setLineWrap(true);
        DESCRIPTION.setRows(5);
        DESCRIPTION.setWrapStyleWord(true);
        jScrollPane2.setViewportView(DESCRIPTION);

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ZIPCODE");

        ZIP.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        ZIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ZIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ZIPKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CITY");

        CITY.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        CITY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("OCCUPATION");

        OCCUPATION.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        OCCUPATION.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout MainPAnelLayout = new javax.swing.GroupLayout(MainPAnel);
        MainPAnel.setLayout(MainPAnelLayout);
        MainPAnelLayout.setHorizontalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPAnelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainPAnelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                                .addComponent(iN)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                                .addComponent(MALEF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FEMALEF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(OTHERF))))
                                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(NAME, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPAnelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CITY, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                        .addComponent(OCCUPATION, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SEARCHB)
                .addGap(26, 26, 26)
                .addComponent(BACK)
                .addGap(142, 142, 142))
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
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MALEF)
                    .addComponent(FEMALEF)
                    .addComponent(OTHERF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCCUPATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCHB)
                    .addComponent(BACK))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBActionPerformed
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement stmt = conn.prepareStatement("""
                                                           INSERT INTO Orphan.Adoptee_Details (ID, ADOPTEENAME, ADDRESS, DESCRIPTION, DOB, GENDER, PHONENO, EMAIL, ZIPCODE, CITY, OCCUPATION) 
                                                           VALUES (?,?,?,?,?,?,?,?,?,?,?)""");
            stmt.setString(1,ID.getText());
            stmt.setString(2, NAME.getText());
            stmt.setString(3,ADDRESS.getText());
            stmt.setString(4,DESCRIPTION.getText());
            SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateF.format(DATE.getDate());
            stmt.setString(5, date);
            if(MALEF.isSelected()){
                stmt.setString(6,MALEF.getText());
            }
            if (FEMALEF.isSelected()){
                stmt.setString(6,FEMALEF.getText());
            }
            if(OTHERF.isSelected()){
                stmt.setString(6,OTHERF.getText());
            }
            stmt.setString(7,CONTACT.getText());
            stmt.setString(8,EMAIL.getText());
            stmt.setString(9,ZIP.getText());
            stmt.setString(10,CITY.getText());
            stmt.setString(11,OCCUPATION.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "UPDATED SUCCESSFULLY!!");
                ID.setText(null);
                NAME.setText(null);
                ADDRESS.setText(null);
                DESCRIPTION.setText(null);
                DATE.setDate(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                CONTACT.setText(null);
                EMAIL.setText(null);
                ZIP.setText(null);
                CITY.setText(null);
                OCCUPATION.setText(null);
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_SEARCHBActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To GO BACK?", "Back to Menu", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            DashBoard dash = new DashBoard();
            dash.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BACKActionPerformed

    private void CONTACTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CONTACTKeyPressed
        String Phone = CONTACT.getText();
        int Length = Phone.length();
        char c = evt.getKeyChar();
        // To check Number 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <='9') {
            // To check if length is not more than 10
            if(Length < 10){
                //is less than 6
                CONTACT.setEditable(true);
            } else {
                //else false
                CONTACT.setEditable(false);
            }
        } else {
            //To allow the keys to perform Backspace and Delete for editable mode
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                CONTACT.setEditable(true);
            } else {
                CONTACT.setEditable(false);
            }
        }
    }//GEN-LAST:event_CONTACTKeyPressed

    private void ZIPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZIPKeyPressed
        String Phone = ZIP.getText();
        int Length = Phone.length();
        char c = evt.getKeyChar();
        // To check Number 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <='9') {
            // To check if length is not more than 10
            if(Length < 6){
                //is less than 6
                ZIP.setEditable(true);
            } else {
                //else false
                ZIP.setEditable(false);
            }
        } else {
            //To allow the keys to perform Backspace and Delete for editable mode
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                ZIP.setEditable(true);
            } else {
                ZIP.setEditable(false);
            }
        }
    }//GEN-LAST:event_ZIPKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdopteeRegistery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new AdopteeRegistery().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADDRESS;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField CITY;
    private javax.swing.JTextField CONTACT;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JTextArea DESCRIPTION;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JRadioButton FEMALEF;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MALEF;
    private javax.swing.JPanel MainPAnel;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField OCCUPATION;
    private javax.swing.JRadioButton OTHERF;
    private javax.swing.JButton SEARCHB;
    private javax.swing.JTextField ZIP;
    private javax.swing.JLabel iN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
