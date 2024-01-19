/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepbangtinhtiendien;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, loai;
    private double chiSoCu, chiSoMoi, heSo, thanhTien, phuTroi, tongTien;
   
    public KhachHang(int i, String loai, double chiSoCu, double chiSoMoi)
    {
        this.ma = "KH" + String.format("%02d", i);
        this.loai = loai;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.heSo = tinhHeSo(this.loai);
        this.thanhTien = (this.chiSoMoi - this.chiSoCu) * this.heSo * 550;
        this.phuTroi = tinhPhuTroi();
        this.tongTien = this.phuTroi + this.thanhTien;
    }
    
    private long tinhHeSo(String s)
    {
        if(s.equals("KD"))return 3;
        if(s.equals("NN")) return 5;
        if(s.equals("TT")) return 4;
        return 2;
    }
    
    private long tinhPhuTroi()
    {
        if(this.chiSoMoi - this.chiSoCu < 50) return 0;
        if(this.chiSoMoi - this.chiSoCu <= 100) return (long)Math.round((this.thanhTien) / 100 * 35);
        return (long)this.thanhTien;
    }
    
    public String toString()    
    {
        return this.ma + " " + (long)this.heSo + " " + (long)this.thanhTien + " " + (long)this.phuTroi + " " + (long)this.tongTien;
    }
    
    public int compareTo(KhachHang o)
    {       
        if(this.tongTien > o.tongTien) return -1;
        if(this.tongTien < o.tongTien) return 1;
        return 0;
    }
}
