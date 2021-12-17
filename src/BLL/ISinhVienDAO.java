/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.SinhVien;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface ISinhVienDAO {
    public ArrayList<SinhVien> getAll();
    public ArrayList<SinhVien> findByMaLopHoc(String maLop);
    public ArrayList<SinhVien> findByMaSV(String maSV);
    public SinhVien addNew(SinhVien sv);
    public SinhVien updateByMaSV(SinhVien sv);
     public ArrayList<SinhVien> CheckMaSV(String maSV);
    
}
