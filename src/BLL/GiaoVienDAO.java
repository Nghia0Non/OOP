package BLL;

import ConnectDatabase.DBConnect;
import Entity.GiaoVien;
import Entity.MonHoc;
import BLL.ChuyenNganhDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiaoVienDAO implements IGiaoVienDAO {

    @Override
    public ArrayList<GiaoVien> getAll() {
        ArrayList<GiaoVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblGiaoVien");
                rs = ps.executeQuery();
                list = new ArrayList<GiaoVien>();
                while (rs.next()) {
                    GiaoVien gv = new GiaoVien();
                    gv.setMaGV(rs.getString(1));
                    gv.setTenGV(rs.getString(2));
                    gv.setMaChuyenNganh(rs.getString(3));
                    gv.setNgaySinh(rs.getString(4));
                    gv.setGioiTinh(rs.getBoolean(5));
                    gv.setEmail(rs.getString(6));
                    gv.setDiaChi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public ArrayList<GiaoVien> findByMaChuyenNganh(String maChuyenNganh) {
        ArrayList<GiaoVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select  * from tblGiaoVien where fldMaChuyenNganh = ?");
                ps.setString(1, maChuyenNganh);
                rs = ps.executeQuery();
                list = new ArrayList<GiaoVien>();
                while (rs.next()) {
                    GiaoVien gv = new GiaoVien();
                    gv.setMaGV(rs.getString(1));
                    gv.setTenGV(rs.getString(2));
                    gv.setMaChuyenNganh(rs.getString(3));
                    gv.setNgaySinh(rs.getString(4));
                    gv.setGioiTinh(rs.getBoolean(5));
                    gv.setEmail(rs.getString(6));
                    gv.setDiaChi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);

                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public GiaoVien addNew(GiaoVien gv) {
        PreparedStatement ps = null;
       
        if (DBConnect.open()) {
            try {
                
                ps = DBConnect.cnn.prepareStatement("INSERT INTO tblGiaoVien values (?,?,?,?,?,?,?,?)"
                        + "insert into tblNguoiDung values (?,?)");
                ps.setString(1, gv.getMaGV());
                ps.setString(2, gv.getTenGV());
                ps.setString(3, gv.getMaChuyenNganh());
                ps.setString(4, gv.getNgaySinh());
                ps.setBoolean(5, gv.isGioiTinh());
                ps.setString(6, gv.getEmail());
                ps.setString(7, gv.getDiaChi());
                ps.setString(8, gv.getSdt());
                ps.setString(9,gv.getMaGV());
                ps.setString(10, "654321");                               
                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return gv;
    }

    @Override
    public GiaoVien updateByMaGV(GiaoVien gv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblGiaoVien set fldTenGV =?, fldMaChuyenNganh= ?,fldNgaySinh=?,fldGioiTinh=?, fldEmail = ?, fldDiaChi = ?,fldSDT = ? where fldMaGV = ?");
                
                ps.setString(1, gv.getTenGV());
                ps.setString(2, gv.getMaChuyenNganh());              
                ps.setString(3, gv.getNgaySinh());              
                ps.setBoolean(4, gv.isGioiTinh());
                ps.setString(5, gv.getEmail());
                ps.setString(6, gv.getDiaChi());
                ps.setString(7, gv.getSdt());
                ps.setString(8, gv.getMaGV());

                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                } 
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            } finally {
                DBConnect.close();
            }
        }
        return gv;
    }
    public void deleteMaGV(String GiaoVienID)throws SQLException,ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblGiaoVien where fldMaGV= ?");
            ps.setString(1, GiaoVienID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }
    public void deleteUserGV(String GiaoVienID)throws SQLException,ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblNguoiDung where fldTenDangNhap= ?");
            ps.setString(1, GiaoVienID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }
    

    public static void main(String[] args) {
        System.out.println(new GiaoVienDAO().findByMaChuyenNganh("KTMP").get(0).getMaChuyenNganh());
    }

    @Override
    public ArrayList<GiaoVien> CheckMaGV(String magv) {
      ArrayList<GiaoVien> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from tblGiaoVien where fldMaGV=?");
               psCheck.setString(1, magv);
                rs = psCheck.executeQuery();
                    list = new ArrayList<GiaoVien>();
                    while (rs.next()) {
                        GiaoVien giaoVien = new GiaoVien();
                        giaoVien.setMaGV(rs.getString(1));
                        list.add(giaoVien);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            DBConnect.close(psCheck, rs);
            }
        }
        return  list;
    }

    @Override
    public ArrayList<GiaoVien> findByMaGV(String maGV) {
        ArrayList<GiaoVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select  * from tblGiaoVien where fldMaGV = ?");
                ps.setString(1, maGV);
                rs = ps.executeQuery();
                list = new ArrayList<GiaoVien>();
                while (rs.next()) {
                    GiaoVien gv = new GiaoVien();
                    gv.setMaGV(rs.getString(1));
                    gv.setTenGV(rs.getString(2));
                    gv.setMaChuyenNganh(rs.getString(3));
                    gv.setNgaySinh(rs.getString(4));
                    gv.setGioiTinh(rs.getBoolean(5));
                    gv.setEmail(rs.getString(6));
                    gv.setDiaChi(rs.getString(7));
                    gv.setSdt(rs.getString(8));
                    list.add(gv);

                }
            } catch (SQLException ex) {
                Logger.getLogger(GiaoVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
