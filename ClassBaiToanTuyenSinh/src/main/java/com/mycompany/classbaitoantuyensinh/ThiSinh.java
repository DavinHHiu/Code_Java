/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classbaitoantuyensinh;

public class ThiSinh 
{
    private String ma, ten, trangThai;
    private double toan, ly, hoa, tong, diemUuTien;
    
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa)
    {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.tong = toan * 2 + ly + hoa;
        String t = ma.substring(0, 3);
        if(t.equals("KV1")) this.diemUuTien = 0.5;
        else if(t.equals("KV2")) this.diemUuTien = 1.0;
        else this.diemUuTien = 2.5;
        if(this.tong + this.diemUuTien >= 24) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
    }
    
    public String toString()
    {
        String ans = ma + " " + ten + " ";
        if((diemUuTien * 10) % 10 == 0) ans += (long)diemUuTien;
        else ans += diemUuTien;
        ans += " ";
        if((tong * 10) % 10 == 0) ans += (long)tong;
        else ans += tong;
        ans += " " + trangThai;
        return ans;
    }
}
