/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhtien;

public class MatHang implements Comparable <MatHang>
{
    private String ma, ten;
    private long soLuong, donGia, tienChietKhau, tongTien;
    
    public MatHang(String ma, String ten, long soLuong, long donGia, long tienChietKhau)
    {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
        this.tongTien = this.soLuong * this.donGia - this.tienChietKhau;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.soLuong + " " + this.donGia + " " + this.tienChietKhau + " " + this.tongTien;
    }
    
    public int compareTo(MatHang o)
    {
        if(this.tongTien > o.tongTien) return -1;
        if(this.tongTien < o.tongTien) return 1;
        return 0;
    }
}
