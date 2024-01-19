/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.giaocuahaidayso;

import java.util.*;

public class GiaoCuaHaiDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet <Integer> s1 = new TreeSet<>();
        TreeSet <Integer> s2 = new TreeSet<>();
        for(int i = 0; i < n; i++)
            s1.add(sc.nextInt());
        for(int i = 0; i < m; i++)
            s2.add(sc.nextInt());
        for(int x : s1)
            if(s2.contains(x)) System.out.print(x + " ");
        System.out.println("");
    }
}
