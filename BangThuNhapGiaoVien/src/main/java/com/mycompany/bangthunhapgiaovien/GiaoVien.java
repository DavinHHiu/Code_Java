/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangthunhapgiaovien;

public class GiaoVien 
{
    private String ma, ten;
    private long luongCoBan, heSoBacLuong, phuCap, thuNhap;
    
    public GiaoVien(String ma, String ten, long luongCoBan)
    {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.heSoBacLuong = Long.parseLong(ma.substring(2));
        this.phuCap = tinhPhuCap();
        this.thuNhap = this.luongCoBan * this.heSoBacLuong + this.phuCap;
    }
    
    private long tinhPhuCap()
    {
        String t = this.ma.substring(0, 2);
        if(t.equals("HT")) return 2000000;
        if(t.equals("HP")) return 900000;
        return 500000;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.heSoBacLuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
