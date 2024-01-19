/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xephanghocsinh;

public class HocSinh implements Comparable <HocSinh>
{
    private String ma, ten, xepLoai;
    private double diemTB;
    private int hang;
    
    public HocSinh(int i, String ten, double diemTB)
    {
        this.ma = "HS" + String.format("%02d", i);
        this.ten = ten;
        this.diemTB = diemTB;
        this.xepLoai = xepHang();
    }
    
    private String xepHang()
    {
        if(this.diemTB >= 9) return "Gioi";
        if(this.diemTB >= 7) return "Kha";
        if(this.diemTB >= 5) return "Trung Binh";
        return "Yeu";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.diemTB + " " + this.xepLoai + " " + this.hang;
    }
    
    public int compareTo(HocSinh o)
    {
        if(this.diemTB > o.diemTB) return -1;
        if(this.diemTB < o.diemTB) return 1;
        return 0;
    }
    
    public double getDiemTB()
    {
        return this.diemTB;
    }
    
    public int getHang()
    {
        return this.hang;
    }
    
    public void setHang(int r)
    {
        this.hang = r;
    }
}
