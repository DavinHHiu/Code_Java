/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xephangvandongvien2;
import java.util.*;
import java.text.*;

public class VDV implements Comparable <VDV>
{
    private String ma, ten;
    private Date ngaySinh, tgXuatPhat, tgVeDich, thanhTichThuc, tgUuTien, thanhTich;
    private int xepHang, tuoi;
    
    public VDV(int i, String ten, String ngaySinh, String tgXuatPhat, String tgVeDich) throws ParseException
    {
        this.ma = "VDV" + String.format("%02d", i);
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.tgXuatPhat = new SimpleDateFormat("HH:mm:ss").parse(tgXuatPhat);
        this.tgVeDich = new SimpleDateFormat("HH:mm:ss").parse(tgVeDich);
        this.tuoi = tinhTuoi();
        this.thanhTichThuc = tinhHieu(this.tgVeDich, this.tgXuatPhat);
        this.tgUuTien = tinhThoiGianUuTien();
        this.thanhTich = tinhHieu(this.thanhTichThuc, this.tgUuTien);
    }
    
    private Date tinhHieu(Date x, Date y) throws ParseException
    {
        long tmp = (x.getTime() - y.getTime()) / 1000;
        long gio = tmp / 3600;
        long phut = (tmp - gio * 3600) / 60;
        long giay = tmp - gio * 3600 - phut * 60;
        return new SimpleDateFormat("HH:mm:ss").parse(""+gio+":"+phut+":"+giay+"");
    }
    
    private int tinhTuoi()
    {
        return 2021 - Integer.parseInt(new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh).substring(6));
    }
    
    private Date tinhThoiGianUuTien() throws ParseException
    {
        if(this.tuoi < 18) return new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
        if(this.tuoi < 25) return new SimpleDateFormat("HH:mm:ss").parse("00:00:01");
        if(this.tuoi <= 32) return new SimpleDateFormat("HH:mm:ss").parse("00:00:02");
        return new SimpleDateFormat("HH:mm:ss").parse("00:00:03");
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + new SimpleDateFormat("HH:mm:ss").format(this.thanhTichThuc) 
                + " " + new SimpleDateFormat("HH:mm:ss").format(this.tgUuTien) + " " + new SimpleDateFormat("HH:mm:ss").format(this.thanhTich) + " " + this.xepHang;
    }
    
    public int compareTo(VDV o)
    {
        if(this.thanhTich.compareTo(o.thanhTich) < 0) return -1;
        if(this.thanhTich.compareTo(o.thanhTich) > 0) return 1;
        return 0;
    }
    
    public boolean cungHang(VDV o)
    {
        return this.thanhTich.equals(o.thanhTich);
    }
    
    public void setHang(int i)
    {
        this.xepHang = i;
    }
    
    public int getHang()
    {
        return this.xepHang;
    }
}
