/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachdoanhnghiepnhansinhvienthuctap1;

public class DoanhNghiep implements Comparable <DoanhNghiep>
{
    private String ma, ten;
    private int soSinhVien;
    
    public DoanhNghiep(String ma, String ten, int soSinhVien)
    {
        this.ma = ma;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.soSinhVien;
    }
    
    public int compareTo(DoanhNghiep o)
    {
        if(this.soSinhVien > o.soSinhVien) return -1;
        if(this.soSinhVien < o.soSinhVien) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
