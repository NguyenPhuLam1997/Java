/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhomSanPham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class NhomSanPhamDAL {
    public static List<NhomSanPham> getALL() throws SQLException
    {
        Connection con = DriverManager.getConnection(Connect.dbURL);
        Statement stm = con.createStatement();
        String sqlSelect = "select * from NHOMSANPHAM";
            ResultSet rs = stm.executeQuery(sqlSelect);
            while(true)
		{
			if(!rs.next()) break;
                        String MaNSP = rs.getString("MaNSP");
                        String TenNSP = rs.getString("TenNSP");
			System.out.print(MaNSP + "\t" + TenNSP + "\n");
		}
            con.close();
        return null;
    
    }
    public static void main(String[] args) {
        try {
            List<NhomSanPham> NSP = getALL();
        } catch (SQLException ex) {
            Logger.getLogger(NhomSanPhamDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
