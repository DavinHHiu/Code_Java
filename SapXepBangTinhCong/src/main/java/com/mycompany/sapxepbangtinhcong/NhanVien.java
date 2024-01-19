/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepbangtinhcong;

public class NhanVien implements Comparable <NhanVien>
{
    private String ma, ten, chucVu;
    private int luongNgay, soNgayCong, luongThang, phuCap, thuong, thuNhap;
    
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
        this.thuNhap = this.luongThang + this.phuCap + this.thuong;
    }
    
    private int Thuong(int ngay)
    {
        if(ngay >= 25) return (int)(0.2 * this.luongThang);
        if(ngay >= 22) return (int)(0.1 * this.luongThang);
        return 0;
    }
    
    private int PhuCap(String chucVu)
    {
        if(chucVu.equals("GD")) return 250000;
        if(chucVu.equals("PGD")) return 200000;
        if(chucVu.equals("TP")) return 180000;
        return 150000;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.luongThang + " " + this.thuong + " " + this.phuCap + " " + this.thuNhap;
    }
    
    public int compareTo(NhanVien o)
    {
        if(this.thuNhap > o.thuNhap) return -1;
        if(this.thuNhap < o.thuNhap) return 1;
        return 0;
    }
}