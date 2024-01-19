/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachcathi;
import java.util.*;
import java.text.*;

public class CaThi implements Comparable <CaThi>
{
    private String ma, IDphong;
    private Date ngay, gio;
    
    public CaThi(int i, String ngay, String gio, String IDphong) throws ParseException
    {
        this.ma = "C" + String.format("%03d", i);
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("HH:mm").parse(gio);
        this.IDphong = IDphong;
    }
    
    public String toString()
    {
        return this.ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(this.ngay) + " " + new SimpleDateFormat("HH:mm").format(this.gio) + " " + this.IDphong;
    }
    
    public int compareTo(CaThi o)
    {
        if(this.ngay.before(o.ngay)) return -1;
        if(this.ngay.after(o.ngay)) return 1;
        else
        {
            if(this.gio.before(o.gio)) return -1;
            if(this.gio.after(o.gio)) return 1;
            else
            {
                if(this.ma.compareTo(o.ma) < 0) return -1;
                if(this.ma.compareTo(o.ma) > 0) return 1;
                return 0;
            }
        }
    }
}
