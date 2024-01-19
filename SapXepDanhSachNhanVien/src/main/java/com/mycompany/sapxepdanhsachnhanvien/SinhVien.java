/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepdanhsachnhanvien;
import java.util.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, hoten, ho, dem, ten, soDT, email;
    
    public SinhVien(String ma, String hoten, String soDT, String email)
    {
        this.ma = ma;
        this.hoten = hoten;
        initName();
        this.soDT = soDT;
        this.email = email;
    }
    
    private void initName()
    {
        StringTokenizer st = new StringTokenizer(this.hoten);
        StringBuilder tenDem = new StringBuilder();
        this.ho = st.nextToken();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(!st.hasMoreTokens())
            {
                this.ten = t; break;
            }
            tenDem.append(t); tenDem.append(" ");
        }
        this.dem = tenDem.toString().trim();
    }
    
    public String toString()
    {
        return this.ma + " " + this.hoten + " " + this.soDT + " " + this.email;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.ten.compareTo(o.ten) < 0) return -1;
        if(this.ten.compareTo(o.ten) > 0) return 1;
        else
        {
            if(this.ho.compareTo(o.ho) < 0) return -1;
            if(this.ho.compareTo(o.ho) > 0) return 1;
            else
            {
                if(this.dem.compareTo(o.dem) < 0) return -1;
                if(this.dem.compareTo(o.dem) > 0) return 1;
                else
                {
                    if(this.ma.compareTo(o.ma) < 0) return -1;
                    if(this.ma.compareTo(o.ma) > 0) return 1;
                    return 0;
                }
            }
        }
    }
}
