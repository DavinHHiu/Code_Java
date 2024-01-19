/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachmonthi2;

public class MonThi implements Comparable <MonThi>
{
    private String ma, ten, hinhThuc;
    
    public MonThi(String ma, String ten, String hinhThuc)
    {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.hinhThuc;
    }
    
    public int compareTo(MonThi o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
    }
}
