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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class NhomSanPhamDAL {
    public static ArrayList<NhomSanPham> getAll(){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NHOMSANPHAM";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<NhomSanPham> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaNSP = rs.getString("MaNSP");
                    String TenNSP = rs.getString("TenNSP") ;
                    NhomSanPham nhomSanPham = new NhomSanPham(MaNSP, TenNSP);
                    ds.add(nhomSanPham);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static int Insert(String MaNSP,String TenNSP){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into NHOMSANPHAM(MaNSP, TenNSP) values ('"+ MaNSP +"',N'"+ TenNSP + "')";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaNSP){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from NHOMSANPHAM where MaNSP='"+MaNSP+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    public static int Update(String MaNSP,String TenNSP){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update NHOMSANPHAM set TenNSP = '"+ TenNSP + "' where MaNSP = '"+ MaNSP +"'";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
}
