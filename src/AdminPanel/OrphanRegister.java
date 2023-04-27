package AdminPanel;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class OrphanRegister extends javax.swing.JFrame {

    public OrphanRegister() {
        initComponents();
        ID.setEditable(false);
      //  IDGenerate();
    }

   /* private void IDGenerate(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement pst = conn.prepareStatement("SELECT ID FROM Orphan.Orphan_details ORDER BY ID DESC LIMIT 1 ");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String num = rs.getString("ID");
                int numlen = num.length();
                String txt = num.substring(0, 2);
                String txt2 = num.substring(2,numlen);
                int val = Integer.parseInt(txt2);
                val++;
                String snum = Integer.toString(val);
                String ftxt = txt + snum;
                ID.setText(ftxt);
            }else{
                ID.setText("1001");
            }
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(rootPane,sql);
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPAnel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ONAME = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DES = new javax.swing.JTextArea();
        MALEF = new javax.swing.JRadioButton();
        FEMALEF = new javax.swing.JRadioButton();
        OTHERF = new javax.swing.JRadioButton();
        SUBMIT = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PARENT = new javax.swing.JTextField();
        YES = new javax.swing.JRadioButton();
        NO = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        DATE = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPAnel.setBackground(new java.awt.Color(0, 51, 51));
        MainPAnel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORPHAN REGISTRATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ORPHANE-ID*");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ORPHANE NAME*");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESCRIPTION*");

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AGE of ORPHAN*");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHYSICALLY CHALLENGED*");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GENDER*");

        ID.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID -");

        ONAME.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ONAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AGE.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AGE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DES.setColumns(20);
        DES.setRows(5);
        jScrollPane1.setViewportView(DES);

        MALEF.setBackground(new java.awt.Color(0, 51, 51));
        MALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MALEF.setForeground(new java.awt.Color(255, 255, 255));
        MALEF.setText("MALE");
        MALEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEFActionPerformed(evt);
            }
        });

        FEMALEF.setBackground(new java.awt.Color(0, 51, 51));
        FEMALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        FEMALEF.setForeground(new java.awt.Color(255, 255, 255));
        FEMALEF.setText("FEMALE");
        FEMALEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEFActionPerformed(evt);
            }
        });

        OTHERF.setBackground(new java.awt.Color(0, 51, 51));
        OTHERF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        OTHERF.setForeground(new java.awt.Color(255, 255, 255));
        OTHERF.setText("OTHER");
        OTHERF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTHERFActionPerformed(evt);
            }
        });

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
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PARENTs (IF KNOWN)");

        PARENT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        PARENT.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        YES.setBackground(new java.awt.Color(0, 51, 51));
        YES.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        YES.setForeground(new java.awt.Color(255, 255, 255));
        YES.setText("YES");
        YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YESActionPerformed(evt);
            }
        });

        NO.setBackground(new java.awt.Color(0, 51, 51));
        NO.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        NO.setForeground(new java.awt.Color(255, 255, 255));
        NO.setText("NO");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATE OF BIRTH");

        javax.swing.GroupLayout MainPAnelLayout = new javax.swing.GroupLayout(MainPAnel);
        MainPAnel.setLayout(MainPAnelLayout);
        MainPAnelLayout.setHorizontalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(SUBMIT))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGap(30, 30, 30)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXITB)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ONAME, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PARENT, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(YES)
                        .addGap(18, 18, 18)
                        .addComponent(NO))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DATE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(MALEF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FEMALEF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OTHERF)))
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
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MALEF)
                    .addComponent(FEMALEF)
                    .addComponent(OTHERF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YES)
                            .addComponent(NO))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(PARENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPAnelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)))
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUBMIT)
                    .addComponent(EXITB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement pst = con.prepareStatement("INSERT INTO Orphan.Orphan_Details (ID, NAME, GENDER, DOB, AGE, DESCRIPTION, PY_CHALLENGED, ORPHAN_PARENTS) \n" +
                                                            "VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, ID.getText());
            pst.setString(2,ONAME.getText());
            if (MALEF.isSelected() == true) {
                pst.setString(3,MALEF.getText());
            }
            if (FEMALEF.isSelected() == true) {
                pst.setString(3,FEMALEF.getText());
            }
            if (OTHERF.isSelected() == true) {
                pst.setString(3,OTHERF.getText());
            }
            SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateF.format(DATE.getDate());
            pst.setString(4, date);
            pst.setString(5,AGE.getText());
            pst.setString(6, DES.getText());
            if (YES.isSelected() == true) {
                pst.setString(7,YES.getText());
            }
            if (NO.isSelected() == true) {
                pst.setString(7,NO.getText());
            }
            pst.setString(8, PARENT.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "RECORD ADDED SUCCESSFULLY!!");
            ID.setText(null);
            ONAME.setText(null);
            MALEF.setText(null);
            FEMALEF.setText(null);
            OTHERF.setText(null);
            DATE.setDate(null);
            AGE.setText(null);
            DES.setText(null);
            YES.setText(null);
            NO.setText(null);
            PARENT.setText(null);      
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

    private void MALEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEFActionPerformed
        if (MALEF.isSelected() == true) {
            FEMALEF.setSelected(false);
            OTHERF.setSelected(false);
        }
    }//GEN-LAST:event_MALEFActionPerformed

    private void YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YESActionPerformed
        if (YES.isSelected() == true) {
            NO.setSelected(false);
        }
    }//GEN-LAST:event_YESActionPerformed

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
        if (NO.isSelected() == true) {
            YES.setSelected(false);
        }
    }//GEN-LAST:event_NOActionPerformed

    private void FEMALEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMALEFActionPerformed
        if (FEMALEF.isSelected() == true) {
            MALEF.setSelected(false);
            OTHERF.setSelected(false);
        }
    }//GEN-LAST:event_FEMALEFActionPerformed

    private void OTHERFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTHERFActionPerformed
        if (OTHERF.isSelected() == true) {
            FEMALEF.setSelected(false);
            MALEF.setSelected(false);
        }
    }//GEN-LAST:event_OTHERFActionPerformed

    private void SUBMITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUBMITMouseClicked
        SUBMIT.setBackground(Color.green);
    }//GEN-LAST:event_SUBMITMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrphanRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new OrphanRegister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JTextArea DES;
    private javax.swing.JButton EXITB;
    private javax.swing.JRadioButton FEMALEF;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MALEF;
    private javax.swing.JPanel MainPAnel;
    private javax.swing.JRadioButton NO;
    private javax.swing.JTextField ONAME;
    private javax.swing.JRadioButton OTHERF;
    private javax.swing.JTextField PARENT;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JRadioButton YES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
