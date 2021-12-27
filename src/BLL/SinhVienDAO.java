/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import ConnectDatabase.DBConnect;
import Entity.SinhVien;
import Entity.LopHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anonymous
 */
public class SinhVienDAO implements ISinhVienDAO {

    @Override
    public ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblSinhVien");
                rs = ps.executeQuery();
                list = new ArrayList<SinhVien>();
                while (rs.next()) {
                    SinhVien sv = new SinhVien();
                    sv.setMaSV(rs.getString(1));
                    sv.setTenSV(rs.getString(2));
                    sv.setMalop(rs.getString(3));
                    sv.setHeDaoTao(rs.getString(4));
                    sv.setNgaySinh(rs.getString(5));
                    sv.setGioiTinh(rs.getBoolean(6));
                    sv.setDiaChi(rs.getString(7));
                    sv.setSdt(rs.getString(8));
                    list.add(sv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<SinhVien> findByMaLopHoc(String maLop) {
        ArrayList<SinhVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select  * from tblSinhVien where fldMalop = ?");
                ps.setString(1, maLop);
                rs = ps.executeQuery();
                list = new ArrayList<SinhVien>();
                while (rs.next()) {
                    SinhVien gv = new SinhVien();
                    gv.setMaSV(rs.getString(1));
                    gv.setTenSV(rs.getString(2));
                    gv.setMalop(rs.getString(3));
                    gv.setHeDaoTao(rs.getString(4));
                    gv.setNgaySinh(rs.getString(5));
                    gv.setGioiTinh(rs.getBoolean(6));
                    gv.setDiaChi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);

                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public SinhVien addNew(SinhVien sv) {
        PreparedStatement ps = null;
       
        if (DBConnect.open()) {
            try {
                
                ps = DBConnect.cnn.prepareStatement("INSERT INTO tblSinhVien values (?,?,?,?,?,?,?,?)"
                        + "insert into tblNguoiDung values (?,?)");
                ps.setString(1, sv.getMaSV());
                ps.setString(2, sv.getTenSV());
                ps.setString(3, sv.getMalop());
                ps.setString(4, sv.getHeDaoTao());
                ps.setString(5, sv.getNgaySinh());
                ps.setBoolean(6, sv.isGioiTinh());
                ps.setString(7, sv.getDiaChi());
                ps.setString(8, sv.getSdt());
                ps.setString(9,sv.getMaSV());
                ps.setString(10, "1");                               
                int row = ps.executeUpdate();
                if (row < 1) {
                    sv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                sv = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return sv;
    }

    @Override
    public SinhVien updateByMaSV(SinhVien gv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblSinhVien set fldTenSV =?, fldMaLop= ?,fldHeDaoTao=?,fldNgaySinh=?,fldGioiTinh=?,fldDiaChi = ?,fldSDT = ? where fldMaSV = ?");
                
                ps.setString(1, gv.getTenSV());
                ps.setString(2, gv.getMalop());              
                ps.setString(3, gv.getHeDaoTao());              
                ps.setString(4, gv.getNgaySinh());
                ps.setBoolean(5, gv.isGioiTinh());
                ps.setString(6, gv.getDiaChi());
                ps.setString(7, gv.getSdt());
                ps.setString(8, gv.getMaSV());

                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                } 
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            } finally {
                DBConnect.close();
            }
        }
        return gv;
    }
    public void deleteMaSV(String SinhVienID)throws SQLException,ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblSinhVien where fldMaSV= ?");
            ps.setString(1, SinhVienID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }
    public void deleteUserSV(String SinhVienID)throws SQLException,ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblNguoiDung where fldTenDangNhap= ?");
            ps.setString(1, SinhVienID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }
    

    public static void main(String[] args) {
        System.out.println(new SinhVienDAO().findByMaLopHoc("LH001").get(0).getMalop());
    }

    @Override
    public ArrayList<SinhVien> CheckMaSV(String magv) {
      ArrayList<SinhVien> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from tblSinhVien where fldMaSV=?");
               psCheck.setString(1, magv);
                rs = psCheck.executeQuery();
                    list = new ArrayList<SinhVien>();
                    while (rs.next()) {
                        SinhVien sinhVien = new SinhVien();
                        sinhVien.setMaSV(rs.getString(1));
                        list.add(sinhVien);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            DBConnect.close(psCheck, rs);
            }
        }
        return  list;
    }

    @Override
    public ArrayList<SinhVien> findByMaSV(String maSV) {
        ArrayList<SinhVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select  * from tblSinhVien where fldMaSV = ?");
                ps.setString(1, maSV);
                rs = ps.executeQuery();
                list = new ArrayList<SinhVien>();
                while (rs.next()) {
                    SinhVien gv = new SinhVien();
                    gv.setMaSV(rs.getString(1));
                    gv.setTenSV(rs.getString(2));
                    gv.setMalop(rs.getString(3));
                    gv.setHeDaoTao(rs.getString(4));
                    gv.setNgaySinh(rs.getString(5));
                    gv.setGioiTinh(rs.getBoolean(6));
                    gv.setDiaChi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);

                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
