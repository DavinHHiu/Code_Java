/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lietkesinhvientheonganh;

public class SinhVien
{
    private String ma, ten, lop, email, nganh;
    
    public SinhVien(String ma, String ten, String lop, String email)
    {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.nganh = chiaNganh(this.ma);
    }
    
    private String chiaNganh(String s)
    {
        if(s.substring(3, 7).equals("DCKT")) return "ke toan";
        if(s.substring(3, 7).equals("DCVT")) return "vien thong";
        if(s.substring(3, 7).equals("DCDT")) return "dien tu";
        if(s.substring(3, 7).equals("DCCN") && this.lop.charAt(0) != 'E') return "cong nghe thong tin";
        if(s.substring(3, 7).equals("DCAT") && this.lop.charAt(0) != 'E') return "an toan thong tin";
        return "";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
    
    public String getNganh()
    {
        return this.nganh;
    }
}
