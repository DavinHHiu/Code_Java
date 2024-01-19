/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhgiaban1;

public class MatHang 
{
    private String ma, ten, donVi;
    private double donGia, soLuong, phiVanChuyen, thanhTien, giaBan;
    
    public MatHang(int i, String ten, String donVi, int donGia, int soLuong)
    {
        this.ma = "MH" + String.format("%02d", i);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.phiVanChuyen = Math.round(this.donGia * this.soLuong * 5 / 100);
        this.thanhTien = Math.round(this.donGia * this.soLuong + this.phiVanChuyen);
        this.giaBan = Math.round(this.thanhTien + this.thanhTien * 2 / 100);
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.donVi + " " + (int)this.phiVanChuyen + " " + (int)this.thanhTien + " " + (int)this.giaBan;
    }
}
