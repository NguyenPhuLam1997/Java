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
public class NhomSanPham {
    private String MaNSP;
    private String TenNSP;

    /**
     * @return the MaNSP
     */
    public NhomSanPham(String MaNSP, String TenNSP)
    {
        this.MaNSP = MaNSP;
        this.TenNSP = TenNSP;
    }
    public String getMaNSP() {
        return MaNSP;
    }

    /**
     * @param MaNSP the MaNSP to set
     */
    public void setMaNSP(String MaNSP) {
        this.MaNSP = MaNSP;
    }

    /**
     * @return the TenNSP
     */
    public String getTenNSP() {
        return TenNSP;
    }

    /**
     * @param TenNSP the TenNSP to set
     */
    public void setTenNSP(String TenNSP) {
        this.TenNSP = TenNSP;
    }
}
