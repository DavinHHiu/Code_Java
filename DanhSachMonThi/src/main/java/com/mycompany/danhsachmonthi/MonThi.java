/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachmonthi;

public class MonThi implements Comparable <MonThi>
{
    private String ma, ten, hinhThucThi;
    
    public MonThi(String ma, String ten, String hinhThucThi)
    {
        this.ma = ma;
        this.ten = ten;
        this.hinhThucThi = hinhThucThi;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.hinhThucThi;
    }
    
    public int compareTo(MonThi o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
    }
}
