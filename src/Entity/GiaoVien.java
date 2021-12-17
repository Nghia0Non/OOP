/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Entity.MonHoc;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anonymous
 */
public class GiaoVien {
    private String maGV;
    private String tenGV;
     private String maChuyenNganh;
    private String ngaySinh;
    private boolean  gioiTinh;
    private String email;
    private String diaChi;
    private String sdt;
   
   

    public GiaoVien() {
    }

    public GiaoVien(String maGV, String tenGV, String maChuyenNganh, String ngaySinh, boolean gioiTinh, String email, String diaChi, String sdt) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.maChuyenNganh = maChuyenNganh;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

   
    
}
