/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlykhoxangdau;

public class DonHang implements Comparable <DonHang>
{
    private String ma, hang;
    private double donGia, soLuong, thue, thanhTien;
    
    public DonHang(String ma, long soLuong)
    {
        this.ma = ma;
        this.soLuong = soLuong;
        this.hang = getHang();
        this.donGia = getDonGia();
        this.thue = getThue();
        this.thanhTien = this.soLuong * this.donGia + this.thue;
    }
    
    private String getHang()
    {
        if(ma.substring(3).equals("BP")) return "British Petro";
        if(ma.substring(3).equals("ES")) return "Esso";
        if(ma.substring(3).equals("SH")) return "Shell";
        if(ma.substring(3).equals("CA")) return "Castrol";
        if(ma.substring(3).equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    
    private long getDonGia()
    {
        if(ma.charAt(0) == 'X') return 128000;
        if(ma.charAt(0) == 'D') return 11200;
        return 9700;
    }
    
    private double getThue()
    {
        if(hang.equals("Trong Nuoc")) return 0;
        if(ma.charAt(0) == 'X') return soLuong * donGia * 3 / 100;
        if(ma.charAt(0) == 'D') return soLuong * donGia * 3.5 / 100;
        return soLuong * donGia * 2 / 100;
    }
    
    public String toString()
    {
        return this.ma + " " + this.hang + " " + (long)this.donGia + " " + (long)this.thue + " " + (long)this.thanhTien;
    }
    
    public int compareTo(DonHang o)
    {
        if(this.thanhTien > o.thanhTien) return -1;
        if(this.thanhTien < o.thanhTien) return 1;
        return 0;
    }
}
