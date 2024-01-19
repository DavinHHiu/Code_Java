/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fileloaiphong;

import java.util.*;

public class LoaiPhong implements Comparable <LoaiPhong>
{
    private String kyHieu, tenLoaiPhong;
    private int donGia;
    private float phiPhucVu;
    
    public LoaiPhong(String input)
    {
        StringTokenizer st = new StringTokenizer(input);
        this.kyHieu = st.nextToken();
        this.tenLoaiPhong = st.nextToken();
        this.donGia = Integer.parseInt(st.nextToken());
        this.phiPhucVu = Float.parseFloat(st.nextToken());
    }
    
    public String toString()
    {
        return this.kyHieu + " " + this.tenLoaiPhong + " " + this.donGia + " " + this.phiPhucVu;
    }
    
    public int compareTo(LoaiPhong o)
    {
        if(this.tenLoaiPhong.compareTo(o.tenLoaiPhong) < 0) return -1;
        if(this.tenLoaiPhong.compareTo(o.tenLoaiPhong) > 0) return 1;
        return 0;
    }
}