package BLL;
import DAL.*;
import DTO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class XuLy {
//Nhan Vien
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
        return NhanVienDAL.Insert(MaNV, HoTen, GioiTinh, DiaChi);
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
    
    public static int DeleteKhachHang(String MaKH){
        return KhachHangDAL.Delete(MaKH);
    } 
     public static int UpdateKhachHang(String MaKH,String TenKH,String TenCongTy,String DiaChi){
        return KhachHangDAL.Update(MaKH, TenKH, TenCongTy, DiaChi);
    }

//San Pham
    public static ArrayList<SanPham> SanPhamArray(){
        return SanPhamDAL.getALL();
    }
    
    public static DefaultTableModel SanPhamModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã SP");
            model.addColumn("Tên SP");
            model.addColumn("Đơn Giá");
            model.addColumn("Số Lượng Hàng");
            model.addColumn("Mã NSP");
            for(int i = 0; i < SanPhamArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(SanPhamArray().get(i).getMaSP());
                h.add(SanPhamArray().get(i).getTenSP());
                h.add(SanPhamArray().get(i).getDonGia());
                h.add(SanPhamArray().get(i).getSoLuongHang());
                h.add(SanPhamArray().get(i).getMSP());
                model.addRow(h);
            }
            return model;
        } catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertSanPham(String MaSP,String TenSP,String DonGia,String SoLuongHang,String MaNSP){
        return SanPhamDAL.Insert(MaSP, TenSP, DonGia, SoLuongHang, MaNSP);
    } 
    
    public static int DeleteSanPham(String MaSP){
        return SanPhamDAL.Delete(MaSP);
    } 
     public static int UpdateSanPham(String MaSP,String TenSP,String HoaDon,String SoLuongHang,String MaNSP){
        return SanPhamDAL.Update(MaSP, TenSP, HoaDon, SoLuongHang, MaNSP);
    }
//Nhóm Sản Phẩm
    public static ArrayList<NhomSanPham> NhomSanPhamArray(){
        return NhomSanPhamDAL.getAll();
    }
    
    public static DefaultTableModel NhomSanPhamModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã NSP");
            model.addColumn("Tên NSP");
            for(int i = 0; i < NhomSanPhamArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(NhomSanPhamArray().get(i).getMaNSP());
                h.add(NhomSanPhamArray().get(i).getTenNSP());
                model.addRow(h);
            }
            return model;
        } catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertNhomSanPham(String MaNSP,String TenNSP){
        return NhomSanPhamDAL.Insert(MaNSP, TenNSP);
    } 
    
    public static int DeleteNhomSanPham(String MaNSP){
        return NhomSanPhamDAL.Delete(MaNSP);
    } 
     public static int UpdateNhomSanPham(String MaNSP,String TenNSP){
        return NhomSanPhamDAL.Update(MaNSP, TenNSP);
    }     
//Hoa Don
         public static ArrayList<HoaDon> HoaDonArray(){
        return HoaDonDAL.getAll();
    }
    
    public static DefaultTableModel HoaDonModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã HD");
            model.addColumn("Mã KH");
            model.addColumn("Mã NV");
            model.addColumn("Tổng Tiền");
            for(int i = 0; i < HoaDonArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(HoaDonArray().get(i).getMaHD());
                h.add(HoaDonArray().get(i).getMaKH());
                h.add(HoaDonArray().get(i).getMaNV());
                h.add(HoaDonArray().get(i).getTongTien());
                model.addRow(h);
            }
            return model;
        } catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertHoaDon(String MaHD,String MaKH,String MaNV,String TongTien){
        return KhachHangDAL.Insert(MaHD, MaKH, MaNV, TongTien);
    } 
    
    public static int DeleteHoaDon(String MaHD){
        return KhachHangDAL.Delete(MaHD);
    } 
     public static int UpdateHoaDon(String MaHD,String MaKH,String MaNV,String TongTien){
        return HoaDonDAL.Update(MaHD, MaKH, MaNV, TongTien);
    }
//Chi Tiết Hóa Đơn
     public static ArrayList<ChiTietHoaDon> ChiTietHoaDonArray(){
        return ChiTietHoaDonDAL.getALL();
    }
    
    public static DefaultTableModel ChiTietHoaDonModel(){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Mã HD");
            model.addColumn("Mã SP");
            model.addColumn("Đơn Giá");
            model.addColumn("Số Lượng");
            model.addColumn("Tổng Tiền");
            for(int i = 0; i < ChiTietHoaDonArray().size();i++ ){
                Vector<String> h = new Vector<>();
                h.add(ChiTietHoaDonArray().get(i).getMaHD());
                h.add(ChiTietHoaDonArray().get(i).getMaSP());
                h.add(ChiTietHoaDonArray().get(i).getDonGia());
                h.add(ChiTietHoaDonArray().get(i).getSoLuong());
                h.add(ChiTietHoaDonArray().get(i).getTongTien());
                model.addRow(h);
            }
            return model;
        } catch (Exception ex){
            JOptionPane.showConfirmDialog(null, "Lỗi");
        }
        return null;
    }
    
    public static int InsertChiTietHoaDon(String MaHD,String TenSP,String DonGia,String SoLuong,String TongTien){
        return SanPhamDAL.Insert(MaHD, TenSP, DonGia, SoLuong, TongTien);
    } 
    
    public static int DeleteChiTietHoaDon(String MaHD){
        return ChiTietHoaDonDAL.Delete(MaHD);
    } 
     public static int UpdateChiTietHoaDon(String MaHD,String TenSP,String HoaDon,String SoLuong,String TongTien){
        return SanPhamDAL.Update(MaHD, TenSP, HoaDon, SoLuong, TongTien);
    }
}
