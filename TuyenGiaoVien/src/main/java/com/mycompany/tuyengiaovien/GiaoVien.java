/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuyengiaovien;

public class GiaoVien implements Comparable <GiaoVien>
{
    private String ma, ten, maXetTuyen, mon, ketQua;
    private double diemTinHoc, diemChuyenMon, diemUuTien, diemTong;
    
    public GiaoVien(int i, String ten, String maXetTuyen, double diemTinHoc, double diemChuyenMon)
    {
        this.ma = "GV" + String.format("%02d", i);
        this.ten = ten;
        this.maXetTuyen = maXetTuyen;
        this.diemTinHoc = diemTinHoc;
        this.diemChuyenMon = diemChuyenMon;
        this.mon = setMon();
        this.diemUuTien = tinhDiemUT();
        this.diemTong = this.diemTinHoc * 2 + this.diemChuyenMon + this.diemUuTien;
        if(this.diemTong >= 18) this.ketQua = "TRUNG TUYEN";
        else this.ketQua = "LOAI";
    }
    
    private String setMon()
    {
        Character t = this.maXetTuyen.charAt(0);
        if(t == 'A') return "TOAN";
        if(t == 'B') return "LY";
        return "HOA";
    }
    
    private double tinhDiemUT()
    {
        Character t = this.maXetTuyen.charAt(1);
        if(t == '1') return 2;
        if(t == '2') return 1.5;
        if(t == '3') return 1;
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.mon + " " + String.format("%.1f", this.diemTong) + " " + this.ketQua;
    }
    
    public int compareTo(GiaoVien o)
    {
        if(this.diemTong > o.diemTong) return -1;
        if(this.diemTong < o.diemTong) return 1;
        return 0;
    }
}
