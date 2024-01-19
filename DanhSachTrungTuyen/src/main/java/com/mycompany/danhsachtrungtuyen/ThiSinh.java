/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachtrungtuyen;
import java.util.*;

public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, trangThai;
    private double d1, d2, d3, diemCong, tong;
    
    public ThiSinh(String ma, String ten, double d1, double d2, double d3)
    {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.diemCong = tinhDiemCong();
        this.tong = this.d1 * 2 + this.d2 + this.d3 + this.diemCong;
    }
    
    private double tinhDiemCong()
    {
        String t = this.ma.substring(0, 3);
        if(t.equals("KV1")) return 0.5;
        if(t.equals("KV2")) return 1.0;
        return 2.5;
    }
    
    public double getTong()
    {
        return this.tong;
    }
    
    public void setTrangThai(double diemChuan)
    {        
        if(this.tong >= diemChuan) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
    }
    
    private boolean isLong(double x)
    {
        return (long)(x) * 10 == (long)(x * 10);
    }    
    
    private String chuanHoa(String ten)
    {
        StringTokenizer st = new StringTokenizer(ten);
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
    
    public String toString()
    {
        String out = this.ma + " " + this.ten + " ";
        if(isLong(this.diemCong)) out += (long)this.diemCong + " ";
        else out += String.format("%.1f", this.diemCong) + " ";
        if(isLong(this.tong)) out += (long)this.tong + " ";
        else out += String.format("%.1f", this.tong) + " ";
        return out += this.trangThai;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.tong > o.tong) return -1;
        if(this.tong < o.tong) return 1;
        else
        {
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
