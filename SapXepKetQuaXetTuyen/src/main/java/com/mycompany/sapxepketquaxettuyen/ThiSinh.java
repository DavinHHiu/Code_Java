/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepketquaxettuyen;
import java.util.*;
import java.text.*;

public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, xepLoai;
    private Date ngaySinh;
    private double diemLT, diemTH, diemCong, diemTB;
    private int tuoi;
    
    public ThiSinh(int i, String ten, String ngaySinh, double diemLT, double diemTH) throws ParseException
    {
        this.ma = "PH" + String.format("%02d", i);
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemCong = tinhDiemCong();
        this.diemTB = (long)Math.round((this.diemTH + this.diemLT) / 2 + this.diemCong);
        if(this.diemTB > 10) this.diemTB = 10;
        this.tuoi = tinhTuoi();
        this.xepLoai = xepHang();
    }
    
    private double tinhDiemCong()
    {
        if(this.diemLT >= 8 && this.diemTH >= 8) return 1;
        if(this.diemLT >= 7.5 && this.diemTH >= 7.5) return 0.5;
        return 0;
    }
    
    private int tinhTuoi()
    {
        return 2021 - Integer.parseInt(new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh).substring(6));
    }
    
    private String xepHang()
    {
        if(this.diemTB == 9 || this.diemTB == 10) return "Xuat sac";
        if(this.diemTB == 8) return "Gioi";
        if(this.diemTB == 7) return "Kha";
        if(this.diemTB == 6 || this.diemTB == 5) return "Trung binh";
        return "Truot";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.tuoi + " " + (long)this.diemTB + " " + this.xepLoai;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.diemTB > o.diemTB) return -1;
        if(this.diemTB < o.diemTB) return 1;
        else
        {
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
