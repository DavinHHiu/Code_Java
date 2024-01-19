/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xeploai;
import java.util.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, ten, xepLoai;
    private double diemLuyenTap, diemThucHanh, diemThi, diemTongKet;
    
    public SinhVien(int i, String ten, double diemLuyenTap, double diemThucHanh, double diemThi)
    {
        this.ma = "SV" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        this.diemLuyenTap = diemLuyenTap;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
        this.diemTongKet = 0.25 * this.diemLuyenTap + 0.35 * this.diemThucHanh + 0.4 * this.diemThi;
        this.xepLoai = XepLoai(this.diemTongKet);
    }
    
    private String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            ans.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                ans.append(Character.toLowerCase(t.charAt(i)));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    
    private String XepLoai(double x)
    {
        if(x >= 8) return "GIOI";
        if(x >= 6.5) return "KHA";
        if(x >= 5) return "TRUNG BINH";
        return "KEM";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.diemTongKet) + " " + this.xepLoai;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.diemTongKet > o.diemTongKet) return -1;
        if(this.diemTongKet < o.diemTongKet) return 1;
        return 0;
    }
}
