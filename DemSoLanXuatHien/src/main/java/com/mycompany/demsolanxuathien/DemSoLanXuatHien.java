/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demsolanxuathien;

import java.util.*;

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), test = 1;
        while(t-- > 0)
        {
            
            int n = sc.nextInt();
            LinkedHashMap <Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                 if(map.containsKey(x))
                 {
                   int tanSuat = map.get(x);
                   map.put(x, tanSuat + 1);
                 }
                 else map.put(x, 1);
            }
            System.out.println("Test " + test + ":");
            for(Map.Entry <Integer, Integer> entry : map.entrySet())
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            ++test;
        }
    }
}
