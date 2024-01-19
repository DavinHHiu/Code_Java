/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhcuocdienthoaicodinh;
import java.util.*;
import java.text.*;

public class CuocGoi 
{
    private String thueBao;
    private Date thoiDiemBatDau, thoiDiemKetThuc;
    private long phutGoi, tien;
    private Tinh tinh;
    
    public CuocGoi(String s) throws ParseException
    {
        StringTokenizer st = new StringTokenizer(s);
        this.thueBao = st.nextToken();
        this.thoiDiemBatDau = new SimpleDateFormat("HH:mm").parse(st.nextToken());
        this.thoiDiemKetThuc = new SimpleDateFormat("HH:mm").parse(st.nextToken());
        this.phutGoi = tinhPhutGoi();
        tinh = new Tinh();
        this.tien = tinhTien();
    }
    
    private long tinhPhutGoi()
    {
        return (this.thoiDiemKetThuc.getTime() - this.thoiDiemBatDau.getTime()) / 60000;
    }
    
    private long tinhTien()
    {
        if(this.thueBao.charAt(0) != '0')
        {
            this.phutGoi = (long)Math.ceil(this.phutGoi / 3.0);
            return 800 * this.phutGoi;
        } 
        else
        {
            return this.phutGoi * (long)this.tinh.getInfo(this.thueBao.substring(1,3)).second();
        }
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        out.append(this.thueBao + " ");
        if(this.thueBao.charAt(0) != '0') out.append("Noi mang");
        else
        {
            String tmp = this.thueBao.substring(1,3);
            out.append(this.tinh.getInfo(tmp).first());
        }
        out.append(" " + this.phutGoi + " " + this.tien);
        return out.toString();
    }
}
