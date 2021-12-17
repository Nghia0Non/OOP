
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.ChuyenNganhDAO;
import Check.Check;
import Entity.GiaoVien;
import BLL.GiaoVienDAO;
import BLL.IGiaoVienDAO;
import BLL.IChuyenNganhDAO;
import Entity.ChuyenNganh;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class frmQuanLyGiaoVien extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbm;
    ArrayList<ChuyenNganh> listCN = null;
    ArrayList<GiaoVien> listGV = null;
   

    public frmQuanLyGiaoVien() {
        try {
            initComponents();
            dcbm = new DefaultComboBoxModel();
            dtm = new DefaultTableModel();
            IChuyenNganhDAO ChuyenNganhDAO = (IChuyenNganhDAO) Class.forName("BLL.ChuyenNganhDAO").newInstance();
            listCN = ChuyenNganhDAO.getAll();
            for (ChuyenNganh cn : listCN) {
                dcbm.addElement(cn.getTenChuyenNganh());
            }
            txtMaChuyenNganh.setModel(dcbm);

            dtm.addColumn("Mã Giáo Viên");
            dtm.addColumn("Họ Tên");
            dtm.addColumn("Mã Chuyên Ngành");
            dtm.addColumn("Ngày Sinh");
            dtm.addColumn("Giới Tính");
            dtm.addColumn("Email");
            dtm.addColumn("Địa Chỉ");
            dtm.addColumn("Số Điện Thoại");
         
            loaddata();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loaddata() {
        try {
            IGiaoVienDAO giaoVienDAO = (IGiaoVienDAO) Class.forName("BLL.GiaoVienDAO").newInstance();
            listGV = new GiaoVienDAO().getAll();
            for (GiaoVien gv : listGV) {
                dtm.addRow(toObjectsData(gv));
            }
            jtbGiaoVien.setModel(dtm);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static Object[] toObjectsData(GiaoVien gv) {
       
        
        boolean flag = gv.isGioiTinh();
        String gioitinh = "Nam";
        if (!flag) {
            gioitinh = "Nữ";
        }

        Object[] objectsData = {gv.getMaGV(), gv.getTenGV(), gv.getMaChuyenNganh(), gv.getNgaySinh(), gioitinh, gv.getEmail(), gv.getDiaChi(), gv.getSdt()};
        return objectsData;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtbGiaoVien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTenGV = new javax.swing.JTextField();
        txtMaGV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cGioiTinh = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtMaChuyenNganh = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gioitinh2 = new javax.swing.JRadioButton();
        jdNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jbUpdate = new javax.swing.JButton();
        jbAdd = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        txtReset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtTimKiemGV = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1030, 504));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jtbGiaoVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã GV", "Họ Tên", "Mã Chuyên Ngành", "Ngày Sinh", "Giới Tính", "Email", "Địa Chỉ", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbGiaoVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbGiaoVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbGiaoVien);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ngày Sinh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Giới Tính");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Giáo Viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Họ Tên");

        txtMaGV.setText("GV");

        cGioiTinh.setText("Nam");
        cGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGioiTinhActionPerformed(evt);
            }
        });

        txtMaChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setBackground(new java.awt.Color(51, 51, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Chuyên Ngành");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Số Điện Thoại");

        gioitinh2.setText("Nữ");
        gioitinh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioitinh2ActionPerformed(evt);
            }
        });

        jdNgaySinh.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenGV, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cGioiTinh)
                                .addGap(22, 22, 22)
                                .addComponent(gioitinh2))
                            .addComponent(txtMaChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtDiaChi)
                    .addComponent(txtSoDienThoai)
                    .addComponent(jdNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenGV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cGioiTinh)
                        .addComponent(gioitinh2)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jbUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbUpdate.setForeground(new java.awt.Color(255, 0, 0));
        jbUpdate.setText("Sửa");
        jbUpdate.setEnabled(false);
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jbAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbAdd.setForeground(new java.awt.Color(255, 0, 0));
        jbAdd.setText("Thêm");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
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

        txtReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtReset.setForeground(new java.awt.Color(255, 0, 0));
        txtReset.setLabel("Làm Mới");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jbUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jbDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(txtReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAdd, jbDelete, jbUpdate});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(204, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("QUẢN LÝ GIÁO VIÊN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(376, 376, 376))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel12.setText("(Tìm kiếm Giáo Viên theo Mã Chuyên Ngành)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTimKiemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkinfo() {
        Check c = new Check();
        if (!c.checkIDGV(txtMaGV.getText())) {
            JOptionPane.showMessageDialog(this, "Mã phải bắt đầu bằng GV và lớn hơn 2 ký tự !", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaGV.setText("");
            txtMaGV.requestFocus();
            return false;
        } else if (!c.checkSpace(txtTenGV.getText()) || !c.check(txtTenGV.getText())) {
            JOptionPane.showMessageDialog(this, "Tên không được trống !", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtTenGV.setText("");
            txtTenGV.requestFocus();
            return false;

        } else if (!c.checkSpace(txtEmail.getText()) || !c.checkEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Email phải có dạng xxx@yyy.zzz", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtEmail.setText("");
            txtEmail.requestFocus();
            return false;

        } else if (!c.checkSpace(txtDiaChi.getText())||!c.check(txtDiaChi.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập địa không được trống", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtEmail.setText("");
            txtEmail.requestFocus();
            return false;

        } else if (!c.checkSpace(txtSoDienThoai.getText()) || !c.checkPhone(txtSoDienThoai.getText())) {
            JOptionPane.showMessageDialog(this, "Lỗi số điện thoại ! (Số điện thoại phải từ 9->13 số)", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtSoDienThoai.setText("");
            txtSoDienThoai.requestFocus();
            return false;
        }
        else if (cGioiTinh.isSelected()==false&&gioitinh2.isSelected()==false) {
            JOptionPane.showMessageDialog(this, "Giới tính không được trống ! ", "Vui lòng chọn giới tính", JOptionPane.ERROR_MESSAGE);
            cGioiTinh.requestFocus();
            return false;
        }
        else
         if(((JTextField)jdNgaySinh.getDateEditor().getUiComponent()).getText().equals("")==true){
            JOptionPane.showMessageDialog(this, "Ngày sinh không được trống ! Vui lòng chọn ngày sinh", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
            }
         else if (txtDiaChi.getText().equals("")==true) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được trống !", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtDiaChi.setText("");
            txtDiaChi.requestFocus();
            return false;
        }
        return true;
    }
    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        String maGV = txtMaGV.getText();
        String tenGV = txtTenGV.getText();
        String ngaySinh = ((JTextField)jdNgaySinh.getDateEditor().getUiComponent()).getText();
        String email = txtEmail.getText();
        String sdt = txtSoDienThoai.getText();
        boolean gioiTinh = cGioiTinh.isSelected();
        String diaChi = txtDiaChi.getText();
        String maChuyenNganh = listCN.get(txtMaChuyenNganh.getSelectedIndex()).getMaChuyenNganh();
        GiaoVien giaoVien = new GiaoVien(maGV, tenGV, maChuyenNganh, ngaySinh, gioiTinh, email, diaChi, sdt);
        ArrayList<GiaoVien> listCheck = new GiaoVienDAO().CheckMaGV(maGV);
        if (!checkinfo()) {
            return;
        }
       

        else
        if (listCheck.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaGV.setText("");
            txtMaGV.requestFocus();

        } else {
            GiaoVien insert = new GiaoVienDAO().addNew(giaoVien);
            JOptionPane.showMessageDialog(this, "Thêm thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (insert != null) {
                showAll();
                resetForm();
            }
        }
       


    }//GEN-LAST:event_jbAddActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        String maGV = txtMaGV.getText();
        String tenGV = txtTenGV.getText();
        String email = txtEmail.getText();
        String sdt = txtSoDienThoai.getText();
        String ngaySinh = ((JTextField)jdNgaySinh.getDateEditor().getUiComponent()).getText();
        boolean gioiTinh = cGioiTinh.isSelected();
        String diaChi = txtDiaChi.getText();
        String maChuyenNganh = listCN.get(txtMaChuyenNganh.getSelectedIndex()).getMaChuyenNganh();

        if (!checkinfo()) {
            return;
        }
        else
        {
        GiaoVien giaoVien = new GiaoVien(maGV, tenGV, maChuyenNganh, ngaySinh, gioiTinh, email, diaChi, sdt);
        GiaoVien update = new GiaoVienDAO().updateByMaGV(giaoVien);
        JOptionPane.showMessageDialog(this, "Sửa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        if (update != null) {
            showAll();
        }
        }
        
        
        
        
        
        resetForm();
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jtbGiaoVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbGiaoVienMouseClicked
        txtMaGV.setText(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 0).toString());
        txtTenGV.setText(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 1).toString());
        txtMaChuyenNganh.setSelectedItem(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 2).toString());
        
        String sex = jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 4).toString();
       if (sex.equals("Nam")) {
            cGioiTinh.setSelected(true);
            gioitinh2.setSelected(false);
        } else {
            gioitinh2.setSelected(true);
            cGioiTinh.setSelected(false);
        }
        txtEmail.setText(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 5).toString());
        txtDiaChi.setText(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 6).toString());
        txtSoDienThoai.setText(jtbGiaoVien.getValueAt(jtbGiaoVien.getSelectedRow(), 7).toString());


        jbAdd.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        txtMaGV.setEnabled(false);
        jdNgaySinh.setDate(null);
    }//GEN-LAST:event_jtbGiaoVienMouseClicked
    public void resetForm() {
        txtMaGV.setText("GV");
        txtTenGV.setText("");
        txtSoDienThoai.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        jdNgaySinh.setDate(null);
        jbAdd.setEnabled(true);
         jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        txtMaGV.setEnabled(true);
        gioitinh2.setSelected(true);
        txtMaGV.requestFocus();
    }
    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {

            String magv = txtMaGV.getText();
            try {
                new GiaoVienDAO().deleteMaGV(magv);
                new GiaoVienDAO().deleteUserGV(magv);
                JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException ex) {
                Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmQuanLyGiaoVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
            jbAdd.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            txtMaGV.setEnabled(true);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        this.resetForm();
    }//GEN-LAST:event_txtResetActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        String timKiem = txtTimKiemGV.getText();
        
        ArrayList<GiaoVien> list = new GiaoVienDAO().findByMaChuyenNganh(timKiem);
        for (GiaoVien gv : list) {
            Vector vector = new Vector();
            vector.add(gv.getMaGV());
            vector.add(gv.getTenGV());
            vector.add(gv.getMaChuyenNganh());
           
            vector.add(gv.getNgaySinh());
            if (gv.isGioiTinh() == true) {
                vector.add("Nam");
            } else {
                vector.add("Nữ");
            }
            vector.add(gv.getEmail());
            vector.add(gv.getDiaChi());
            vector.add(gv.getSdt());
            dtm.addRow(vector);
        }
        resetForm();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void cGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGioiTinhActionPerformed
        gioitinh2.setSelected(false);
    }//GEN-LAST:event_cGioiTinhActionPerformed

    private void gioitinh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioitinh2ActionPerformed
        cGioiTinh.setSelected(false);
    }//GEN-LAST:event_gioitinh2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JRadioButton cGioiTinh;
    private javax.swing.JRadioButton gioitinh2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbUpdate;
    private com.toedter.calendar.JDateChooser jdNgaySinh;
    private javax.swing.JTable jtbGiaoVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox txtMaChuyenNganh;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JButton txtReset;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenGV;
    private javax.swing.JTextField txtTimKiemGV;
    // End of variables declaration//GEN-END:variables

    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        int selectedIndex = txtMaChuyenNganh.getSelectedIndex();
        ChuyenNganh getCN = listCN.get(selectedIndex);
        ArrayList<GiaoVien> list = new GiaoVienDAO().getAll();
        for (GiaoVien gv : list) {
            Vector vector = new Vector();
            vector.add(gv.getMaGV());
            vector.add(gv.getTenGV());
            vector.add(gv.getMaChuyenNganh());
           
            vector.add(gv.getNgaySinh());
            if (gv.isGioiTinh() == true) {
                vector.add("Nam");
            } else {
                vector.add("Nữ");
            }
            vector.add(gv.getEmail());
            vector.add(gv.getDiaChi());
            vector.add(gv.getSdt());
            dtm.addRow(vector);
        }
        resetForm();

    }
}
