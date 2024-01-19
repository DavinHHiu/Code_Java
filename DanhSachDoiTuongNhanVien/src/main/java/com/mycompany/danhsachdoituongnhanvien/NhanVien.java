/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachdoituongnhanvien;

public class NhanVien 
{
    private String ma, ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;
    
    public NhanVien(int i, String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKy)
    {
        this.ma = String.format("%05d", i);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKy = ngayKy;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " "+ this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maThue + " " + this.ngayKy;
    }
}
