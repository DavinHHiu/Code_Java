/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classtinhtoanphanso;

public class PhanSo {
    private long tuSo, mauSo;
    
    public PhanSo(long tuSo, long mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    private long GCD(long a, long b)
    {
        if(b == 0) return a;
        return GCD(b, a % b);
    }
        
    public void rutGon()
    {
        long gcd = GCD(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }
    
    public PhanSo cong(PhanSo ps)
    {
        long ts = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        long ms = this.mauSo * ps.mauSo;
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.rutGon();
        return phanSoTong;
    }   
    
    public PhanSo nhan(PhanSo ps)
    {
        long ts = this.tuSo * ps.tuSo;
        long ms = this.mauSo * ps.mauSo;
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.rutGon();
        return phanSoTich;
    }
    
    public String toString()
    {
        return tuSo + "/" + mauSo;
    }
}
