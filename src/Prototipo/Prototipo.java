/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototipo;

import desplazable.Desface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 *
 * @author El!an
 */
public class Prototipo extends javax.swing.JFrame {

    Desface desplace;
    private int xMouse;
    private int yMouse;

    public Prototipo() {
        initComponents();
        desplace = new Desface();
        setLocationRelativeTo(null);
        mostar();
        mostar2();
        mostrar3();
        Inicio.setVisible(true);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        panelMod.setVisible(false);
        AggtraPanel.setVisible(false);
    }
    public static String confirmacion = "";
    public static String auxname, auxape, auxtel, auxmail;
    public static Date auxfen, auxlc;
    public static int identidad = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        MenuPlegable = new javax.swing.JPanel();
        BtnCitas = new javax.swing.JLabel();
        Desplazo = new javax.swing.JLabel();
        BtnInicio = new javax.swing.JLabel();
        BtnCliente = new javax.swing.JLabel();
        BtnTratamiento = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        favicon = new javax.swing.JLabel();
        modcontra = new javax.swing.JPanel();
        ModPass = new javax.swing.JLabel();
        panelMod = new javax.swing.JPanel();
        passTxt = new javax.swing.JPasswordField();
        Confpass = new javax.swing.JPasswordField();
        Confirmar = new javax.swing.JPanel();
        modTxt = new javax.swing.JLabel();
        Npass = new javax.swing.JLabel();
        confpasss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JPanel();
        lo = new javax.swing.JLabel();
        Clientes = new javax.swing.JPanel();
        Tabla = new javax.swing.JPanel();
        favicon4 = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IngresarBtn = new javax.swing.JPanel();
        Ingresartxt = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JPanel();
        Eliminartxt = new javax.swing.JLabel();
        ModificarBtn = new javax.swing.JPanel();
        Modificartxt = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JPanel();
        Updatetxt = new javax.swing.JLabel();
        AscBtn = new javax.swing.JPanel();
        Asctxt = new javax.swing.JLabel();
        DscBtn = new javax.swing.JPanel();
        DscTxt = new javax.swing.JLabel();
        Citas = new javax.swing.JPanel();
        favicon2 = new javax.swing.JLabel();
        Scroll1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        InrBtn = new javax.swing.JPanel();
        Ingresartxt1 = new javax.swing.JLabel();
        EliminarBtn1 = new javax.swing.JPanel();
        Eliminartxt1 = new javax.swing.JLabel();
        ModificarBtn1 = new javax.swing.JPanel();
        Modificartxt1 = new javax.swing.JLabel();
        reminderBtn = new javax.swing.JPanel();
        Ingresartxt2 = new javax.swing.JLabel();
        UpdateBtn2 = new javax.swing.JPanel();
        Updatetxt2 = new javax.swing.JLabel();
        Tratamiento = new javax.swing.JPanel();
        favicon1 = new javax.swing.JLabel();
        Scroll2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        IngresarBtn1 = new javax.swing.JPanel();
        Addtra = new javax.swing.JLabel();
        EliminarBtn2 = new javax.swing.JPanel();
        Deltra = new javax.swing.JLabel();
        ModificarBtn2 = new javax.swing.JPanel();
        Modtra = new javax.swing.JLabel();
        UpdateBtn1 = new javax.swing.JPanel();
        Updatra = new javax.swing.JLabel();
        AggtraPanel = new javax.swing.JPanel();
        nombreTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        ConTratamiento = new javax.swing.JPanel();
        Confi = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(251, 248, 241));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(251, 248, 241));

        exitTxt.setBackground(new java.awt.Color(251, 248, 241));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(84, 186, 185));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        header.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 40, 40));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 40));

        MenuPlegable.setBackground(new java.awt.Color(247, 236, 222));
        MenuPlegable.setLayout(null);

        BtnCitas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnCitas.setForeground(new java.awt.Color(84, 186, 185));
        BtnCitas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/factura2.png"))); // NOI18N
        BtnCitas.setText("Citas");
        BtnCitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCitas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnCitas.setIconTextGap(15);
        BtnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCitasMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnCitas);
        BtnCitas.setBounds(0, 160, 220, 50);

        Desplazo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Desplazo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/menu2.png"))); // NOI18N
        Desplazo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Desplazo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Desplazo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesplazoMouseClicked(evt);
            }
        });
        MenuPlegable.add(Desplazo);
        Desplazo.setBounds(0, 10, 220, 40);

        BtnInicio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(84, 186, 185));
        BtnInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/inicio2.png"))); // NOI18N
        BtnInicio.setText("Inicio");
        BtnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnInicio.setIconTextGap(15);
        BtnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInicioMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnInicio);
        BtnInicio.setBounds(0, 50, 220, 50);

        BtnCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnCliente.setForeground(new java.awt.Color(84, 186, 185));
        BtnCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/usuario2.png"))); // NOI18N
        BtnCliente.setText("Clientes");
        BtnCliente.setToolTipText("");
        BtnCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnCliente.setIconTextGap(15);
        BtnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnClienteMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnCliente);
        BtnCliente.setBounds(0, 100, 220, 50);

        BtnTratamiento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BtnTratamiento.setForeground(new java.awt.Color(84, 186, 185));
        BtnTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BtnTratamiento.setIcon(new javax.swing.ImageIcon("C:\\Users\\elian\\OneDrive\\Desktop\\JAVA\\Prototipo\\src\\Icons\\medicina.png")); // NOI18N
        BtnTratamiento.setText("Tratamientos");
        BtnTratamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        BtnTratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnTratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BtnTratamiento.setIconTextGap(15);
        BtnTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTratamientoMouseClicked(evt);
            }
        });
        MenuPlegable.add(BtnTratamiento);
        BtnTratamiento.setBounds(0, 220, 220, 50);

        jPanel1.add(MenuPlegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 670));

        Inicio.setBackground(new java.awt.Color(233, 218, 193));
        Inicio.setPreferredSize(new java.awt.Dimension(50, 560));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon.setForeground(new java.awt.Color(255, 255, 255));
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon.setText("Clinica La Esperanza");
        Inicio.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 13, -1, 91));

        modcontra.setBackground(new java.awt.Color(84, 186, 185));
        modcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modcontraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modcontraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modcontraMouseExited(evt);
            }
        });

        ModPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ModPass.setText("Modificar contraseña");

        javax.swing.GroupLayout modcontraLayout = new javax.swing.GroupLayout(modcontra);
        modcontra.setLayout(modcontraLayout);
        modcontraLayout.setHorizontalGroup(
            modcontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modcontraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ModPass, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        modcontraLayout.setVerticalGroup(
            modcontraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModPass, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Inicio.add(modcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 220, -1));

        panelMod.setBackground(new java.awt.Color(233, 218, 193));

        passTxt.setBackground(new java.awt.Color(251, 248, 241));
        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });

        Confpass.setBackground(new java.awt.Color(251, 248, 241));
        Confpass.setForeground(new java.awt.Color(204, 204, 204));
        Confpass.setText("********");
        Confpass.setBorder(null);
        Confpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfpassMousePressed(evt);
            }
        });
        Confpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfpassActionPerformed(evt);
            }
        });

        Confirmar.setBackground(new java.awt.Color(84, 186, 185));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmarMouseExited(evt);
            }
        });

        modTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modTxt.setText("Cambiar");
        modTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConfirmarLayout = new javax.swing.GroupLayout(Confirmar);
        Confirmar.setLayout(ConfirmarLayout);
        ConfirmarLayout.setHorizontalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfirmarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(modTxt)
                .addContainerGap())
        );
        ConfirmarLayout.setVerticalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Npass.setText("Digite nueva contraseña");

        confpasss.setText("Escriba nuevamente la contraseña");

        javax.swing.GroupLayout panelModLayout = new javax.swing.GroupLayout(panelMod);
        panelMod.setLayout(panelModLayout);
        panelModLayout.setHorizontalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpasss)
                    .addComponent(Npass)
                    .addComponent(Confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panelModLayout.setVerticalGroup(
            panelModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Npass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(confpasss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Confpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        Inicio.add(panelMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 420, 400));

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        lo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lo.setText("CERRAR SESION");

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addComponent(lo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Inicio.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 100, 40));

        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Clientes.setVisible(false);
        Clientes.setBackground(new java.awt.Color(204, 255, 255));
        Clientes.setPreferredSize(new java.awt.Dimension(50, 560));

        Tabla.setBackground(new java.awt.Color(239, 255, 253));
        Tabla.setPreferredSize(new java.awt.Dimension(50, 560));
        Tabla.setLayout(null);

        favicon4.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon4.setText("Clinica La Esperanza");
        Tabla.add(favicon4);
        favicon4.setBounds(760, 10, 426, 91);

        Scroll.setBackground(new java.awt.Color(239, 255, 253));
        Scroll.setBorder(null);
        Scroll.setToolTipText("");
        Scroll.setOpaque(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(133, 244, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Telefono", "Correo", "Fecha de nacimiento", "Ultimo Chequeo"
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
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(66, 194, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        Scroll.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Edad");
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Telefono");
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Correo");
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Fecha de nacimiento");
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Ultimo Chequeo");
        }

        Tabla.add(Scroll);
        Scroll.setBounds(100, 110, 1100, 320);

        IngresarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Ingresartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ingresartxt.setText("Ingresar");
        Ingresartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout IngresarBtnLayout = new javax.swing.GroupLayout(IngresarBtn);
        IngresarBtn.setLayout(IngresarBtnLayout);
        IngresarBtnLayout.setHorizontalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresartxt)
                .addGap(24, 24, 24))
        );
        IngresarBtnLayout.setVerticalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingresartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(IngresarBtn);
        IngresarBtn.setBounds(100, 580, 100, 40);

        EliminarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Eliminartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eliminartxt.setText("Eliminar ");
        Eliminartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtnLayout = new javax.swing.GroupLayout(EliminarBtn);
        EliminarBtn.setLayout(EliminarBtnLayout);
        EliminarBtnLayout.setHorizontalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminartxt)
                .addContainerGap())
        );
        EliminarBtnLayout.setVerticalGroup(
            EliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(EliminarBtn);
        EliminarBtn.setBounds(210, 580, 100, 40);

        ModificarBtn.setBackground(new java.awt.Color(84, 186, 185));

        Modificartxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modificartxt.setText("Modificar");
        Modificartxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificartxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificartxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificartxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModificarBtnLayout = new javax.swing.GroupLayout(ModificarBtn);
        ModificarBtn.setLayout(ModificarBtnLayout);
        ModificarBtnLayout.setHorizontalGroup(
            ModificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modificartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModificarBtnLayout.setVerticalGroup(
            ModificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(ModificarBtn);
        ModificarBtn.setBounds(330, 580, 110, 40);

        UpdateBtn.setBackground(new java.awt.Color(84, 186, 185));

        Updatetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatetxt.setText("Actualizar");
        Updatetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdatetxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBtnLayout = new javax.swing.GroupLayout(UpdateBtn);
        UpdateBtn.setLayout(UpdateBtnLayout);
        UpdateBtnLayout.setHorizontalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatetxt)
                .addGap(24, 24, 24))
        );
        UpdateBtnLayout.setVerticalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(UpdateBtn);
        UpdateBtn.setBounds(480, 580, 110, 40);

        AscBtn.setBackground(new java.awt.Color(84, 186, 185));

        Asctxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Asctxt.setText("Ascendente");
        Asctxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsctxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AsctxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AsctxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AscBtnLayout = new javax.swing.GroupLayout(AscBtn);
        AscBtn.setLayout(AscBtnLayout);
        AscBtnLayout.setHorizontalGroup(
            AscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AscBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Asctxt)
                .addGap(24, 24, 24))
        );
        AscBtnLayout.setVerticalGroup(
            AscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Asctxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(AscBtn);
        AscBtn.setBounds(1060, 580, 140, 40);

        DscBtn.setBackground(new java.awt.Color(84, 186, 185));

        DscTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DscTxt.setText("Descendente");
        DscTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DscTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DscTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DscTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DscBtnLayout = new javax.swing.GroupLayout(DscBtn);
        DscBtn.setLayout(DscBtnLayout);
        DscBtnLayout.setHorizontalGroup(
            DscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DscBtnLayout.createSequentialGroup()
                .addComponent(DscTxt)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        DscBtnLayout.setVerticalGroup(
            DscBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DscTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tabla.add(DscBtn);
        DscBtn.setBounds(910, 580, 130, 40);

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Citas.setBackground(new java.awt.Color(254, 227, 236));
        Citas.setPreferredSize(new java.awt.Dimension(50, 560));
        Citas.setLayout(null);

        favicon2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon2.setForeground(new java.awt.Color(255, 255, 255));
        favicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon2.setText("Clinica La Esperanza");
        Citas.add(favicon2);
        favicon2.setBounds(720, 30, 426, 91);

        Scroll1.setBackground(new java.awt.Color(239, 255, 253));
        Scroll1.setBorder(null);
        Scroll1.setToolTipText("");
        Scroll1.setOpaque(false);

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(249, 197, 213));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad", "Correo", "Fecha Cita", "Tratamiento", "Costo", "Ultimo Chequeo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setRowHeight(24);
        jTable2.setSelectionBackground(new java.awt.Color(249, 153, 183));
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setUpdateSelectionOnSort(false);
        jTable2.setVerifyInputWhenFocusTarget(false);
        Scroll1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Id");
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable2.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(2);
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Edad");
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Correo");
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Fecha Cita");
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Tratamiento");
            jTable2.getColumnModel().getColumn(7).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setHeaderValue("Costo");
            jTable2.getColumnModel().getColumn(8).setResizable(false);
            jTable2.getColumnModel().getColumn(8).setHeaderValue("Ultimo Chequeo");
        }

        Citas.add(Scroll1);
        Scroll1.setBounds(90, 130, 1119, 404);

        InrBtn.setBackground(new java.awt.Color(242, 120, 159));

        Ingresartxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ingresartxt1.setText("Ingresar");
        Ingresartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingresartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ingresartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ingresartxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout InrBtnLayout = new javax.swing.GroupLayout(InrBtn);
        InrBtn.setLayout(InrBtnLayout);
        InrBtnLayout.setHorizontalGroup(
            InrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InrBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresartxt1)
                .addGap(24, 24, 24))
        );
        InrBtnLayout.setVerticalGroup(
            InrBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingresartxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(InrBtn);
        InrBtn.setBounds(90, 580, 100, 40);

        EliminarBtn1.setBackground(new java.awt.Color(242, 120, 159));

        Eliminartxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Eliminartxt1.setText("Eliminar ");
        Eliminartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Eliminartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Eliminartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Eliminartxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtn1Layout = new javax.swing.GroupLayout(EliminarBtn1);
        EliminarBtn1.setLayout(EliminarBtn1Layout);
        EliminarBtn1Layout.setHorizontalGroup(
            EliminarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarBtn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminartxt1)
                .addContainerGap())
        );
        EliminarBtn1Layout.setVerticalGroup(
            EliminarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eliminartxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(EliminarBtn1);
        EliminarBtn1.setBounds(210, 580, 100, 40);

        ModificarBtn1.setBackground(new java.awt.Color(242, 120, 159));

        Modificartxt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modificartxt1.setText("Modificar");
        Modificartxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Modificartxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modificartxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modificartxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModificarBtn1Layout = new javax.swing.GroupLayout(ModificarBtn1);
        ModificarBtn1.setLayout(ModificarBtn1Layout);
        ModificarBtn1Layout.setHorizontalGroup(
            ModificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarBtn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modificartxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModificarBtn1Layout.setVerticalGroup(
            ModificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modificartxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(ModificarBtn1);
        ModificarBtn1.setBounds(330, 580, 110, 40);

        reminderBtn.setBackground(new java.awt.Color(242, 120, 159));

        Ingresartxt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ingresartxt2.setText("Enviar Recordatorio");
        Ingresartxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingresartxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ingresartxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ingresartxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout reminderBtnLayout = new javax.swing.GroupLayout(reminderBtn);
        reminderBtn.setLayout(reminderBtnLayout);
        reminderBtnLayout.setHorizontalGroup(
            reminderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reminderBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ingresartxt2)
                .addGap(38, 38, 38))
        );
        reminderBtnLayout.setVerticalGroup(
            reminderBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingresartxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(reminderBtn);
        reminderBtn.setBounds(820, 580, 200, 40);

        UpdateBtn2.setBackground(new java.awt.Color(242, 120, 159));

        Updatetxt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatetxt2.setText("Actualizar");
        Updatetxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Updatetxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Updatetxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Updatetxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBtn2Layout = new javax.swing.GroupLayout(UpdateBtn2);
        UpdateBtn2.setLayout(UpdateBtn2Layout);
        UpdateBtn2Layout.setHorizontalGroup(
            UpdateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtn2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatetxt2)
                .addGap(24, 24, 24))
        );
        UpdateBtn2Layout.setVerticalGroup(
            UpdateBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatetxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Citas.add(UpdateBtn2);
        UpdateBtn2.setBounds(480, 580, 110, 40);

        jPanel1.add(Citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        Tratamiento.setBackground(new java.awt.Color(233, 218, 193));
        Tratamiento.setPreferredSize(new java.awt.Dimension(50, 560));
        Tratamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favicon1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        favicon1.setForeground(new java.awt.Color(255, 255, 255));
        favicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo1.png"))); // NOI18N
        favicon1.setText("Clinica La Esperanza");
        Tratamiento.add(favicon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 13, -1, 91));

        Scroll2.setBackground(new java.awt.Color(239, 255, 253));
        Scroll2.setBorder(null);
        Scroll2.setToolTipText("");
        Scroll2.setOpaque(false);

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBackground(new java.awt.Color(233, 218, 193));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Tratamiento", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setFillsViewportHeight(true);
        jTable3.setFocusCycleRoot(true);
        jTable3.setRowHeight(24);
        jTable3.setSelectionBackground(new java.awt.Color(190, 140, 99));
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jTable3.getTableHeader().setResizingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.setUpdateSelectionOnSort(false);
        jTable3.setVerifyInputWhenFocusTarget(false);
        Scroll2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(2);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(35);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(45);
        }

        Tratamiento.add(Scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 890, 310));

        IngresarBtn1.setBackground(new java.awt.Color(190, 140, 99));

        Addtra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addtra.setText("Ingresar");
        Addtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddtraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout IngresarBtn1Layout = new javax.swing.GroupLayout(IngresarBtn1);
        IngresarBtn1.setLayout(IngresarBtn1Layout);
        IngresarBtn1Layout.setHorizontalGroup(
            IngresarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarBtn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Addtra)
                .addGap(24, 24, 24))
        );
        IngresarBtn1Layout.setVerticalGroup(
            IngresarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Addtra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(IngresarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        EliminarBtn2.setBackground(new java.awt.Color(190, 140, 99));

        Deltra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deltra.setText("Eliminar ");
        Deltra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeltraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeltraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeltraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EliminarBtn2Layout = new javax.swing.GroupLayout(EliminarBtn2);
        EliminarBtn2.setLayout(EliminarBtn2Layout);
        EliminarBtn2Layout.setHorizontalGroup(
            EliminarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Deltra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EliminarBtn2Layout.setVerticalGroup(
            EliminarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deltra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(EliminarBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        ModificarBtn2.setBackground(new java.awt.Color(190, 140, 99));

        Modtra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Modtra.setText("Modificar");
        Modtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModtraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModtraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModtraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ModificarBtn2Layout = new javax.swing.GroupLayout(ModificarBtn2);
        ModificarBtn2.setLayout(ModificarBtn2Layout);
        ModificarBtn2Layout.setHorizontalGroup(
            ModificarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarBtn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        ModificarBtn2Layout.setVerticalGroup(
            ModificarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Modtra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(ModificarBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, -1, -1));

        UpdateBtn1.setBackground(new java.awt.Color(190, 140, 99));

        Updatra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatra.setText("Actualizar");
        Updatra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdatraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdatraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UpdateBtn1Layout = new javax.swing.GroupLayout(UpdateBtn1);
        UpdateBtn1.setLayout(UpdateBtn1Layout);
        UpdateBtn1Layout.setHorizontalGroup(
            UpdateBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtn1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatra)
                .addGap(24, 24, 24))
        );
        UpdateBtn1Layout.setVerticalGroup(
            UpdateBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Updatra, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Tratamiento.add(UpdateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, -1, -1));

        AggtraPanel.setBackground(new java.awt.Color(233, 218, 193));

        nombreTxt.setBackground(new java.awt.Color(251, 248, 241));
        nombreTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        nombreTxt.setText("Ingrese el nombre del tratamiento");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });

        precioTxt.setBackground(new java.awt.Color(251, 248, 241));
        precioTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precioTxt.setForeground(new java.awt.Color(204, 204, 204));
        precioTxt.setText("Ingrese el precio del tratamiento");
        precioTxt.setBorder(null);
        precioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precioTxtMousePressed(evt);
            }
        });
        precioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxtActionPerformed(evt);
            }
        });

        ConTratamiento.setBackground(new java.awt.Color(190, 140, 99));

        Confi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Confi.setText("Confirmar");
        Confi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConTratamientoLayout = new javax.swing.GroupLayout(ConTratamiento);
        ConTratamiento.setLayout(ConTratamientoLayout);
        ConTratamientoLayout.setHorizontalGroup(
            ConTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConTratamientoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Confi)
                .addGap(24, 24, 24))
        );
        ConTratamientoLayout.setVerticalGroup(
            ConTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Confi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AggtraPanelLayout = new javax.swing.GroupLayout(AggtraPanel);
        AggtraPanel.setLayout(AggtraPanelLayout);
        AggtraPanelLayout.setHorizontalGroup(
            AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AggtraPanelLayout.createSequentialGroup()
                .addGroup(AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AggtraPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AggtraPanelLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(ConTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        AggtraPanelLayout.setVerticalGroup(
            AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AggtraPanelLayout.createSequentialGroup()
                .addGroup(AggtraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ConTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Tratamiento.add(AggtraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 890, -1));

        jPanel1.add(Tratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1220, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DesplazoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesplazoMouseClicked
        //Despliega el menu dependiendo la poscision.
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);

        } else if (MenuPlegable.getX() == -170) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 5);
        }
    }//GEN-LAST:event_DesplazoMouseClicked

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        //Redimensiona el componente para ecitar errores al momento de desplazarce.
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);//Sale del programa

    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        //hover de la X en rojo
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(new Color(251, 248, 243));
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        //hover regresando al color original
        exitBtn.setBackground(new Color(251, 248, 243));
        exitTxt.setForeground(new Color(84, 186, 185));
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        //Obtine la poscicion del Header
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //Mueve el programa a la poscicion arrastrada
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

