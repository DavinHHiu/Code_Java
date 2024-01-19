/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachdoituongsinhvien2;
import java.util.*;
import java.text.*;

public class SinhVien {
    private String ma, ten, lop;
    private Date ns;
    private float gpa;
    
    public SinhVien(int i, String ten, String lop, String ns, float gpa) throws ParseException
    {
        this.ma = "B20DCCN" + String.format("%03d", i);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa; 
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
    
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }
}
