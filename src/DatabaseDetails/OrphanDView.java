package DatabaseDetails;

import AdminPanel.DashBoard;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class OrphanDView extends javax.swing.JFrame {

    public OrphanDView() {
        initComponents();
        Fetch();
        IDGenerate();
        ID.setEditable(false);
    }

    public void Fetch(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Orphan.Orphan_Details");
            ResultSet rs = stmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
}
    
    private void IDGenerate(){
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
    }
    
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
        jLabel9 = new javax.swing.JLabel();
        PARENT = new javax.swing.JTextField();
        YES = new javax.swing.JRadioButton();
        NO = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        DATE = new com.toedter.calendar.JDateChooser();
        UPDATEB = new javax.swing.JButton();
        DELETEB = new javax.swing.JButton();
        REFRESHB = new javax.swing.JButton();
        CLOSEB = new javax.swing.JButton();
        TablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SEARCHB = new javax.swing.JButton();

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

        UPDATEB.setBackground(new java.awt.Color(102, 255, 0));
        UPDATEB.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        UPDATEB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/update.png"))); // NOI18N
        UPDATEB.setText("UPDATE");
        UPDATEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UPDATEBMousePressed(evt);
            }
        });
        UPDATEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBActionPerformed(evt);
            }
        });

        DELETEB.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        DELETEB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/delete.png"))); // NOI18N
        DELETEB.setText("DELETE");
        DELETEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEBActionPerformed(evt);
            }
        });

        REFRESHB.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        REFRESHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/reset.png"))); // NOI18N
        REFRESHB.setText("REFRESH");
        REFRESHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHBActionPerformed(evt);
            }
        });

        CLOSEB.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        CLOSEB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/exit.png"))); // NOI18N
        CLOSEB.setText("CLOSE");
        CLOSEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEBActionPerformed(evt);
            }
        });

        TablePanel.setBackground(new java.awt.Color(0, 51, 51));
        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVAILABLE DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(153, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
        );

        SEARCHB.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        SEARCHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/search.png"))); // NOI18N
        SEARCHB.setText("SEARCH");
        SEARCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPAnelLayout = new javax.swing.GroupLayout(MainPAnel);
        MainPAnel.setLayout(MainPAnelLayout);
        MainPAnelLayout.setHorizontalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPAnelLayout.createSequentialGroup()
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(MALEF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FEMALEF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OTHERF))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ONAME, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MainPAnelLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(SEARCHB)))))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)))
                        .addGap(26, 26, 26)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(YES)
                                .addGap(18, 18, 18)
                                .addComponent(NO))
                            .addComponent(PARENT, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UPDATEB)
                        .addGap(18, 18, 18)
                        .addComponent(DELETEB)
                        .addGap(18, 18, 18)
                        .addComponent(REFRESHB)
                        .addGap(18, 18, 18)
                        .addComponent(CLOSEB)))
                .addGap(26, 26, 26)
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPAnelLayout.setVerticalGroup(
            MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPAnelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(SEARCHB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ONAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MALEF)
                        .addComponent(FEMALEF)
                        .addComponent(OTHERF))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MainPAnelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(MainPAnelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)))
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YES)
                    .addComponent(NO)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PARENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(MainPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATEB)
                    .addComponent(DELETEB)
                    .addComponent(REFRESHB)
                    .addComponent(CLOSEB))
                .addGap(22, 22, 22))
            .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MALEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEFActionPerformed
        if (MALEF.isSelected() == true) {
            FEMALEF.setSelected(false);
            OTHERF.setSelected(false);
        }
    }//GEN-LAST:event_MALEFActionPerformed

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

    private void UPDATEBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEBMousePressed
        UPDATEB.setBackground(Color.blue);
    }//GEN-LAST:event_UPDATEBMousePressed

    private void UPDATEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To UPDATE the Record?", "RECORD UPDATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
                PreparedStatement stmt = con.prepareStatement("UPDATE Orphan_Details SET NAME = ?, GENDER = ?, DOB = ?, AGE = ?, DESCRIPTION = ?, PY_CHALLENGED = ?, ORPHAN_PARENTS = ?  WHERE ID = " +ID.getText());
                stmt.setString(1, ONAME.getText());
                if (MALEF.isSelected() == true) {
                    stmt.setString(2, MALEF.getText());
                }
                if (FEMALEF.isSelected() == true) {
                    stmt.setString(2, FEMALEF.getText());
                }
                if (OTHERF.isSelected() == true) {
                    stmt.setString(2, OTHERF.getText());
                }
                SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateF.format(DATE.getDate());
                stmt.setString(3, date);
                stmt.setString(4,AGE.getText());
                stmt.setString(5, DES.getText());
                if (YES.isSelected() == true) {
                    stmt.setString(6, YES.getText());
                }
                if (NO.isSelected() == true) {
                    stmt.setString(6, NO.getText());
                }
                stmt.setString(7,PARENT.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY DELETED THE RECORD!!");
                ID.setText(null);
                ONAME.setText(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                DATE.setDate(null);
                AGE.setText(null);
                DES.setText(null);
                YES.setSelected(false);
                NO.setSelected(false);
                PARENT.setText(null);
            }catch(SQLException sql){
                JOptionPane.showMessageDialog(rootPane,"NO DATA FOND IN THE RECORDS");
            }Fetch();
        }
    }//GEN-LAST:event_UPDATEBActionPerformed

    private void DELETEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To DELETE the Record?", "DELETE RECORD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
                PreparedStatement stmt = con.prepareStatement("DELETE from orphan_Details where ID = " +ID.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY DELETED THE RECORD!!");
                ID.setText(null);
                ONAME.setText(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                DATE.setDate(null);
                AGE.setText(null);
                DES.setText(null);
                YES.setSelected(false);
                NO.setSelected(false);
                PARENT.setText(null);
            }catch(SQLException sql){
                JOptionPane.showMessageDialog(rootPane,"NO DATA FOND IN THE RECORDS");
            }Fetch();
        }
    }//GEN-LAST:event_DELETEBActionPerformed

    private void REFRESHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHBActionPerformed
                ID.setText(null);
                ONAME.setText(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                DATE.setDate(null);
                AGE.setText(null);
                DES.setText(null);
                YES.setSelected(false);
                NO.setSelected(false);
                PARENT.setText(null);
    }//GEN-LAST:event_REFRESHBActionPerformed

    private void CLOSEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To go BACK?", "GO TO DASHBOARD?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            DashBoard dash = new DashBoard();
            dash.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CLOSEBActionPerformed

    private void SEARCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBActionPerformed
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Orphan.orphan_Details where ID = " + ID.getText());
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                 ID.setText(null);
                ONAME.setText(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                DATE.setDate(null);
                AGE.setText(null);
                DES.setText(null);
                YES.setSelected(false);
                NO.setSelected(false);
                PARENT.setText(null);
            } else {
                ONAME.setText(rs.getString("NAME"));
                if(rs.getString("GENDER") != null) 
                    switch(rs.getString("GENDER")){
                        case "MALE" -> MALEF.setSelected(true);
                        case "FEMALE" -> FEMALEF.setSelected(true);
                        case "OTHER" -> OTHERF.setSelected(true);
                        default -> {
                            MALEF.setSelected(false);
                            FEMALEF.setSelected(false);
                            OTHERF.setSelected(false);
                        }
                    }
                DATE.setDateFormatString(rs.getString("DOB"));
                AGE.setText(rs.getString("AGE"));
                DES.setText(rs.getString("DESCRIPTION"));
                if(rs.getString("GENDER") != null) 
                    switch(rs.getString("PY_CHALLENGED")){
                        case "YES" -> YES.setSelected(true);
                        case "NO" -> NO.setSelected(true);
                        default -> {
                            YES.setSelected(false);
                            NO.setSelected(false);
                        }
                    }
                PARENT.setText(rs.getString("ORPHAN_PARENTS"));
            }
            JOptionPane.showMessageDialog(rootPane, "SEARCH SUCCESSFULLY!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, "No Record Found!!");
        }          
    }//GEN-LAST:event_SEARCHBActionPerformed

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
            java.util.logging.Logger.getLogger(OrphanDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrphanDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrphanDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrphanDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OrphanDView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JButton CLOSEB;
    private com.toedter.calendar.JDateChooser DATE;
    private javax.swing.JButton DELETEB;
    private javax.swing.JTextArea DES;
    private javax.swing.JRadioButton FEMALEF;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton MALEF;
    private javax.swing.JPanel MainPAnel;
    private javax.swing.JRadioButton NO;
    private javax.swing.JTextField ONAME;
    private javax.swing.JRadioButton OTHERF;
    private javax.swing.JTextField PARENT;
    private javax.swing.JButton REFRESHB;
    private javax.swing.JButton SEARCHB;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JButton UPDATEB;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
