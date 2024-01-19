/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolopsinhvien;

import java.util.*;
import java.text.*;

public class SinhVien {
    private String msv, ten, lop;
    private Date ngaysinh;
    private float gpa;
    
    public SinhVien(String ten, String lop, String ngaysinh, float gpa) throws ParseException
    {
        this.msv = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
    
    public String toString()
    {
        return msv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
