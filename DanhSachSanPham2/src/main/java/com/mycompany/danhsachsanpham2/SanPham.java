/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachsanpham2;

public class SanPham implements Comparable <SanPham>
{
    private String ma, ten;
    private int giaBan, baoHanh;
    
    public SanPham(String ma, String ten, int giaBan, int baoHanh)
    {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }
    
    public String toString()
    {
        return this.ma + ' ' + this.ten + ' ' + this.giaBan + ' ' + this.baoHanh;
    }
    
    public int compareTo(SanPham o)
    {
        if(this.giaBan > o.giaBan) return -1;
        if(this.giaBan < o.giaBan) return 1;
        if(this.giaBan == o.giaBan){
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
        return 0;
    }
}
