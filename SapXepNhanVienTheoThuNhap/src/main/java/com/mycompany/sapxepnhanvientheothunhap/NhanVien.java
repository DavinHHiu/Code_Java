/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepnhanvientheothunhap;

public class NhanVien implements Comparable <NhanVien>
{
    private String ma, ten, chucVu;
    private double luongNgay, soNgayCong, luongChinh, phuCap, tamUng, conLai, thuNhap;
    
    public NhanVien(int i, String ten, String chucVu, double luongNgay, double soNgayCong)
    {
        this.ma = "NV" + String.format("%02d", i);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.luongChinh = this.luongNgay * this.soNgayCong;
        this.phuCap = PhuCap(this.chucVu);
        this.tamUng = (this.luongChinh + this.phuCap) * 2 /3;
        if(this.tamUng < 25000) this.tamUng = Math.round(this.tamUng / 1000) * 1000;
        else this.tamUng = 25000;
        this.conLai = this.luongChinh + this.phuCap - this.tamUng;
        this.thuNhap = this.luongChinh + this.phuCap;
    }
    
    private int PhuCap(String chuc)
    {
        if(chuc.equals("GD")) return 500;
        else if(chuc.equals("PGD")) return 400;
        else if(chuc.equals("TP")) return 300;
        else if(chuc.equals("KT")) return 250;
        return 100;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + (int)this.phuCap + " " + (int)this.luongChinh + " " + (int)this.tamUng + " " + (int)this.conLai;
    }
    
    public int compareTo(NhanVien o)
    {
        if(this.thuNhap > o.thuNhap) return -1;
        if(this.thuNhap < o.thuNhap) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
