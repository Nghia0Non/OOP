/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.ChuyenNganh;
import java.util.ArrayList;

/**
 *
 * @author ND
 */
public interface IChuyenNganhDAO {
    public ArrayList<ChuyenNganh> getAll();
    public ChuyenNganh addNew(ChuyenNganh chuyennganh);
    public ChuyenNganh updateByID(ChuyenNganh chuyenNganh);
    public ArrayList<ChuyenNganh> checkID(String machuyennganh);
}
