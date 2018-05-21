package BLL;
import DAL.*;
import DTO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


//Nhan Vien
public class XuLy {
    public static ArrayList<NhanVien> NhanVienArray() throws SQLException{
        return NhanVienDAL.getALL();
    }
    
    public static DefaultTableModel NhanVienModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã NV");
        model.addColumn("Tên NV");
        model.addColumn("Giới Tính");
        model.addColumn("Địa Chỉ");
        try{
            for(int i = 0; i < NhanVienArray().size(); i++){
                Vector<String> h = new Vector();
                h.add(NhanVienArray().get(i).getMaNV());
                h.add(NhanVienArray().get(i).getHoTen());
                h.add(NhanVienArray().get(i).getGioiTinh());
                h.add(NhanVienArray().get(i).getDiaChi());
                model.addRow(h);
            }
            return model;
        }catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertNhanVien(String MaNV, String HoTen, String GioiTinh,String DiaChi){
        try{
            return NhanVienDAL.Insert(MaNV, HoTen, GioiTinh, DiaChi);
        } catch (Exception e){
            System.out.println("Lỗi" + e);
            return 0;
        }
    }
    
    public static int DeleteNhanVien(String MaNV){
        
            return NhanVienDAL.Delete(MaNV);
        
        
    }
    public static int UpdateNhanVien(String MaNV, String HoTen, String GioiTinh,String DiaChi){
        return NhanVienDAL.Update(MaNV, HoTen,GioiTinh, DiaChi);
    }
    
    

//Khach Hang
    public static ArrayList<KhachHang> KhachHangArray(){
        return KhachHangDAL.getAll();
    }
    
    public static DefaultTableModel KhachHangModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã KH");
            model.addColumn("Tên KH");
            model.addColumn("Tên Công Ty");
            model.addColumn("Điạ Chỉ");
            for(int i = 0; i < KhachHangArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(KhachHangArray().get(i).getMaKH());
                h.add(KhachHangArray().get(i).getTenKH());
                h.add(KhachHangArray().get(i).getTenCongTy());
                h.add(KhachHangArray().get(i).getDiaChi());
                model.addRow(h);
            }
            return model;
        } catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertKhachHang(String MaKH,String TenKH,String TenCongTy,String DiaChi){
        return KhachHangDAL.Insert(MaKH, TenKH, TenCongTy, DiaChi);
    }    
    
    
    
}
