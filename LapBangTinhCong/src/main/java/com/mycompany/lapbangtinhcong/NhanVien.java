/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lapbangtinhcong;

public class NhanVien {
    private String ma, ten, chucVu;
    private int luongNgay, soNgayCong, luongThang, thuong, phuCap, thuNhap; 
    
    public NhanVien(int i, String ten, int luongNgay, int soNgayCong, String chucVu)
    {
        this.ma = "NV" + String.format("%02d", i);
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.luongThang = this.luongNgay * this.soNgayCong;
        this.thuong = Thuong(this.soNgayCong);
        this.phuCap = PhuCap(this.chucVu);
        this.thuNhap = this.luongThang + this.thuong + this.phuCap;
    }
    
    private int PhuCap(String chuc)
    {
        if(chuc.equals("GD")) return 250000;
        if(chuc.equals("PGD")) return 200000;
        if(chuc.equals("TP")) return 180000;
        return 150000;
    }
    
    private int Thuong(int ngay)
    {
        if(ngay >= 25) return (int)(0.2 * this.luongThang);
        if(ngay >= 22) return (int)(0.1 * this.luongThang);
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.luongThang + " " + this.thuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
