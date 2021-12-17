/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.IChuyenNganhDAO;
import BLL.MonHocDAO;
import BLL.IMonHocDAO;
import BLL.IKhoaDAO;
import Check.Check;
import BLL.IMonHocDAO;
import Entity.ChuyenNganh;
import Entity.MonHoc;
import Entity.Khoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class frmQuanLyMonHoc extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbmMaChuyenNganh;
    private DefaultComboBoxModel dcbmHinhThucThi;
    private ArrayList<MonHoc> list=null;
    private ArrayList<ChuyenNganh> allChuyenNganh=null;

    public frmQuanLyMonHoc() {
        initComponents();
        dcbmMaChuyenNganh = new DefaultComboBoxModel();
        dtm = new DefaultTableModel();
        menuChuyenNganh.setModel(dcbmMaChuyenNganh);
        dtm.addColumn("Mã Môn Học");
        dtm.addColumn("Tên Môn Học");
        dtm.addColumn("Mã Chuyên Ngành");
        dtm.addColumn("Học Kỳ");
        dtm.addColumn("Số Tín Chỉ");
        dtm.addColumn("Hình Thức Thi");
        dtm.addColumn("Bắt Buộc");
        dcbmHinhThucThi = new DefaultComboBoxModel();
        dcbmHinhThucThi.addElement("Thi Lý Thuyết");
        dcbmHinhThucThi.addElement("Thi Thực Hành");
        jcbHinhThucThi.setModel(dcbmHinhThucThi);

        loaddata();
    }

    private void loaddata() {
        try {
            
            
            IChuyenNganhDAO chuyenNganhDAO = (IChuyenNganhDAO) Class.forName("BLL.ChuyenNganhDAO").newInstance();
            allChuyenNganh = chuyenNganhDAO.getAll();
            for (ChuyenNganh k : allChuyenNganh) {
                dcbmMaChuyenNganh.addElement(k.getTenChuyenNganh());
            }
            IMonHocDAO monHocDAO = (IMonHocDAO) Class.forName("BLL.MonHocDAO").newInstance();
            list = new MonHocDAO().getAll();
            for (MonHoc mH : list) {
                dtm.addRow(toObjectsData(mH));
            }
            jtbMonHoc.setModel(dtm);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmQuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmQuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmQuanLyMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object[] toObjectsData(MonHoc mh) {
         
        Object[] objectsData = {mh.getMaMH(), mh.getTenMH(), mh.getMaChuyenNganh(),mh.getHocKy(), mh.getSoTinChi(),mh.getHinhThucThi(),mh.getBatBuoc()};
        return objectsData;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbMonHoc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuChuyenNganh = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtMaMH = new javax.swing.JTextField();
        txtTenMH = new javax.swing.JTextField();
        txtHocKy = new javax.swing.JTextField();
        txtSoTinChi = new javax.swing.JTextField();
        jcbHinhThucThi = new javax.swing.JComboBox<>();
        jcbBatBuoc = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jbAdd = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTimKiemHP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ MÔN HỌC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(404, 404, 404))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jtbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Môn Học", "Tên Môn Học", "Mã Chuyên Ngành", "Học Kỳ", "Số Tín Chỉ", "Hình Thức Thi", "Bắt Buộc "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMonHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbMonHoc);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tên Môn Học");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Môn Học");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Học Kỳ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Số Tín Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Chuyên Ngành");

        menuChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Hình Thức Thi");

        jcbHinhThucThi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbBatBuoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbBatBuoc.setText("Bắt Buộc");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaMH, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtTenMH))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuChuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSoTinChi)
                    .addComponent(jcbHinhThucThi, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jcbBatBuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcbBatBuoc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(menuChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(txtHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbHinhThucThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jbAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbAdd.setForeground(new java.awt.Color(255, 0, 0));
        jbAdd.setText("Thêm");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbUpdate.setForeground(new java.awt.Color(255, 0, 0));
        jbUpdate.setText("Sửa");
        jbUpdate.setEnabled(false);
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jbDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbDelete.setForeground(new java.awt.Color(255, 0, 0));
        jbDelete.setText("Xóa");
        jbDelete.setEnabled(false);
        jbDelete.setIconTextGap(2);
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 0, 0));
        jbExit.setText("Làm Mới");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAdd, jbDelete, jbExit, jbUpdate});

        jLabel10.setText("(Tìm kiếm theo mã môn học)");

        txtTimKiemHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemHPActionPerformed(evt);
            }
        });

        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemHP, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTimKiemHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        String maMH = txtMaMH.getText();
        String tenMH = txtTenMH.getText(); 
        String maChuyenNganh = allChuyenNganh.get(menuChuyenNganh.getSelectedIndex()).getMaChuyenNganh();
        String hocKy = txtHocKy.getText();
        String soTinChi =txtSoTinChi.getText();
        String hinhThucThi = (String) jcbHinhThucThi.getSelectedItem();
        boolean bB = jcbBatBuoc.isSelected();
        String batBuoc;
        if(bB==true){
         batBuoc="Bắt Buộc";
        }
        else{batBuoc="";}
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }



      
        MonHoc monHoc = new MonHoc(maMH, tenMH, maChuyenNganh, hocKy, soTinChi, hinhThucThi,batBuoc);
        ArrayList<MonHoc> listCheckIDMH = new MonHocDAO().CheckID(maMH);
       
        if (listCheckIDMH.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã Môn Học bị trùng", "Thông báo", JOptionPane.ERROR_MESSAGE);
            txtMaMH.setText("MH");
            txtMaMH.requestFocus();
        }
       
        else {
            MonHoc insert = new MonHocDAO().addNew(monHoc);
            JOptionPane.showMessageDialog(this, "Thêm thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (insert != null) {
                showAll();
            }
        }

    }//GEN-LAST:event_jbAddActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        String maMH=txtMaMH.getText();
        String tenMH = txtTenMH.getText();
        String hocKy = txtHocKy.getText();
        String soTinChi = txtSoTinChi.getText();
        String hinhThucThi =(String) jcbHinhThucThi.getSelectedItem();
        String maChuyenNganh = allChuyenNganh.get(menuChuyenNganh.getSelectedIndex()).getMaChuyenNganh();
        boolean bB=jcbBatBuoc.isSelected();
        String batBuoc;
        if(bB==true){
         batBuoc="Bắt Buộc";
        }
        else{batBuoc="";}
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }

        MonHoc monHoc = new MonHoc(maMH, tenMH, maChuyenNganh, hocKy, soTinChi, hinhThucThi,batBuoc);
        MonHoc update = new MonHocDAO().updateByID(monHoc);
        JOptionPane.showMessageDialog(this, "Sửa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        if (update != null) {
            showAll();
        }
        jbAdd.setEnabled(true);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        txtMaMH.setEnabled(true);
        jcbBatBuoc.setSelected(false);
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jtbMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMonHocMouseClicked
        txtMaMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 0).toString());
        txtTenMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 1).toString());
        menuChuyenNganh.setSelectedItem(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 2).toString());
        txtHocKy.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 4).toString());
        txtSoTinChi.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 4).toString());
        jcbHinhThucThi.setSelectedItem(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 5).toString());
       
       
     

        jbAdd.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        txtMaMH.setEnabled(false);
    }//GEN-LAST:event_jtbMonHocMouseClicked

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        String maMH = txtMaMH.getText();
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                new MonHocDAO().deleteMonHoc(maMH);
                JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại  học phần của môn học này, hãy xóa dữ liệu học phần trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại  học phần của môn học này, hãy xóa dữ liệu học phần trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
            jbAdd.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            txtMaMH.setEnabled(true);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed
    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<MonHoc> MH = new MonHocDAO().getAll();
        for (MonHoc mh : MH) {
            Vector v = new Vector();
            v.add(mh.getMaMH());
            v.add(mh.getTenMH());
            v.add(mh.getMaChuyenNganh());
            v.add(mh.getHocKy());
            v.add(mh.getSoTinChi());
            v.add(mh.getHinhThucThi());
            v.add(mh.getBatBuoc());
            
            

            dtm.addRow(v);
        }
        resetForm();
        
    }

    public void resetForm() {
        txtMaMH.setText("MH");
        txtTenMH.setText("");
        txtHocKy.setText("");
        txtSoTinChi.setText("");
        jcbBatBuoc.setSelected(false);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        jbAdd.setEnabled(true);
        txtMaMH.setEnabled(true);
        txtMaMH.requestFocus();
    }

    public boolean checkinfo() {
        Check c = new Check();
        if (!c.checkIDMH(txtMaMH.getText())) {
            JOptionPane.showMessageDialog(this, "Mã học phần phải có độ dài lớn hơn 2 và bắt đầu bằng MH", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaMH.setText("MH");
            txtMaMH.requestFocus();
            return false;
        } else if (!c.checkSpace(txtTenMH.getText()) || !c.check(txtTenMH.getText())) {
            JOptionPane.showMessageDialog(this, "Tên môn học không được trống !", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtTenMH.setText("");
            txtTenMH.requestFocus();
            return false;

        } else if (!c.checkSpace(txtHocKy.getText()) || !c.checkNumber(txtHocKy.getText())||Integer.parseInt(txtHocKy.getText())>8||Integer.parseInt(txtHocKy.getText())<1) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại học kỳ(Phải là số nguyên từ 1 đến 8)", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtHocKy.setText("");
            txtHocKy.requestFocus();
            return false;
        }
        else if (!c.checkSpace(txtSoTinChi.getText()) || !c.checkNumber(txtSoTinChi.getText())||Integer.parseInt(txtSoTinChi.getText())>4||Integer.parseInt(txtSoTinChi.getText())<1) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại số tín chỉ(Phải là số nguyên từ 1 đến 4)", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtSoTinChi.setText("");
            txtSoTinChi.requestFocus();
            return false;
        }
        
        return true;
    }
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.resetForm();
        
    }//GEN-LAST:event_jbExitActionPerformed

    private void txtTimKiemHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemHPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JCheckBox jcbBatBuoc;
    private javax.swing.JComboBox<String> jcbHinhThucThi;
    private javax.swing.JTable jtbMonHoc;
    private javax.swing.JComboBox<String> menuChuyenNganh;
    private javax.swing.JTextField txtHocKy;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenMH;
    private javax.swing.JTextField txtTimKiemHP;
    // End of variables declaration//GEN-END:variables
}
