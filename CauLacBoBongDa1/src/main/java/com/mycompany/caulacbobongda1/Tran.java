/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caulacbobongda1;

public class Tran 
{
    private String ma;
    private long soCDV, doanhThu;
    private CLB clb;
    
    public Tran(String ma, long soCDV, CLB clb)
    {
        this.ma = ma; 
        this.soCDV = soCDV;
        this.clb = clb;
        this.doanhThu = this.clb.getGiaVe() * this.soCDV;
    }
    
    public String toString()
    {
        return this.ma + " " + this.clb.getTen() + " " + this.doanhThu;
    }
}
