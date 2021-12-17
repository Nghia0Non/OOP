/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.HocPhan;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface IHocPhanDAO {

    public ArrayList<HocPhan> getAll();

    public ArrayList<HocPhan> findTenKhoa(String tenKhoa);

    public HocPhan addNew(HocPhan hp);

    public HocPhan updateByMaHP(HocPhan hp);
    public ArrayList<HocPhan> CheckMaHP(String maHP);
    public ArrayList<HocPhan> CheckMaMH(String maMH);
}
