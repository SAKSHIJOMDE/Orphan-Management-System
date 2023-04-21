package UserInterface;

import AdminPanel.DashBoard;
import AdminPanel.LoginForm;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainMenuInterface extends javax.swing.JFrame {

    boolean a = true;
    public MainMenuInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TITLE = new javax.swing.JLabel();
        MinMax = new javax.swing.JPanel();
        Close = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Max = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        Nav = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lineMenu = new javax.swing.JPanel();
        HideMenu = new javax.swing.JPanel();
        ButtonHide = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        MenuHide = new javax.swing.JPanel();
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
        Dashboard = new javax.swing.JPanel();
        ORPHANLOGO = new javax.swing.JLabel();
        TITLE1 = new javax.swing.JLabel();
        TITLE2 = new javax.swing.JLabel();
        TITLE4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(5, 10, 46));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));

        TITLE.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE.setText("ORPHAN MANAGEMENT SYSTEM");

        MinMax.setBackground(new java.awt.Color(5, 10, 46));
        MinMax.setPreferredSize(new java.awt.Dimension(150, 50));
        MinMax.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(0, 102, 51));
        Close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Close.setPreferredSize(new java.awt.Dimension(50, 50));
        Close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Close.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        MinMax.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, -1));

        Max.setBackground(new java.awt.Color(153, 153, 153));
        Max.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Max.setPreferredSize(new java.awt.Dimension(50, 50));
        Max.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        max.setBackground(new java.awt.Color(255, 255, 255));
        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/fullscreen.png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxMouseExited(evt);
            }
        });
        Max.add(max, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        MinMax.add(Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, -1));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(TITLE)
                .addGap(253, 253, 253)
                .addComponent(MinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MinMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Nav.setBackground(new java.awt.Color(25, 29, 74));
        Nav.setPreferredSize(new java.awt.Dimension(270, 450));
        Nav.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(5, 10, 46));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(5, 10, 46));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineMenu.setBackground(new java.awt.Color(5, 10, 46));

        javax.swing.GroupLayout lineMenuLayout = new javax.swing.GroupLayout(lineMenu);
        lineMenu.setLayout(lineMenuLayout);
        lineMenuLayout.setHorizontalGroup(
            lineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineMenuLayout.setVerticalGroup(
            lineMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(lineMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        HideMenu.setBackground(new java.awt.Color(5, 10, 46));
        HideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/list.png"))); // NOI18N
        ButtonHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonHideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonHideMouseExited(evt);
            }
        });
        HideMenu.add(ButtonHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, 40, 36));

        jPanel2.add(HideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        jPanel4.setBackground(new java.awt.Color(5, 10, 46));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 10));

        MenuIcon.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        Nav.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        MenuHide.setBackground(new java.awt.Color(35, 55, 60));

        ABOUT.setBackground(new java.awt.Color(54, 70, 78));
        ABOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ABOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ABOUTMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/info.png"))); // NOI18N

        AboutUs.setBackground(new java.awt.Color(54, 70, 78));
        AboutUs.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        AboutUs.setForeground(new java.awt.Color(255, 255, 255));
        AboutUs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AboutUs, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ABOUTLayout.setVerticalGroup(
            ABOUTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABOUTLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AboutUs)
                .addContainerGap())
        );

        Contact.setBackground(new java.awt.Color(54, 70, 78));
        Contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContactMouseExited(evt);
            }
        });

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
                .addComponent(ContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
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
        ADMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADMINMouseExited(evt);
            }
        });

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
        SUPPORT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SUPPORTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SUPPORTMouseExited(evt);
            }
        });

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
        DONATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DONATIONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DONATIONMouseExited(evt);
            }
        });

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
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EXITMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EXITMouseExited(evt);
            }
        });

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

        javax.swing.GroupLayout MenuHideLayout = new javax.swing.GroupLayout(MenuHide);
        MenuHide.setLayout(MenuHideLayout);
        MenuHideLayout.setHorizontalGroup(
            MenuHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuHideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ABOUT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SUPPORT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DONATION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuHideLayout.setVerticalGroup(
            MenuHideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuHideLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ABOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SUPPORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DONATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        Nav.add(MenuHide, java.awt.BorderLayout.CENTER);

        getContentPane().add(Nav, java.awt.BorderLayout.LINE_START);

        Dashboard.setBackground(new java.awt.Color(25, 29, 60));

        ORPHANLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/ORPHAN.jpg"))); // NOI18N

        TITLE1.setBackground(new java.awt.Color(2, 10, 46));
        TITLE1.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(255, 255, 255));
        TITLE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE1.setText("Welcome to");

        TITLE2.setBackground(new java.awt.Color(2, 10, 46));
        TITLE2.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        TITLE2.setForeground(new java.awt.Color(255, 255, 255));
        TITLE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE2.setText("Orphan's");

        TITLE4.setBackground(new java.awt.Color(255, 255, 255));
        TITLE4.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        TITLE4.setForeground(new java.awt.Color(0, 204, 0));
        TITLE4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITLE4.setText("World!!");

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ORPHANLOGO)
                .addGap(26, 26, 26)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardLayout.createSequentialGroup()
                        .addComponent(TITLE1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TITLE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TITLE4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                        .addComponent(TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TITLE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TITLE4)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createSequentialGroup()
                        .addComponent(ORPHANLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        getContentPane().add(Dashboard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(799, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
    public void changeBColoronEnter(){
        
    }
    
    public void clickMenu(JPanel h1, int numberBool) {
        if (numberBool == 1) {
            h1.setBackground(new Color(25,29,74));
            //h2.setBackground(new Color(5,10,46));
        } else {
            h1.setBackground(new Color(5,10,46));
            //h2.setBackground(new Color(25,29,74));
        }
    }
    
    public void hideShow(JPanel menuShowHide, boolean dashboard){
        if(dashboard == true){
            menuShowHide.setPreferredSize(new Dimension(50,menuShowHide.getHeight()));
        } else{
            menuShowHide.setPreferredSize(new Dimension(270,menuShowHide.getHeight()));
        }
    }
    
    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changeColor(Close, new Color(208, 46, 39));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changeColor(Close, new Color(208, 46, 39));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        if (JOptionPane.showConfirmDialog(rootPane, "Are You Sure You Want To Exit?", "EXIT", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if(this.getExtendedState()!=MainMenuInterface.MAXIMIZED_BOTH) {
            this.setExtendedState(MainMenuInterface.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(MainMenuInterface.NORMAL);
        }
    }//GEN-LAST:event_maxMouseClicked

    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
        changeColor(Max, new Color(0,102,51));
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
       changeColor(Max, new Color(0,102,51));
    }//GEN-LAST:event_maxMouseExited

    private void ButtonHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMouseClicked
        clickMenu(HideMenu, 1);
        if (a == true) {
            hideShow(Nav, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
        } else {
            hideShow(Nav, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }
    }//GEN-LAST:event_ButtonHideMouseClicked

    private void ButtonHideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMouseEntered
        changeColor(lineMenu, new Color(247,78,105));
    }//GEN-LAST:event_ButtonHideMouseEntered

    private void ButtonHideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMouseExited
        changeColor(lineMenu, new Color(5,10,46));
    }//GEN-LAST:event_ButtonHideMouseExited

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

    private void ABOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABOUTMouseEntered
        ABOUT.setBackground(Color.white);
        AboutUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_ABOUTMouseEntered

    private void ABOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABOUTMouseExited
        ABOUT.setBackground(new Color(54,70,78));
        AboutUs.setForeground(Color.white);
    }//GEN-LAST:event_ABOUTMouseExited

    private void ContactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseEntered
        Contact.setBackground(Color.white);
        ContactUs.setForeground(Color.BLACK);
    }//GEN-LAST:event_ContactMouseEntered

    private void ContactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactMouseExited
        Contact.setBackground(new Color(54,70,78));
        ContactUs.setForeground(Color.white);
    }//GEN-LAST:event_ContactMouseExited

    private void ADMINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseEntered
        ADMIN.setBackground(Color.white);
        AdminLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_ADMINMouseEntered

    private void ADMINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseExited
        ADMIN.setBackground(new Color(54,70,78));
        AdminLogin.setForeground(Color.white);
    }//GEN-LAST:event_ADMINMouseExited

    private void SUPPORTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUPPORTMouseEntered
        SUPPORT.setBackground(Color.white);
        SUPPORTL.setForeground(Color.BLACK);
    }//GEN-LAST:event_SUPPORTMouseEntered

    private void SUPPORTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUPPORTMouseExited
        SUPPORT.setBackground(new Color(54,70,78));
        SUPPORTL.setForeground(Color.white);
    }//GEN-LAST:event_SUPPORTMouseExited

    private void DONATIONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DONATIONMouseEntered
        DONATION.setBackground(Color.white);
        DONATIONL.setForeground(Color.BLACK);
    }//GEN-LAST:event_DONATIONMouseEntered

    private void DONATIONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DONATIONMouseExited
        DONATION.setBackground(new Color(54,70,78));
        DONATIONL.setForeground(Color.white);
    }//GEN-LAST:event_DONATIONMouseExited

    private void EXITMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseEntered
        EXIT.setBackground(new Color(205,0,0));
        EXITL.setForeground(Color.BLACK);
    }//GEN-LAST:event_EXITMouseEntered

    private void EXITMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseExited
        EXIT.setBackground(new Color(54,70,78));
        EXITL.setForeground(Color.white);
    }//GEN-LAST:event_EXITMouseExited


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainMenuInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABOUT;
    private javax.swing.JPanel ADMIN;
    private javax.swing.JLabel AboutUs;
    private javax.swing.JLabel AdminLogin;
    private javax.swing.JLabel ButtonHide;
    private javax.swing.JPanel Close;
    private javax.swing.JPanel Contact;
    private javax.swing.JLabel ContactUs;
    private javax.swing.JPanel DONATION;
    private javax.swing.JLabel DONATIONL;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel EXIT;
    private javax.swing.JLabel EXITL;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HideMenu;
    private javax.swing.JPanel Max;
    private javax.swing.JPanel MenuHide;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel MinMax;
    private javax.swing.JPanel Nav;
    private javax.swing.JLabel ORPHANLOGO;
    private javax.swing.JPanel SUPPORT;
    private javax.swing.JLabel SUPPORTL;
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JLabel TITLE2;
    private javax.swing.JLabel TITLE4;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel lineMenu;
    private javax.swing.JLabel max;
    // End of variables declaration//GEN-END:variables
}
