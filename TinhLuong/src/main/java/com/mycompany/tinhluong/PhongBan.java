/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhluong;
import java.util.*;

public class PhongBan 
{
    private static Map <String, String> phongBan = new HashMap <>();
    
    public static void setPhongBan(String ma, String ten)
    {
        phongBan.put(ma, ten);
    }
    
    public PhongBan(){}
    
    public String getInfo(String ma)
    {
        return phongBan.get(ma);
    }
}
