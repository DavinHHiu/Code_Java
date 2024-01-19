/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lietkesinhvientheokhoa;

public class SinhVien 
{
    private String ma, khoa, ten, lop, email;
    
    public SinhVien(String ma, String ten, String lop, String email)
    {
        this.ma = ma;
        this.lop = lop;
        this.khoa = "20" + this.lop.substring(1,3);
        this.ten = ten;
        this.email = email;
    }
    
    public String getKhoa()
    {
        return this.khoa;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
