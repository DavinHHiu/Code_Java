/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lietkenhapxuathangtheonhom;

public class Hang implements Comparable <Hang>
{
    private String ma;
    private double soLuongNhap, soLuongXuat, donGia, thue, tien;
    
    public Hang(String ma, int soLuongNhap)
    {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        if(ma.charAt(0) == 'A') this.soLuongXuat = (int)Math.round(0.6 * this.soLuongNhap);
        else this.soLuongXuat = (int)Math.round(0.7 * this.soLuongNhap);
        if(ma.charAt(4) == 'Y') this.donGia = 110000;
        else this.donGia = 135000;
        this.tien = this.soLuongXuat * this.donGia;
        this.thue = tinhThue();
    }
    
    private int tinhThue()
    {
        if(ma.charAt(0) == 'A')
        {
            if(ma.charAt(4) == 'Y') return (int)(0.08 * this.tien);
            return (int)(0.11 * this.tien);
        }
        else{
            if(ma.charAt(4) == 'Y') return (int)(0.17 * this.tien);
            return (int)(0.22 * this.tien);
        }
    }
    
    public String toString()
    {
        return this.ma + " " + (int)this.soLuongNhap+ " " + (int)this.soLuongXuat + " " + (int)this.donGia + " " + (int)this.tien + " " + (int)this.thue;
    }
    
    public int compareTo(Hang o)
    {
        if(this.thue > o.thue) return -1;
        if(this.thue < o.thue) return 1;
        return 0;
    }
    
    public char getMa()
    {
        return this.ma.charAt(0);
    }
}
