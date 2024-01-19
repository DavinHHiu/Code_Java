/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachthuctap;
import java.util.*;

public class DoanhNghiep 
{
    private static Map <String , Pair <String, Integer>> dn = new HashMap <>();    
    
    public static void setDoanhNghiep(String ma, String ten, int soLuong)
    {
        dn.put(ma, new Pair(ten, soLuong));
    }
    
    public Pair getInfo(String ma)
    {
        return dn.get(ma);
    }
}
