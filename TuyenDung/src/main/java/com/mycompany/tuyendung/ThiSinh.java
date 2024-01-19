/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuyendung;

public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, xepLoai;
    private double diemLT, diemTH, diemTB;
    
    public ThiSinh(int i, String ten, double diemLT, double diemTH)
    {
        this.ma = "TS" + String.format("%02d", i);
        this.ten = ten;
        if(diemLT > 10) diemLT /= 10;
        this.diemLT = diemLT;
        if(diemTH > 10) diemTH /= 10;
        this.diemTH = diemTH;
        this.diemTB = (diemLT + diemTH) / 2;
        this.xepLoai = danhGia();
    }
    
    private String danhGia()
    {
        if(this.diemTB > 9.5) return "XUAT SAC";
        if(this.diemTB >= 8) return "DAT";
        if(this.diemTB > 5) return "CAN NHAC";
        return "TRUOT";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.diemTB) + " " + this.xepLoai;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.diemTB > o.diemTB) return -1;
        if(this.diemTB < o.diemTB) return 1;
        return 0;
    }
}
