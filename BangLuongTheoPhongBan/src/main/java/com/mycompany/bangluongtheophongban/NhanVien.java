/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangluongtheophongban;

public class NhanVien 
{
    private String ma, ten;
    private long luongCoBan, soNgayCong, heSoNhan, luongThang;
    private PhongBan phongBan;
    
    public NhanVien(String ma, String ten, long luongCoBan, long soNgayCong)
    {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan * 1000;
        this.soNgayCong = soNgayCong;
        this.heSoNhan = tinhHeSo();
        this.luongThang = this.luongCoBan * this.soNgayCong * this.heSoNhan;
        this.phongBan = new PhongBan();
    }
    
    private int tinhHeSo()
    {
        Character nhom = this.ma.charAt(0);
        int namKN = Integer.parseInt(this.ma.substring(1,3));
        if(nhom == 'A')
        {
            if(namKN < 4) return 10;
            if(namKN < 9) return 12;
            if(namKN < 16) return 14;
            return 20;
        }
        if(nhom == 'B')
        {
            if(namKN < 4) return 10;
            if(namKN < 9) return 11;
            if(namKN < 16) return 13;
            return 16;
        }
        if(nhom == 'C')
        {
            if(namKN < 4) return 9;
            if(namKN < 9) return 10;
            if(namKN < 16) return 12;
            return 14;
        }
        else // nhom == 'D'
        {
            if(namKN < 4) return 8;
            if(namKN < 9) return 9;
            if(namKN < 16) return 11;
            return 13;
        }
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.luongThang;
    }
    
    public boolean check(String maPhongBan)
    {
        return this.ma.substring(3).equals(maPhongBan);
    }
}