//Mustra panel visible inicio y cierra el menu desplegable
    private void BtnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInicioMouseClicked
        Inicio.setVisible(true);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }

    }//GEN-LAST:event_BtnInicioMouseClicked
//Mustra panel visible Cliente y cierra el menu desplegable
    private void BtnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseClicked
        Inicio.setVisible(false);
        Clientes.setVisible(true);
        Citas.setVisible(false);
        Tratamiento.setVisible(false);
        mostar();
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnClienteMouseClicked
//Mustra panel visible citas y cierra el menu desplegable
    private void BtnCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCitasMouseClicked
        Inicio.setVisible(false);
        Clientes.setVisible(false);
        Citas.setVisible(true);
        Tratamiento.setVisible(false);
        mostar2();
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnCitasMouseClicked

    private void IngresartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseClicked
        new AddClientePanel().setVisible(true);
    }//GEN-LAST:event_IngresartxtMouseClicked

    private void IngresartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseEntered
        IngresarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_IngresartxtMouseEntered

    private void IngresartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresartxtMouseExited
        IngresarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_IngresartxtMouseExited

    private void EliminartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseClicked
        if(jTable1.getSelectionModel().isSelectionEmpty()){
        try { 
        int fila =jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
        identidad = id;
            try {
                conexionBD conex = new conexionBD();
                ResultSet r = conex.consultar("select nombre FROM cliente WHERE idc=" + id);
                while (r.next()) {
                    confirmacion = (r.getString("nombre"));
                    System.out.println(confirmacion + " Esta es la variable");
                }
                DeletePanel ventana = new DeletePanel();
                ventana.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que borrar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
        }
        }else{JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que borrar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_EliminartxtMouseClicked

    private void EliminartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseEntered
        EliminarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_EliminartxtMouseEntered

    private void EliminartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminartxtMouseExited
        EliminarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_EliminartxtMouseExited

    private void ModificartxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseClicked
       if(jTable1.getSelectionModel().isSelectionEmpty()){
        int fila = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
        identidad = id;

        try {
            conexionBD conex = new conexionBD();
            ResultSet r = conex.consultar("select nombre,apellido,telefono,mail,fechan,lastcheck FROM cliente WHERE idc=" + id);

            while (r.next()) {
                auxname = r.getString("nombre");
                auxape = r.getString("apellido");
                auxtel = r.getString("telefono");
                auxmail = r.getString("mail");
                auxfen = new Date(r.getDate("fechan").getTime());
                auxlc = new Date(r.getDate("lastcheck").getTime());
                System.out.println(auxfen + " Y " + auxlc);
                new ModClientePanel().setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
       }else{JOptionPane.showMessageDialog(null, "Error, porfavor seleccione un registro que borrar", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ModificartxtMouseClicked

    private void ModificartxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseEntered
        ModificarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ModificartxtMouseEntered

    private void ModificartxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificartxtMouseExited
        ModificarBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_ModificartxtMouseExited

    private void UpdatetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseClicked
        // TODO add your handling code here:

        int id = Integer.parseInt(jTable1.getValueAt(0, 0).toString());
        mostar();
    }//GEN-LAST:event_UpdatetxtMouseClicked

    private void UpdatetxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseEntered
        // TODO add your handling code here:
        UpdateBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_UpdatetxtMouseEntered

    private void UpdatetxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatetxtMouseExited
        // TODO add your handling code here:
        UpdateBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_UpdatetxtMouseExited

    private void AsctxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseClicked
        // TODO add your handling code here:
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente order by apellido asc;");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AsctxtMouseClicked

    private void AsctxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseEntered
        // TODO add your handling code here:
        AscBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_AsctxtMouseEntered

    private void AsctxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsctxtMouseExited
        // TODO add your handling code here:
        AscBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_AsctxtMouseExited

    private void DscTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseClicked
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente order by apellido desc;");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DscTxtMouseClicked

    private void DscTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseEntered
        // TODO add your handling code here:
        DscBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_DscTxtMouseEntered

    private void DscTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DscTxtMouseExited
        // TODO add your handling code here:
        DscBtn.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_DscTxtMouseExited

    private void BtnTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTratamientoMouseClicked
        // TODO add your handling code here:
        Inicio.setVisible(false);
        Clientes.setVisible(false);
        Citas.setVisible(false);
        Tratamiento.setVisible(true);
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -170, 10, 5);
        }
    }//GEN-LAST:event_BtnTratamientoMouseClicked

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void ConfpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfpassMousePressed
        if (String.valueOf(Confpass.getPassword()).equals("********")) {
            Confpass.setText("");
            Confpass.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfpassMousePressed

    private void ConfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfpassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ConfpassActionPerformed

    private void modTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseClicked

    private void modTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseEntered

    private void modTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modTxtMouseExited

    private void modcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseClicked
        panelMod.setVisible(true);
    }//GEN-LAST:event_modcontraMouseClicked

    private void modcontraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseEntered
        // TODO add your handling code here:
        modcontra.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_modcontraMouseEntered

    private void modcontraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modcontraMouseExited
        modcontra.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_modcontraMouseExited

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        String us = Login.User;
        String a = String.valueOf(passTxt.getPassword());
        String b = String.valueOf(Confpass.getPassword());

        if (a.equals(b)) {
            conexionBD conex = new conexionBD();//Select usercol,contra FROM usuario WHERE usercol
            String consulta = "UPDATE usuario SET contra= '" + b + "' WHERE usercol='" + us + "'";
            int repuesta = conex.accionesEdit(consulta);
            if (repuesta > 0) {
                panelMod.setVisible(false);
                JOptionPane.showMessageDialog(null, "Modificacion Exitosa", "Modificacion con exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar los datos del Cleinte", "Error Al Modificar", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void Ingresartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt1MouseClicked

    private void Ingresartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt1MouseEntered

    private void Ingresartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt1MouseExited

    private void Eliminartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminartxt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminartxt1MouseClicked

    private void Eliminartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminartxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminartxt1MouseEntered

    private void Eliminartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Eliminartxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminartxt1MouseExited

    private void Modificartxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificartxt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificartxt1MouseClicked

    private void Modificartxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificartxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificartxt1MouseEntered

    private void Modificartxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modificartxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificartxt1MouseExited

    private void Ingresartxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt2MouseClicked

    private void Ingresartxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt2MouseEntered

    private void Ingresartxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresartxt2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresartxt2MouseExited

    private void AddtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseClicked
        // TODO add your handling code here:
        AggtraPanel.setVisible(true);
    }//GEN-LAST:event_AddtraMouseClicked

    private void AddtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseEntered
        // TODO add your handling code here:
         Confi.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_AddtraMouseEntered

    private void AddtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtraMouseExited
        // TODO add your handling code here:
         Confi.setBackground(new Color(190,140,99));
    }//GEN-LAST:event_AddtraMouseExited

    private void DeltraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeltraMouseClicked

    private void DeltraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DeltraMouseEntered

    private void DeltraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeltraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_DeltraMouseExited

    private void ModtraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModtraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ModtraMouseClicked

    private void ModtraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModtraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ModtraMouseEntered

    private void ModtraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModtraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ModtraMouseExited

    private void UpdatraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatraMouseClicked

    private void UpdatraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatraMouseEntered

    private void UpdatraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatraMouseExited

    private void Updatetxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updatetxt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Updatetxt2MouseClicked

    private void Updatetxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updatetxt2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Updatetxt2MouseEntered

    private void Updatetxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Updatetxt2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Updatetxt2MouseExited

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
        Confirmar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
        Confirmar.setBackground(new Color(84, 186, 185));
    }//GEN-LAST:event_ConfirmarMouseExited

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese el nombre del tratamiento")) {
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void precioTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese el precio del tratamiento")) {
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_precioTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void precioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioTxtActionPerformed

    private void ConfiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseClicked
        // TODO add your handling code here:
        int bandera = 0;
        if (nombreTxt.getText().equals("Ingrese el nombre del tratamiento") || nombreTxt.getText().isEmpty() || isNumeric(nombreTxt.getText()) == true) {
            bandera++;
        }
        if (precioTxt.getText().equals("Ingrese el precio del tratamiento") || precioTxt.getText().isEmpty() || isNumeric(precioTxt.getText()) == false) {
            bandera++;
        }
        if (bandera == 0) {
            conexionBD conex = new conexionBD();
            String consulta = "Insert into tratamiento(nombret,costo) values " + "(" + "'" + nombreTxt.getText() + "'," + precioTxt.getText() + ");";
            System.out.println(consulta);//Debuger
            int repuesta = conex.accionesEdit(consulta);

            if (repuesta > 0) {
                JOptionPane.showMessageDialog(null, "Datos Ingresado Correctamente", "Insertado Correctamente", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, porfavor rellene correctamente los campos, solo poner texto donde se le pide y poner numero donde se le pide", "Error Al Ingresar Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfiMouseClicked

    private void ConfiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseEntered
        // TODO add your handling code here:
        Confi.setBackground(new Color(153, 102, 0));
    }//GEN-LAST:event_ConfiMouseEntered

    private void ConfiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiMouseExited
        // TODO add your handling code here:
         Confi.setBackground(new Color(190,140,99));
    }//GEN-LAST:event_ConfiMouseExited
    void mostar() {//personaliza y crea la tabla
        Color myColor = new Color(239, 255, 253);
        Scroll.getViewport().setBackground(myColor);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setForeground(myColor);
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(66, 194, 255));

        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM cliente");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idc"), r.getString("nombre"), r.getString("apellido"),
                    r.getString("edad"), r.getString("telefono"), r.getString("mail"), r.getString("fechan"), r.getString("lastcheck")});

            }
            jTable1.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra

        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void mostar2() {//personaliza y crea la tabla
        Color myColor = new Color(254, 227, 236);
        Scroll1.getViewport().setBackground(myColor);
        jTable2.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setForeground(myColor);
        jTable2.getTableHeader().setForeground(new Color(249, 153, 183));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(249, 153, 183));

        for (int i = 0; i < jTable2.getModel().getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD       
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            String idt = "";
            String idcl = "";
            String fech = "";
            String idcitas = "";
            ResultSet citas = conex.consultar("select * FROM citas");
            while (citas.next()) {//Se detiene en cada fila
                idcitas = citas.getString("idcitas");
                fech = citas.getString("fecha");
                idcl = citas.getString("idcliente");//Obtiene el id
                idt = citas.getString("idtratamiento");
                ResultSet clientes = conex.consultar("select nombre,apellido,edad,telefono,mail,lastcheck FROM cliente where idc=" + idcl);
                while (clientes.next()) {
                    String auxn = clientes.getString("nombre");
                    String auxa = clientes.getString("apellido");
                    String auxed = clientes.getString("edad");
                    String auxm = clientes.getString("mail");
                    String aulc = clientes.getString("lastcheck");
                    ResultSet tratamiento = conex.consultar("select nombret,costo FROM tratamiento where idt=" + idt);
                    while (tratamiento.next()) {
                        String auxnom = tratamiento.getString("nombret");
                        String auxcost = tratamiento.getString("costo");
                        modelo.addRow(new Object[]{idcitas, auxn, auxa, auxed, auxm, fech, auxnom, auxcost, aulc});
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void mostrar3() {
        //190,140,99 Cafe oscuro
        Color myColor = new Color(233, 218, 193);
        Scroll2.getViewport().setBackground(myColor);
        jTable3.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jTable3.getTableHeader().setOpaque(false);
        jTable3.getTableHeader().setForeground(myColor);
        jTable3.getTableHeader().setForeground(new Color(190, 140, 99));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(190, 140, 99));
        for (int i = 0; i < jTable3.getModel().getColumnCount(); i++) {
            jTable3.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);//Obtiene todas las columnas necesarias
        }
        conexionBD conex = new conexionBD();//Conecta con la BD
        ResultSet r = conex.consultar("SELECT * FROM tratamiento");//Declara la consulta de los datos
        DefaultTableModel modelo = new DefaultTableModel();//Ubica las columnas  
        modelo = (DefaultTableModel) jTable3.getModel();
        modelo.setRowCount(0); //indica el inicio para ingresar datos desde la columna 0
        try {
            while (r.next()) {//Mientras haya objetos en la tabla de BD los obtendra
                modelo.addRow(new Object[]{r.getString("idt"), r.getString("nombret"), r.getString("costo")});
            }
            jTable3.setModel(modelo);//Obtiene el modelo terminado de la tabla con todos los datos y la muestra
        } catch (SQLException ex) {
            Logger.getLogger(Prototipo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

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
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prototipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prototipo().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addtra;
    private javax.swing.JPanel AggtraPanel;
    private javax.swing.JPanel AscBtn;
    private javax.swing.JLabel Asctxt;
    private javax.swing.JLabel BtnCitas;
    private javax.swing.JLabel BtnCliente;
    private javax.swing.JLabel BtnInicio;
    private javax.swing.JLabel BtnTratamiento;
    private javax.swing.JPanel Citas;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel ConTratamiento;
    private javax.swing.JLabel Confi;
    private javax.swing.JPanel Confirmar;
    private javax.swing.JPasswordField Confpass;
    private javax.swing.JLabel Deltra;
    private javax.swing.JLabel Desplazo;
    private javax.swing.JPanel DscBtn;
    private javax.swing.JLabel DscTxt;
    private javax.swing.JPanel EliminarBtn;
    private javax.swing.JPanel EliminarBtn1;
    private javax.swing.JPanel EliminarBtn2;
    private javax.swing.JLabel Eliminartxt;
    private javax.swing.JLabel Eliminartxt1;
    private javax.swing.JPanel IngresarBtn;
    private javax.swing.JPanel IngresarBtn1;
    private javax.swing.JLabel Ingresartxt;
    private javax.swing.JLabel Ingresartxt1;
    private javax.swing.JLabel Ingresartxt2;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel InrBtn;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JLabel ModPass;
    private javax.swing.JPanel ModificarBtn;
    private javax.swing.JPanel ModificarBtn1;
    private javax.swing.JPanel ModificarBtn2;
    private javax.swing.JLabel Modificartxt;
    private javax.swing.JLabel Modificartxt1;
    private javax.swing.JLabel Modtra;
    private javax.swing.JLabel Npass;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JScrollPane Scroll1;
    private javax.swing.JScrollPane Scroll2;
    private javax.swing.JPanel Tabla;
    private javax.swing.JPanel Tratamiento;
    private javax.swing.JPanel UpdateBtn;
    private javax.swing.JPanel UpdateBtn1;
    private javax.swing.JPanel UpdateBtn2;
    private javax.swing.JLabel Updatetxt;
    private javax.swing.JLabel Updatetxt2;
    private javax.swing.JLabel Updatra;
    private javax.swing.JLabel confpasss;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel favicon1;
    private javax.swing.JLabel favicon2;
    private javax.swing.JLabel favicon4;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lo;
    private javax.swing.JPanel logout;
    private javax.swing.JLabel modTxt;
    private javax.swing.JPanel modcontra;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panelMod;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JPanel reminderBtn;
    // End of variables declaration//GEN-END:variables
}
