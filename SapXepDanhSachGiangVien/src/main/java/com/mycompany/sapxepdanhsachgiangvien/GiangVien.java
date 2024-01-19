/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepdanhsachgiangvien;
import java.util.*;

public class GiangVien implements Comparable <GiangVien>
{
    private String ma, hoten, mon, ten;
    
    public GiangVien(int i, String hoten, String mon)
    {
        this.ma = "GV" + String.format("%02d", i);
        this.hoten = hoten;
        this.ten = layTen(this.hoten);
        this.mon = vieTat(mon);
    }
    
    public String vieTat(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            ans.append(Character.toUpperCase(t.charAt(0)));
        }
        return ans.toString();
    }
    
    public String layTen(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        String t = st.nextToken();
        while(st.hasMoreTokens())
            t = st.nextToken();
        return t;
    }
    
    public String toString()
    {
        return this.ma + " " + this.hoten + " " + this.mon;
    }
    
    public int compareTo(GiangVien o)
    {
        if(this.ten.compareTo(o.ten) < 0) return -1;
        if(this.ten.compareTo(o.ten) > 0) return 1;
        if(this.ten.equals(o.ten)){
            if(this.ma.compareTo(o.ma) < 0) return -1;
            if(this.ma.compareTo(o.ma) > 0) return 1;
            return 0;
        }
        return 0;
    }
}
