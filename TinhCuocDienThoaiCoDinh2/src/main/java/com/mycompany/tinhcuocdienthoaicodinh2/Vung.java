/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhcuocdienthoaicodinh2;
import java.util.*;

public class Vung 
{
    private static Map <String, Pair <String, Long>> vung = new HashMap <>();
    
    public Vung(){}
    
    public static void setVung(String ma, String ten, long giaCuoc)
    {
        vung.put(ma, new Pair(ten, giaCuoc));
    }
    
    public Pair getInfo(String ma)
    {
        return vung.get(ma);
    }
}
