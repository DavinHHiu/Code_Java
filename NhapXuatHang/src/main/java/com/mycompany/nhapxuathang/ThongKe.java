/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhapxuathang;

public class ThongKe 
{
    private MatHang mh;
    private double soLuongNhap, donGiaNhap, soLuongXuat, tongGiaNhap, tongGiaXuat;
    
    public ThongKe(MatHang mh, int soLuongNhap, int donGiaNhap, int soLuongXuat)
    {
        this.mh = mh;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
        this.tongGiaNhap = this.soLuongNhap * this.donGiaNhap;
        this.tongGiaXuat = tinhTienXuat();
    }
    
    private double tinhTienXuat()
    {
        String t = this.mh.getXepLoai();
        if(t.equals("A")) return this.soLuongXuat * this.donGiaNhap * 1.08;
        if(t.equals("B")) return this.soLuongXuat * this.donGiaNhap * 1.05;
        return this.soLuongXuat * this.donGiaNhap * 1.02;
    }
    
    public String toString()
    {
        return this.mh.getMa() + " " + this.mh.getTen() + " " + (long)this.tongGiaNhap + " " + (long)this.tongGiaXuat;
    }
}
