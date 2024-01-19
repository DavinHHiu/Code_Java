/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangdiemhocsinh;
import java.util.*;

public class HocSinh implements Comparable <HocSinh>
{
    private String ma, ten, xepLoai;
    private double toan, tiengViet, ngoaiNgu, ly, hoa, sinh, su, dia, congNghe, GDCD, TB;
    
    public HocSinh(int i, String ten, String diem)
    {
        StringTokenizer st = new StringTokenizer(diem);
        this.ma = "HS" + String.format("%02d", i);
        this.ten = ten;
        this.toan = Double.parseDouble(st.nextToken());
        this.tiengViet = Double.parseDouble(st.nextToken());
        this.ngoaiNgu = Double.parseDouble(st.nextToken());
        this.ly = Double.parseDouble(st.nextToken());
        this.hoa = Double.parseDouble(st.nextToken());
        this.sinh = Double.parseDouble(st.nextToken());
        this.su = Double.parseDouble(st.nextToken());
        this.dia = Double.parseDouble(st.nextToken());
        this.congNghe = Double.parseDouble(st.nextToken());
        this.GDCD = Double.parseDouble(st.nextToken());
        this.TB = (this.toan * 2 + this.tiengViet * 2 + this.ngoaiNgu + this.ly + this.hoa + this.sinh + this.su + this.dia + this.congNghe + this.GDCD) / 12;
        if(TB >= 9) this.xepLoai = "XUAT SAC";
        else if(TB >= 8 && TB < 9) this.xepLoai = "GIOI";
        else if(TB >= 7 && TB < 8) this.xepLoai = "KHA";
        else if(TB >= 5 && TB < 7) this.xepLoai = "TB";
        else this.xepLoai = "YEU";
    }
    
    public String toString()
    {
         return this.ma + " " + this.ten + " " + Math.round(this.TB * 10.0)/10.0 + " " + this.xepLoai;
    }
    
    public int compareTo(HocSinh o)
    {
        if(this.TB > o.TB) return -1;
        if(this.TB < o.TB) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
