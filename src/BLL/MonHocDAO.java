/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import ConnectDatabase.DBConnect;
import Entity.MonHoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anonymous
 */
public class MonHocDAO implements IMonHocDAO {

    @Override
    public ArrayList<MonHoc> getAll() {
        ArrayList<MonHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblMonHoc");
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    MonHoc mh = new MonHoc();
                    mh.setMaMH(rs.getString(1));
                    mh.setTenMH(rs.getString(2));
                    mh.setMaChuyenNganh(rs.getString(3));
                    mh.setHocKy(rs.getString(4));
                    mh.setSoTinChi(rs.getString(5));
                    mh.setHinhThucThi(rs.getString(6));
                    mh.setBatBuoc(rs.getString(7));
//                   

                    list.add(mh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;

    }

    @Override
    public ArrayList<MonHoc> findIDMaMH(String maMH) {
        ArrayList<MonHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblMonHoc where fldMaMH =?");
                ps.setString(1, maMH);
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    MonHoc mh = new MonHoc();
                    mh.setMaMH(rs.getString(1));
                    mh.setTenMH(rs.getString(2));
                    mh.setMaChuyenNganh(rs.getString(3));
                    mh.setHocKy(rs.getString(4));
                    mh.setSoTinChi(rs.getString(5));
                    mh.setHinhThucThi(rs.getString(6));
                    mh.setBatBuoc(rs.getString(7));
                    list.add(mh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public MonHoc addNew(MonHoc mh) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into tblMonHoc(fldMaMH, fldTenMH,fldMaChuyenNganh, fldHocKy,fldSoTinChi,fldHinhThucThi,fldBatBuoc) values (?,?,?,?,?,?,?)");
                ps.setString(1, mh.getMaMH());
                ps.setString(2, mh.getTenMH());
                ps.setString(3, mh.getMaChuyenNganh());
                ps.setString(4, mh.getHocKy());
                ps.setString(5, mh.getSoTinChi());
                ps.setString(6, mh.getHinhThucThi());
                ps.setString(7, mh.getBatBuoc());

                int row = ps.executeUpdate();
                if (row < 1) {
                    mh = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
                mh = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return mh;
    }

    @Override
    public MonHoc updateByID(MonHoc mh) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update tblMonHoc set fldTenMH=?,fldMaChuyenNganh=?,fldHocKy=?, fldSoTinChi =?,fldHinhThucThi =?,fldBatBuoc =? where fldMaMH =?");
                ps.setString(1, mh.getTenMH());
                ps.setString(2, mh.getMaChuyenNganh());
                ps.setString(3, mh.getHocKy());
                ps.setString(4, mh.getSoTinChi());
                ps.setString(5, mh.getHinhThucThi());
                ps.setString(6, mh.getBatBuoc());
                ps.setString(7, mh.getMaMH());
                int row = ps.executeUpdate();
                if (row < 1) {
                    mh = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
                mh = null;
            } finally {
                DBConnect.close();
            }
        }
        return mh;
    }

    public void deleteMonHoc(String MonHocID) throws SQLException, ClassNotFoundException {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from tblMonHoc where fldMaMH= ?");
            ps.setString(1, MonHocID);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<MonHoc> CheckID(String mamh) {
      
         ArrayList<MonHoc> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from tblMonHoc where fldMaMH=?");
               psCheck.setString(1, mamh);
                rs = psCheck.executeQuery();
                    list = new ArrayList<MonHoc>();
                    while (rs.next()) {
                        MonHoc monHoc = new MonHoc();
                        monHoc.setMaMH(rs.getString(1));
                        list.add(monHoc);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            DBConnect.close(psCheck, rs);
            }
        }
        return  list;
    }

    @Override
    public ArrayList<MonHoc> findMonHocByMaChuyenNganh(String maCN) {
         ArrayList<MonHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from tblMonHoc where fldMaChuyenNganh =?");
                ps.setString(1, maCN);
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    MonHoc mh = new MonHoc();
                    mh.setMaMH(rs.getString(1));
                    mh.setTenMH(rs.getString(2));
                    mh.setMaChuyenNganh(rs.getString(3));
                    mh.setHocKy(rs.getString(4));
                    mh.setSoTinChi(rs.getString(5));
                    mh.setHinhThucThi(rs.getString(6));
                    mh.setBatBuoc(rs.getString(7));
                    list.add(mh);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
