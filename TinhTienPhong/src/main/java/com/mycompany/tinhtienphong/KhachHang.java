/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhtienphong;
import java.util.*;
import java.text.*;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, ten, maPhong;
    private Date ngayNhan, ngayTra;
    private long soNgayO, tienDichVuPhatSinh, thanhTien;
    
    public KhachHang(int i, String ten, String maPhong, String ngayNhan, String ngayTra, long tienDichVuPhatSinh) throws ParseException
    {
        this.ma = "KH" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        this.maPhong = maPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
        this.soNgayO = tinhNgay() + 1;
        this.tienDichVuPhatSinh = tienDichVuPhatSinh;
        this.thanhTien = this.soNgayO * tinhGia() + this.tienDichVuPhatSinh;
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
    
    private long tinhNgay()
    {
        return (this.ngayTra.getTime() - this.ngayNhan.getTime()) / 86400000;
    }
    
    private long tinhGia()
    {
        Character t = this.maPhong.charAt(0);
        if(t == '1') return 25;
        if(t == '2') return 34;
        if(t == '3') return 50;
        return 80;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.maPhong + " " + this.soNgayO + " " + this.thanhTien;
    }
    
    public int compareTo(KhachHang o)
    {
        if(this.thanhTien > o.thanhTien) return -1;
        if(this.thanhTien < o.thanhTien) return 1;
        return 0;
    }
}
