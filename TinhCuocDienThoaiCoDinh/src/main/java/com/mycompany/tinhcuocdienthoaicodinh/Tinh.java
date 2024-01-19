/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhcuocdienthoaicodinh;
import java.util.*;

public class Tinh 
{
    private static Map <String, Pair <String, Long> > tinh = new HashMap <>();
    
    public Tinh(){}
    
    public static void setTinh(String ma, String ten, long giaCuoc)
    {
        tinh.put(ma, new Pair(ten, giaCuoc));
    }
    
    public Pair getInfo(String ma)
    {
        return tinh.get(ma);
    }
}
