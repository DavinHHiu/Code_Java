/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caulacbobongda2;

public class Tran implements Comparable <Tran>
{
    private String ma;
    private long soCDV, doanhThu;
    private CLB clb;
    
    public Tran(String ma, long soCDV, CLB clb)
    {
        this.ma = ma;
        this.soCDV = soCDV;
        this.clb = clb;
        this.doanhThu = this.soCDV * this.clb.getGiaVe();
    }
    
    public String toString()
    {
        return this.ma + " " + this.clb.getTen() + " " + this.doanhThu;
    }
    
    public int compareTo(Tran o)
    {
        if(this.doanhThu > o.doanhThu) return -1;
        if(this.doanhThu < o.doanhThu) return 1;
        else
        {
            if(this.clb.getTen().compareTo(o.clb.getTen()) < 0) return -1;
            if(this.clb.getTen().compareTo(o.clb.getTen()) > 0) return 1;
            return 0;
        }
    }
}
