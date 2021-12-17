/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ND
 */
public class LopHocPhan {
    private String maLHP;
    private String maHP;
    private String maMH;
    private String maKhoa;
    private String tietHoc;
    private String phongHoc;
    private String thu;
    private String siSo;
    private String hocKy;
    private String namHoc;
    private String ngayThi;

    public LopHocPhan() {
    }

    public LopHocPhan(String maLHP, String maHP, String maMH, String maKhoa, String tietHoc, String phongHoc, String thu, String siSo, String hocKy, String namHoc, String ngayThi) {
        this.maLHP = maLHP;
        this.maHP = maHP;
        this.maMH = maMH;
        this.maKhoa = maKhoa;
        this.tietHoc = tietHoc;
        this.phongHoc = phongHoc;
        this.thu = thu;
        this.siSo = siSo;
        this.hocKy = hocKy;
        this.namHoc = namHoc;
        this.ngayThi = ngayThi;
    }

   

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTietHoc() {
        return tietHoc;
    }

    public void setTietHoc(String tietHoc) {
        this.tietHoc = tietHoc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getSiSo() {
        return siSo;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public void setSiSo(String siSo) {
        this.siSo = siSo;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }
    
}
