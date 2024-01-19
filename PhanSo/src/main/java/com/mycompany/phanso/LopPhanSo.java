/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanso;

public class LopPhanSo {
    private long tuSo, mauSo;
    
    public LopPhanSo(long tu, long mau)
    {
        this.tuSo = tu;
        this.mauSo = mau;
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
  
    public String toString()
    {
        return tuSo + "/" + mauSo;
    }
}
