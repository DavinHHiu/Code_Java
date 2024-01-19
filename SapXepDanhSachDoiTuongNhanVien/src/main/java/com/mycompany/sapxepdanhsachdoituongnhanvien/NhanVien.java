/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepdanhsachdoituongnhanvien;
import java.util.*;
import java.text.*;

public class NhanVien implements Comparable <NhanVien>
{
    private String ma, ten, gioiTinh, diaChi, maThue, ngayKy;
    private Date ngaySinh;
    
    public NhanVien(int i, String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKy) throws ParseException
    {
        this.ma = String.format("%05d", i);
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKy = ngayKy;
    }
    
    public int compareTo(NhanVien o)
    {
        if(this.ngaySinh.before(o.ngaySinh)) return -1;
        if(this.ngaySinh.after(o.ngaySinh)) return 1;
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + this.diaChi + " " + this.maThue + " " + this.ngayKy;
    }
}
