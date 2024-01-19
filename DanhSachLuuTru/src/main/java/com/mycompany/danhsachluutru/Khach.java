/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachluutru;
import java.util.*;
import java.text.*;

public class Khach implements Comparable <Khach>
{
    private String ma, ten, maPhong;
    private Date ngayDen, ngayDi;
    private long soNgayLuuTru;
    
    public Khach(int i, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException
    {
        this.ma = "KH" + String.format("%02d", i);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
        this.soNgayLuuTru = tinhNgay();
    }
    
    private long tinhNgay()
    {
        return (this.ngayDi.getTime() - this.ngayDen.getTime()) / 86400000;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.maPhong + " " + this.soNgayLuuTru;
    }
    
    public int compareTo(Khach o)
    {
        if(this.soNgayLuuTru > o.soNgayLuuTru) return -1;
        if(this.soNgayLuuTru < o.soNgayLuuTru) return 1;
        return 0;
    }
}
