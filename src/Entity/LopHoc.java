/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Anonymous
 */
public class LopHoc {
    private String malop;
    private String tenlop;
    private String machuyennganh;
    private String siso;
    private String khoahoc;

    public LopHoc(String malop, String tenlop, String machuyennganh, String siso, String khoahoc) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.machuyennganh = machuyennganh;
        this.siso = siso;
        this.khoahoc = khoahoc;
    }

   

    

    public LopHoc() {
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getMaChuyenNganh() {
        return machuyennganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.machuyennganh = maChuyenNganh;
    }

    public String getSiSo() {
        return siso;
    }

    public void setSiSo(String siSo) {
        this.siso = siSo;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

   
}
