package GUI;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 */
public class MainAdmin extends javax.swing.JFrame {

    public static String nameLogin;
    public static Date today = new Date();
    public static Locale local = new Locale("vi", "VI");
    public static DateFormat d = DateFormat.getDateInstance(DateFormat.MEDIUM, local);
    public static String date = d.format(today);
    

    /**
     * Creates new form Main
     */
    public MainAdmin() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/thoat_1.jpg")).getImage());
        setUser();
        Timer dongho = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calendar lich = Calendar.getInstance();
                int gio = lich.get(Calendar.HOUR);
                int phut = lich.get(Calendar.MINUTE);
                int giay = lich.get(Calendar.SECOND);
                jtfCurrent.setText(" " + gio + " : " + phut + " : " + giay);
            }
        });
        dongho.start();
    }

    private void setUser() {
        nameLogin = Login.nameLogin;
        jlbUser.setText(nameLogin);
        thongBaoMatKhau.setText(Login.thongBaoMatKhau);
        jlbToday.setText(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbUser = new javax.swing.JLabel();
        jlbToday = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCurrent = new javax.swing.JTextField();
        thongBaoMatKhau = new javax.swing.JLabel();
        jtpContent = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jmHeThong = new javax.swing.JMenu();
        jmidoimatkhau = new javax.swing.JMenuItem();
        jmiLogOff = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmQuanLyChuyenNganh = new javax.swing.JMenuItem();
        jmQuanLyLop = new javax.swing.JMenuItem();
        jmTacVu = new javax.swing.JMenu();
        jmiNhapSV = new javax.swing.JMenuItem();
        jmiNhapGV = new javax.swing.JMenuItem();
        jmQuanLyHocPhan = new javax.swing.JMenuItem();
        jmQuaLyLopHocPhan = new javax.swing.JMenuItem();
        jmQuanLyMonHoc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1106, 700));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(89, 134, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Ngày :");

        jlbUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlbUser.setForeground(new java.awt.Color(255, 255, 255));

        jlbToday.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbToday.setForeground(new java.awt.Color(255, 255, 255));
        jlbToday.setText("Hour");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Giờ :");

        jtfCurrent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfCurrent.setEnabled(false);
        jtfCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCurrentActionPerformed(evt);
            }
        });

        thongBaoMatKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        thongBaoMatKhau.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thongBaoMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbToday, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jlbToday)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(thongBaoMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtpContent.setMinimumSize(new java.awt.Dimension(1106, 638));
        jtpContent.setPreferredSize(new java.awt.Dimension(800, 638));

        jPanel6.setBackground(new java.awt.Color(43, 122, 121));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bia.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtpContent.addTab("Trang Chủ", jPanel6);

        jMenuBar2.setBackground(new java.awt.Color(69, 82, 90));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar2.setToolTipText("");
        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jmHeThong.setBackground(new java.awt.Color(94, 172, 175));
        jmHeThong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(69, 82, 90)));
        jmHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/taikhoan.png"))); // NOI18N
        jmHeThong.setText("Tài Khoản");
        jmHeThong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jmHeThong.setPreferredSize(new java.awt.Dimension(145, 32));

        jmidoimatkhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmidoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doimatkhau.png"))); // NOI18N
        jmidoimatkhau.setText("Đổi Mật Khẩu");
        jmidoimatkhau.setPreferredSize(new java.awt.Dimension(213, 30));
        jmidoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmidoimatkhauActionPerformed(evt);
            }
        });
        jmHeThong.add(jmidoimatkhau);

        jmiLogOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiLogOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dangxuat.png"))); // NOI18N
        jmiLogOff.setText("Đăng Xuất");
        jmiLogOff.setPreferredSize(new java.awt.Dimension(213, 30));
        jmiLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogOffActionPerformed(evt);
            }
        });
        jmHeThong.add(jmiLogOff);

        jmiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat.png"))); // NOI18N
        jmiExit.setText("Thoát");
        jmiExit.setPreferredSize(new java.awt.Dimension(213, 30));
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jmHeThong.add(jmiExit);

        jMenuBar2.add(jmHeThong);

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/quanlycoban.png"))); // NOI18N
        jMenu1.setText("Quản Lý Chung");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(145, 32));

        jmQuanLyChuyenNganh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmQuanLyChuyenNganh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        jmQuanLyChuyenNganh.setText("Quản Lý Chuyên Ngành");
        jmQuanLyChuyenNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmQuanLyChuyenNganhActionPerformed(evt);
            }
        });
        jMenu1.add(jmQuanLyChuyenNganh);

        jmQuanLyLop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmQuanLyLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        jmQuanLyLop.setText("Quản Lý Lớp");
        jmQuanLyLop.setPreferredSize(new java.awt.Dimension(213, 30));
        jmQuanLyLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmQuanLyLopActionPerformed(evt);
            }
        });
        jMenu1.add(jmQuanLyLop);

        jMenuBar2.add(jMenu1);

        jmTacVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/quanlydaotao .png"))); // NOI18N
        jmTacVu.setText("Quản Lý Đào Tạo");
        jmTacVu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jmTacVu.setPreferredSize(new java.awt.Dimension(145, 32));

        jmiNhapSV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiNhapSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jmiNhapSV.setText("Quản Lý Sinh Viên");
        jmiNhapSV.setPreferredSize(new java.awt.Dimension(213, 30));
        jmiNhapSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNhapSVActionPerformed(evt);
            }
        });
        jmTacVu.add(jmiNhapSV);

        jmiNhapGV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiNhapGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jmiNhapGV.setText("Quản Lý Giáo Viên");
        jmiNhapGV.setPreferredSize(new java.awt.Dimension(213, 30));
        jmiNhapGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNhapGVActionPerformed(evt);
            }
        });
        jmTacVu.add(jmiNhapGV);

        jmQuanLyHocPhan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmQuanLyHocPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jmQuanLyHocPhan.setText("Quản Lý Học Phần");
        jmQuanLyHocPhan.setPreferredSize(new java.awt.Dimension(213, 30));
        jmQuanLyHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmQuanLyHocPhanActionPerformed(evt);
            }
        });
        jmTacVu.add(jmQuanLyHocPhan);

        jmQuaLyLopHocPhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jmQuaLyLopHocPhan.setText("Quản Lý Lớp Học Phần");
        jmQuaLyLopHocPhan.setPreferredSize(new java.awt.Dimension(213, 30));
        jmQuaLyLopHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmQuaLyLopHocPhanActionPerformed(evt);
            }
        });
        jmTacVu.add(jmQuaLyLopHocPhan);

        jmQuanLyMonHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmQuanLyMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jmQuanLyMonHoc.setText("Quản Lý Môn Học");
        jmQuanLyMonHoc.setPreferredSize(new java.awt.Dimension(213, 30));
        jmQuanLyMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmQuanLyMonHocActionPerformed(evt);
            }
        });
        jmTacVu.add(jmQuanLyMonHoc);

        jMenuBar2.add(jmTacVu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpContent, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtpContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpContent.getAccessibleContext().setAccessibleName("Trang Chủ");

        setSize(new java.awt.Dimension(1300, 790));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiNhapSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNhapSVActionPerformed
        // TODO add your handling code here:
        frmQuanLySinhVien sinhVien = new frmQuanLySinhVien();
        jtpContent.removeAll();
        jtpContent.add("Quản Lý Sinh Viên", sinhVien);
        sinhVien.resetForm();


    }//GEN-LAST:event_jmiNhapSVActionPerformed

    private void jmiNhapGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNhapGVActionPerformed
        frmQuanLyGiaoVien giaoVien = new frmQuanLyGiaoVien();
        jtpContent.removeAll();
        jtpContent.add("Quản Lý Giáo Viên", giaoVien);
        giaoVien.resetForm();
    }//GEN-LAST:event_jmiNhapGVActionPerformed

    private void jmQuanLyChuyenNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmQuanLyChuyenNganhActionPerformed
        frmQuanLyChuyenNganh chuyennganh = new frmQuanLyChuyenNganh();
        jtpContent.removeAll();
        jtpContent.add("Quản Lý Chuyên Ngành", chuyennganh);
        chuyennganh.ResetForm();
    }//GEN-LAST:event_jmQuanLyChuyenNganhActionPerformed

    private void jmQuanLyMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmQuanLyMonHocActionPerformed
        frmQuanLyMonHoc monhoc = new frmQuanLyMonHoc();
        jtpContent.removeAll();
        jtpContent.add("Quản Lý Môn Học", monhoc);
        monhoc.resetForm();
    }//GEN-LAST:event_jmQuanLyMonHocActionPerformed

    private void jmiLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogOffActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jmiLogOffActionPerformed

    private void jmidoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmidoimatkhauActionPerformed
        DoiMatKhau ld=new DoiMatKhau();
           ld.show();
           
    }//GEN-LAST:event_jmidoimatkhauActionPerformed

    private void jtfCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCurrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCurrentActionPerformed

    private void jmQuanLyLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmQuanLyLopActionPerformed
        frmQuanLyLopHoc lophoc = new frmQuanLyLopHoc();
        jtpContent.removeAll();
        jtpContent.add("Quản Lý Lớp Học", lophoc);
        lophoc.ResetForm();
    }//GEN-LAST:event_jmQuanLyLopActionPerformed

    private void jmQuanLyHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmQuanLyHocPhanActionPerformed
       frmQuanLyHocPhan hocphan =new frmQuanLyHocPhan();
       jtpContent.removeAll();
       jtpContent.add("Quản Lý Học Phần",hocphan);
       hocphan.resetForm();
    }//GEN-LAST:event_jmQuanLyHocPhanActionPerformed

    private void jmQuaLyLopHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmQuaLyLopHocPhanActionPerformed
       frmQuanLyLopHocPhan lophocphan =new frmQuanLyLopHocPhan();
       jtpContent.removeAll();
       jtpContent.add("Quản Lý Lớp Học Phần",lophocphan);
       lophocphan.resetForm();
    }//GEN-LAST:event_jmQuaLyLopHocPhanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlbToday;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JMenu jmHeThong;
    private javax.swing.JMenuItem jmQuaLyLopHocPhan;
    private javax.swing.JMenuItem jmQuanLyChuyenNganh;
    private javax.swing.JMenuItem jmQuanLyHocPhan;
    private javax.swing.JMenuItem jmQuanLyLop;
    private javax.swing.JMenuItem jmQuanLyMonHoc;
    private javax.swing.JMenu jmTacVu;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiLogOff;
    private javax.swing.JMenuItem jmiNhapGV;
    private javax.swing.JMenuItem jmiNhapSV;
    private javax.swing.JMenuItem jmidoimatkhau;
    private javax.swing.JTextField jtfCurrent;
    private javax.swing.JTabbedPane jtpContent;
    private javax.swing.JLabel thongBaoMatKhau;
    // End of variables declaration//GEN-END:variables

    
}
