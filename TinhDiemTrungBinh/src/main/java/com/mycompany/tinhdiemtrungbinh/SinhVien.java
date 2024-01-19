/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhdiemtrungbinh;
import java.util.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, ten;
    private double d1, d2, d3, TB;
    private int xepHang;
    
    public SinhVien(int i, String ten, Double d1, Double d2, Double d3)
    {
        this.ma = "SV" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.TB = (this.d1 * 3 + this.d2 * 3 + this.d3 * 2) / 8;
    }
    
    private String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                kq.append(Character.toLowerCase(t.charAt(i)));
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.TB) + " " + this.xepHang;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.TB > o.TB) return -1;
        if(this.TB < o.TB) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
    
    public double getTB()
    {
        return this.TB;
    }
    
    public void setRank(int r)
    {
        this.xepHang = r;
    }
}
