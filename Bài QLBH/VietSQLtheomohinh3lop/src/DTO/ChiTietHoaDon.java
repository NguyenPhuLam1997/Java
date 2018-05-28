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
public class ChiTietHoaDon {
    private String MaHD;
    private String MaSP;

    /**
     * @return the MaHD
     */
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
    public String getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    /**
     * @return the SoLuong
     */
    public String getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
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
    private String DonGia;
    private String SoLuong;
    private String TongTien;

    /**
     * @return the MaHD
     */
    public ChiTietHoaDon(String MaHD, String MaSP, String DonGia, String SoLuong, String TongTien)
    {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
    }
    
}
