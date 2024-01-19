/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duaxedap;
import java.util.*;
import java.text.*;

public class VanDongVien implements Comparable <VanDongVien>
{
    private String ma, ten, donVi;
    private Date thoiDiemVeDich;
    private double vanToc;
    
    public VanDongVien(String ten, String donVi, String thoiDiemVeDich) throws ParseException
    {
        this.ten = ten;
        this.donVi = donVi;
        this.thoiDiemVeDich = new SimpleDateFormat("HH:mm").parse(thoiDiemVeDich);
        this.ma = taoMa();
        this.vanToc = tinhVanToc();
    }
    
    private String taoMa()
    {
        StringBuilder Ma = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(this.donVi);
        StringTokenizer st2 = new StringTokenizer(this.ten);
        while(st1.hasMoreTokens()) Ma.append(st1.nextToken().charAt(0));
        while(st2.hasMoreTokens()) Ma.append(st2.nextToken().charAt(0));
        return Ma.toString();
    }
    
    private double tinhVanToc() throws ParseException
    {
        Date thoiDiemBatDau = new SimpleDateFormat("HH:mm").parse("06:00");
        return 120.0 / ((this.thoiDiemVeDich.getTime() - thoiDiemBatDau.getTime()) / 3600000.0);
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.donVi + " " + (long)Math.round(this.vanToc) + " Km/h";
    }
    
    public int compareTo(VanDongVien o)
    {
        if(this.vanToc > o.vanToc) return -1;
        if(this.vanToc < o.vanToc) return 1;
        return 0;
    }
}
