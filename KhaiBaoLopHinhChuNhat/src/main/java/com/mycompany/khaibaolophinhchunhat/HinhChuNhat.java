/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolophinhchunhat;

public class HinhChuNhat 
{
    private double dai, rong;
    private String mau;
    
    public HinhChuNhat(double dai, double rong, String mau)
    {
        this.dai = dai;
        this.rong = rong;
        this.mau = chuanHoa(mau);
    }
    
    private String chuanHoa(String s)
    {
        StringBuilder ans = new StringBuilder();
        ans.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++)
            ans.append(Character.toLowerCase(s.charAt(i)));
        return ans.toString();
    }
    
    public double dienTich()
    {
        return this.dai * this.rong;
    }
    
    public double chuVi()
    {
        return (this.dai + this.rong) * 2;
    }
    
    public String getMau()
    {
        return this.mau;
    }
}
