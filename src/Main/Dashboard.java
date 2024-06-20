package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

        final String passsword="";
        final String userName="root";
        final String URL="jdbc:mysql://localhost:3306/myshare";
        Connection conn = null;
        PreparedStatement Insertps=null;
    public Dashboard() {
        initComponents();
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
        
                conn=DriverManager.getConnection(URL,userName , passsword);
            } catch (SQLException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            catch (ClassNotFoundException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        this.setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(222, 4, 4)));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/logo11.png")));
        
        ComponentResizer cr = new ComponentResizer();
        cr.registerComponent(this);
        cr.setSnapSize(new Dimension(1, 1));
        cr.setMaximumSize(new Dimension(2147483647, 2147483647));
        cr.setMinimumSize(new Dimension(1000, 550));
        
        panel_Suppliers.setVisible(false);
        
        

      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        CloseWindow = new javax.swing.JLabel();
        MinimizeWindow = new javax.swing.JLabel();
        MaximizeWindow = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        LeftBar = new javax.swing.JPanel();
        Button1 = new javax.swing.JPanel();
        Icon1 = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Button3 = new javax.swing.JPanel();
        Text2 = new javax.swing.JLabel();
        Icon2 = new javax.swing.JLabel();
        Button4 = new javax.swing.JPanel();
        Icon3 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        Button5 = new javax.swing.JPanel();
        Icon4 = new javax.swing.JLabel();
        Text4 = new javax.swing.JLabel();
        Button6 = new javax.swing.JPanel();
        Icon5 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();
        Button7 = new javax.swing.JPanel();
        Icon7 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Button8 = new javax.swing.JPanel();
        Text6 = new javax.swing.JLabel();
        Icon6 = new javax.swing.JLabel();
        MainContent = new javax.swing.JPanel();
        MainContainer = new javax.swing.JLayeredPane();
        panel_Dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_Reports = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pincode3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_Order = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbldd = new javax.swing.JLabel();
        lblp = new javax.swing.JLabel();
        txtdd = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnadd = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnup = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panel_Manage_Employee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pincode1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbid2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbiid2 = new javax.swing.JLabel();
        lbiname2 = new javax.swing.JLabel();
        lbp2 = new javax.swing.JLabel();
        txttiid2 = new javax.swing.JTextField();
        txttid2 = new javax.swing.JTextField();
        txttiname2 = new javax.swing.JTextField();
        txttp2 = new javax.swing.JTextField();
        botnedit = new javax.swing.JButton();
        botndelete = new javax.swing.JButton();
        botnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        panel_Suppliers = new javax.swing.JPanel();
        lblid1 = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        lbldd1 = new javax.swing.JLabel();
        lblp1 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        txtdd1 = new javax.swing.JTextField();
        txtp1 = new javax.swing.JTextField();
        btnadd1 = new javax.swing.JButton();
        btnremove1 = new javax.swing.JButton();
        btnup1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panel_Reports2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panel_Manage_Employee2 = new javax.swing.JPanel();
        lblid2 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        txtid2 = new javax.swing.JTextField();
        txtnum = new javax.swing.JTextField();
        btnaddemp = new javax.swing.JButton();
        btnremoveemp = new javax.swing.JButton();
        btnupemp = new javax.swing.JButton();
        lblname3 = new javax.swing.JLabel();
        lblname4 = new javax.swing.JLabel();
        txtname2 = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(217, 22, 22));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Header.setPreferredSize(new java.awt.Dimension(1050, 60));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        CloseWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close Window_32px_8.png"))); // NOI18N
        CloseWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CloseWindow.setPreferredSize(new java.awt.Dimension(32, 60));
        CloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseWindowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseWindowMouseExited(evt);
            }
        });

        MinimizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Minimize Window_32px_8.png"))); // NOI18N
        MinimizeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MinimizeWindow.setPreferredSize(new java.awt.Dimension(32, 60));
        MinimizeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeWindowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeWindowMouseExited(evt);
            }
        });

        MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Maximize Window_32px_7.png"))); // NOI18N
        MaximizeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MaximizeWindow.setPreferredSize(new java.awt.Dimension(32, 60));
        MaximizeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaximizeWindowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaximizeWindowMouseExited(evt);
            }
        });

        Title.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("My Share");
        Title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(MinimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaximizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MaximizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MinimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftBar.setBackground(new java.awt.Color(255, 255, 255));
        LeftBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(8, 61, 65)));
        LeftBar.setPreferredSize(new java.awt.Dimension(250, 490));

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setPreferredSize(new java.awt.Dimension(250, 40));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });

        Icon1.setBackground(new java.awt.Color(51, 51, 51));
        Icon1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon1.setForeground(new java.awt.Color(255, 255, 255));
        Icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Combo Chart_24px_2.png"))); // NOI18N
        Icon1.setPreferredSize(new java.awt.Dimension(24, 40));

        Text1.setBackground(new java.awt.Color(51, 51, 51));
        Text1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text1.setForeground(new java.awt.Color(102, 102, 102));
        Text1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text1.setText("Dashboard");
        Text1.setPreferredSize(new java.awt.Dimension(250, 35));

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Text1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Welcome.setBackground(new java.awt.Color(255, 255, 255));
        Welcome.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo11.png"))); // NOI18N
        Welcome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Welcome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(8, 61, 65)));
        Welcome.setPreferredSize(new java.awt.Dimension(250, 35));

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setPreferredSize(new java.awt.Dimension(250, 40));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });

        Text2.setBackground(new java.awt.Color(51, 51, 51));
        Text2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text2.setForeground(new java.awt.Color(102, 102, 102));
        Text2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text2.setText("Order");
        Text2.setPreferredSize(new java.awt.Dimension(250, 35));

        Icon2.setBackground(new java.awt.Color(51, 51, 51));
        Icon2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon2.setForeground(new java.awt.Color(255, 255, 255));
        Icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Purchase Order_24px.png"))); // NOI18N
        Icon2.setPreferredSize(new java.awt.Dimension(24, 40));

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Text2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.setPreferredSize(new java.awt.Dimension(250, 40));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });

        Icon3.setBackground(new java.awt.Color(51, 51, 51));
        Icon3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon3.setForeground(new java.awt.Color(255, 255, 255));
        Icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Tags_24px.png"))); // NOI18N
        Icon3.setPreferredSize(new java.awt.Dimension(24, 40));

        Text3.setBackground(new java.awt.Color(51, 51, 51));
        Text3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text3.setForeground(new java.awt.Color(102, 102, 102));
        Text3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text3.setText("Suppliers");
        Text3.setPreferredSize(new java.awt.Dimension(250, 35));

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(Text3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.setPreferredSize(new java.awt.Dimension(250, 40));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });

        Icon4.setBackground(new java.awt.Color(51, 51, 51));
        Icon4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon4.setForeground(new java.awt.Color(255, 255, 255));
        Icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Refund_24px.png"))); // NOI18N
        Icon4.setPreferredSize(new java.awt.Dimension(24, 40));

        Text4.setBackground(new java.awt.Color(51, 51, 51));
        Text4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text4.setForeground(new java.awt.Color(102, 102, 102));
        Text4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text4.setText("Inventory");
        Text4.setPreferredSize(new java.awt.Dimension(250, 35));

        javax.swing.GroupLayout Button5Layout = new javax.swing.GroupLayout(Button5);
        Button5.setLayout(Button5Layout);
        Button5Layout.setHorizontalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Icon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Button5Layout.setVerticalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Button5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Button6.setBackground(new java.awt.Color(255, 255, 255));
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.setPreferredSize(new java.awt.Dimension(250, 40));
        Button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button6MouseExited(evt);
            }
        });

        Icon5.setBackground(new java.awt.Color(51, 51, 51));
        Icon5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon5.setForeground(new java.awt.Color(255, 255, 255));
        Icon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Pie Chart_24px.png"))); // NOI18N
        Icon5.setPreferredSize(new java.awt.Dimension(24, 40));

        Text5.setBackground(new java.awt.Color(51, 51, 51));
        Text5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text5.setForeground(new java.awt.Color(102, 102, 102));
        Text5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text5.setText("Manage Employee");
        Text5.setPreferredSize(new java.awt.Dimension(250, 35));

        javax.swing.GroupLayout Button6Layout = new javax.swing.GroupLayout(Button6);
        Button6.setLayout(Button6Layout);
        Button6Layout.setHorizontalGroup(
            Button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Button6Layout.setVerticalGroup(
            Button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Text5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button7.setBackground(new java.awt.Color(255, 255, 255));
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.setPreferredSize(new java.awt.Dimension(250, 40));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button7MouseExited(evt);
            }
        });

        Icon7.setBackground(new java.awt.Color(51, 51, 51));
        Icon7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon7.setForeground(new java.awt.Color(255, 255, 255));
        Icon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Google Alerts_24px.png"))); // NOI18N
        Icon7.setPreferredSize(new java.awt.Dimension(24, 40));

        Text7.setBackground(new java.awt.Color(51, 51, 51));
        Text7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text7.setForeground(new java.awt.Color(102, 102, 102));
        Text7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text7.setText("Log out");
        Text7.setPreferredSize(new java.awt.Dimension(250, 35));

        javax.swing.GroupLayout Button7Layout = new javax.swing.GroupLayout(Button7);
        Button7.setLayout(Button7Layout);
        Button7Layout.setHorizontalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        Button7Layout.setVerticalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Text7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button8.setBackground(new java.awt.Color(255, 255, 255));
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.setPreferredSize(new java.awt.Dimension(250, 40));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button8MouseExited(evt);
            }
        });

        Text6.setBackground(new java.awt.Color(51, 51, 51));
        Text6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Text6.setForeground(new java.awt.Color(102, 102, 102));
        Text6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Text6.setText("Reports");
        Text6.setPreferredSize(new java.awt.Dimension(250, 35));

        Icon6.setBackground(new java.awt.Color(51, 51, 51));
        Icon6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Icon6.setForeground(new java.awt.Color(255, 255, 255));
        Icon6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Tax_24px.png"))); // NOI18N
        Icon6.setPreferredSize(new java.awt.Dimension(24, 40));

        javax.swing.GroupLayout Button8Layout = new javax.swing.GroupLayout(Button8);
        Button8.setLayout(Button8Layout);
        Button8Layout.setHorizontalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        Button8Layout.setVerticalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Text6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LeftBarLayout = new javax.swing.GroupLayout(LeftBar);
        LeftBar.setLayout(LeftBarLayout);
        LeftBarLayout.setHorizontalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(Button8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftBarLayout.createSequentialGroup()
                        .addGroup(LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addGap(2, 2, 2))))
        );
        LeftBarLayout.setVerticalGroup(
            LeftBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftBarLayout.createSequentialGroup()
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        MainContent.setBackground(new java.awt.Color(255, 255, 255));
        MainContent.setPreferredSize(new java.awt.Dimension(750, 490));

        MainContainer.setBackground(new java.awt.Color(157, 204, 188));
        MainContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MainContainer.setOpaque(true);
        MainContainer.setPreferredSize(new java.awt.Dimension(750, 310));
        MainContainer.setLayout(new java.awt.CardLayout());

        panel_Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        panel_Dashboard.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Welcome to MyShare");
        panel_Dashboard.add(jLabel1);
        jLabel1.setBounds(160, 190, 240, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dashboard2.jpg"))); // NOI18N
        panel_Dashboard.add(jLabel2);
        jLabel2.setBounds(-20, -20, 740, 590);

        MainContainer.add(panel_Dashboard, "card4");

        panel_Reports.setBackground(new java.awt.Color(255, 255, 255));
        panel_Reports.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");
        panel_Reports.add(jLabel3);
        jLabel3.setBounds(300, 280, 49, 25);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel_Reports.add(jButton2);
        jButton2.setBounds(250, 275, 143, 40);

        pincode3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        panel_Reports.add(pincode3);
        pincode3.setBounds(220, 222, 200, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Enter 4 pin code");
        panel_Reports.add(jLabel11);
        jLabel11.setBounds(270, 180, 120, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dashboard2.jpg"))); // NOI18N
        panel_Reports.add(jLabel12);
        jLabel12.setBounds(0, 0, 640, 510);

        MainContainer.add(panel_Reports, "card7");

        panel_Order.setBackground(new java.awt.Color(255, 255, 255));
        panel_Order.setForeground(new java.awt.Color(255, 255, 255));
        panel_Order.setOpaque(false);
        panel_Order.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblid.setText("ID");

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname.setText("Name");

        lbldd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbldd.setText("Delivery date");

        lblp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblp.setText("Price");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Delivery date", "Price"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnremove.setText("REMOVE");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnup.setText("UPDATE");
        btnup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(18, 18, 18)
                                .addComponent(btnremove)
                                .addGap(18, 18, 18)
                                .addComponent(btnup))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbldd)
                                    .addComponent(lblp)
                                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid)
                                    .addComponent(txtname)
                                    .addComponent(txtdd)
                                    .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldd)
                    .addComponent(txtdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblp))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnremove)
                    .addComponent(btnup))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Order.add(jPanel1);
        jPanel1.setBounds(0, 34, 751, 496);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        panel_Order.add(jPanel3);
        jPanel3.setBounds(0, 0, 670, 540);

        MainContainer.add(panel_Order, "Purchases");

        panel_Manage_Employee.setBackground(new java.awt.Color(255, 255, 255));
        panel_Manage_Employee.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        panel_Manage_Employee.add(jLabel4);
        jLabel4.setBounds(270, 270, 70, 32);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Enter 4 pin code");
        panel_Manage_Employee.add(jLabel7);
        jLabel7.setBounds(240, 160, 110, 20);

        pincode1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 3));
        pincode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincode1ActionPerformed(evt);
            }
        });
        panel_Manage_Employee.add(pincode1);
        pincode1.setBounds(180, 210, 230, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel_Manage_Employee.add(jButton1);
        jButton1.setBounds(220, 270, 150, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dashboard2.jpg"))); // NOI18N
        panel_Manage_Employee.add(jLabel8);
        jLabel8.setBounds(0, 0, 630, 500);

        MainContainer.add(panel_Manage_Employee, "card6");

        lbid2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Inventory");

        jLabel9.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel9.setText("ID");

        lbiid2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        lbiid2.setText("Item ID");

        lbiname2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        lbiname2.setText("Item Name");

        lbp2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        lbp2.setText("Price");

        botnedit.setBackground(new java.awt.Color(255, 51, 51));
        botnedit.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        botnedit.setText("EDIT");
        botnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botneditActionPerformed(evt);
            }
        });

        botndelete.setBackground(new java.awt.Color(255, 51, 51));
        botndelete.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        botndelete.setText("DELETE");
        botndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botndeleteActionPerformed(evt);
            }
        });

        botnadd.setBackground(new java.awt.Color(255, 51, 51));
        botnadd.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        botnadd.setText("ADD");
        botnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botnaddActionPerformed(evt);
            }
        });

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item ID", "Item Name", "Price"
            }
        ));
        jTable12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable12MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable12);

        javax.swing.GroupLayout lbid2Layout = new javax.swing.GroupLayout(lbid2);
        lbid2.setLayout(lbid2Layout);
        lbid2Layout.setHorizontalGroup(
            lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbid2Layout.createSequentialGroup()
                .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbid2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbiid2)
                            .addComponent(lbiname2)
                            .addComponent(jLabel9)
                            .addComponent(lbp2))
                        .addGap(85, 85, 85)
                        .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttid2)
                            .addComponent(txttiid2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txttiname2)
                            .addComponent(txttp2)))
                    .addGroup(lbid2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(114, 114, 114)
                .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(botnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(lbid2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lbid2Layout.setVerticalGroup(
            lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbid2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(66, 66, 66)
                .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lbid2Layout.createSequentialGroup()
                        .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttiid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbiid2))
                        .addGap(32, 32, 32)
                        .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(lbid2Layout.createSequentialGroup()
                                .addComponent(lbiname2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(lbid2Layout.createSequentialGroup()
                                .addComponent(txttiname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))
                    .addGroup(lbid2Layout.createSequentialGroup()
                        .addComponent(botnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(botnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lbid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbp2)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainContainer.add(lbid2, "card5");

        panel_Suppliers.setBackground(new java.awt.Color(255, 102, 102));

        lblid1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblid1.setText("ID");

        lblname1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblname1.setText("Name");

        lbldd1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lbldd1.setText("Delivery date");

        lblp1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblp1.setText("Price");

        btnadd1.setBackground(new java.awt.Color(255, 255, 0));
        btnadd1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnadd1.setText("ADD");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });

        btnremove1.setBackground(new java.awt.Color(255, 255, 0));
        btnremove1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnremove1.setText("REMOVE");
        btnremove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremove1ActionPerformed(evt);
            }
        });

        btnup1.setBackground(new java.awt.Color(255, 255, 0));
        btnup1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnup1.setText("UPDATE");
        btnup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnup1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Delivery date", "Price"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Manage Suppliers");

        javax.swing.GroupLayout panel_SuppliersLayout = new javax.swing.GroupLayout(panel_Suppliers);
        panel_Suppliers.setLayout(panel_SuppliersLayout);
        panel_SuppliersLayout.setHorizontalGroup(
            panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SuppliersLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_SuppliersLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_SuppliersLayout.createSequentialGroup()
                                .addComponent(btnadd1)
                                .addGap(18, 18, 18)
                                .addComponent(btnremove1)
                                .addGap(18, 18, 18)
                                .addComponent(btnup1))
                            .addGroup(panel_SuppliersLayout.createSequentialGroup()
                                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbldd1)
                                    .addComponent(lblp1)
                                    .addComponent(lblid1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblname1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtp1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_SuppliersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(181, 181, 181))
        );
        panel_SuppliersLayout.setVerticalGroup(
            panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_SuppliersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid1)
                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname1)
                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldd1)
                    .addComponent(txtdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblp1))
                .addGap(27, 27, 27)
                .addGroup(panel_SuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd1)
                    .addComponent(btnremove1)
                    .addComponent(btnup1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        MainContainer.add(panel_Suppliers, "card4");

        panel_Reports2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Reports");

        javax.swing.GroupLayout panel_Reports2Layout = new javax.swing.GroupLayout(panel_Reports2);
        panel_Reports2.setLayout(panel_Reports2Layout);
        panel_Reports2Layout.setHorizontalGroup(
            panel_Reports2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Reports2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel10)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        panel_Reports2Layout.setVerticalGroup(
            panel_Reports2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Reports2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel10)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        MainContainer.add(panel_Reports2, "card9");

        panel_Manage_Employee2.setBackground(new java.awt.Color(255, 255, 255));

        lblid2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblid2.setText("ID");

        lblname2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname2.setText("Telephone No.");

        txtid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid2ActionPerformed(evt);
            }
        });

        btnaddemp.setText("ADD");
        btnaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddempActionPerformed(evt);
            }
        });

        btnremoveemp.setText("REMOVE");
        btnremoveemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveempActionPerformed(evt);
            }
        });

        btnupemp.setText("UPDATE");
        btnupemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupempActionPerformed(evt);
            }
        });

        lblname3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname3.setText("Name");

        lblname4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblname4.setText("Status");

        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Telephone no.", "Status"
            }
        ));
        jScrollPane5.setViewportView(tblemployee);

        javax.swing.GroupLayout panel_Manage_Employee2Layout = new javax.swing.GroupLayout(panel_Manage_Employee2);
        panel_Manage_Employee2.setLayout(panel_Manage_Employee2Layout);
        panel_Manage_Employee2Layout.setHorizontalGroup(
            panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnaddemp)
                .addGap(36, 36, 36)
                .addComponent(btnremoveemp)
                .addGap(61, 61, 61)
                .addComponent(btnupemp)
                .addGap(250, 250, 250))
            .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblid2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblname3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblname2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblname4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        panel_Manage_Employee2Layout.setVerticalGroup(
            panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Manage_Employee2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid2)
                    .addComponent(txtid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname3)
                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname2)
                    .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname4)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Manage_Employee2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupemp)
                    .addComponent(btnremoveemp)
                    .addComponent(btnaddemp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        MainContainer.add(panel_Manage_Employee2, "card8");

        javax.swing.GroupLayout MainContentLayout = new javax.swing.GroupLayout(MainContent);
        MainContent.setLayout(MainContentLayout);
        MainContentLayout.setHorizontalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        MainContentLayout.setVerticalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContentLayout.createSequentialGroup()
                .addComponent(MainContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftBar, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addComponent(MainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int pX, pY;
    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        // Get x,y and store them
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX,
                         this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void CloseWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseWindowMouseEntered
        CloseWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close Window_32px_9.png")));
    }//GEN-LAST:event_CloseWindowMouseEntered

    private void CloseWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseWindowMouseExited
        CloseWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Close Window_32px_8.png")));
    }//GEN-LAST:event_CloseWindowMouseExited

    private void CloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseWindowMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseWindowMouseClicked

    private void MaximizeWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeWindowMouseEntered
        if(!isMaximized)
            MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Maximize Window_32px_6.png")));
        else
            MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Restore Window_32px.png")));
    }//GEN-LAST:event_MaximizeWindowMouseEntered

    private void MaximizeWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeWindowMouseExited
        if(!isMaximized)
            MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Maximize Window_32px_7.png")));
        else
            MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Restore Window_32px_1.png")));
    }//GEN-LAST:event_MaximizeWindowMouseExited

    boolean isMaximized = false;
    private void MaximizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeWindowMouseClicked
        if(!isMaximized) {
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            isMaximized = true;
        } else {
            this.setExtendedState(JFrame.NORMAL);
            isMaximized = false;
        }
    }//GEN-LAST:event_MaximizeWindowMouseClicked

    private void MinimizeWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeWindowMouseEntered
        MinimizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Minimize Window_32px_9.png")));
    }//GEN-LAST:event_MinimizeWindowMouseEntered

    private void MinimizeWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeWindowMouseExited
        MinimizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Minimize Window_32px_8.png")));
    }//GEN-LAST:event_MinimizeWindowMouseExited

    private void MinimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeWindowMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeWindowMouseClicked

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        onHover(Button1);
    }//GEN-LAST:event_Button1MouseEntered

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        onLeaveHover(Button1);
    }//GEN-LAST:event_Button1MouseExited

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked
        changeLayer(panel_Dashboard);
    }//GEN-LAST:event_Button1MouseClicked
    
    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        changeLayer(panel_Order);
    }//GEN-LAST:event_Button3MouseClicked

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        onHover(Button3);
    }//GEN-LAST:event_Button3MouseEntered

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        onLeaveHover(Button3);
    }//GEN-LAST:event_Button3MouseExited

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked
        changeLayer(panel_Suppliers);
    }//GEN-LAST:event_Button4MouseClicked

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        onHover(Button4);
    }//GEN-LAST:event_Button4MouseEntered

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        onLeaveHover(Button4);
    }//GEN-LAST:event_Button4MouseExited

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked
        changeLayer(lbid2);
    }//GEN-LAST:event_Button5MouseClicked

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        onHover(Button5);
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        onLeaveHover(Button5);
    }//GEN-LAST:event_Button5MouseExited

    private void Button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseClicked
        changeLayer(panel_Manage_Employee);
    }//GEN-LAST:event_Button6MouseClicked

    private void Button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseEntered
        onHover(Button6);
    }//GEN-LAST:event_Button6MouseEntered

    private void Button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button6MouseExited
        onLeaveHover(Button6);
    }//GEN-LAST:event_Button6MouseExited

    private void Button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_Button7MouseClicked

    private void Button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseEntered
        onHover(Button7);
    }//GEN-LAST:event_Button7MouseEntered

    private void Button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseExited
        onLeaveHover(Button7);
    }//GEN-LAST:event_Button7MouseExited

    private void Button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseClicked
        changeLayer(panel_Reports);
    }//GEN-LAST:event_Button8MouseClicked

    private void Button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseEntered
        onHover(Button8);
    }//GEN-LAST:event_Button8MouseEntered

    private void Button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseExited
        onLeaveHover(Button8);
    }//GEN-LAST:event_Button8MouseExited

    private void pincode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincode1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pin=pincode1.getText();
        
        if (pin.equals("1111")){
            changeLayer(panel_Manage_Employee2);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect Password!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pinc=pincode3.getText();
        
        if (pinc.equals("1111")){
            changeLayer(panel_Reports2);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Incorrect Password!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        
        String tblID = tblModel.getValueAt(jTable2.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(jTable2.getSelectedRow(), 1).toString();
        String tblDeliverydate = tblModel.getValueAt(jTable2.getSelectedRow(), 2).toString();
        String tblPrice = tblModel.getValueAt(jTable2.getSelectedRow(), 3).toString();
        
        txtid.setText(tblID);
        txtname.setText(tblName);
        txtdd.setText(tblDeliverydate);
        txtp.setText(tblPrice);

    }//GEN-LAST:event_jTable2MouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
     if(txtid.getText().equals("")||txtname.getText().equals("")||txtdd.getText().equals("")||txtp.getText().equals("")){
        
        JOptionPane.showMessageDialog(this,"Please Enter All Data:");
        
        }else{
            String data[] = {txtid.getText(),txtname.getText(),txtdd.getText(),txtp.getText()};
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
            
            tblModel.addRow(data);
            
            JOptionPane.showMessageDialog(this,"Add data Successfully");

            String ID= txtid.getText();
            String name= txtname.getText();
            String date= txtdd.getText();
            String price= txtp.getText();

             int result;
            String sql="insert into oders(id,name,dilivery_date,price) values (?,?,?,?)";
                   try {
                       Insertps=conn.prepareStatement(sql);
                       Insertps.setString(1, ID);
                       Insertps.setString(2, name);
                       Insertps.setString(3, date);
                       Insertps.setString(4, price);
                       
                      result= Insertps.executeUpdate();
                       if(result==1)
                       {
                           JOptionPane.showMessageDialog(null, "insert ok", "Success", JOptionPane.INFORMATION_MESSAGE);
                       
                       }
                       else{
                                 JOptionPane.showMessageDialog(null, "insert Error", "Error", JOptionPane.ERROR_MESSAGE);
                               
                       }
                       Insertps.close();
  
                   } catch (SQLException ex) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                   }
                  
        
        }
  // Code to add data to the database (unchanged)

    }//GEN-LAST:event_btnaddActionPerformed

    
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
         
         if(jTable2.getSelectedRowCount()==1){
             tblModel.removeRow(jTable2.getSelectedRow());
         
         }else{
             if(jTable2.getRowCount()==0){
                 JOptionPane.showMessageDialog(this,"Table is Empty");
             }else{
                 JOptionPane.showMessageDialog(this,"Please select single Row for Delete");
             }
         }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
        
        if(jTable2.getSelectedRowCount()==1){
            
            String ID = txtid.getText();
            String Name = txtname.getText();
            String Deliverydate = txtdd.getText();
            String Price = txtp.getText();
            
            tblModel.setValueAt(ID,jTable2.getSelectedRow(),0);
            tblModel.setValueAt(Name,jTable2.getSelectedRow(),1);
            tblModel.setValueAt(Deliverydate,jTable2.getSelectedRow(),2);
            tblModel.setValueAt(Price,jTable2.getSelectedRow(),3);
            
            
            JOptionPane.showMessageDialog(this,"Update Successfully");
            
        }else{
            if(jTable2.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is empty");
                
            }else{
                 JOptionPane.showMessageDialog(this,"Please select singlr row foe update");
            }
            
        }

    }//GEN-LAST:event_btnupActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
        // TODO add your handling code here:
         if(txtid1.getText().equals("")||txtname1.getText().equals("")||txtdd1.getText().equals("")||txtp1.getText().equals("")){
        
        JOptionPane.showMessageDialog(this,"Please Enter All Data:");
        
        }else{
            String data[] = {txtid1.getText(),txtname1.getText(),txtdd1.getText(),txtp1.getText()};
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();
            
            tblModel.addRow(data);
            
            JOptionPane.showMessageDialog(this,"Add data Successfully");
            
            txtid1.setText("");
            txtname1.setText("");
            txtdd1.setText("");
            txtp1.setText("");
        
        }
             
        
    }//GEN-LAST:event_btnadd1ActionPerformed

    private void btnremove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremove1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();
         
         if(jTable3.getSelectedRowCount()==1){
             tblModel.removeRow(jTable3.getSelectedRow());
         
         }else{
             if(jTable3.getRowCount()==0){
                 JOptionPane.showMessageDialog(this,"Table is Empty");
             }else{
                 JOptionPane.showMessageDialog(this,"Please select single Row for Delete");
             }
         }
    }//GEN-LAST:event_btnremove1ActionPerformed

    private void btnup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnup1ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();
        
        if(jTable3.getSelectedRowCount()==1){
            
            String ID = txtid1.getText();
            String Name = txtname1.getText();
            String Deliverydate = txtdd1.getText();
            String Price = txtp1.getText();
            
            tblModel.setValueAt(ID,jTable3.getSelectedRow(),0);
            tblModel.setValueAt(Name,jTable3.getSelectedRow(),1);
            tblModel.setValueAt(Deliverydate,jTable3.getSelectedRow(),2);
            tblModel.setValueAt(Price,jTable3.getSelectedRow(),3);
            
            
            JOptionPane.showMessageDialog(this,"Update Successfully");
            
        }else{
            if(jTable3.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is empty");
                
            }else{
                 JOptionPane.showMessageDialog(this,"Please select singlr row foe update");
            }
            
        }
        
        
    }//GEN-LAST:event_btnup1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
        
        String tblID = tblModel.getValueAt(jTable3.getSelectedRow(), 0).toString();
        String tblName = tblModel.getValueAt(jTable3.getSelectedRow(), 1).toString();
        String tblDeliverydate = tblModel.getValueAt(jTable3.getSelectedRow(), 2).toString();
        String tblPrice = tblModel.getValueAt(jTable3.getSelectedRow(), 3).toString();
        
        txtid1.setText(tblID);
        txtname1.setText(tblName);
        txtdd1.setText(tblDeliverydate);
        txtp1.setText(tblPrice);
    }//GEN-LAST:event_jTable3MouseClicked

    private void botnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnaddActionPerformed
        // TODO add your handling code here:
        
         if(txttid2.getText().equals("")||txttiid2.getText().equals("")||txttiname2.getText().equals("")||txttp2.getText().equals("")){
        
        JOptionPane.showMessageDialog(this,"Please Enter All Data:");
        
        }else{
            String data[] = {txttid2.getText(),txttiid2.getText(),txttiname2.getText(),txttp2.getText()};
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable12.getModel();
            
            tblModel.addRow(data);
            
            JOptionPane.showMessageDialog(this,"Add data Successfully");
            
            txttid2.setText("");
            txttiid2.setText("");
            txttiname2.setText("");
            txttp2.setText("");
        
        }
    }//GEN-LAST:event_botnaddActionPerformed

    private void botneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botneditActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel)jTable12.getModel();
        
        if(jTable12.getSelectedRowCount()==1){
            
            String ID = txttid2.getText();
            String ItemID = txttiid2.getText();
            String ItemName = txttiname2.getText();
            String Price = txttp2.getText();
            
            tblModel.setValueAt(ID,jTable12.getSelectedRow(),0);
            tblModel.setValueAt(ItemID,jTable12.getSelectedRow(),1);
            tblModel.setValueAt(ItemName,jTable12.getSelectedRow(),2);
            tblModel.setValueAt(Price,jTable12.getSelectedRow(),3);
            
            
            JOptionPane.showMessageDialog(this,"Edit Successfully");
            
        }else{
            if(jTable12.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is empty");
                
            }else{
                 JOptionPane.showMessageDialog(this,"Please select singlr row foe update");
            }
            
        }
    }//GEN-LAST:event_botneditActionPerformed

    private void botndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botndeleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel)jTable12.getModel();
         
         if(jTable12.getSelectedRowCount()==1){
             tblModel.removeRow(jTable12.getSelectedRow());
         
         }else{
             if(jTable12.getRowCount()==0){
                 JOptionPane.showMessageDialog(this,"Table is Empty");
             }else{
                 JOptionPane.showMessageDialog(this,"Please select single Row for Delete");
             }
         }
    }//GEN-LAST:event_botndeleteActionPerformed

    private void jTable12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable12MouseClicked
        // TODO add your handling code here:
         DefaultTableModel tblModel = (DefaultTableModel) jTable12.getModel();
        
        String tblID = tblModel.getValueAt(jTable12.getSelectedRow(), 0).toString();
        String tblItemID = tblModel.getValueAt(jTable12.getSelectedRow(), 1).toString();
        String tblItemName = tblModel.getValueAt(jTable12.getSelectedRow(), 2).toString();
        String tblPrice = tblModel.getValueAt(jTable12.getSelectedRow(), 3).toString();
        
        txttid2.setText(tblID);
        txttiid2.setText(tblItemID);
        txttiname2.setText(tblItemName);
        txttp2.setText(tblPrice);
    }//GEN-LAST:event_jTable12MouseClicked

    private void btnaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddempActionPerformed
        // TODO add your handling code here:
        if(txtid2.getText().equals("")||txtname2.getText().equals("")||txtnum.getText().equals("")||txtstatus.getText().equals("")){

            JOptionPane.showMessageDialog(this,"Please Enter All Data:");

        }else{
            String data[] = {txtid2.getText(),txtname2.getText(),txtnum.getText(),txtstatus.getText()};

            DefaultTableModel tblModel = (DefaultTableModel)tblemployee.getModel();

            tblModel.addRow(data);

            JOptionPane.showMessageDialog(this,"Add data Successfully");

            txtid2.setText("");
            txtname2.setText("");
            txtnum.setText("");
            txtstatus.setText("");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddempActionPerformed

    private void btnremoveempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveempActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblemployee.getModel();

        if(tblemployee.getSelectedRowCount()==1){
            tblModel.removeRow(tblemployee.getSelectedRow());

        }else{
            if(tblemployee.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(this,"Please select single Row for Delete");
            }
        }
    }//GEN-LAST:event_btnremoveempActionPerformed

    private void btnupempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupempActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tblemployee.getModel();

        if(tblemployee.getSelectedRowCount()==1){

            String ID = txtid2.getText();
            String Name = txtname2.getText();
            String Deliverydate = txtnum.getText();
            String Price = txtstatus.getText();

            tblModel.setValueAt(ID,tblemployee.getSelectedRow(),0);
            tblModel.setValueAt(Name,tblemployee.getSelectedRow(),1);
            tblModel.setValueAt(Deliverydate,tblemployee.getSelectedRow(),2);
            tblModel.setValueAt(Price,tblemployee.getSelectedRow(),3);

            JOptionPane.showMessageDialog(this,"Update Successfully");

        }else{
            if(tblemployee.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is empty");

            }else{
                JOptionPane.showMessageDialog(this,"Please select singlr row foe update");
            }

        }
    }//GEN-LAST:event_btnupempActionPerformed

    private void txtid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid2ActionPerformed

    // *** Utilities ***
    
    private void onHover(JPanel button) {
        button.setBackground(new Color(255, 122, 122));
        button.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, new Color(255, 0, 0)));
    }
    
    private void onLeaveHover(JPanel button) {
        button.setBackground(new Color(252, 252, 252));
        button.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(194,242,252)));
    }
    
    private void changeLayer(JPanel panel) {
        MainContainer.removeAll();
        MainContainer.add(panel);
        MainContainer.repaint();
        MainContainer.revalidate();
    }
    
    // *** End of Utilities ***
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Button6;
    private javax.swing.JPanel Button7;
    private javax.swing.JPanel Button8;
    private javax.swing.JLabel CloseWindow;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel Icon2;
    private javax.swing.JLabel Icon3;
    private javax.swing.JLabel Icon4;
    private javax.swing.JLabel Icon5;
    private javax.swing.JLabel Icon6;
    private javax.swing.JLabel Icon7;
    private javax.swing.JPanel LeftBar;
    private javax.swing.JLayeredPane MainContainer;
    private javax.swing.JPanel MainContent;
    private javax.swing.JLabel MaximizeWindow;
    private javax.swing.JLabel MinimizeWindow;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton botnadd;
    private javax.swing.JButton botndelete;
    private javax.swing.JButton botnedit;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btnaddemp;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnremove1;
    private javax.swing.JButton btnremoveemp;
    private javax.swing.JButton btnup;
    private javax.swing.JButton btnup1;
    private javax.swing.JButton btnupemp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel lbid2;
    private javax.swing.JLabel lbiid2;
    private javax.swing.JLabel lbiname2;
    private javax.swing.JLabel lbldd;
    private javax.swing.JLabel lbldd1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblid2;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JLabel lblname4;
    private javax.swing.JLabel lblp;
    private javax.swing.JLabel lblp1;
    private javax.swing.JLabel lbp2;
    private javax.swing.JPanel panel_Dashboard;
    private javax.swing.JPanel panel_Manage_Employee;
    private javax.swing.JPanel panel_Manage_Employee2;
    private javax.swing.JPanel panel_Order;
    private javax.swing.JPanel panel_Reports;
    private javax.swing.JPanel panel_Reports2;
    private javax.swing.JPanel panel_Suppliers;
    private javax.swing.JTextField pincode1;
    private javax.swing.JTextField pincode3;
    private javax.swing.JTable tblemployee;
    private javax.swing.JTextField txtdd;
    private javax.swing.JTextField txtdd1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtid2;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname2;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtp;
    private javax.swing.JTextField txtp1;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txttid2;
    private javax.swing.JTextField txttiid2;
    private javax.swing.JTextField txttiname2;
    private javax.swing.JTextField txttp2;
    // End of variables declaration//GEN-END:variables


private static class DefaultTable{
    
     public DefaultTable(){
     }
}


}




