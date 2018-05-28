/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class KhachHangDAL {
    public static ArrayList<KhachHang> getAll(){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from KHACHHANG";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<KhachHang> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaKH = rs.getString("MaKH");
                    String TenKH = rs.getString("TenKH") ;
                    String TenCongTy = rs.getString("TenCongTy");
                    String DiaChi = rs.getString("DiaChi");
                    KhachHang khach= new KhachHang(MaKH, TenKH, TenCongTy, DiaChi);
                    ds.add(khach);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static int Insert(String MaKH,String TenKH,String TenCongTy,String DiaChi){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into KHACHHANG(MaKH, TenKH, TenCongTy, DiaChi) values ('"+ MaKH +"',N'"+ TenKH +"','"+ TenCongTy +"','"+ DiaChi +"')";
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
    
    public static int Delete(String MaKH){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from KHACHHANG where MaKH='"+MaKH+"'";
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
    public static int Update(String MaKH,String TenKH,String TenCongTy,String DiaChi){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update KHACHHANG set TenKH = '"+ TenKH +"', TenCongTy = '"+ TenCongTy +"',DiaChi = '"+ DiaChi +"' where MaKH = '"+ MaKH +"'";
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

