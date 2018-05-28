/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class NhanVienDAL {
    public static ArrayList<NhanVien> getALL()
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from NHANVIEN";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<NhanVien> NV = new ArrayList<>();
                while (true){
                    if(!rs.next()) break;
                    String MaNV = rs.getString("MaNV");
                    String HoTen = rs.getString("HoTen");
                    String GioiTinh = rs.getString("GioiTinh");
                    String DiaChi = rs.getString("DiaChi");
                    DTO.NhanVien nhanVien = new DTO.NhanVien(MaNV, HoTen, GioiTinh, DiaChi);
                    NV.add(nhanVien); 
                }
                con.close();
                return NV;
            } catch(SQLException ex){
                System.out.println(ex);
                return null;
            }
        } 
        return null;         
    }
    public static ArrayList<NhanVien> getByID(int id)
    {
        return null;
    
    }
    
    public static int Insert(String MaNV,String HoTen, String GioiTinh, String DiaChi)
    {
        Connection conn = Connect.MoKetNoi();
        if(conn != null){
            try{
               Statement stmt = conn.createStatement();
               String sql = "insert into NHANVIEN(MaNV, HoTen, GioiTinh, DiaChi) values ('"+ MaNV +"','"+ HoTen +"','"+ GioiTinh +"','"+ DiaChi +"')";
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
    public static int Update(String HoTen,String MaNV, String GioiTinh, String DiaChi)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update NHANVIEN set HoTen = '"+ HoTen +"', GioiTinh = '"+ GioiTinh +"',DiaChi = '"+ DiaChi +"' where MaNV = '"+ MaNV +"'";
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
    public static int Delete(String MaNV)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from NHANVIEN where MaNV = '"+ MaNV +"'";
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
