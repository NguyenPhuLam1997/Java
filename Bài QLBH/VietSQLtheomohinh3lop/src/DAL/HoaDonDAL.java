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
public class HoaDonDAL {
        public static ArrayList<HoaDon> getAll(){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from HOADON";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<HoaDon> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHD = rs.getString("MaHD");
                    String MaKH = rs.getString("MaKH") ;
                    String MaNV = rs.getString("MaNV");
                    String TongTien = rs.getString("TongTien");
                    HoaDon hoaDon = new HoaDon(MaHD, MaKH, MaNV, TongTien);
                    ds.add(hoaDon);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    public static int Insert(String MaHD,String MaKH,String MaNV,String TongTien){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into HOADON(MaHD, MaKH, MaNV, TongTien) values ('"+ MaHD +"',N'"+ MaKH +"','"+ MaNV +"','"+ TongTien +"')";
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
    
    public static int Delete(String MaHD){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from HOADON where MaKH='"+MaHD+"'";
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
    public static int Update(String MaHD,String MaKH,String MaNV,String TongTien){
        Connection con = Connect.MoKetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "update HOADON set MaKH = '"+ MaKH +"', MaNV = '"+ MaNV +"',TongTien = '"+ TongTien +"' where MaHD = '"+ MaHD +"'";
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
