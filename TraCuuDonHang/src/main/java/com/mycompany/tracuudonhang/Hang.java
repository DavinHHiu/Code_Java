/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tracuudonhang;

public class Hang 
{
    private String ten, ma, stt;
    private int donGia, soLuong, giamGia, thanhTien;
    
    public Hang(String ten, String ma, int donGia, int soLuong)
    {
        this.ten = ten;
        this.ma = ma;
        this.stt = this.ma.substring(1, 4);
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(this.ma.charAt(4) == '1') this.giamGia = (int)(0.5 * this.donGia * this.soLuong);
        else this.giamGia = (int)(0.3 * this.donGia * this.soLuong);
        this.thanhTien = this.donGia * this.soLuong - this.giamGia;
    }
    
    public String toString()
    {
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giamGia + " " + this.thanhTien;
    }
}
