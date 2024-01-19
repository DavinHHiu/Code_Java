/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolopnhanvien;

public class NhanVien {
    private String ma, ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;  
    
    public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKy)
    {
        this.ma = "00001";
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKy = ngayKy;
    }
    
    public String toString()
    {
        return ma + " " + ten + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " " + maThue + " " + ngayKy; 
    }
}
