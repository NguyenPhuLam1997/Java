package DTO;
public class HoaDon {
    private String MaHD;
    private String MaKH;
    private String MaNV;
    private String TongTien;

    /**
     * @return the MaHD
     */
    public HoaDon(String MaHD, String MaKH, String MaNV, String TongTien)
    {
        this.MaHD = MaHD;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.TongTien = TongTien;
    }
    public String getMaHD() {
        return MaHD;
    }

    /**
     * @param MaHD the MaHD to set
     */
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the TongTien
     */
    public String getTongTien() {
        return TongTien;
    }

    /**
     * @param TongTien the TongTien to set
     */
    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }
    
}
