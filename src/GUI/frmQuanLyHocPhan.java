/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.HocPhanDAO;
import BLL.IHocPhanDAO;
import BLL.IKhoaDAO;
import Check.Check;

import Entity.HocPhan;
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
public class frmQuanLyHocPhan extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbmTenKhoa;
    private ArrayList<HocPhan> list=null;
    private ArrayList<Khoa> allKhoa=null;

    public frmQuanLyHocPhan() {
        initComponents();
        dcbmTenKhoa = new DefaultComboBoxModel();
        dtm = new DefaultTableModel();
        menuTenKhoa.setModel(dcbmTenKhoa);
        dtm.addColumn("Mã Học Phần");
        dtm.addColumn("Tên Học Phần");
        dtm.addColumn("Mã Môn Học");
        dtm.addColumn("Khoa");
        dtm.addColumn("Học Phần Yêu Cầu");
        

        loaddata();
    }

    private void loaddata() {
        try {
            
            
            IKhoaDAO khoaDAO = (IKhoaDAO) Class.forName("BLL.KhoaDAO").newInstance();
            allKhoa = khoaDAO.getAll();
            for (Khoa k : allKhoa) {
                dcbmTenKhoa.addElement(k.getTenkhoa());
            }
            IHocPhanDAO hocPhanDAO = (IHocPhanDAO) Class.forName("BLL.HocPhanDAO").newInstance();
            list = new HocPhanDAO().getAll();
            for (HocPhan hp : list) {
                dtm.addRow(toObjectsData(hp));
            }
            jtbHocPhan.setModel(dtm);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmQuanLyHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmQuanLyHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmQuanLyHocPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object[] toObjectsData(HocPhan hp) {
        Object[] objectsData = {hp.getMaHP(), hp.getTenHP(), hp.getMaMH(),hp.getTenKhoa(), hp.getHocPhanYeuCau()};
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
        jtbHocPhan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHP = new javax.swing.JTextField();
        txtMaMH = new javax.swing.JTextField();
        txtTenHP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHPyeucau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        menuTenKhoa = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HỌC PHẦN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addGap(413, 413, 413))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jtbHocPhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Học Phần", "Tên Học Phần", "Mã Môn Học", "Tên Khoa", "Học Phần Yêu Cầu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbHocPhanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbHocPhan);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tên Học Phần");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã Học Phần");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mã Môn Học");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Học Phần Yêu Cầu");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Khoa");

        menuTenKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menuTenKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaMH, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHPyeucau, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHPyeucau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        String maHP = txtMaHP.getText();
        String tenHP = txtTenHP.getText();
        String maMH = txtMaMH.getText();
        String tenKhoa = allKhoa.get(menuTenKhoa.getSelectedIndex()).getTenkhoa();
        String hocPhanYeuCau = txtHPyeucau.getText();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }




        HocPhan hocPhan = new HocPhan(maHP, tenHP, maMH, tenKhoa, hocPhanYeuCau);
        ArrayList<HocPhan> listCheckMaHP = new HocPhanDAO().CheckMaHP(maHP); //Tìm học phần từ danh sách học phần
        ArrayList<HocPhan> listCheckMaMH = new HocPhanDAO().CheckMaMH(maMH); //Tìm môn học từ danh sách môn học
        if (listCheckMaHP.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaHP.setText("");
            txtMaHP.requestFocus();
        }
        else
        if (listCheckMaMH.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không tồn tại môn học", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaMH.setText("");
            txtMaMH.requestFocus();
        }
    
        
        else {
            HocPhan insert = new HocPhanDAO().addNew(hocPhan);
            JOptionPane.showMessageDialog(this, "Thêm thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            if (insert != null) {
                showAll();
            }
        }

    }//GEN-LAST:event_jbNewActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        
        String tenHP = txtTenHP.getText();
        String maMH = txtMaMH.getText();
        String tenKhoa = allKhoa.get(menuTenKhoa.getSelectedIndex()).getTenkhoa();
        String hocPhanYeuCau = txtHPyeucau.getText();
        String maHP = txtMaHP.getText();
        ArrayList<HocPhan> listCheckMaMH = new HocPhanDAO().CheckMaMH(maMH);
        if (!checkinfo()) {
            return;
        }
        HocPhan hp = new HocPhan(maHP,tenHP, maMH, tenKhoa, hocPhanYeuCau);
        HocPhan update = new HocPhanDAO().updateByMaHP(hp);
        JOptionPane.showMessageDialog(this, "Sửa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        if (listCheckMaMH.size() == 0) {
            JOptionPane.showMessageDialog(this, "Không tồn tại Môn học", "Vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txtMaMH.setText("");
            txtMaMH.requestFocus();
        }
        else
        if (update != null)
        {
            showAll();
        }
        jbNew.setEnabled(true);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(false);
        txtMaHP.setEnabled(true);
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jtbHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbHocPhanMouseClicked
        txtMaHP.setText(jtbHocPhan.getValueAt(jtbHocPhan.getSelectedRow(), 0).toString());
        txtTenHP.setText(jtbHocPhan.getValueAt(jtbHocPhan.getSelectedRow(), 1).toString());
        txtMaMH.setText(jtbHocPhan.getValueAt(jtbHocPhan.getSelectedRow(), 2).toString());
        menuTenKhoa.setSelectedItem(jtbHocPhan.getValueAt(jtbHocPhan.getSelectedRow(), 3).toString());
        txtHPyeucau.setText(jtbHocPhan.getValueAt(jtbHocPhan.getSelectedRow(), 4).toString());
       
       
     

        jbNew.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        txtMaHP.setEnabled(false);
    }//GEN-LAST:event_jtbHocPhanMouseClicked

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        String maHP = txtMaHP.getText();
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                new HocPhanDAO().delHocPhan(maHP);
                JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa,hãy xóa dữ liệu lớp học phần của học phần này trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa,hãy xóa dữ liệu lớp học phần của học phần này trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
           
        }
    }//GEN-LAST:event_jbDeleteActionPerformed
    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<HocPhan> HP = new HocPhanDAO().getAll();
        for (HocPhan hp : HP) {
            Vector v = new Vector();
            v.add(hp.getMaHP());
            v.add(hp.getTenHP());
            v.add(hp.getMaMH());
            v.add(hp.getTenKhoa());
            v.add(hp.getHocPhanYeuCau());
            dtm.addRow(v);
        }
        resetForm();
        
    }

    public void resetForm() {
        txtMaHP.setText("HP");
        txtTenHP.setText("");
        txtMaMH.setText("MH");
        txtHPyeucau.setText("");
        jbNew.setEnabled(true);
         jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
        txtMaHP.setEnabled(true);
        txtMaHP.requestFocus();
    }

    public boolean checkinfo() {
        Check c = new Check();
        ArrayList<HocPhan> listCheckMaHP = new HocPhanDAO().CheckMaHP(txtHPyeucau.getText()); 
        if (!c.checkIDHP(txtMaHP.getText())) {
            JOptionPane.showMessageDialog(this, "Mã học phần phải có độ dài lớn hơn 2 và bắt đầu bằng HP", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaHP.setText("");
            txtMaHP.requestFocus();
            return false;
        } else if (!c.checkSpace(txtTenHP.getText()) || !c.check(txtTenHP.getText())) {
            JOptionPane.showMessageDialog(this, "Tên học phần không được trống", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtTenHP.setText("");
            txtTenHP.requestFocus();
            return false;

        } else if (!c.checkSpace(txtMaMH.getText()) || !c.checkIDMH(txtMaMH.getText())) {
            JOptionPane.showMessageDialog(this, "Mã môn học phải bắt đầu bằng MH và lớn hơn 2 ký tự", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtMaMH.setText("");
            txtMaMH.requestFocus();
            return false;
        }
          else
            if(txtHPyeucau.getText().equals("")){
                return true;
            }
                else
                if (txtHPyeucau.getText().equals("")==false&&!c.checkIDHP(txtHPyeucau.getText())||txtHPyeucau.getText().equals(txtMaHP)==true) {
            JOptionPane.showMessageDialog(this, "Học phần yêu cầu không tồn tại trong danh sách học phần và chỉ một học phần yêu cầu khác học phần hiện tại", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtHPyeucau.setText("");
            txtHPyeucau.requestFocus();
            return false;

        }
        else if (listCheckMaHP.size()==0) {
            JOptionPane.showMessageDialog(this, "Học phần yêu cầu không tồn tại trong danh sách học phần", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            txtHPyeucau.setText("");
            txtHPyeucau.requestFocus();
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
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JTable jtbHocPhan;
    private javax.swing.JComboBox<String> menuTenKhoa;
    private javax.swing.JTextField txtHPyeucau;
    private javax.swing.JTextField txtMaHP;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtTenHP;
    // End of variables declaration//GEN-END:variables
}
