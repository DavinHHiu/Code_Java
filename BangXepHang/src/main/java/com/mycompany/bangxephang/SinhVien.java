/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangxephang;

public class SinhVien implements Comparable <SinhVien>
{
    private String ten;
    private int soBaiDung, soLuotSubmit;
    
    public SinhVien(String ten, int soBaiDung, int soLuotSubmit)
    {
        this.ten = ten;
        this.soBaiDung = soBaiDung;
        this.soLuotSubmit = soLuotSubmit;
    }
    
    public String toString()
    {
        return this.ten + " " + this.soBaiDung + " " + this.soLuotSubmit;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.soBaiDung > o.soBaiDung) return -1;
        if(this.soBaiDung < o.soBaiDung) return 1;
        else{
            if(this.soLuotSubmit < this.soLuotSubmit) return -1;
            if(this.soLuotSubmit > this.soLuotSubmit) return 1;
            else{
                if(this.ten.compareTo(o.ten) < 0) return -1;
                if(this.ten.compareTo(o.ten) > 0) return 1;
                return 0;
            }
        }
    }
}
