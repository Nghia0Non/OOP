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
public class PhieuDangKyHoc {
    private String maLHP;
    private String maSV;
    private String hocKy;
    private String namHoc;
    private String ngayDangKy;

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maGV) {
        this.maSV = maGV;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public PhieuDangKyHoc(String maLHP, String maSV, String hocKy, String namHoc, String ngayDangKy) {
        this.maLHP = maLHP;
        this.maSV = maSV;
        this.hocKy = hocKy;
        this.namHoc = namHoc;
        this.ngayDangKy = ngayDangKy;
    }

    public PhieuDangKyHoc() {
    }
}
