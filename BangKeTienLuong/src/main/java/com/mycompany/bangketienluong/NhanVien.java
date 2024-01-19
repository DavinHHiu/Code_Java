/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangketienluong;

public class NhanVien
{
    private String ma, ten, chucVu;
    private int luongNgay, soNgayCong, luongThang, thuong, phuCap, thucLinh;
    
    public NhanVien(int i, String ten, int luongNgay, int soNgayCong, String chucVu)
    {
        this.ma = "NV" + String.format("%02d", i);
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        this.luongThang = this.luongNgay * this.soNgayCong;
        if(this.soNgayCong >= 25) this.thuong = (int)(this.luongThang * 0.2);
        else if(this.soNgayCong >= 22) this.thuong = (int)(this.luongThang * 0.1);
        else this.thuong = 0;
        if(this.chucVu.equals("GD")) this.phuCap = 250000;
        else if(this.chucVu.equals("PGD")) this.phuCap = 200000;
        else if(this.chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        this.thucLinh = this.luongThang + this.phuCap + this.thuong;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.luongThang + " " + this.thuong + " " + this.phuCap + " " + this.thucLinh; 
    }
    
    public int getThucLinh()
    {
        return this.thucLinh;
    }
}
