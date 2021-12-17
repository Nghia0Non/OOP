/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;


import Entity.LopHocPhan;
import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface ILopHocPhanDAO {
    public ArrayList<LopHocPhan> getAll();
    public ArrayList<LopHocPhan> findByIDKhoa(String maKhoa);
    public ArrayList<LopHocPhan> findByMaLHP(String maLHP);
    public LopHocPhan addNew(LopHocPhan lhp);
    public LopHocPhan updateByID(LopHocPhan lhp);
    public ArrayList<LopHocPhan> checkMaLHP(String maLHP);
   }
