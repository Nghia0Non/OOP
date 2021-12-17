/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.GiaoVien;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface IGiaoVienDAO {
    public ArrayList<GiaoVien> getAll();
    public ArrayList<GiaoVien> findByMaChuyenNganh(String maChuyenNganh);
    public ArrayList<GiaoVien> findByMaGV(String maGV);
    public GiaoVien addNew(GiaoVien gv);
    public GiaoVien updateByMaGV(GiaoVien gv);
     public ArrayList<GiaoVien> CheckMaGV(String maGV);
    
}
