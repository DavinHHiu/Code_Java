/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangkenhapkhosapxeptheochietkhau;

public class MatHang implements Comparable <MatHang>
{
    private String ten, ma;
    private int soLuong, donGia, tienChietKhau, thanhTien;
    
    public MatHang(String ma, String ten, int soLuong, int donGia)
    {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChietKhau = tinhChietKhau();
        this.thanhTien = this.donGia * this.soLuong - this.tienChietKhau;
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
    
    public int compareTo(MatHang o)
    {
        if(this.tienChietKhau > o.tienChietKhau) return -1;
        if(this.tienChietKhau < o.tienChietKhau) return 1;
        return 0;
    }
}
