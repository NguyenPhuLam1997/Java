package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connect 
{
    static String dbURL = "jdbc:sqlserver://localhost;databaseName=QuanLyBanHang;user=sa;password=nguyenphulam1";
    public static Connection MoKetNoi() {
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (Exception ex) {
            return null;
        }
    }
    
}
