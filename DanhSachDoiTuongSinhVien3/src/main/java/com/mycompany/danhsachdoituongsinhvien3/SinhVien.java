/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachdoituongsinhvien3;
import java.util.*;
import java.text.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, ten, lop;
    private Date ngaySinh;
    private double gpa;
    
    public SinhVien(int i, String ten, String lop, String ngaySinh, double gpa) throws ParseException
    {
        this.ma = "B20DCCN" + String.format("%03d", i);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
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
        return this.ma + " " + this.ten + " " + this.lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return 0;
    }
}
