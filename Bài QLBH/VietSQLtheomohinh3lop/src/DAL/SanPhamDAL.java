/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
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
public class SanPhamDAL {
    public static ArrayList<SanPham> getALL()
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from SANPHAM";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<SanPham> SP = new ArrayList<>();
                while (true){
                    if(!rs.next()) break;
                    String MaSP = rs.getString("MaSP");
                    String TenSP = rs.getString("TenSP");
                    String DonGia = rs.getString("DonGia");
                    String SoLuongHang = rs.getString("SoLuongHang");
                    String MaNSP = rs.getString("MaNSP");
                    DTO.SanPham sanPham = new DTO.SanPham(MaSP, TenSP, DonGia, SoLuongHang, MaNSP);
                    SP.add(sanPham); 
                }
                con.close();
                return SP;
            } catch(SQLException ex){
                System.out.println(ex);
                return null;
            }
        } 
        return null; 
    }
    
    public static ArrayList<SanPham> getByID(int id)
    {
        return null;
    }
    
    public static int Insert(String MaSP,String TenSP,String DonGia,String SoLuongHang,String MaNSP)
    {
        Connection conn = Connect.MoKetNoi();
        if(conn != null){
            try{
               Statement stmt = conn.createStatement();
               String sql = "insert into SANPHAM(MaSP, TenSP, DonGia, SoLuongHang, MaNSP) values ('"+ MaSP +"','"+ TenSP +"','"+ DonGia +"','"+ SoLuongHang +"','"+ MaNSP +"')";
               int rs = stmt.executeUpdate(sql);
               
               if(rs < 1){
                   conn.close();
                   return 0;
               } else {
                   conn.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    public static int Update(String MaSP,String TenSP,String DonGia,String SoLuongHang,String MaNSP)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update SANPHAM set TenSP = '"+ TenSP +"', DonGia = '"+ DonGia +"',SoLuongHang = '"+ SoLuongHang + "',MaNSP = '"+ MaNSP +"' where MaSP = '"+ MaSP +"'";
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
    public static int Delete(String MaSP)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from SANPHAM where MaSP = '"+ MaSP +"'";
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
