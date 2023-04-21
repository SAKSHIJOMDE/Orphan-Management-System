package Extras;

import AdminPanel.LoginForm;
import UserInterface.AboutUs;
import UserInterface.ContactUs;
import UserInterface.Donation;
import UserInterface.SupportUs;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Slider = new javax.swing.JPanel();
        LOGO1 = new javax.swing.JLabel();
        ABOUT = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AboutUs = new javax.swing.JLabel();
        Contact = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ContactUs = new javax.swing.JLabel();
        ADMIN = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        AdminLogin = new javax.swing.JLabel();
        SUPPORT = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        SUPPORTL = new javax.swing.JLabel();
        DONATION = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        DONATIONL = new javax.swing.JLabel();
        EXIT = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        EXITL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ORPHANLOGO = new javax.swing.JLabel();
        WELCOME = new javax.swing.JLabel();
        WORLD = new javax.swing.JLabel();
        ORPHAN = new javax.swing.JLabel();
        PUSHOUT = new javax.swing.JLabel();
        UPPERPANEL = new javax.swing.JPanel();
        TITLE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Slider.setBackground(new java.awt.Color(54, 70, 78));

        LOGO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/list.png"))); // NOI18N
        LOGO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGO1MouseClicked(evt);
            }
        });

        ABOUT.setBackground(new java.awt.Color(54, 70, 78));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/info.png"))); // NOI18N

        AboutUs.setBackground(new java.awt.Color(54, 70, 78));
        AboutUs.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setText("About Us");
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ABOUTLayout = new javax.swing.GroupLayout(ABOUT);
        ABOUT.setLayout(ABOUTLayout);
        ABOUTLayout.setHorizontalGroup(
            ABOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABOUTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(AboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ABOUTLayout.setVerticalGroup(
            ABOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABOUTLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(AboutUs)
                .addGap(19, 19, 19))
        );

        Contact.setBackground(new java.awt.Color(54, 70, 78));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/contact.png"))); // NOI18N

        ContactUs.setBackground(new java.awt.Color(54, 70, 78));
        ContactUs.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ContactUs.setForeground(new java.awt.Color(255, 255, 255));
        ContactUs.setText("Contact Us");
        ContactUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContactLayout = new javax.swing.GroupLayout(Contact);
        Contact.setLayout(ContactLayout);
        ContactLayout.setHorizontalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(ContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContactLayout.setVerticalGroup(
            ContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContactLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContactUs)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ADMIN.setBackground(new java.awt.Color(54, 70, 78));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/dashboard.png"))); // NOI18N

        AdminLogin.setBackground(new java.awt.Color(54, 70, 78));
        AdminLogin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin.setText("Admin Login");
        AdminLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ADMINLayout = new javax.swing.GroupLayout(ADMIN);
        ADMIN.setLayout(ADMINLayout);
        ADMINLayout.setHorizontalGroup(
            ADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ADMINLayout.setVerticalGroup(
            ADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ADMINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SUPPORT.setBackground(new java.awt.Color(54, 70, 78));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/customer.png"))); // NOI18N

        SUPPORTL.setBackground(new java.awt.Color(54, 70, 78));
        SUPPORTL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        SUPPORTL.setForeground(new java.awt.Color(255, 255, 255));
        SUPPORTL.setText("SUPPORT US");
        SUPPORTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUPPORTLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SUPPORTLayout = new javax.swing.GroupLayout(SUPPORT);
        SUPPORT.setLayout(SUPPORTLayout);
        SUPPORTLayout.setHorizontalGroup(
            SUPPORTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SUPPORTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(SUPPORTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SUPPORTLayout.setVerticalGroup(
            SUPPORTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SUPPORTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SUPPORTL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DONATION.setBackground(new java.awt.Color(54, 70, 78));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/charity.png"))); // NOI18N

        DONATIONL.setBackground(new java.awt.Color(54, 70, 78));
        DONATIONL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        DONATIONL.setForeground(new java.awt.Color(255, 255, 255));
        DONATIONL.setText("DONATION");
        DONATIONL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DONATIONLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DONATIONLayout = new javax.swing.GroupLayout(DONATION);
        DONATION.setLayout(DONATIONLayout);
        DONATIONLayout.setHorizontalGroup(
            DONATIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DONATIONLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DONATIONL, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DONATIONLayout.setVerticalGroup(
            DONATIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DONATIONLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DONATIONL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EXIT.setBackground(new java.awt.Color(54, 70, 78));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/power.png"))); // NOI18N

        EXITL.setBackground(new java.awt.Color(54, 70, 78));
        EXITL.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        EXITL.setForeground(new java.awt.Color(255, 255, 255));
        EXITL.setText("EXIT");
        EXITL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EXITLayout = new javax.swing.GroupLayout(EXIT);
        EXIT.setLayout(EXITLayout);
        EXITLayout.setHorizontalGroup(
            EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EXITLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(EXITL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EXITLayout.setVerticalGroup(
            EXITLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EXITLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EXITL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SliderLayout = new javax.swing.GroupLayout(Slider);
        Slider.setLayout(SliderLayout);
        SliderLayout.setHorizontalGroup(
            SliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SliderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGO1)
                .addGap(27, 27, 27))
            .addComponent(ABOUT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SUPPORT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DONATION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SliderLayout.setVerticalGroup(
            SliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SliderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LOGO1)
                .addGap(37, 37, 37)
                .addComponent(ABOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SUPPORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DONATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        MainPanel.add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 210, 550));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ORPHANLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/ORPHAN.jpg"))); // NOI18N
        jPanel3.add(ORPHANLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 400));

        WELCOME.setBackground(new java.awt.Color(51, 102, 255));
        WELCOME.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        WELCOME.setText("Welcome  to");
        jPanel3.add(WELCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 251, 47));

        WORLD.setBackground(new java.awt.Color(0, 255, 0));
        WORLD.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        WORLD.setText("World");
        jPanel3.add(WORLD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 159, -1));

        ORPHAN.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        ORPHAN.setForeground(new java.awt.Color(255, 102, 51));
        ORPHAN.setText("Orphan's");
        jPanel3.add(ORPHAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 10, -1, -1));

        MainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 800, 550));

        PUSHOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/right-arrow.png"))); // NOI18N
        PUSHOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PUSHOUTMouseClicked(evt);
            }
        });
        MainPanel.add(PUSHOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 50));

        UPPERPANEL.setBackground(new java.awt.Color(54, 70, 78));

        TITLE.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("ORPHAN MANAGEMENT SYSTEM");

        javax.swing.GroupLayout UPPERPANELLayout = new javax.swing.GroupLayout(UPPERPANEL);
        UPPERPANEL.setLayout(UPPERPANELLayout);
        UPPERPANELLayout.setHorizontalGroup(
            UPPERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(UPPERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TITLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE))
        );
        UPPERPANELLayout.setVerticalGroup(
            UPPERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(UPPERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UPPERPANELLayout.createSequentialGroup()
                    .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainPanel.add(UPPERPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x = 210;
    private void LOGO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGO1MouseClicked
        if (x == 210) {
            Slider.show();
            Slider.setSize(210,552);
            Thread th;
            th = new Thread() {
                @Override
                public void run(){
                    try {
                        for (int i = 210; i >= 0; i--) {
                            Thread.sleep(1);
                            Slider.setSize(i,552);
                        }
                    }catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
th.start();
        x = 0;
        }
    }//GEN-LAST:event_LOGO1MouseClicked

    private void PUSHOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PUSHOUTMouseClicked
        if (x == 0) {
            Slider.show();
            Slider.setSize(x,552);
            Thread th;
            th = new Thread() {
                @Override
                public void run(){
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(1);
                            Slider.setSize(i,552);
                        }
                    }catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
th.start();
        x = 210;
        }
    }//GEN-LAST:event_PUSHOUTMouseClicked

    private void AboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseClicked
        AboutUs about = new AboutUs();
        about.setVisible(true);
        dispose();
    }//GEN-LAST:event_AboutUsMouseClicked

    private void ContactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactUsMouseClicked
        ContactUs contact = new ContactUs();
        contact.setVisible(true);
        dispose();
    }//GEN-LAST:event_ContactUsMouseClicked

    private void AdminLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminLoginMouseClicked
        LoginForm log = new LoginForm();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdminLoginMouseClicked

    private void SUPPORTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUPPORTLMouseClicked
        SupportUs support = new SupportUs();
        support.setVisible(true);
        dispose();
    }//GEN-LAST:event_SUPPORTLMouseClicked

    private void DONATIONLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DONATIONLMouseClicked
        Donation donate = new Donation();
        donate.setVisible(true);
        dispose();
    }//GEN-LAST:event_DONATIONLMouseClicked

    private void EXITLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITLMouseClicked
         if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Exit?", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_EXITLMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABOUT;
    private javax.swing.JPanel ADMIN;
    private javax.swing.JLabel AboutUs;
    private javax.swing.JLabel AdminLogin;
    private javax.swing.JPanel Contact;
    private javax.swing.JLabel ContactUs;
    private javax.swing.JPanel DONATION;
    private javax.swing.JLabel DONATIONL;
    private javax.swing.JPanel EXIT;
    private javax.swing.JLabel EXITL;
    private javax.swing.JLabel LOGO1;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ORPHAN;
    private javax.swing.JLabel ORPHANLOGO;
    private javax.swing.JLabel PUSHOUT;
    private javax.swing.JPanel SUPPORT;
    private javax.swing.JLabel SUPPORTL;
    private javax.swing.JPanel Slider;
    private javax.swing.JLabel TITLE;
    private javax.swing.JPanel UPPERPANEL;
    private javax.swing.JLabel WELCOME;
    private javax.swing.JLabel WORLD;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
