/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepmathang;

public class MatHang implements Comparable <MatHang>
{
    private String ma, ten, nhom;
    private double giaMua, giaBan, loiNhuan;
    
    public MatHang(int i, String ten, String nhom, double giaMua, double giaBan)
    {
        this.ma = "MH" + String.format("%02d", i);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.02f", this.loiNhuan);
    }
    
    public int compareTo(MatHang o)
    {
        if(this.loiNhuan > o.loiNhuan) return -1;
        if(this.loiNhuan < o.loiNhuan) return 1;
        return 0;
    }
}
