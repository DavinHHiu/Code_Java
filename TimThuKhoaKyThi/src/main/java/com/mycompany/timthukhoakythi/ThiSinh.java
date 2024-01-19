/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timthukhoakythi;

public class ThiSinh {
    private int ma;
    private String ten, ngaySinh;
    private double m1, m2, m3, tong;
    
    public ThiSinh(int i, String ten, String ngaySinh, double m1, double m2, double m3)
    {
        this.ma = i; 
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.tong = this.m1 + this.m2 + this.m3;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.ngaySinh + " " + this.tong;
    }
    
    public double getTong()
    {
        return this.tong;
    }
}
