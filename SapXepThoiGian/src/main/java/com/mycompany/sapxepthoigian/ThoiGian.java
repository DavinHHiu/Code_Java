/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxepthoigian;

public class ThoiGian implements Comparable <ThoiGian>
{
    private int gio, phut, giay;
    
    public ThoiGian(int gio, int phut, int giay)
    {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public String toString()
    {
        return this.gio + " " + this.phut + " " + this.giay;
    }
    
    public int compareTo(ThoiGian o)
    {
        if(this.gio > o.gio) return 1;
        if(this.gio < o.gio) return -1;
        if(this.gio == o.gio)
        {
            if(this.phut > o.phut) return 1;
            if(this.phut < o.phut) return -1;
            if(this.phut == this.phut) 
            {
                if(this.giay > o.giay) return 1;
                if(this.giay < o.giay) return -1;
                return 0;
            }
        }
        return 0;
    }
            
}
