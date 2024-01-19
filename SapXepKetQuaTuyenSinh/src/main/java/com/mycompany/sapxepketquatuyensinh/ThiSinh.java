/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepketquatuyensinh;

public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, trangThai;
    private double diemToan, diemLy, diemHoa, diemCong, tong;
    
    public ThiSinh(String ma, String ten, double diemToan, double diemLy, double diemHoa)
    {
        this.ma = ma;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemCong = tinhDiemCong();
        this.tong = this.diemToan * 2 + this.diemLy + this.diemHoa + this.diemCong;
        this.trangThai = xetTuyen();
    }
    
    private double tinhDiemCong()
    {
        if(ma.charAt(2) == '1') return 0.5;
        if(ma.charAt(2) == '2') return 1.0;
        return 2.5;
    }
    
    private String xetTuyen()
    {
        if(this.tong >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    
    private boolean check(double x)
    {
        if((long)(x * 10) == (long)x * 10) return true;
        return false;
    }
    
    public String toString()
    {
        String out = this.ma + " " + this.ten + " ";
        if(check(this.diemCong)) out += (long)this.diemCong + " ";
        else out += String.format("%.1f", this.diemCong) + " ";
        if(check(this.tong)) out += (long)this.tong + " ";
        else out += String.format("%.1f", this.tong) + " ";
        return out += this.trangThai;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.tong > o.tong) return -1;
        if(this.tong < o.tong) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
