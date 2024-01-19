/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classtinhthunhapgiaovien;


public class GiaoVien {
    private String ma, ten; 
    private long luongCoBan, heSoLuong, phuCap, thuNhap;
    
    public GiaoVien(String ma, String ten, long luongCoBan)
    {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        StringBuilder x = new StringBuilder();
        x.append(ma.charAt(2)); x.append(ma.charAt(3));
        this.heSoLuong = Long.parseLong(x.toString());
        StringBuilder t = new StringBuilder();
        t.append(ma.charAt(0)); t.append(ma.charAt(1));
        if(t.toString().equals("HT")) this.phuCap = 2000000;
        else if(t.toString().equals("HP")) this.phuCap = 900000;
        else this.phuCap = 500000;
        this.thuNhap = this.luongCoBan * this.heSoLuong + phuCap;
    }
           
    public String toString()
    {
        return ma + " " + ten + " " + heSoLuong + " " + phuCap + " " + thuNhap;
    }
}
