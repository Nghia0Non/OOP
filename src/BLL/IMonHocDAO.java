/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.MonHoc;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface IMonHocDAO {

    public ArrayList<MonHoc> getAll();

    public ArrayList<MonHoc> findIDMaMH(String maMH);
    public ArrayList<MonHoc> findMonHocByMaChuyenNganh(String maCN);

    public MonHoc addNew(MonHoc mh);

    public MonHoc updateByID(MonHoc mh);
   public ArrayList<MonHoc> CheckID(String mamh);
}
