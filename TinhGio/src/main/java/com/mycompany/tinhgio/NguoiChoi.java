/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhgio;
import java.util.*;
import java.text.*;

public class NguoiChoi implements Comparable <NguoiChoi>
{
    private String ma, ten;
    private Date gioVao, gioRa;
    private Date thoiGian;
    
    public NguoiChoi(String ma, String ten, String gioVao, String gioRa) throws ParseException
    {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = new SimpleDateFormat("HH:mm").parse(gioVao);
        this.gioRa = new SimpleDateFormat("HH:mm").parse(gioRa);
        this.thoiGian = tinhGio();
    }
    
    private Date tinhGio() throws ParseException
    {
        long tmp = (this.gioRa.getTime() - this.gioVao.getTime()) / 60000;
        long gio = tmp /60, phut = tmp - gio * 60;
        return new SimpleDateFormat("HH:mm").parse(""+gio+":"+phut+"");
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + ""+this.thoiGian.getHours()+" gio "+this.thoiGian.getMinutes()+" phut";
    }
    
    public int compareTo(NguoiChoi o)
    {
        if(this.thoiGian.compareTo(o.thoiGian) > 0) return -1;
        if(this.thoiGian.compareTo(o.thoiGian) < 0) return 1;
        return 0;
    }
}
