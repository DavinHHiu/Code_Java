/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhgiaban2;

public class MatHang implements Comparable <MatHang>
{
    private String ma, ten, donVi;
    private double donGia, soLuong, phiVanChuyen, thanhTien, giaBan;
    
    public MatHang(int i, String ten, String donVi, double donGia, double soLuong)
    {
        this.ma = "MH" + String.format("%02d", i);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.phiVanChuyen = Math.round(this.donGia * this.soLuong * 0.05);
        this.thanhTien = Math.round(this.donGia * this.soLuong + this.phiVanChuyen);
        this.giaBan = Math.ceil(this.thanhTien * 1.02 / this.soLuong);
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.donVi + " " + (int)this.phiVanChuyen + " " + (int)this.thanhTien + " " + (int)Math.ceil(this.giaBan / 100) * 100;
    }
    
    public int compareTo(MatHang o)
    {
        if(this.giaBan > o.giaBan) return -1;
        if(this.giaBan < o.giaBan) return 1;
        return 0;
    }
}
