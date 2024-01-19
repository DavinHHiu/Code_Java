/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepbanggiaxangdau;

public class DonHang implements Comparable <DonHang>
{
    private String ma, hang;
    private double donGia, soLuong, thue, thanhTien;
    
    public DonHang(String ma, long soLuong)
    {
        this.ma = ma;
        this.soLuong = soLuong;
        this.hang = setHang();
        this.donGia = setDonGia();
        this.thue = setThue();
        this.thanhTien = this.soLuong * this.donGia + this.thue;
    }
    
    private String setHang()
    {
        String t = this.ma.substring(3);
        if(t.equals("BP")) return "British Petro";
        if(t.equals("ES")) return "Esso";
        if(t.equals("SH")) return "Shell";
        if(t.equals("CA")) return "Castrol";
        if(t.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    
    private double setDonGia()
    {
        Character t = this.ma.charAt(0);
        if(t == 'X') return 128000;
        if(t == 'D') return 11200;
        return 9700;
    }
    
    private double setThue()
    {
        double t = this.soLuong * this.donGia;
        Character c = this.ma.charAt(0);
        if(this.hang.equals("Trong Nuoc")) return 0;
        if(c == 'X') return t * 3 / 100;
        if(c == 'D') return t * 3.5 / 100;
        return t * 2 / 100;
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
