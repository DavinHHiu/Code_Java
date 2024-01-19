/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lophocphan1;

public class MonHoc implements Comparable <MonHoc> 
{
    private String ma, ten, tenGV, nhom;
    
    public MonHoc(String ma, String ten, String nhom, String tenGV)
    {
        this.ma = ma;
        this.ten = ten;
        this.tenGV = tenGV;
        this.nhom = nhom;
    }
    
    public String toString()
    {
        return this.nhom + " " + this.tenGV;
    }
    
    public int compareTo(MonHoc o)
    {
        if(this.nhom.compareTo(o.nhom) < 0) return -1;
        if(this.nhom.compareTo(o.nhom) > 0) return 1;
        return 0;
    }
    
    public String getMa()
    {
        return this.ma;
    }
    
    public String getTen()
    {
        return this.ten;
    }
}
