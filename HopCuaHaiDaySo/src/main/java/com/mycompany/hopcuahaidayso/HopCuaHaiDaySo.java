/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hopcuahaidayso;

import java.util.*;

public class HopCuaHaiDaySo
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet <Integer> set = new TreeSet<>();
        for(int i = 0; i  < n; i++)
            set.add(sc.nextInt());
        for(int i = 0; i < m; i++)
            set.add(sc.nextInt());
        for(int x : set)
            System.out.print(x + " ");
        System.out.println("");
    }
}
