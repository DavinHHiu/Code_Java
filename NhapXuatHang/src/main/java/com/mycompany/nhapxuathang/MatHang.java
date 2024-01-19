/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhapxuathang;

public class MatHang
{
    private String ma, ten, xepLoai;
    
    public MatHang(String ma, String ten, String xepLoai)
    {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }
    
    public String getMa()
    {
        return this.ma;
    }
    
    public String getTen()
    {
        return this.ten;
    }
    
    public String getXepLoai()
    {
        return this.xepLoai;
    }
}
