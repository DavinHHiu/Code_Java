/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachthuctap2;

public class SinhVien implements Comparable <SinhVien>
{
    private int stt;
    private String ma, ten, lop, email, doanhNghiep;
    
    public SinhVien(int i, String ma, String ten, String lop, String email, String doanhNghiep)
    {
        this.stt = i;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }
    
    public String toString()
    {
        return this.stt + " " + this.ma + " " + this.ten + " " + this.lop + " " + this.email + " " + this.doanhNghiep;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
    }
    
    public String getDoanhNghiep()
    {
        return this.doanhNghiep;
    }
}
