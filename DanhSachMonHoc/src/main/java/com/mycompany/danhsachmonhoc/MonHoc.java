/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachmonhoc;

public class MonHoc implements Comparable <MonHoc>
{
    private String ma, ten;
    private int soTinChi;
    
    public MonHoc (String ma, String ten, int soTinChi)
    {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
    }
    
    public int compareTo (MonHoc o)
    {
        if(this.ten.compareTo(o.ten) < 0) return -1;
        if(this.ten.compareTo(o.ten) > 0) return 1;
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.soTinChi;
    }
}
