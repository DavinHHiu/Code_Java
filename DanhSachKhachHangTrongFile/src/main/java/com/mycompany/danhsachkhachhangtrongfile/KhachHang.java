/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachkhachhangtrongfile;
import java.util.*;
import java.text.*;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, ten, gioiTinh, diaChi;
    private Date ngaySinh;
    
    public KhachHang(int i, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException
    {
        this.ma = "KH" + String.format("%03d", i);
        this.ten = chuanHoa(ten);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
    }
    
    private String chuanHoa(String ten)
    {
        StringTokenizer st = new StringTokenizer(ten);
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
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.gioiTinh + " " + this.diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh);
    }
    
    public int compareTo(KhachHang o)
    {
        if(this.ngaySinh.before(o.ngaySinh)) return -1;
        if(this.ngaySinh.after(o.ngaySinh)) return 1;
        return 0;
    }
}
