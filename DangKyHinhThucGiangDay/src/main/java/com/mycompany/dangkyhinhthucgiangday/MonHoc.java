/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dangkyhinhthucgiangday;

public class MonHoc implements Comparable <MonHoc>
{
    private String ma, ten, hinhThucDayLT, hinhThucDayTH;
    private int soTin;
    
    public MonHoc(String ma, String ten, int soTin, String hinhThucDayLT, String hinhThucDayTH)
    {
        this.ma = ma;
        this.ten = ten;
        this.soTin = soTin;
        this.hinhThucDayLT = hinhThucDayLT;
        this.hinhThucDayTH = hinhThucDayTH;
    }
    
    public String getHinhThucDayTH()
    {
        return this.hinhThucDayTH;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.soTin + " " + this.hinhThucDayLT + " " + this.hinhThucDayTH;
    }
    
    public int compareTo(MonHoc o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
    }
}
