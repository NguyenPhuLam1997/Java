
package DAL;

import DTO.*;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ChiTietHoaDonDAL {

    public static ArrayList<ChiTietHoaDon> getALL()
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from CHITIETHOADON";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<ChiTietHoaDon> CTHD = new ArrayList<>();
                while (true){
                    if(!rs.next()) break;
                    String MaHD = rs.getString("MaHD");
                    String TenSP = rs.getString("MaSP");
                    String DonGia = rs.getString("DonGia");
                    String SoLuong = rs.getString("SoLuong");
                    String TongTien = rs.getString("TongTien");
                    DTO.ChiTietHoaDon chiTietHoaDon = new DTO.ChiTietHoaDon(MaHD, TenSP, DonGia, SoLuong, TongTien);
                    CTHD.add(chiTietHoaDon); 
                }
                con.close();
                return CTHD;
            } catch(SQLException ex){
                System.out.println(ex);
                return null;
            }
        } 
        return null; 
    }
    
    public static ArrayList<ChiTietHoaDon> getByID(int id)
    {
        return null;
    }
    
    public static int Insert(String MaHD,String TenSP,String DonGia,String SoLuong,String TongTien)
    {
        Connection conn = Connect.MoKetNoi();
        if(conn != null){
            try{
               Statement stmt = conn.createStatement();
               String sql = "insert into SANPHAM(MaHD, MaSP, DonGia, SoLuong, TongTien) values ('"+ MaHD +"','"+ TenSP +"','"+ DonGia +"','"+ SoLuong +"','"+ TongTien +"')";
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
    public static int Update(String MaHD,String TenSP,String DonGia,String SoLuong,String TongTien)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update CHITIETHOADON set MaSP = '"+ TenSP +"', DonGia = '"+ DonGia +"',SoLuong = '"+ SoLuong + "',TongTien = '"+ TongTien +"' where MaHD = '"+ MaHD +"'";
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
    public static int Delete(String MaHD)
    {
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from CHITIETHOADON where MaHD = '"+ MaHD +"'";
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
