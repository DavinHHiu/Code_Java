/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoadonkhachsan;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, ten, soPhong;
    private Date ngayNhan, ngayTra;
    private long ngayO, gia, tienDVPhatSinh, thanhTien;
    
    public KhachHang(int i, String ten, String soPhong, String ngayNhan, String ngayTra, long tienDVPhatSinh) throws ParseException
    {
        this.ma = "KH" + String.format("%02d", i);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
        this.tienDVPhatSinh = tienDVPhatSinh;
        this.ngayO = tinhNgay() + 1;
        this.gia = tinhGia();
        this.thanhTien = this.gia * this.ngayO + this.tienDVPhatSinh;
    }
    
    private long tinhNgay()
    {
        return TimeUnit.DAYS.convert(ngayTra.getTime() - ngayNhan.getTime(), TimeUnit.MILLISECONDS);
    }
    
    private long tinhGia()
    {
        Character t = this.soPhong.charAt(0);
        if(t == '1') return 25;
        if(t == '2') return 34;
        if(t == '3') return 50;
        return 80;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.soPhong + " " + this.ngayO + " " + this.thanhTien;
    }
    
    public int compareTo(KhachHang o)
    {
        if(this.thanhTien > o.thanhTien) return -1;
        if(this.thanhTien < o.thanhTien) return 1;
        return 0;
    }
}
