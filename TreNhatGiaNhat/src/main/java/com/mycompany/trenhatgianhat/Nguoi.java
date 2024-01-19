/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trenhatgianhat;
import java.util.*;
import java.text.*;
public class Nguoi implements Comparable <Nguoi>
{
    private String ten;
    private Date ngaySinh;
    
    public Nguoi(String ten, String ngaySinh) throws ParseException
    {
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }
    
    public String toString()
    {
        return this.ten;
    }
    
    public int compareTo(Nguoi o)
    {
        if(this.ngaySinh.after(o.ngaySinh)) return -1;
        if(this.ngaySinh.before(o.ngaySinh)) return 1;
        return 0;
    }
}
