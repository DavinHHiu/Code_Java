/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachgiangvientheobomon;
import java.util.*;

public class GiangVien
{
    private String ma, ten, boMon, maBoMon;
    
    public GiangVien(int i, String ten, String boMon)
    {
        this.ma = "GV" + String.format("%02d", i);
        this.ten = ten;
        this.boMon = boMon;
        this.maBoMon = vietTat(this.boMon);
    }
    
    private String vietTat(String s)
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
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.maBoMon;
    }
    
    public String getMaBoMon()
    {
        return this.maBoMon;
    }
}
