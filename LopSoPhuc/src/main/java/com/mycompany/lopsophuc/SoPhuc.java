/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lopsophuc;

public class SoPhuc 
{
    private int thuc, ao;
    
    public SoPhuc(int thuc, int ao)
    {
        this.thuc = thuc;
        this.ao = ao;
    }
    
    public SoPhuc congSoPhuc(SoPhuc o)
    {
        SoPhuc tong = new SoPhuc(this.thuc + o.thuc, this.ao + o.ao);
        return tong;
    }
    
    public SoPhuc nhanSoPhuc(SoPhuc o)
    {
        SoPhuc tich = new SoPhuc(this.thuc * o.thuc - this.ao * o.ao, this.thuc * o.ao + this.ao * o.thuc);
        return tich;
    }
    
    public String toString()
    {
        String out = "";
        out += this.thuc;
        if(this.ao > 0) out += " + " + this.ao + "i";
        else out += " - " + Math.abs(this.ao) + "i";
        return out;
    }
}
