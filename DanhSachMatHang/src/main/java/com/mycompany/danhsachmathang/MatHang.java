/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachmathang;
import java.text.*;

public class MatHang implements Comparable <MatHang>
{
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;
    
    public MatHang (int i, String ten, String donVi, int giaMua, int giaBan) throws ParseException
    {
        this.ma = "MH" + String.format("%03d", i);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaMua;
    }
    
    @Override
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + this.loiNhuan;
    }
    
    public int compareTo(MatHang o)
    {
        if(this.loiNhuan > o.loiNhuan) return -1;
        if(this.loiNhuan < o.loiNhuan) return 1;
        if(this.loiNhuan == o.loiNhuan){
            if(this.ma.compareTo(o.ma) == 1) return 1;
        }
        return 0;
    }
}
