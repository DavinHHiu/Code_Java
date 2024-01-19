/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diemtuyensinh;
import java.util.*;

public class ThiSinh implements Comparable <ThiSinh>
{
    private String ma, ten, trangThai;
    private double diem, congKhuVuc, congDanToc, tong;
    
    public ThiSinh(int i, String ten, double diem, String danToc, int khuVuc)
    {
        this.ma = "TS" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        this.diem = diem;
        if(danToc.equals("Kinh")) this.congDanToc = 0;
        else congDanToc = 1.5;
        if(khuVuc == 1) this.congKhuVuc = 1.5;
        else if(khuVuc == 2) this.congKhuVuc = 1;
        else this.congKhuVuc = 0;
        this.tong = this.diem + this.congDanToc + this.congKhuVuc;
        if(this.tong >= 20.5) this.trangThai = "Do";
        else this.trangThai = "Truot";
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
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.tong + " " + this.trangThai;
    }
    
    public int compareTo(ThiSinh o)
    {
        if(this.tong > o.tong) return -1;
        if(this.tong < o.tong) return 1;
        else{
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
    }
}
