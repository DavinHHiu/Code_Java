/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xacdinhdanhsachtrungtuyen;


public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, trangThai;
    private double d1, d2, d3, diemUT, tong;
    
    public ThiSinh(String ma, String ten, double d1, double d2, double d3)
    {
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.diemUT = tinhDiemUT();
        this.tong = this.d1 * 2 + this.d2 + this.d3 + this.diemUT;
    }
    
    private double tinhDiemUT()
    {
        Character t = this.ma.charAt(2);
        if(t == '1') return 0.5;
        if(t == '2') return 1;
        return 2.5;
    }
    
    private boolean checkLong(double x)
    {
        return (long)(x * 10) == (long)x * 10;
    }
    
    public void setTrangThai(double diem)
    {
        if(this.tong >= diem) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
    }
    
    public double getTong()
    {
        return this.tong;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + (checkLong(this.diemUT) ? (long)this.diemUT : String.format("%.1f", this.diemUT)) 
                + " " + (checkLong(this.tong) ? (long)this.tong : String.format("%.1f", this.tong)) + " " + this.trangThai ;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.tong > o.tong) return -1;
        if(this.tong < o.tong) return 1;
        else
        {
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
