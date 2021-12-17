/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.LopHoc;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface ILopHocDAO {
    public ArrayList<LopHoc> getAll();
    public ArrayList<LopHoc> findByIDChuyenNganh(String maChuyenNganh);
    public LopHoc addNew(LopHoc lh);
    public LopHoc updateByID(LopHoc lh);
    public ArrayList<LopHoc> checkID(String malop);
   }
