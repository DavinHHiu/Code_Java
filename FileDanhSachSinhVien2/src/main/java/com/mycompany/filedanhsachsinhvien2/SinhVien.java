/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filedanhsachsinhvien2;
import java.util.*;
import java.text.*;

public class SinhVien 
{
    private String ma, ten, lop;
    private Date ngaySinh;
    private double gpa;
    
    public SinhVien(int i, String ten, String lop, String ngaySinh, double gpa) throws ParseException
    {
        this.ma = "B20DCCN" + String.format("%03d", i);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", this.gpa);
    }
}
