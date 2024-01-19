/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuanhoavasapxep;
import java.util.*;

public class HoTen implements Comparable <HoTen>
{
    private String ho, dem, ten;
    
    public HoTen(String hoten)
    {
        khoiTaoHoTen(hoten);
    }
    
    private void khoiTaoHoTen(String s)
    {   
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ho = new StringBuilder();
        StringBuilder dem = new StringBuilder();
        StringBuilder ten = new StringBuilder();
        ho.append(st.nextToken());
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(!st.hasMoreTokens()) {
                ten.append(t);
                break;
            }
            dem.append(t + " ");
        }
        this.ho = chuanHoa(ho.toString());
        this.dem = chuanHoa(dem.toString());
        this.ten = chuanHoa(ten.toString());
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
        return this.ho + " " + this.dem + " " + this.ten;
    }
    
    public int compareTo(HoTen o)
    {
        if(this.ten.compareTo(o.ten) < 0) return -1;
        if(this.ten.compareTo(o.ten) > 0) return 1;
        else{
            if(this.ho.compareTo(o.ho) < 0) return -1;
            if(this.ho.compareTo(o.ho) > 0) return 1;
            else{
                if(this.dem.compareTo(o.dem) < 0) return -1;
                if(this.dem.compareTo(o.dem) > 0) return 1;
                return 0;
            }
        }
    }
}

