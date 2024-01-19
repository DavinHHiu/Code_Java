/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangdiemthanhphan2;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, ten, lop;
    private double d1, d2, d3;
    
    public SinhVien(String ma, String ten, String lop, double d1, double d2, double d3)
    {
        this.ma = ma; 
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + String.format("%.1f", this.d1) + " " + String.format("%.1f", this.d2) + " " + String.format("%.1f", this.d3);
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.ten.compareTo(o.ten) < 0) return -1;
        if(this.ten.compareTo(o.ten) > 0) return 1;
        return 0;
    }
}
