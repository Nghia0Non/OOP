/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HocPhanDAO;
import BLL.IHocPhanDAO;
import BLL.IKhoaDAO;
import BLL.ILopHocPhanDAO;
import Check.Check;
import BLL.IMonHocDAO;
import BLL.LopHocPhanDAO;
import Entity.HocPhan;
import Entity.Khoa;
import Entity.LopHocPhan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class frmQuanLyLopHocPhan extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbmMaKhoa;
    private DefaultComboBoxModel dcbmTietHoc;
    private DefaultComboBoxModel dcbmHocKy;
    private DefaultComboBoxModel dcbmThu;
    private ArrayList<LopHocPhan> list=null;
    private ArrayList<Khoa> allKhoa=null;

    public frmQuanLyLopHocPhan() {
        initComponents();
        dcbmMaKhoa = new DefaultComboBoxModel();
        dtm = new DefaultTableModel();
        menuMaKhoa.setModel(dcbmMaKhoa);
        dtm.addColumn("Mã Lớp Học Phần");
        dtm.addColumn("Mã Học Phần");
        dtm.addColumn("Mã Môn Học");
        dtm.addColumn("Mã Khoa");
        dtm.addColumn("Tiết Học");
        dtm.addColumn("Phòng Học");
        dtm.addColumn("Thứ");
        dtm.addColumn("Sĩ Số");     
        dtm.addColumn("Học Kỳ");     
        dtm.addColumn("Năm Học");
        dtm.addColumn("Ngày Thi");
        
        dcbmTietHoc = new DefaultComboBoxModel();
        dcbmTietHoc.addElement("1-3");
        dcbmTietHoc.addElement("4-6");
        dcbmTietHoc.addElement("7-9");
        dcbmTietHoc.addElement("10-12");
        dcbmTietHoc.addElement("1-2");
        dcbmTietHoc.addElement("3-4");
        dcbmTietHoc.addElement("5-6");
        dcbmTietHoc.addElement("7-8");
        dcbmTietHoc.addElement("9-10");
        dcbmTietHoc.addElement("11-12");
        menuTietHoc.setModel(dcbmTietHoc);
        
        dcbmThu = new DefaultComboBoxModel();
        dcbmThu.addElement("Thứ 2");
        dcbmThu.addElement("Thứ 3");
        dcbmThu.addElement("Thứ 4");
        dcbmThu.addElement("Thứ 5");
        dcbmThu.addElement("Thứ 6");
        menuThu.setModel(dcbmThu);
        
        dcbmHocKy = new DefaultComboBoxModel();
        dcbmHocKy.addElement("1");
        dcbmHocKy.addElement("2");
       
        menuHocKy.setModel(dcbmHocKy);
        
        loaddata();
    }

    private void loaddata() {
        try {
            
            
            IKhoaDAO khoaDAO = (IKhoaDAO) Class.forName("BLL.KhoaDAO").newInstance();
            allKhoa = khoaDAO.getAll();
            for (Khoa k : allKhoa) {
                dcbmMaKhoa.addElement(k.getTenkhoa());
            }
            ILopHocPhanDAO lopHocPhanDAO = (ILopHocPhanDAO) Class.forName("BLL.LopHocPhanDAO").newInstance();
            list = new LopHocPhanDAO().getAll();
            for (LopHocPhan lhp : list) {
                dtm.addRow(toObjectsData(lhp));
            }
            jtbLopHocPhan.setModel(dtm);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmQuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmQuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmQuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object[] toObjectsData(LopHocPhan lhp) {
        Object[] objectsData = {lhp.getMaLHP(), lhp.getMaHP(), lhp.getMaMH(),lhp.getMaKhoa(), lhp.getTietHoc(),lhp.getPhongHoc(),lhp.getThu(),lhp.getSiSo(),lhp.getHocKy(),lhp.getNamHoc(),lhp.getNgayThi()};
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
        jtbLopHocPhan = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLHP = new javax.swing.JTextField();
        txtMaHP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menuMaKhoa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        menuTietHoc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPhongHoc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSiSo = new javax.swing.JTextField();
        menuThu = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNamHoc = new javax.swing.JTextField();
        jdNgayThi = new com.toedter.calendar.JDateChooser();
        menuHocKy = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(974, 33));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ LỚP HỌC PHẦN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel1)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jtbLopHocPhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Lớp Học Phần", "Mã Học Phần", "Mã Môn Học", "Mã Khoa", "Tiết Học", "Phòng Học", "Thứ", "Sĩ Số", "Học Kỳ", "Năm Học", "Ngày Thi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbLopHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbLopHocPhanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbLopHocPhan);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jbNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbNew.setForeground(new java.awt.Color(255, 0, 0));
        jbNew.setText("Thêm");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
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
                    .addComponent(jbDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jbNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbDelete, jbExit, jbNew, jbUpdate});

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mã Học Phần");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Lớp Học Phần");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Khoa");

        menuMaKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tiết Học");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Năm Học");

        menuTietHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Thứ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Phòng Học");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Sĩ Số");

        menuThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Học Kỳ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ngày Thi");

        jdNgayThi.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLHP)
                            .addComponent(txtMaHP, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuMaKhoa, 0, 150, Short.MAX_VALUE)
                            .addComponent(menuTietHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 98, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(menuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(txtNamHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(menuMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(menuTietHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(menuHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(menuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel14))
                            .addComponent(jdNgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
         
        String maLHP = txtMaLHP.getText();
        String maHP = txtMaHP.getText();
       
        String maKhoa = allKhoa.get(menuMaKhoa.getSelectedIndex()).getMakhoa();
        String tietHoc = (String)menuTietHoc.getSelectedItem();
        String thu =(String) menuThu.getSelectedItem();
        String namHoc = txtNamHoc.getText();
        String siSo = txtSiSo.getText();
        String phongHoc = txtPhongHoc.getText();
        String hocKy = (String) menuHocKy.getSelectedItem();
        String ngayThi = ((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText();
       Check c = new Check();
        if (!checkinfo()) {
            return;
        }

        
        else
        if(Integer.parseInt(siSo)<40||Integer.parseInt(siSo)>80){
            JOptionPane.showMessageDialog(this, "Sĩ số phải từ 40 đến 80 ", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtSiSo.setText("");
            txtSiSo.requestFocus();
        }
        else {
             ArrayList<HocPhan> GetMaMH = new HocPhanDAO().findByMaHP(txtMaHP.getText());
             String maMH = GetMaMH.get(0).getMaMH();
            LopHocPhan lopHocPhan = new LopHocPhan(maLHP, maHP, maMH, maKhoa, tietHoc, phongHoc, thu, siSo, hocKy, namHoc, ngayThi);
            LopHocPhan insert = new LopHocPhanDAO().addNew(lopHocPhan);
            JOptionPane.showMessageDialog(this, "Thêm thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (insert != null) {
                showAll();
            }
        }

    }//GEN-LAST:event_jbNewActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        String maLHP = txtMaLHP.getText();
        String maHP = txtMaHP.getText();
        String maKhoa = allKhoa.get(menuMaKhoa.getSelectedIndex()).getMakhoa();
        String tietHoc = (String)menuTietHoc.getSelectedItem();
        String thu =(String) menuThu.getSelectedItem();
        String namHoc = txtNamHoc.getText();
        String siSo = txtSiSo.getText();
        String phongHoc = txtPhongHoc.getText();
        String hocKy = (String) menuHocKy.getSelectedItem();
        String ngayThi = ((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText();
       Check c = new Check();
        if (!checkinfo()) {
            return;
        }
        for(int i=0;i<list.size();i++)
        if (list.get(i).getPhongHoc().equals(txtPhongHoc.getText())&&list.get(i).getTietHoc().equals(menuTietHoc.getSelectedItem())
                &&list.get(i).getThu().equals(menuThu.getSelectedItem())&&list.get(i).getNamHoc().equals(txtNamHoc.getText())&&list.get(i).getHocKy().equals(hocKy)) {
            JOptionPane.showMessageDialog(this, "Phòng ("+txtPhongHoc.getText()+") "+menuThu.getSelectedItem()+"  Tiết ("+tietHoc+
                    ")  Học Kỳ ("+hocKy+")  Năm Học ("+txtNamHoc.getText()+") đã được sử dụng !" , "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
           
            txtMaLHP.requestFocus();
        }
        if(Integer.parseInt(siSo)<40||Integer.parseInt(siSo)>80){
            JOptionPane.showMessageDialog(this, "Sĩ số phải từ 40 đến 80 ", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtSiSo.setText("");
            txtSiSo.requestFocus();
        }
        else {
            ArrayList<HocPhan> GetMaMH = new HocPhanDAO().findByMaHP(txtMaHP.getText());
             String maMH = GetMaMH.get(0).getMaMH();
            LopHocPhan lopHocPhan = new LopHocPhan(maLHP, maHP, maMH, maKhoa, tietHoc, phongHoc, thu, siSo, hocKy, namHoc, ngayThi);
            LopHocPhan update = new LopHocPhanDAO().updateByID(lopHocPhan);
            JOptionPane.showMessageDialog(this, "Sửa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (update != null) {
                showAll();
            }
        }
       
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jtbLopHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbLopHocPhanMouseClicked
        /*Đưa dữ liệu từ bảng xuống form nhập liệu*/
        txtMaLHP.setText(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 0).toString());
        txtMaHP.setText(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 1).toString());
        menuTietHoc.setSelectedItem(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 4).toString());
        txtPhongHoc.setText(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 5).toString());
        menuThu.setSelectedItem(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 6).toString());
        txtSiSo.setText(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 7).toString());
        menuHocKy.setSelectedItem(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 8).toString());
        txtNamHoc.setText(jtbLopHocPhan.getValueAt(jtbLopHocPhan.getSelectedRow(), 9).toString());
        
        txtMaHP.setEnabled(false);
        menuMaKhoa.setEnabled(false);
        menuTietHoc.setEnabled(true);
        menuThu.setEnabled(true);
        txtNamHoc.setEnabled(false);
        txtPhongHoc.setEnabled(true);
        txtMaLHP.setEnabled(false);
        jbNew.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        
    }//GEN-LAST:event_jtbLopHocPhanMouseClicked

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        String maLHP = txtMaLHP.getText();
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này ?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                new LopHocPhanDAO().deleteLopHocPhan(maLHP);
                JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu không thể xóa , sinh viên trong lớp học phần này đã có điểm!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu không thể xóa, sinh viên trong lớp học phần này đã có điểm!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
            jbNew.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            txtMaLHP.setEnabled(true);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed
    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<LopHocPhan> LHP = new LopHocPhanDAO().getAll();
        for (LopHocPhan lhp : LHP) {
            Vector v = new Vector();
            v.add(lhp.getMaLHP());
            v.add(lhp.getMaHP());
            v.add(lhp.getMaMH());
            v.add(lhp.getMaKhoa());
            v.add(lhp.getTietHoc());
            v.add(lhp.getPhongHoc());
            v.add(lhp.getThu());
            v.add(lhp.getSiSo());
            v.add(lhp.getHocKy());
            v.add(lhp.getNamHoc());
            v.add(lhp.getNgayThi());
            
            

            dtm.addRow(v);
        }
        
        
    }

    public void resetForm() {
        txtMaLHP.setText("LHP");
        txtMaHP.setText("HP");
       
        txtNamHoc.setText("");
        txtPhongHoc.setText("");
        txtSiSo.setText("");
        
        menuMaKhoa.setEnabled(true);
        txtMaLHP.requestFocus();
        jbNew.setEnabled(true);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        
        txtMaHP.setEnabled(true);
       
        
        menuTietHoc.setEnabled(true);
        menuThu.setEnabled(true);
        
        txtNamHoc.setEnabled(true);
        txtPhongHoc.setEnabled(true);
        txtMaLHP.setEnabled(true);
        
        
    }

    public boolean checkinfo() {
        Check c = new Check();
         ArrayList<LopHocPhan> listCheckIDLHP = new LopHocPhanDAO().checkMaLHP(txtMaLHP.getText());
        ArrayList<HocPhan> GetMaMH1 = new HocPhanDAO().findByMaHP(txtMaHP.getText());//Lấy mã môn học từ học phần
        for(int i=0;i<list.size();i++)
        if (list.get(i).getPhongHoc().equals(txtPhongHoc.getText())&&list.get(i).getTietHoc().equals(menuTietHoc.getSelectedItem())
                &&list.get(i).getThu().equals(menuThu.getSelectedItem())&&list.get(i).getNamHoc().equals(txtNamHoc.getText())&&list.get(i).getHocKy().equals(menuHocKy.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Phòng ("+txtPhongHoc.getText()+") "+menuThu.getSelectedItem()+"  Tiết ("+(String) menuTietHoc.getSelectedItem()+
                    ")  Học Kỳ ("+(String) menuHocKy.getSelectedItem()+")  Năm Học ("+txtNamHoc.getText()+") đã được sử dụng !" , "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
           
            txtMaLHP.requestFocus();
            return false;
        }
        else
        if (!c.checkMaLHP(txtMaLHP.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập mã lớp học phần sai,mã học phần phải có độ dài lớn hơn 3 và bắt đầu bằng LHP", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaLHP.setText("LHP");
            txtMaLHP.requestFocus();
            return false;
        } else
            if (listCheckIDLHP.size() > 0) {
            
            JOptionPane.showMessageDialog(this, "Mã Lớp Học Phần bị trùng", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaLHP.setText("LHP");
            txtMaLHP.requestFocus();
            return false;
        }
        else
        if(GetMaMH1.size()==0){
            JOptionPane.showMessageDialog(this, "Không tồn tại học phần !", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaHP.setText("HP");
            txtMaHP.requestFocus();
            return false;
        }else 
            if (!c.checkSpace(txtMaHP.getText()) || !c.checkIDHP(txtMaHP.getText())) {
            JOptionPane.showMessageDialog(this, "Mã học phần phải lớn hơn 2 ký tự và bắt đầu bằng HP", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaHP.setText("HP");
            txtMaHP.requestFocus();
            return false;

        } 
        else if (txtNamHoc.getText().equals("")||!Check.checkNumber(txtNamHoc.getText())) {
            JOptionPane.showMessageDialog(this, "Năm học không được trống ( năm học phải là số nguyên lớn hơn hoặc bằng năm hiện tại)", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtNamHoc.setText("");
            txtNamHoc.requestFocus();
            return false;

        } else if (txtPhongHoc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Phòng học không được trống", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtPhongHoc.setText("");
            txtPhongHoc.requestFocus();
            return false;

        }
        
        
        else if (!c.checkSpace(txtSiSo.getText()) || !c.checkNumber(txtSiSo.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập sĩ số sai (Sĩ số phải là số nguyên lớn hơn 40 và nhỏ hơn 80)", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
           
            txtSiSo.requestFocus();
            return false;

        }
        else
        if(((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText().equals("")==true){
            JOptionPane.showMessageDialog(this, "Ngày thi không được trống ! Vui lòng chọn ngày thi", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        else
        if(Integer.parseInt(((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText().substring(6, 10))<Integer.parseInt(MainAdmin.date.substring(6, 10))){
            JOptionPane.showMessageDialog(this, "Ngày thi phải lớn hơn 2 tháng và nhỏ hơn 6 tháng tính từ thời điểm hiện tại !", "Kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        
        else
        if(Integer.parseInt(((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText().substring(6, 10))==Integer.parseInt(MainAdmin.date.substring(6, 10))&&Integer.parseInt(((JTextField)jdNgayThi.getDateEditor().getUiComponent()).getText().substring(3, 5))<=Integer.parseInt(MainAdmin.date.substring(3, 5))){
            JOptionPane.showMessageDialog(this, "Ngày thi phải lớn hơn 2 tháng và nhỏ hơn 6 tháng tính từ thời điểm hiện tại !", "Kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            return false;
            }
                
        return true;
    }
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.resetForm();
    }//GEN-LAST:event_jbExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbUpdate;
    private com.toedter.calendar.JDateChooser jdNgayThi;
    private javax.swing.JTable jtbLopHocPhan;
    private javax.swing.JComboBox<String> menuHocKy;
    private javax.swing.JComboBox<String> menuMaKhoa;
    private javax.swing.JComboBox<String> menuThu;
    private javax.swing.JComboBox<String> menuTietHoc;
    private javax.swing.JTextField txtMaHP;
    private javax.swing.JTextField txtMaLHP;
    private javax.swing.JTextField txtNamHoc;
    private javax.swing.JTextField txtPhongHoc;
    private javax.swing.JTextField txtSiSo;
    // End of variables declaration//GEN-END:variables
}
