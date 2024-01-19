/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lietkesinhvientheolop;

public class SinhVien 
{
    private String ma, ten, lop, email;
    
    public SinhVien(String ma, String ten, String lop, String email)
    {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
    
    public String getLop()
    {
        return this.lop;
    }
}
