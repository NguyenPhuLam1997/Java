/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class SanPham {
    private String MaSP;
    private String TenSP;
    private float DonGia;
    private float SoLuongHang;
    private String MSP;
    /**
     * @return the SanPham
     */
    
    /**
     * @return the TenSP
     */
    public SanPham(String MaSP,String TenSP,float DonGia,float SoLuongHang, String MSP)
    {
        this.MaSP = MaSP;
        this.MSP = MSP;
        this.TenSP = TenSP;
        this.DonGia = DonGia;
        this.SoLuongHang = SoLuongHang;
    }
    public String getTenSP() {
        return TenSP;
    }

    /**
     * @param TenSP the TenSP to set
     */
    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    /**
     * @return the MaSP
     */
    public String getMaSP() {
        return MaSP;
    }

    /**
     * @param MaSP the MaSP to set
     */
    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    /**
     * @return the DonGia
     */
    public float getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the SoLuongHang
     */
    public float getSoLuongHang() {
        return SoLuongHang;
    }

    /**
     * @param SoLuongHang the SoLuongHang to set
     */
    public void setSoLuongHang(float SoLuongHang) {
        this.SoLuongHang = SoLuongHang;
    }

    /**
     * @return the MSP
     */
    public String getMSP() {
        return MSP;
    }

    /**
     * @param MSP the MSP to set
     */
    public void setMSP(String MSP) {
        this.MSP = MSP;
    }
}
