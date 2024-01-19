/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filesokhacnhau1;
import java.util.*;
import java.io.*;

public class FileSoKhacNhau1 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap <Integer, Integer> map = new TreeMap<>();
        while(sc.hasNext())
        {
            String tmp = sc.next();
            int x = Integer.parseInt(tmp);
            if(map.containsKey(x)){
                int tanSuat = map.get(x);
                ++tanSuat;
                map.put(x, tanSuat);
            }else map.put(x, 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
