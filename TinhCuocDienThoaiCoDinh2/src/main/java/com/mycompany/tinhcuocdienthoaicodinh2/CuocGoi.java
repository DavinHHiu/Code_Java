/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhcuocdienthoaicodinh2;
import java.util.*;
import java.text.*;

public class CuocGoi implements Comparable <CuocGoi>
{
    private String thueBao;
    private Date thoiDiemBatDau, thoiDiemKetThuc;
    private long phutGoi, tien;
    private Vung vung;
    
    public CuocGoi(String info) throws ParseException
    {
        StringTokenizer st = new StringTokenizer(info);
        this.thueBao = st.nextToken();
        this.thoiDiemBatDau = new SimpleDateFormat("HH:mm").parse(st.nextToken());
        this.thoiDiemKetThuc = new SimpleDateFormat("HH:mm").parse(st.nextToken());
        this.phutGoi = tinhPhut();
        this.tien = tinhTien();
      
    }
    
    private long tinhPhut()
    {
        return (this.thoiDiemKetThuc.getTime() - this.thoiDiemBatDau.getTime()) / 60000;
    }
    
    private long tinhTien()
    {
        if(this.thueBao.charAt(0) == '0')
        {
            return this.phutGoi * (long)this.vung.getInfo(this.thueBao.substring(1,3)).second();
        }
        else
        {
            this.phutGoi = (long)Math.ceil(this.phutGoi / 3);
            return this.phutGoi * 800;
        }
    }
    
    public String toString()
    {
        if(this.thueBao.charAt(0) == '0')
        {
            String ma = this.thueBao.substring(1,3);
            return this.thueBao + " " + this.vung.getInfo(ma).first() + " " + this.phutGoi + " " + this.tien;
        }
        else
        {
            return this.thueBao + " " + "Noi mang" + this.phutGoi + this.tien;
        }
    }
    
    public int compareTo(CuocGoi o)
    {
        if(this.tien > o.tien) return -1;
        if(this.tien < o.tien) return 1;
        return 0;
    }
}
