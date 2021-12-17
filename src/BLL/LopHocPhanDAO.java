/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import ConnectDatabase.DBConnect;
import Entity.Khoa;
import Entity.LopHocPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LopHocPhanDAO implements ILopHocPhanDAO {

    @Override
    public ArrayList<LopHocPhan> getAll() {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblLopHP");
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaMH(rs.getString(3));
                    lhp.setMaKhoa(rs.getString(4));
                    lhp.setTietHoc(rs.getString(5));
                    lhp.setPhongHoc(rs.getString(6));
                    lhp.setThu(rs.getString(7));
                    lhp.setSiSo(rs.getString(8));
                    lhp.setHocKy(rs.getString(9));
                    lhp.setNamHoc(rs.getString(10));
                    lhp.setNgayThi(rs.getString(11));
                    list.add(lhp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<LopHocPhan> findByIDKhoa(String maKhoa) {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblLopHP where fldMaKhoa = ?");
               ps.setString(1, maKhoa);
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                   lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaMH(rs.getString(3));
                    lhp.setMaKhoa(rs.getString(4));
                    lhp.setTietHoc(rs.getString(5));
                    lhp.setPhongHoc(rs.getString(6));
                    lhp.setThu(rs.getString(7));
                    lhp.setSiSo(rs.getString(8));
                    lhp.setHocKy(rs.getString(9));
                    lhp.setNamHoc(rs.getString(10));
                    lhp.setNgayThi(rs.getString(11));
                    list.add(lhp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public LopHocPhan addNew(LopHocPhan lhp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into tblLopHP(fldMaLHP,fldMaHP,fldMaMH,fldMaKhoa,fldTietHoc,fldPhongHoc,fldThu,fldSiSo,fldHocKy,fldNamHoc,fldNgayThi) values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, lhp.getMaLHP());
                ps.setString(2, lhp.getMaHP());
                ps.setString(3, lhp.getMaMH());
                ps.setString(4, lhp.getMaKhoa());
                ps.setString(5, lhp.getTietHoc());
                ps.setString(6, lhp.getPhongHoc());
                ps.setString(7, lhp.getThu());
                ps.setString(8, lhp.getSiSo());
                ps.setString(9, lhp.getHocKy());
                ps.setString(10, lhp.getNamHoc());
                ps.setString(11, lhp.getNgayThi());
                int row = ps.executeUpdate();
                if (row < 1) {
                    lhp = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
                lhp = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return lhp;
    }

    @Override
    public LopHocPhan updateByID(LopHocPhan lhp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblLopHP set fldMaHP = ?,fldMaMH=?, fldMaKhoa = ?, fldTietHoc = ?, fldPhongHoc = ?, fldThu = ?, fldSiSo = ?,fldHocKy =?, fldNamHoc = ?,fldNgayThi= ? where fldMaLHP = ?");
               
                ps.setString(1, lhp.getMaHP());
                ps.setString(2, lhp.getMaMH());
                ps.setString(3, lhp.getMaKhoa());
                ps.setString(4, lhp.getTietHoc());
                ps.setString(5, lhp.getPhongHoc());
                ps.setString(6, lhp.getThu());
                ps.setString(7, lhp.getSiSo());
                ps.setString(8, lhp.getHocKy());
                ps.setString(9, lhp.getNamHoc());
                ps.setString(10, lhp.getNgayThi());
                ps.setString(11, lhp.getMaLHP());              
                int row = ps.executeUpdate();
                if (row < 1) {
                    lhp = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
                lhp = null;
            } finally {
                DBConnect.close();
            }
        }
        return lhp;
    }
    public void deleteLopHocPhan(String maLHP)throws SQLException, ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblLopHP where fldMaLHP= ?");
            ps.setString(1, maLHP);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<LopHocPhan> checkMaLHP(String maLHP) {
      ArrayList<LopHocPhan> list = null;
      PreparedStatement psCheck = null;
      ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from tblLopHP where fldMaLHP=?");
                psCheck.setString(1, maLHP);
                rs = psCheck.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    list.add(lhp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            DBConnect.close(psCheck, rs);
            }
            
        }
        return list;
    }

    @Override
    public ArrayList<LopHocPhan> findByMaLHP(String maLHP) {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from tblLopHP where fldMaLHP = ?");
               ps.setString(1, maLHP);
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaMH(rs.getString(3));
                    lhp.setMaKhoa(rs.getString(4));
                    lhp.setTietHoc(rs.getString(5));
                    lhp.setPhongHoc(rs.getString(6));
                    lhp.setThu(rs.getString(7));
                    lhp.setSiSo(rs.getString(8));
                    lhp.setHocKy(rs.getString(9));
                    lhp.setNamHoc(rs.getString(10));
                    lhp.setNgayThi(rs.getString(11));
                    list.add(lhp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    
}
