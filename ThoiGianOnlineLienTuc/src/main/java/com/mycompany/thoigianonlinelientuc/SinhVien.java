/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thoigianonlinelientuc;
import java.util.*;
import java.text.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ten;
    private Date tgBatDau, tgKetThuc;
    private long tgOnline;
    
    public SinhVien(String ten, String tgBatDau, String tgKetThuc) throws ParseException
    {
        this.ten = ten;
        this.tgBatDau = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tgBatDau);
        this.tgKetThuc = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tgKetThuc);
        this.tgOnline = tinhThoiGian();
    }
    
    private long tinhThoiGian()
    {
        return (this.tgKetThuc.getTime() - this.tgBatDau.getTime()) / 60000;
    }
    
    public String toString()
    {
        return this.ten + " " +this.tgOnline;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.tgOnline > o.tgOnline) return -1;
        if(this.tgOnline < o.tgOnline) return 1;
        else{
            if(this.ten.compareTo(o.ten) < 0) return -1;
            if(this.ten.compareTo(o.ten) > 0) return 1;
            return 0;
        }
    }
}
