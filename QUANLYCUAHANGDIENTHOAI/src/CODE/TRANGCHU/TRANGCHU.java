/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODE.TRANGCHU;

import CODE.HOADON.CTHD;
import CODE.HOADON.HD;
import CODE.KHACHHANG.KH;
import CODE.NHANVIEN.NV;
import CODE.SANPHAM.MUASP;
import CODE.SANPHAM.SANPHAM;
import CODE.SANPHAM.SP;
import CODE.THANHTOAN.PTTT;
import CODE.THANHTOAN.THANHTOAN;
import CODE.THANHTOAN.TRAGOP;
import CODE.THANHTOAN.table1;
import SQL.controller;
import com.toedter.calendar.JCalendar;
import static java.lang.constant.ConstantDescs.NULL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;

/**
 *
 * @author admin
 */
public class TRANGCHU extends javax.swing.JFrame {
public DefaultTableModel table;
public DefaultComboBoxModel combo;
public ArrayList<table1>  khsp;
    /**
     * Creates new form TRANGCHU
     */
    public TRANGCHU() {
       

        initComponents();setLocationRelativeTo(null);
        table=(DefaultTableModel)jTable1.getModel();
        
          ArrayList<NV> nhanvien=new controller().getNV();
       ArrayList<NV> nvthungan=new ArrayList<>();
        
       for( NV nv:nhanvien){
           NV nvbh=new NV();
            if(nv.getCHUCVU().equalsIgnoreCase("nhân viên thu ngân")){
                jComboBox1.addItem(nv.getMANV());
            }  
        }
       
       ArrayList<table1> list=new controller().gettable();
        showTable(list);
        
    }
    
     public void showTable(ArrayList<table1> list) {
          int i=table.getRowCount();
          for(int j=i-1;j>=0;j--){
              table.removeRow(j);    
          }
          for(table1 d1:list){
         table.addRow(new Object[]{
         d1.getTen(),d1.getSdt(),d1.getMasp(),d1.getMahd(),d1.getGia()
        });
          }
       
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("QUẢN LÝ CỬA HÀNG ĐIỆN THOẠI");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Mua hàng");

        jLabel3.setText("TÊN KHÁCH HÀNG");

        jLabel4.setText("SỐ CHỨNG MINH");

        jLabel5.setText("SỐ ĐIỆN THOẠI");

        jLabel6.setText("ĐỊA CHỈ");

        jLabel7.setText("MÃ SẢN PHẨM");

        jTextField3.setDragEnabled(true);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("MÃ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextField4)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TÊN KHÁCH HÀNG", "SỐ ĐIỆN THOẠI", "MÃ SẢN PHẨM", "MÃ HÓA ĐƠN", "GIÁ"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a7.png"))); // NOI18N
        jButton5.setText("THÊM SẢN PHẨM");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/Untitled-1 copy.png"))); // NOI18N
        jButton6.setText("THÊM NHÂN VIÊN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a5.png"))); // NOI18N
        jButton7.setText("THÊM NHÀ CUNG CẤP");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a11.png"))); // NOI18N
        jButton8.setText("THÊM KHO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a8.png"))); // NOI18N
        jButton9.setText("BẢO HÀNH");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a10.png"))); // NOI18N
        jButton4.setText("TRẢ GÓP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addGap(56, 56, 56)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(59, 59, 59)
                .addComponent(jButton7)
                .addGap(61, 61, 61)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a4.png"))); // NOI18N
        jButton3.setText("THANH TOÁN ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 51, 0));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/add_trash_24px.png"))); // NOI18N
        jButton11.setText("XÓA");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/Untitled-1 copy1.png"))); // NOI18N
        jButton10.setText("THỐNG KÊ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a9a.png"))); // NOI18N
        jButton2.setText("RESET");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CODE/icon/a3.png"))); // NOI18N
        jButton1.setText("MUA HÀNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       new CODE.SANPHAM.SANPHAM().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         new CODE.NHANVIEN.NHANVIEN().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new CODE.NHACC.NHACC().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new CODE.KHO.KHO().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       new CODE.BAOHANH.BAOHANH().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       new CODE.THONGKE.THONGKE().setVisible(true);
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

     ArrayList<table1> a1 = new ArrayList<>(); 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    ArrayList<table1> a1 = new ArrayList<>(); 
     
        boolean t=false;
       int a[]=jTable1.getSelectedRows();
       
       
       if(a.length==0){
       JOptionPane.showMessageDialog(rootPane, "CHƯA CHỌN SẢN PHẨM");
       }
       else {
       if(a.length!=1){
for(int i=0;i<1;i++){
    for(int j=i+1;j<a.length;j++){
        if(!((table.getValueAt(a[j], 1)).toString()).equals((table.getValueAt(a[i], 1)).toString())){
            t=true;break;
        }
    }
}
if(t){
    JOptionPane.showMessageDialog(rootPane, "SẢN PHẨM CHỌN KHÔNG CÙNG MÃ KHÁCH HÀNG");
       }
else{
        for(int i=0;i<a.length;i++){
            table1 s1=new table1() ;
            
         s1.setTen(table.getValueAt(a[i], 0).toString());
         s1.setSdt(table.getValueAt(a[i], 1).toString());
         s1.setMahd(table.getValueAt(a[i], 2).toString());
         s1.setMasp(table.getValueAt(a[i], 3).toString());
         s1.setGia(Integer.parseInt(table.getValueAt(a[i], 4).toString()));
        a1.add(s1);
       }
        this.dispose();
       new   THANHTOAN(a1,a).setVisible(true);
} 
       }
       else {
           table1 s1=new table1() ;
           s1.setTen(table.getValueAt(a[0], 0).toString());
         s1.setSdt(table.getValueAt(a[0], 1).toString());
         s1.setMasp(table.getValueAt(a[0], 2).toString());
         s1.setMahd(table.getValueAt(a[0], 3).toString());
         s1.setGia(Integer.parseInt(table.getValueAt(a[0], 4).toString()));
         a1.add(s1);
         this.dispose();
         new   THANHTOAN(a1,a).setVisible(true);
        
       }
       }
    }//GEN-LAST:event_jButton3ActionPerformed
