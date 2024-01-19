/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lophocphan2;

public class MonHoc implements Comparable <MonHoc>
{
    private String ma, ten, nhom, tenGV;
    
    public MonHoc(String ma, String ten, String nhom, String tenGV)
    {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.tenGV = tenGV;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.nhom;
    }
    
    public int compareTo(MonHoc o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        else{
            if(this.nhom.compareTo(o.nhom) < 0) return -1;
            if(this.nhom.compareTo(o.nhom) > 0) return 1;
            return 0;
        }
    }
    
    public String getTenGV()
    {
        return this.tenGV;
    }
}
