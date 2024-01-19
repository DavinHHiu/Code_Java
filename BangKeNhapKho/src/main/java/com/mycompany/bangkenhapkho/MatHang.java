/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangkenhapkho;
import java.util.*;

public class MatHang 
{
    private String ma, ten;
    private int soLuong, donGia, tienChietKhau, thanhTien;
    
    public MatHang(String ten, String ma, int soLuong, int donGia)
    {
        this.ten = ten;
        this.ma = ma;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChietKhau = tinhChietKhau();
        this.thanhTien = this.soLuong * this.donGia - this.tienChietKhau;
    }
    
    private int tinhChietKhau()
    {
        if(this.soLuong > 10) return (int)(this.donGia * this.soLuong * 0.05);
        if(this.soLuong >= 8) return (int)(this.donGia * this.soLuong * 0.02);
        if(this.soLuong >= 5) return (int)(this.donGia * this.soLuong * 0.01);
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + (int)this.tienChietKhau + " " + (int)this.thanhTien;
    }
}
