/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xettuyen;
import java.util.*;
import java.text.*;

public class ThiSinh 
{
    private String ma, ten, xepLoai;
    private Date ngaySinh;
    private double diemLT, diemTH, diemCong, diemTB;
    private int tuoi;
    
    public ThiSinh(int i, String ten, String ngaySinh, double diemLT, double diemTH) throws ParseException
    {
        this.ma = "PH" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemCong = tinhDiemCong();
        
        this.tuoi = 2021 -  Integer.parseInt(new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh).substring(6));
        this.diemTB = Math.round((this.diemLT + this.diemTH) / 2 + this.diemCong);
        if(this.diemTB > 10) this.diemTB = 10;
        this.xepLoai = xepHang();
    }
    
    private String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken().toLowerCase();
            ans.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                ans.append(t.charAt(i));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    
    private double tinhDiemCong()
    {
        if(this.diemLT >= 8 && this.diemTH >=8) return 1;
        if(this.diemLT >= 7.5 && this.diemTH >= 7.5) return 0.5;
        return 0;
    }
    
    private String xepHang()
    {
        if((long)diemTB == 9 || (long)diemTB == 10) return "Xuat sac";
        if((long)diemTB == 8) return "Gioi";
        if((long)diemTB == 7) return "Kha";
        if((long)diemTB == 5 || (long)diemTB == 6) return "Trung binh";
        return "Truot";
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.tuoi + " " + (long)this.diemTB + " " + this.xepLoai;
    }
}
