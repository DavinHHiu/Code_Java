/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.timkiemgiangvien;
import java.util.*;

public class GiangVien
{
    private String ma, ten, nganh;
    
    public GiangVien(int i, String ten, String nganh)
    {
        this.ma = "GV" + String.format("%02d", i);
        this.ten = ten;
        this.nganh = vietTat(nganh);
    }
    
    private String vietTat(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
            ans.append(Character.toUpperCase(st.nextToken().charAt(0)));
        return ans.toString();
    }
    
    public String getTen()
    {
        return this.ten.toLowerCase();
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.nganh;
    }
}
