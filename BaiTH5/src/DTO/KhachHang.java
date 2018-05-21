package DTO;
public class KhachHang {
    private String MaKH;
    private String TenKH;
    private String TenCongTy;
    private String DiaChi;

    /**
     * @return the MaKH
     */
    public KhachHang(String MaKH, String TenKH, String TenCongTy, String DiaChi)
    {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.TenCongTy = TenCongTy;
        this.DiaChi = DiaChi;
    }
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
     * @return the TenKH
     */
    public String getTenKH() {
        return TenKH;
    }

    /**
     * @param TenKH the TenKH to set
     */
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    /**
     * @return the TenCongTy
     */
    public String getTenCongTy() {
        return TenCongTy;
    }

    /**
     * @param TenCongTy the TenCongTy to set
     */
    public void setTenCongTy(String TenCongTy) {
        this.TenCongTy = TenCongTy;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
