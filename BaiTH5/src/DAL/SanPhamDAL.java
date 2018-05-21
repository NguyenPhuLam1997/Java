/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.SanPham;
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
public class SanPhamDAL {
    public static List<SanPham> getALL() throws SQLException
    {
        Connection con = DriverManager.getConnection(Connect.dbURL);
        Statement stm = con.createStatement();
        String sqlSelect = "select * from SANPHAM";
            ResultSet rs = stm.executeQuery(sqlSelect);
            while(true)
		{
			if(!rs.next()) break;
                        String MaSP = rs.getString("MaSP");
                        String TenSP = rs.getString("TenSP");
			System.out.print(MaSP + "\t" + TenSP + "\n");
		}
            con.close();
        return null;
        
    }
    public static void main(String[] args) {
        try {
            List<SanPham> SP = getALL();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