String KH;String x = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ArrayList<NV> nhanvien=new controller().getNV();
      ArrayList<SP> sanpham=new controller().getSP();
       ArrayList<KH> khachhang=new controller().getKH();
        ArrayList<MUASP> muasp=new controller().getMUASP();
      boolean t2=false,t3=false,t4=false;
    
     
         if(jTextField1.getText().equals(""))JOptionPane.showMessageDialog(rootPane, "THIẾU TÊN KHÁCH HÀNG");
        else if(jTextField2.getText().equals(""))JOptionPane.showMessageDialog(rootPane, "THIẾU SỐ CHỨNG MINH");
        else if(jTextField3.getText().equals(""))JOptionPane.showMessageDialog(rootPane, "THIẾU SỐ ĐIỆN THOẠI");    
        else if(jTextArea1.getText().equals(""))JOptionPane.showMessageDialog(rootPane, "THIẾU ĐỊA CHỈ");
        else  if(jTextField4.getText().equals(""))JOptionPane.showMessageDialog(rootPane, "THIẾU MÃ SẢN PHẨM"); 
        else  if(jComboBox1.getSelectedItem().toString().equals(""))JOptionPane.showMessageDialog(rootPane, "CHỌN NHÂN VIÊN  "); 
        else {  
            
           
        
        
        for( SP s:sanpham){
            if(jTextField4.getText().equalsIgnoreCase(s.getMASP())){
                t2=true;break;
            }
              
        }
         for( MUASP msp:muasp){
            if(jTextField4.getText().equalsIgnoreCase(msp.getMASP())){
                t4=true;break;
            }
              
        }
         
        for( KH k:khachhang){
            if(("KH"+jTextField3.getText()).equalsIgnoreCase(k.getMAKH()))  {
                t3=true;break;
            }}
           if(t2&&!t4) { 
        KH KHACHHANG = new KH();
        KHACHHANG.setTENKH(jTextField1.getText());
        KHACHHANG.setSOCMNN(jTextField2.getText());
        KHACHHANG.setSDT(jTextField3.getText());
        KHACHHANG.setMAKH("KH"+jTextField3.getText());
        KHACHHANG.setDIACHI(jTextArea1.getText());   
        
       if(!t3) new controller().addKH( KHACHHANG);
       HD HOADON= new HD();
        
        long hd = System.currentTimeMillis();
               SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd");
        if(!("KH"+jTextField3.getText()).equals(KH) ){
        HOADON.setMAHD("HD"+hd);
        HOADON.setMAKH("KH"+jTextField3.getText());
        HOADON.setMANV(jComboBox1.getSelectedItem().toString());
        HOADON.setNGAY(da.format(hd));
        HOADON.setTONGTIEN(0);
        HOADON.setHTTT("0");
        new controller().addHD(HOADON);
        x="HD"+hd;
            PTTT pttt= new PTTT();
            pttt.setMAHD(x);
             
            new controller().addPTTT(pttt);
        
        
        for( SP s:sanpham){
            if(jTextField4.getText().equalsIgnoreCase(s.getMASP())){
                CTHD chitiethd=new CTHD();
                chitiethd.setMAHD("HD"+hd);
                chitiethd.setMASP(jTextField4.getText());
                chitiethd.setTHANHTIEN(s.getGIA());
               new controller().addCTHD(chitiethd);
               ArrayList<table1> list=new controller().gettable();
        showTable(list);
            }}
        
        }
        else{ for( SP s:sanpham){
            if(jTextField4.getText().equalsIgnoreCase(s.getMASP())){
                CTHD chitiethd=new CTHD();
                chitiethd.setMAHD(x);
                chitiethd.setMASP(jTextField4.getText());
                chitiethd.setTHANHTIEN(s.getGIA());
               new controller().addCTHD(chitiethd);
               
               
            }}}
        MUASP mua=new MUASP();
        mua.setMAKH("KH"+jTextField3.getText());
        mua.setMASP(jTextField4.getText());
        mua.setNGAYMUA(da.format(hd));
        new controller().addMUASP(mua);
        KH="KH"+jTextField3.getText();
       
        JOptionPane.showMessageDialog(rootPane, "MUA THÀNH CÔNG"); 
        }  
         else if(!t2 ) JOptionPane.showMessageDialog(rootPane, "MÃ SẢN PHẨM KHÔNG TỒN TẠI");   
           else if(t4 ) JOptionPane.showMessageDialog(rootPane, " SẢN PHẨM ĐÃ ĐƯỢC MUA"); 
           
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
ArrayList<table1> a1 = new ArrayList<>(); 
       int a[]=jTable1.getSelectedRows(); 
        for(int i=0;i<a.length;i++){
            table1 s1=new table1() ;
            
         s1.setTen(table.getValueAt(a[i], 0).toString());
         s1.setSdt(table.getValueAt(a[i], 1).toString());
         s1.setMasp(table.getValueAt(a[i], 2).toString());
         s1.setMahd(table.getValueAt(a[i], 3).toString());
         s1.setGia(Integer.parseInt(table.getValueAt(a[i], 4).toString()));
        a1.add(s1);
       }
       if(a.length==0){
           JOptionPane.showMessageDialog(rootPane, "CHƯA CHỌN SẢN PHẨM ĐỂ XÓA");

       }
       else {
           if(JOptionPane.showConfirmDialog(rootPane, "BẠN CÓ MUỐN XÓA KHÔNG?")==0){
           ArrayList<table1> list=new controller().gettable();
        showTable(list);
       for(table1 tb:a1){
       new controller().deletemsp(tb.getMasp());
       new controller().deletecthd(tb.getMasp());
       }
       JOptionPane.showMessageDialog(rootPane, "XÓA THÀNH CÔNG");
         new TRANGCHU().setVisible(true);
         this.dispose();
       }}
       
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      new TRAGOP().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
 ArrayList<KH> khachhang=new controller().getKH();      
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&!jTextField3.getText().equals("")){
           for(KH kh:khachhang){
               if(kh.getMAKH().equalsIgnoreCase("kh"+jTextField3.getText())){
                   jTextField1.setText(kh.getTENKH());
                   jTextField2.setText(kh.getSOCMNN());
                   jTextArea1.setText(kh.getDIACHI());
                   break;
                   
           }
               else {
                    jTextField1.setText("");
                   jTextField2.setText("");
                   jTextArea1.setText("");
                   
               }
               
           }   }
        
        
    }//GEN-LAST:event_jTextField3KeyPressed
 
 
     
                                   
    
      
                                       
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
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANGCHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}