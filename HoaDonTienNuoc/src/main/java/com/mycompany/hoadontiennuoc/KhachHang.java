/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoadontiennuoc;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, ten;
    private double chiSoCu, chiSoMoi, soNuoc, thanhTien;
    
    public KhachHang(int i, String ten, int chiSoCu, int chiSoMoi)
    {
        this.ma = "KH" + String.format("%02d", i);
        this.ten = ten;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soNuoc = this.chiSoMoi - this.chiSoCu;
        this.thanhTien = tinhTien();
    }
    
    private double tinhTien()
    {
        if(this.soNuoc <= 50) return (this.soNuoc * 100) * 1.02;
        if(this.soNuoc <= 100) return (50 * 100 + (this.soNuoc - 50) * 150) * 1.03;
        return (50 * 100 + 50 * 150 + (this.soNuoc - 100) * 200) * 1.05;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + (long)Math.round(this.thanhTien);
    }
    
    public int compareTo(KhachHang o)
    {
        if(this.thanhTien > o.thanhTien) return -1;
        if(this.thanhTien < o.thanhTien) return 1;
        return 0;
    }
}
