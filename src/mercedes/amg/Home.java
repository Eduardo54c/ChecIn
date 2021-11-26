package mercedes.amg;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Home extends javax.swing.JFrame {

    boolean error;
    File Nomarchivo;
    String Cad1 = "", Cad2 = "", Cad3 = "", Cad4 = "";

    //-------------------------------------------
    int espAray;
    int contarray = 0;
    SUV_CLASS array1[];
    EQ_CLASS array2[];
    CUPE_CLASS array3[];
    SEDAN_CLASS array4[];

    //------------------------------------------
    int opC = 0;
    int opC2 = 0;
    int seats = 0, VM = 0, NM = 0, NB = 0;
    String tS = "", pll = "", ilum = "", told = "";
    int c1, c2, c3, c4;

    public Home() {
        initComponents();

        setLocationRelativeTo(null);

        //--------------------------------------
        jLabel46.setVisible(false);
        jLabel47.setVisible(false);
        jLabel57.setVisible(false);

        //---------------------------------------
        DefaultTableCellRenderer a = new DefaultTableCellRenderer();

        a.setForeground(new Color(19, 166, 154));

        jTable1.getTableHeader().setDefaultRenderer(a);
        jTable1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane1.setVisible(false);
        jTextArea1.setVisible(false);

        //---------------------------------------
        jLabel61.setVisible(false);
        jLabel62.setVisible(false);
        jLabel63.setVisible(false);
        jLabel64.setVisible(false);
        jLabel65.setVisible(false);

        //---------------------------------------
        jLabel16.setVisible(false);
        jLabel24.setVisible(false);
        jLabel18.setVisible(false);
        jLabel30.setVisible(false);
        jLabel29.setVisible(false);
        jLabel32.setVisible(false);
        jLabel38.setVisible(false);
        jTextField7.setEnabled(false);

        jLabel42.setVisible(false);

        //---------------------------------------
        //---------------------------------------
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel28.setVisible(false);
        jLabel18.setVisible(false);
        jLabel16.setVisible(false);
        jLabel24.setVisible(false);
        jLabel19.setVisible(false);
        jLabel25.setVisible(false);
        jLabel17.setVisible(false);
        jLabel29.setVisible(false);
        jLabel26.setVisible(false);
        jLabel30.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);

        jSeparator1.setVisible(false);
        jSeparator6.setVisible(false);

        jTextField2.setVisible(false);
        jTextField5.setVisible(false);

        //---------------------------------------
        jTextField7.setBackground(new Color(0, 0, 0, 0));
        jTextField3.setBackground(new Color(0, 0, 0, 0));
        jTextField4.setBackground(new Color(0, 0, 0, 0));
        jTextField6.setBackground(new Color(0, 0, 0, 0));
        jTextField2.setBackground(new Color(0, 0, 0, 0));
        jTextField5.setBackground(new Color(0, 0, 0, 0));
        jTextField8.setBackground(new Color(0, 0, 0, 0));

        //--------------------------------------
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);

        //--------------------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quit");
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 26, 60, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/log_M.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/Sin título-2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 90));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/fonLD.png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 460, 660));

        jLabel33.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Enter the data:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Color:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 50, 20));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Type of suspension:");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 90, 10));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setActionCommand("<Not Set>");
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 50, 20));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("N° of seats:");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 20));

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Car price: ");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, 20));

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Model:");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 50, 20));

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Year of manufacture:");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 140, 20));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setActionCommand("<Not Set>");
        jTextField3.setAutoscrolls(false);
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 200, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 200, 10));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setActionCommand("<Not Set>");
        jTextField4.setAutoscrolls(false);
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 200, 20));

        jLabel20.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Pneumatic");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, 25));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setActionCommand("<Not Set>");
        jTextField6.setAutoscrolls(false);
        jTextField6.setBorder(null);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 50, 20));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 50, 10));

        jLabel21.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("8");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, 20));

        jLabel22.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("5");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 20));

        jLabel23.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("7");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, 20));

        jLabel28.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Dampers");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, 25));

        jLabel31.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Number of cars to enter :");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, 20));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setActionCommand("<Not Set>");
        jTextField7.setAutoscrolls(false);
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 60, 20));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, 10));

        jLabel32.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("OK");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel32MouseMoved(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 50, 20));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Categories:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sedan");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, 50));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EQ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, 50));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cupé");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 50));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUV");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-a.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-a.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-a.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/fonLZ.png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 690, 650));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-e.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-e.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-e.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-a.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-e.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        jLabel66.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Records");
        jLabel66.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel66MouseMoved(evt);
            }
        });
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 60, 30));

        jLabel38.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("SAVE");
        jLabel38.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel38MouseMoved(evt);
            }
        });
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 60, 30));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-a.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/rb-e.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/Sin título-2.png"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 450, 50));

        jLabel37.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("N° of Speakers:");
        jLabel37.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 120, 20));

        jLabel67.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("ENTRY");
        jLabel67.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel67MouseMoved(evt);
            }
        });
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel67MouseExited(evt);
            }
        });
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 700, 60, 30));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setActionCommand("<Not Set>");
        jTextField5.setAutoscrolls(false);
        jTextField5.setBorder(null);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 90, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 50, 10));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Model", "Color", "Y / M", "---", "---", "---", "----", "---"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(19, 166, 154));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 660, 180));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/warning1.png"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 30, -1));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/warning1.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 30, -1));

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/warning1.png"))); // NOI18N
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 30, -1));

        jLabel52.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 153, 102));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("SEARCH");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102)));
        jLabel52.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel52MouseMoved(evt);
            }
        });
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 80, 30));

        jLabel49.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Cupé");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel49.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel49MouseMoved(evt);
            }
        });
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
        });
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 70, 50));

        jLabel50.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("EQ");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel50MouseMoved(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 70, 50));

        jLabel51.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Sedan");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 70, 50));

        jLabel34.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("SUV");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 50));

        jLabel35.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("EQ");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, 50));

        jLabel40.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 153, 153));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Cupé");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, 50));

        jLabel41.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("SUV");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel41.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel41MouseMoved(evt);
            }
        });
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 70, 50));

        jLabel44.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Records");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 110, 30));

        jLabel65.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("* fill the field");
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 100, 20));

        jLabel64.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("* choose an option ");
        jLabel64.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 140, 20));

        jLabel63.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 0, 0));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("* choose an option ");
        jLabel63.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 150, 20));

        jLabel62.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 0, 0));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("* fill the field");
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 90, 20));

        jLabel61.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 0, 0));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("* fill the field");
        jLabel61.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 90, 20));

        jLabel59.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("File name:");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 70, 20));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setActionCommand("<Not Set>");
        jTextField8.setAutoscrolls(false);
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 70, 20));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 70, 10));

        jLabel60.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 153, 102));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("OK");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102)));
        jLabel60.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel60MouseMoved(evt);
            }
        });
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
        });
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 50, 20));

        jLabel45.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Search by category:");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 146, -1, 20));

        jLabel53.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(153, 153, 153));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("SUV");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 70, 50));

        jLabel54.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(153, 153, 153));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("EQ");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 70, 50));

        jLabel55.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(153, 153, 153));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Cupé");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 70, 50));

        jLabel56.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(153, 153, 153));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Sedan");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 70, 50));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 51));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 360, 170));

        jLabel58.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Specific search by file");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/fonLZ1.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 690, 650));

        jLabel48.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 153, 153));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Sedan");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercedes/amg/img/Sin título-4.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 460, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel5.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel5.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel6.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel8.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel7.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel32MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseMoved
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jLabel32.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_jLabel32MouseMoved

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        Error E = new Error();
        //-------------------------------------------------------------------------- 
        try {
          
            espAray = Integer.parseInt(jTextField7.getText());
        } catch (NumberFormatException e) {
            jTextField7.setText(null);
            E.setVisible(true);
         
        }
        //--------------------------------------------------------------------------

        if (espAray > 0) {

            jLabel66.setVisible(false);

            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField6.setEnabled(true);
            jTextField5.setEnabled(true);

            jLabel23.setEnabled(true);
            jLabel24.setEnabled(true);
            jLabel25.setEnabled(true);
            jLabel28.setEnabled(true);

            jLabel14.setVisible(true);
            jLabel32.setVisible(false);
            jTextField7.setEnabled(false);

            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel38.setVisible(true);

        }

        if (opC == 1) {
            array1 = new SUV_CLASS[espAray];
        }
        if (opC == 2) {
            array2 = new EQ_CLASS[espAray];
        }
        if (opC == 3) {
            array3 = new CUPE_CLASS[espAray];
        }
        if (opC == 4) {
            array4 = new SEDAN_CLASS[espAray];
        }


    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel32.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        jLabel16.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel16.setVisible(false);
        jLabel24.setVisible(true);
        jLabel18.setVisible(false);

        seats = 7;
        VM = 380;
        NM = 2;
        ilum = "Halogen";


    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel24.setVisible(false);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel16.setVisible(false);
        jLabel24.setVisible(false);
        jLabel18.setVisible(true);

        seats = 8;
        VM = 412;
        NM = 3;
        ilum = "Laser";
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jLabel18.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        jLabel16.setVisible(true);
        jLabel24.setVisible(false);
        jLabel18.setVisible(false);

        seats = 5;
        VM = 320;
        NM = 1;
        ilum = "LED";

    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        jLabel29.setVisible(true);
        jLabel30.setVisible(false);

        tS = "Pneumatic";
        pll = "19 pul.";
        NB = 2;
        told = "Sunroof";

    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        jLabel29.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        jLabel29.setVisible(false);
        jLabel30.setVisible(true);

        tS = "Dampers";
        pll = "23 pul.";
        NB = 3;
        told = "Panoramic roof";

    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        jLabel30.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel38MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseMoved
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel38MouseMoved

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        jLabel38.setBorder(null);
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        opC = 1;
        c1 = 1;

        jLabel32.setVisible(true);
        jTextField7.setEnabled(true);

        jLabel12.setText("N° of seats:");
        jLabel22.setText("5");
        jLabel23.setText("7");
        jLabel21.setText("8");

        jLabel11.setText("Type of suspension:");
        jLabel20.setText("Pneumatic.");
        jLabel28.setText("Dampers.");

        jLabel37.setText("N° of Speakers:");

        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel23.setVisible(true);
        jLabel28.setVisible(true);
        jLabel25.setVisible(true);
        jLabel17.setVisible(true);
        jLabel19.setVisible(true);
        jLabel26.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);

        jSeparator1.setVisible(true);
        jSeparator6.setVisible(true);

        jTextField2.setVisible(true);
        jTextField5.setVisible(true);


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        opC = 2;
        c2 = 1;

        jLabel32.setVisible(true);
        jTextField7.setEnabled(true);

        jLabel12.setText("N° of engines:");
        jLabel22.setText("1");
        jLabel23.setText("2");
        jLabel21.setText("3");

        jLabel11.setText("Number of energy cells:");
        jLabel20.setText("2 cells.");
        jLabel28.setText("3 cells.");

        jLabel37.setText("N° of kw/H:");

        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel23.setVisible(true);
        jLabel28.setVisible(true);
        jLabel25.setVisible(true);
        jLabel17.setVisible(true);
        jLabel19.setVisible(true);
        jLabel26.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);

        jSeparator1.setVisible(true);
        jSeparator6.setVisible(true);

        jTextField2.setVisible(true);
        jTextField5.setVisible(true);


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        opC = 3;
        c3 = 1;

        jLabel32.setVisible(true);
        jTextField7.setEnabled(true);

        jLabel12.setText("Maximum speed:");
        jLabel22.setText("320 Km/h");
        jLabel23.setText("380 Km/h");
        jLabel21.setText("412 Km/h");

        jLabel11.setText("Tire diameter:");
        jLabel20.setText("19 pul.");
        jLabel28.setText("23 pul.");
        jLabel37.setText("N° of horsepower:");

        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel23.setVisible(true);
        jLabel28.setVisible(true);
        jLabel25.setVisible(true);
        jLabel17.setVisible(true);
        jLabel19.setVisible(true);
        jLabel26.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);

        jSeparator1.setVisible(true);
        jSeparator6.setVisible(true);

        jTextField2.setVisible(true);
        jTextField5.setVisible(true);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        opC = 4;
        c4 = 1;

        jLabel32.setVisible(true);
        jTextField7.setEnabled(true);

        jLabel12.setText("Type of lighting:");
        jLabel22.setText("LED");
        jLabel23.setText("Halogen");
        jLabel21.setText("Laser");

        jLabel11.setText("Type of roof:");
        jLabel20.setText("Sunroof.");
        jLabel28.setText("Panoramic roof.");
        jLabel37.setText("Interior color:");

        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel13.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel23.setVisible(true);
        jLabel28.setVisible(true);
        jLabel25.setVisible(true);
        jLabel17.setVisible(true);
        jLabel19.setVisible(true);
        jLabel26.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);

        jSeparator1.setVisible(true);
        jSeparator6.setVisible(true);

        jTextField2.setVisible(true);
        jTextField5.setVisible(true);


    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked

        error = false;

        SUV_CLASS a = new SUV_CLASS();
        EQ_CLASS b = new EQ_CLASS();
        CUPE_CLASS c = new CUPE_CLASS();
        SEDAN_CLASS d = new SEDAN_CLASS();

        if (opC == 1) {

            //----------------------------------------------
            if (jTextField3.getText().equals("")) {
                jLabel61.setVisible(true);
                error = true;
            } else {
                a.SetModel(jTextField3.getText());
                jLabel61.setVisible(false);
            }

            //---------------------------------------------
            if (jTextField4.getText().equals("")) {
                jLabel62.setVisible(true);
                error = true;
            } else {
                a.SetColor(jTextField4.getText());
                jLabel62.setVisible(false);
            }

            //-------------------------------------------------
            if (seats == 0) {
                jLabel63.setVisible(true);
                error = true;
            } else {
                a.SetNac(seats);
                jLabel63.setVisible(false);
            }

            //--------------------------------------------- 
            if (tS.isEmpty()) {
                jLabel64.setVisible(true);
                error = true;
            } else {
                a.SetTipe_S(tS);
                jLabel64.setVisible(false);
            }

            //--------------------------------------------------------------------------
            try {
                a.SetAño_f(Integer.parseInt(jTextField6.getText()));
                jLabel47.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel47.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                a.SetNbs(Integer.parseInt(jTextField2.getText()));
                jLabel57.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel57.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                a.Setpre(Double.parseDouble(jTextField5.getText()));
                jLabel46.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel46.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------

            if (error == false) {
                array1[contarray] = a;

                Cad1 = "SUV \n \n"
                        + "Model: " + jTextField3.getText() + "\n"
                        + "Color: " + jTextField4.getText() + "\n"
                        + "Y / M: " + jTextField6.getText() + "\n"
                        + "N° Seats: " + seats + "\n"
                        + "Suspension: " + tS + "\n"
                        + "N° Speakers: " + jTextField2.getText() + "\n"
                        + "Price: " + jTextField5.getText() + "\n"
                        + "Total Price: " + array1[contarray].TolA();

                Nomarchivo = new File(jTextField3.getText());
                GuardarArchivos(Nomarchivo, opC);

                contarray++;
                jLabel46.setVisible(false);
                jLabel47.setVisible(false);
                jLabel57.setVisible(false);

                jLabel61.setVisible(false);
                jLabel62.setVisible(false);
                jLabel63.setVisible(false);
                jLabel64.setVisible(false);
                jLabel65.setVisible(false);

            }
        }

        if (opC == 2) {

            //----------------------------------------------
            if (jTextField3.getText().equals("")) {
                jLabel61.setVisible(true);
                error = true;
            } else {
                b.SetModel(jTextField3.getText());
                jLabel61.setVisible(false);
            }

            //---------------------------------------------
            if (jTextField4.getText().equals("")) {
                jLabel62.setVisible(true);
                error = true;
            } else {
                b.SetColor(jTextField4.getText());
                jLabel62.setVisible(false);
            }

            //-------------------------------------------------
            if (NM == 0) {
                jLabel63.setVisible(true);
                error = true;
            } else {
                b.SetNm(NM);
                jLabel63.setVisible(false);
            }

            //--------------------------------------------- 
            if (NB == 0) {
                jLabel64.setVisible(true);
                error = true;
            } else {
                b.SetNb(NB);
                jLabel64.setVisible(false);
            }

            //--------------------------------------------------------------------------
            try {
                b.SetAño_f(Integer.parseInt(jTextField6.getText()));
                jLabel47.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel47.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                b.SetKw(Integer.parseInt(jTextField2.getText()));
                jLabel57.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel57.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                b.Setpre(Integer.parseInt(jTextField5.getText()));
                jLabel46.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel46.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------

            if (error == false) {
                array2[contarray] = b;

                Cad2 = "EQ  \n \n"
                        + "Model: " + jTextField3.getText() + "\n"
                        + "Color: " + jTextField4.getText() + "\n"
                        + "Y / M: " + jTextField6.getText() + "\n"
                        + "N° Engines: " + NM + "\n"
                        + "Energy Cells: " + NB + "\n"
                        + "Kh/h: " + jTextField2.getText() + "\n"
                        + "Price: " + jTextField5.getText() + "\n"
                        + "Total Price: " + array2[contarray].TolA();

                Nomarchivo = new File(jTextField3.getText());
                GuardarArchivos(Nomarchivo, opC);

                contarray++;
                jLabel46.setVisible(false);
                jLabel47.setVisible(false);
                jLabel57.setVisible(false);
                jLabel61.setVisible(false);
                jLabel62.setVisible(false);
                jLabel63.setVisible(false);
                jLabel64.setVisible(false);
                jLabel65.setVisible(false);
            }

        }
        if (opC == 3) {
            //----------------------------------------------
            if (jTextField3.getText().equals("")) {
                jLabel61.setVisible(true);
                error = true;
            } else {
                c.SetModel(jTextField3.getText());
                jLabel61.setVisible(false);
            }

            //---------------------------------------------
            if (jTextField4.getText().equals("")) {
                jLabel62.setVisible(true);
                error = true;
            } else {
                c.SetColor(jTextField4.getText());
                jLabel62.setVisible(false);
            }

            //-------------------------------------------------
            if (VM == 0) {
                jLabel63.setVisible(true);
                error = true;
            } else {
                c.SetVm(VM);
                jLabel63.setVisible(false);
            }

            //--------------------------------------------- 
            if (pll.isEmpty()) {
                jLabel64.setVisible(true);
                error = true;
            } else {
                c.SetPll(pll);
                jLabel64.setVisible(false);
            }

            //--------------------------------------------------------------------------
            //--------------------------------------------------------------------------
            try {
                c.SetAño_f(Integer.parseInt(jTextField6.getText()));
                jLabel47.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel47.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                c.SetNc(Integer.parseInt(jTextField2.getText()));
                jLabel57.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel57.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------
            try {
                c.Setpre(Integer.parseInt(jTextField5.getText()));
                jLabel46.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel46.setVisible(true);
                error = true;
            }
            //--------------------------------------------------------------------------

            if (error == false) {
                array3[contarray] = c;

                Cad3 = "Cupe  \n \n"
                        + "Model: " + jTextField3.getText() + "\n"
                        + "Color: " + jTextField4.getText() + "\n"
                        + "Y / M: " + jTextField6.getText() + "\n"
                        + "Max Sp: " + VM + "\n"
                        + "Tire D: " + pll + "\n"
                        + "HP: " + jTextField2.getText() + "\n"
                        + "Price: " + jTextField5.getText() + "\n"
                        + "Total Price: " + array3[contarray].TolA();

                Nomarchivo = new File(jTextField3.getText());
                GuardarArchivos(Nomarchivo, opC);

                contarray++;
                jLabel46.setVisible(false);
                jLabel47.setVisible(false);
                jLabel57.setVisible(false);
                jLabel61.setVisible(false);
                jLabel62.setVisible(false);
                jLabel63.setVisible(false);
                jLabel64.setVisible(false);
                jLabel65.setVisible(false);
            }
        }

        if (opC == 4) {

            //----------------------------------------------
            if (jTextField3.getText().equals("")) {
                jLabel61.setVisible(true);
                error = true;
            } else {
                d.SetModel(jTextField3.getText());
                jLabel61.setVisible(false);
            }

            //---------------------------------------------
            if (jTextField4.getText().equals("")) {
                jLabel62.setVisible(true);
                error = true;
            } else {
                d.SetColor(jTextField4.getText());
                jLabel62.setVisible(false);
            }

            //-------------------------------------------------
            if (ilum.isEmpty()) {
                jLabel63.setVisible(true);
                error = true;
            } else {
                d.SetIlum(ilum);
                jLabel63.setVisible(false);
            }

            //--------------------------------------------- 
            if (told.isEmpty()) {
                jLabel64.setVisible(true);
                error = true;
            } else {
                d.Settold(told);
                jLabel64.setVisible(false);
            }
            //--------------------------------------------- 
            if (jTextField2.getText().equals("")) {
                jLabel65.setVisible(true);
                error = true;
            } else {
                d.SetInte(jTextField2.getText());
                jLabel65.setVisible(false);
            }

            //--------------------------------------------------------------------------
            try {
                d.SetAño_f(Integer.parseInt(jTextField6.getText()));
                jLabel47.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel47.setVisible(true);
                error = true;
            }

            //--------------------------------------------------------------------------
            try {
                d.Setpre(Integer.parseInt(jTextField5.getText()));
                jLabel46.setVisible(false);
            } catch (NumberFormatException e) {
                jLabel46.setVisible(true);
                error = true;
            }
            //-------------------------------------------------------------------------- 

            if (error == false) {
                array4[contarray] = d;

                Cad4 = "Sedan  \n \n"
                        + "Model: " + jTextField3.getText() + "\n"
                        + "Color: " + jTextField4.getText() + "\n"
                        + "Y / M: " + jTextField6.getText() + "\n"
                        + "Lighting: " + ilum + "\n"
                        + "Roof: " + told + "\n"
                        + "In. Color: " + jTextField2.getText() + "\n"
                        + "Price: " + jTextField5.getText() + "\n"
                        + "Total Price: " + array4[contarray].TolA();

                Nomarchivo = new File(jTextField3.getText());
                GuardarArchivos(Nomarchivo, opC);

                contarray++;
                jLabel46.setVisible(false);
                jLabel47.setVisible(false);
                jLabel57.setVisible(false);
                jLabel61.setVisible(false);
                jLabel62.setVisible(false);
                jLabel63.setVisible(false);
                jLabel64.setVisible(false);
                jLabel65.setVisible(false);
            }

        }

        if (error == false) {

            jTextField3.setText("");
            jTextField4.setText("");
            jTextField6.setText("");
            jTextField2.setText("");
            jTextField5.setText("");
            jLabel16.setVisible(false);
            jLabel24.setVisible(false);
            jLabel18.setVisible(false);
            jLabel30.setVisible(false);
            jLabel29.setVisible(false);
            jLabel32.setVisible(false);
        }

        if (contarray == (espAray)) {
            jLabel61.setVisible(false);
            jLabel62.setVisible(false);
            jLabel63.setVisible(false);
            jLabel64.setVisible(false);
            jLabel65.setVisible(false);

            jLabel46.setVisible(false);
            jLabel47.setVisible(false);
            jLabel57.setVisible(false);

            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
            jLabel22.setVisible(false);
            jLabel23.setVisible(false);
            jLabel28.setVisible(false);
            jLabel18.setVisible(false);
            jLabel16.setVisible(false);
            jLabel24.setVisible(false);
            jLabel19.setVisible(false);
            jLabel25.setVisible(false);
            jLabel17.setVisible(false);
            jLabel29.setVisible(false);
            jLabel26.setVisible(false);
            jLabel30.setVisible(false);
            jLabel36.setVisible(false);
            jLabel37.setVisible(false);

            jSeparator1.setVisible(false);
            jSeparator6.setVisible(false);

            jTextField2.setVisible(false);
            jTextField5.setVisible(false);

            jTextField7.setText("");

            jTextField3.setEnabled(false);
            jTextField4.setEnabled(false);
            jTextField6.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextField5.setEnabled(false);

            jLabel66.setVisible(true);

            if (c1 < 1) {
                jLabel5.setVisible(true);
            }
            if (c2 < 1) {
                jLabel6.setVisible(true);
            }
            if (c3 < 1) {
                jLabel8.setVisible(true);
            }
            if (c4 < 1) {
                jLabel7.setVisible(true);
            }

            opC = 0;
            espAray = 0;
            contarray = 0;

            seats = 0;
            VM = 0;
            NM = 0;
            NB = 0;
            tS = "";
            pll = "";
            ilum = "";
            told = "";

            jLabel38.setVisible(false);

        }


    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel41MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseMoved
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel41.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel41MouseMoved

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel41.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel50MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseMoved
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel50.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel50MouseMoved

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel50.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel50MouseExited

    private void jLabel49MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseMoved
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel49.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel49MouseMoved

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel49.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel49MouseExited

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel51.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel51.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel52MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseMoved
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 190, 197)));
        jLabel52.setForeground(new Color(176, 190, 197));
    }//GEN-LAST:event_jLabel52MouseMoved

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 152, 102)));
        jLabel52.setForeground(new Color(255, 152, 102));
    }//GEN-LAST:event_jLabel52MouseExited

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked

        opC2 = 1;
        jLabel41.setVisible(false);
        jLabel50.setVisible(false);
        jLabel49.setVisible(false);
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked

        opC2 = 2;
        jLabel41.setVisible(false);
        jLabel50.setVisible(false);
        jLabel49.setVisible(false);
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked

        opC2 = 3;
        jLabel41.setVisible(false);
        jLabel50.setVisible(false);
        jLabel49.setVisible(false);
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked

        opC2 = 4;
        jLabel41.setVisible(false);
        jLabel50.setVisible(false);
        jLabel49.setVisible(false);
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked

        Error2 E2 = new Error2();

        try {
            if (opC2 == 1) {
                SearchSUV();
            }

            if (opC2 == 2) {
                SearchEQ();
            }

            if (opC2 == 3) {
                SearchCupé();
            }

            if (opC2 == 4) {
                SearchSedan();
            }
        } catch (NullPointerException ex) {
            E2.setVisible(true);
        }

        jLabel41.setVisible(true);
        jLabel50.setVisible(true);
        jLabel49.setVisible(true);
        jLabel51.setVisible(true);


    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        Error E = new Error();
        E.setVisible(true);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        Error E = new Error();
        E.setVisible(true);
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        Error E = new Error();
        E.setVisible(true);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel60MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseMoved
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(19, 166, 154)));
        jLabel60.setForeground(new Color(19, 166, 154));
    }//GEN-LAST:event_jLabel60MouseMoved

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        jTextArea1.setText("");
        String NomAr = jTextField8.getText();
        jTextArea1.append(LeerArchivos(NomAr));
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102)));
        jLabel60.setForeground(new Color(255, 153, 102));
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel66MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseMoved
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel66MouseMoved

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked

        jLabel42.setVisible(true);
        jLabel39.setVisible(false);
        jTable1.setVisible(true);
        jScrollPane2.setVisible(true);
        jScrollPane1.setVisible(true);
        jTextArea1.setVisible(true);


    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
        jLabel66.setBorder(null);
    }//GEN-LAST:event_jLabel66MouseExited

    private void jLabel67MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseMoved
        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel67MouseMoved

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        jLabel42.setVisible(false);
        jLabel39.setVisible(true);
        jTable1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane1.setVisible(false);
        jTextArea1.setVisible(false);
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel67MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseExited
        jLabel67.setBorder(null);
    }//GEN-LAST:event_jLabel67MouseExited

    public void SearchSUV() {

        String matris[][];

        matris = new String[array1.length][8];

        for (int i = 0; i < array1.length; i++) {

            matris[i][0] = array1[i].getModel();
            matris[i][1] = array1[i].getColor();
            matris[i][2] = ("" + array1[i].getAño_fl());
            matris[i][3] = ("" + array1[i].getNac());
            matris[i][4] = array1[i].getTipe_S();
            matris[i][5] = ("" + array1[i].getNbs());
            matris[i][6] = ("" + array1[i].getpre());
            matris[i][7] = ("" + array1[i].TolA());

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Model", "Color", "Y / M", "N° Seats", "Suspension", "N° Speakers", "Price", "Total Price"
                }
        ));

    }

    public void SearchEQ() {

        String matris[][];

        matris = new String[array2.length][8];

        for (int i = 0; i < array2.length; i++) {

            matris[i][0] = array2[i].getModel();
            matris[i][1] = array2[i].getColor();
            matris[i][2] = ("" + array2[i].getAño_fl());
            matris[i][3] = ("" + array2[i].getNm());
            matris[i][4] = ("" + array2[i].getNb());
            matris[i][5] = ("" + array2[i].getKw());
            matris[i][6] = ("" + array2[i].getpre());
            matris[i][7] = ("" + array2[i].TolA());

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Model", "Color", "Y / M", "N° Engines", "Energy Cells", "Kh/h", "Price", "Total Price"
                }
        ));

    }

    public void SearchCupé() {

        String matris[][];

        matris = new String[array3.length][8];

        for (int i = 0; i < array3.length; i++) {

            matris[i][0] = array3[i].getModel();
            matris[i][1] = array3[i].getColor();
            matris[i][2] = ("" + array3[i].getAño_fl());
            matris[i][3] = ("" + array3[i].getVm());
            matris[i][4] = array3[i].getPll();
            matris[i][5] = ("" + array3[i].getNc());
            matris[i][6] = ("" + array3[i].getpre());
            matris[i][7] = ("" + array3[i].TolA());

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Model", "Color", "Y / M", "Max Sp", "Tire D", "HP", "Price", "Total Price"
                }
        ));

    }

    public void SearchSedan() {

        String matris[][];

        matris = new String[array4.length][8];

        for (int i = 0; i < array4.length; i++) {

            matris[i][0] = array4[i].getModel();
            matris[i][1] = array4[i].getColor();
            matris[i][2] = ("" + array4[i].getAño_fl());
            matris[i][3] = array4[i].getIlum();
            matris[i][4] = array4[i].gettold();
            matris[i][5] = array4[i].getInte();
            matris[i][6] = ("" + array4[i].getpre());
            matris[i][7] = ("" + array4[i].TolA());

        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Model", "Color", "Y / M", "Lighting", "Roof", "In. Color", "Price", "Total Price"
                }
        ));

    }

    public void GuardarArchivos(File nomarchivo, int cat) {
        Error3 E3 = new Error3();
        FileOutputStream archivo = null;
        PrintWriter pw;
        try {
            archivo = new FileOutputStream(nomarchivo.getName(), true);
        } catch (FileNotFoundException ex) {
            E3.setVisible(true);
        }
        pw = new PrintWriter(archivo);

        if (cat == 1) {
            pw.write(Cad1);
        }
        if (cat == 2) {
            pw.write(Cad2);
        }
        if (cat == 3) {
            pw.write(Cad3);
        }
        if (cat == 4) {
            pw.write(Cad4);
        }

        pw.close();
        try {
            archivo.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    String LeerArchivos(String NomAr) {
        boolean er = false;
        Warning W = new Warning();
        FileReader fr = null;
        BufferedReader br = null;
        String Nom = NomAr;
        String cadena, cad = "";

        try {
            fr = new FileReader(Nom);
        } catch (FileNotFoundException ex) {
            W.setVisible(true);
            er = true;
        }

        if (er == false) {
            br = new BufferedReader(fr);
            try {
                cadena = br.readLine();
                cad = cadena;
                for (int r = 0; r < 9; r++) {

                    cadena = br.readLine();
                    cad = cad + "\n" + cadena;
                }

            } catch (IOException ex) {
            }

            try {
                br.close();
                fr.close();

            } catch (IOException ex) {

            }

        } else {
            System.out.print("archivo no encontrado");
        }
        return cad;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void cash() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
