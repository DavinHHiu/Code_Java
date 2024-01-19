/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemdanh1;

public class SinhVien 
{
    private String ma, ten, lop, ghiChu;
    private int diemCC;
    
    public SinhVien(String ma, String ten, String lop)
    {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.diemCC + " " + this.ghiChu;
    }
    
    public String getMa()
    {
        return this.ma;
    }
    
    public void setdiemCC(String s)
    {
        this.diemCC = 10;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'm') this.diemCC -= 1;
            else if(s.charAt(i) == 'v') this.diemCC -= 2;
        }   
        if(this.diemCC < 0) this.diemCC = 0;
        if(this.diemCC == 0) this.ghiChu = "KDDK";
        else this.ghiChu = "";
    }
}
