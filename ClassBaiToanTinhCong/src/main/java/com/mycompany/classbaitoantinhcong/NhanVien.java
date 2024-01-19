/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classbaitoantinhcong;

public class NhanVien {
    private String ma, ten, chucVu;
    private long luongCoBan, luongThang, soNgayCong, thuong, phuCap, thuNhap;
    
    public NhanVien(String ten, long luongCoBan, long soNgayCong, String chucVu)
    {
        this.ma = "NV01";
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.luongThang = this.luongCoBan * this.soNgayCong;
        this.chucVu = chucVu;
        if(soNgayCong >= 25) this.thuong = 20 * this.luongThang / 100;
        else if(soNgayCong < 22) this.thuong = 0;
        else this.thuong = 10 * this.luongThang / 100;
        if(this.chucVu.equals("GD")) this.phuCap = 250000;
        else if(this.chucVu.equals("PGD")) this.phuCap = 200000;
        else if(this.chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.thuNhap = this.luongCoBan * this.soNgayCong + this.thuong + this.phuCap;
    }
    
    public String toString()
    {
        return ma + " " + ten + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
