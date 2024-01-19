/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepsinhvientheolop;

public class SinhVien implements Comparable <SinhVien>
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
    
    public int compareTo(SinhVien o)
    {
        if(this.lop.compareTo(o.lop) < 0) return -1;
        if(this.lop.compareTo(o.lop) > 0) return 1;
        if(this.lop.equals(o.lop)){
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
        return 0;
    }
}
