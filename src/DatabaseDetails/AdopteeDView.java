package DatabaseDetails;

import AdminPanel.DashBoard;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class AdopteeDView extends javax.swing.JFrame {

    public AdopteeDView() {
        initComponents();
        Fetch();
     //   IDGenerate();
       // IDF.setEditable(false);
    }

    public void Fetch(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Orphan.Adoptee_Details");
            ResultSet rs = stmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
}
    
   /* private void IDGenerate(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement pst = conn.prepareStatement("SELECT ID FROM Orphan.Adoptee_details ORDER BY ID DESC LIMIT 1 ");
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
                IDF.setText(ftxt);
            }else{
                IDF.setText("1001");
            }
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(rootPane,sql);
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        IDF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ANAMEF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ADDRESSF = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DESF = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        DATEF = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        MALEF = new javax.swing.JRadioButton();
        FEMALEF = new javax.swing.JRadioButton();
        OTHERF = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PHONEF = new javax.swing.JTextField();
        EMAILF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        UPDATEB = new javax.swing.JButton();
        DELETEB = new javax.swing.JButton();
        REFRESHB = new javax.swing.JButton();
        CLOSEB = new javax.swing.JButton();
        SEARCHB = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        ZIP = new javax.swing.JTextField();
        CITY = new javax.swing.JTextField();
        OCCUPATION = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(51, 51, 51));
        MainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADOPTEE DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Condensed", 1, 24), new java.awt.Color(0, 255, 0))); // NOI18N

        TablePanel.setBackground(new java.awt.Color(51, 51, 51));
        TablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AVAILABLE DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(153, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout TablePanelLayout = new javax.swing.GroupLayout(TablePanel);
        TablePanel.setLayout(TablePanelLayout);
        TablePanelLayout.setHorizontalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
        );
        TablePanelLayout.setVerticalGroup(
            TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(TablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID - ");

        IDF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADOPTEE NAME");

        ANAMEF.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        ANAMEF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");

        ADDRESSF.setColumns(20);
        ADDRESSF.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        ADDRESSF.setRows(5);
        ADDRESSF.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ADDRESSF);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESCRIPTION");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADOPTEE");

        DESF.setColumns(20);
        DESF.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        DESF.setLineWrap(true);
        DESF.setRows(5);
        jScrollPane3.setViewportView(DESF);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATE OF BIRTH");

        DATEF.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER");

        MALEF.setBackground(new java.awt.Color(51, 51, 51));
        MALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        MALEF.setForeground(new java.awt.Color(255, 255, 255));
        MALEF.setText("MALE");
        MALEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEFActionPerformed(evt);
            }
        });

        FEMALEF.setBackground(new java.awt.Color(51, 51, 51));
        FEMALEF.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        FEMALEF.setForeground(new java.awt.Color(255, 255, 255));
        FEMALEF.setText("FEMALE");
        FEMALEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALEFActionPerformed(evt);
            }
        });

        OTHERF.setBackground(new java.awt.Color(51, 51, 51));
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
        jLabel9.setText("PHONE NUMBER");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAIL - ID");

        PHONEF.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        PHONEF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PHONEF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PHONEFKeyPressed(evt);
            }
        });

        EMAILF.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        EMAILF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("+ 91");

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

        SEARCHB.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        SEARCHB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/search.png"))); // NOI18N
        SEARCHB.setText("SEARCH");
        SEARCHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ZIPCODE");

        ZIP.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        ZIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ZIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ZIPKeyPressed(evt);
            }
        });

        CITY.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        CITY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OCCUPATION.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        OCCUPATION.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CITY");

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("OCCUPATION");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(38, 38, 38)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SEARCHB))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(ANAMEF)
                                .addComponent(DATEF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(MALEF)
                                    .addGap(10, 10, 10)
                                    .addComponent(FEMALEF)
                                    .addGap(10, 10, 10)
                                    .addComponent(OTHERF))
                                .addComponent(EMAILF)
                                .addComponent(jScrollPane3)
                                .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CITY, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(OCCUPATION)
                                    .addGap(79, 79, 79)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PHONEF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(UPDATEB)
                        .addGap(18, 18, 18)
                        .addComponent(DELETEB)
                        .addGap(18, 18, 18)
                        .addComponent(REFRESHB)
                        .addGap(18, 18, 18)
                        .addComponent(CLOSEB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SEARCHB)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ANAMEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DATEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MALEF)
                            .addComponent(FEMALEF)
                            .addComponent(OTHERF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PHONEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(EMAILF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OCCUPATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATEB)
                    .addComponent(DELETEB)
                    .addComponent(REFRESHB)
                    .addComponent(CLOSEB))
                .addGap(19, 19, 19))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBActionPerformed
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Orphan.Adoptee_Details where ID = " + IDF.getText());
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                IDF.setText(null);
                ANAMEF.setText(null);
                ADDRESSF.setText(null);
                DESF.setText(null);
                DATEF.setDate(null);
                MALEF.setSelected(false);
                FEMALEF.setSelected(false);
                OTHERF.setSelected(false);
                PHONEF.setText(null);
                EMAILF.setText(null);
                ZIP.setText(null);
                CITY.setText(null);
                OCCUPATION.setText(null);
            } else {
                ANAMEF.setText(rs.getString("ADOPTEENAME"));
                ADDRESSF.setText(rs.getString("ADDRESS"));
                DESF.setText(rs.getString("DESCRIPTION"));
                DATEF.setDateFormatString(rs.getString("DOB"));
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
                PHONEF.setText(rs.getString("PHONENO"));
                EMAILF.setText(rs.getString("EMAIL"));
                ZIP.setText(rs.getString("ZIPCODE"));
                CITY.setText(rs.getString("CITY"));
                OCCUPATION.setText(rs.getString("OCCUPATION"));
            }
            JOptionPane.showMessageDialog(rootPane, "SEARCH SUCCESSFULLY!!");
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(rootPane, sql);
        }
    }//GEN-LAST:event_SEARCHBActionPerformed

    private void UPDATEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To UPDATE the Record?", "RECORD UPDATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
                PreparedStatement stmt = con.prepareStatement("UPDATE Adoptee_Details SET ADOPTEENAME = ?, ADDRESS = ?, DESCRIPTION = ?, DOB = ?, GENDER = ?, PHONENO = ?, EMAIL = ?, ZIPCODE = ?, CITY = ? ,OCCUPATION = ? WHERE ID = " + IDF.getText());
                stmt.setString(1,ANAMEF.getText());
                stmt.setString(2,ADDRESSF.getText());
                stmt.setString(3,DESF.getText());
                SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
                String date = dateF.format(DATEF.getDate());
                stmt.setString(4, date);
                if (MALEF.isSelected() == true) {
                    stmt.setString(5, MALEF.getText());
                }
                if(FEMALEF.isSelected() == true) {
                    stmt.setString(5, MALEF.getText());
                }
                if (OTHERF.isSelected() == true) {
                    stmt.setString(5, OTHERF.getText());
                }
                stmt.setString(6,PHONEF.getText());
                stmt.setString(7,EMAILF.getText());
                stmt.setString(8,ZIP.getText());
                stmt.setString(9,CITY.getText());
                stmt.setString(10,OCCUPATION.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY UPDATED THE RECORD!!");
            }catch(SQLException sql){
                JOptionPane.showMessageDialog(rootPane,"NO DATA FOND IN THE RECORDS");
            }Fetch();
         }
    }//GEN-LAST:event_UPDATEBActionPerformed

    private void DELETEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEBActionPerformed
         if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To DELETE the Record?", "DELETE RECORD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orphan","root","Root@123");
                PreparedStatement stmt = con.prepareStatement("DELETE from Adoptee_Details where ID = " +IDF.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY DELETED THE RECORD!!");
                    IDF.setText(null);
                    ANAMEF.setText(null);
                    ADDRESSF.setText(null);
                    DESF.setText(null);
                    DATEF.setDate(null);
                    MALEF.setSelected(false);
                    FEMALEF.setSelected(false);
                    OTHERF.setSelected(false);
                    PHONEF.setText(null);
                    EMAILF.setText(null);
                    ZIP.setText(null);
                    CITY.setText(null);
                    OCCUPATION.setText(null);
            }catch(SQLException sql){
                JOptionPane.showMessageDialog(rootPane,"NO DATA FOND IN THE RECORDS");
            }Fetch();
         }
    }//GEN-LAST:event_DELETEBActionPerformed

    private void REFRESHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHBActionPerformed
        IDF.setText(null);
        ANAMEF.setText(null);
        ADDRESSF.setText(null);
        DESF.setText(null);
        DATEF.setDate(null);
        MALEF.setSelected(false);
        FEMALEF.setSelected(false);
        OTHERF.setSelected(false);
        PHONEF.setText(null);
        EMAILF.setText(null);
        ZIP.setText(null);
        CITY.setText(null);
        OCCUPATION.setText(null);
    }//GEN-LAST:event_REFRESHBActionPerformed

    private void CLOSEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEBActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Go Back?", "BACK TO MENU", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            DashBoard dash = new DashBoard();
            dash.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CLOSEBActionPerformed

    private void UPDATEBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEBMousePressed
        UPDATEB.setBackground(Color.blue);
    }//GEN-LAST:event_UPDATEBMousePressed

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

    private void PHONEFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PHONEFKeyPressed
        String Phone = PHONEF.getText();
        int Length = Phone.length();
        char c = evt.getKeyChar();
        // To check Number 0 to 9
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <='9') {
            // To check if length is not more than 10
            if(Length < 6){
                //is less than 6
                PHONEF.setEditable(true);
            } else {
                //else false
                PHONEF.setEditable(false);
            }
        } else {
            //To allow the keys to perform Backspace and Delete for editable mode
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                PHONEF.setEditable(true);
            } else {
                PHONEF.setEditable(false);
            }
        }
    }//GEN-LAST:event_PHONEFKeyPressed

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
            java.util.logging.Logger.getLogger(AdopteeDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdopteeDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdopteeDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdopteeDView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdopteeDView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ADDRESSF;
    private javax.swing.JTextField ANAMEF;
    private javax.swing.JTextField CITY;
    private javax.swing.JButton CLOSEB;
    private com.toedter.calendar.JDateChooser DATEF;
    private javax.swing.JButton DELETEB;
    private javax.swing.JTextArea DESF;
    private javax.swing.JTextField EMAILF;
    private javax.swing.JRadioButton FEMALEF;
    private javax.swing.JTextField IDF;
    private javax.swing.JRadioButton MALEF;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField OCCUPATION;
    private javax.swing.JRadioButton OTHERF;
    private javax.swing.JTextField PHONEF;
    private javax.swing.JButton REFRESHB;
    private javax.swing.JButton SEARCHB;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JButton UPDATEB;
    private javax.swing.JTextField ZIP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
