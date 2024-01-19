/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietkecactukhacnhau;

import java.util.*;

public class LietKeCacTuKhacNhau 
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeSet <String> s1 = new TreeSet<>();
         TreeSet <String> s2 = new TreeSet<>();
        while(n-- > 0)
        {
            String [] a = sc.nextLine().split( "\\s+");
            TreeSet <String> s = new TreeSet <> (Arrays.asList(a));
            for(String x : s){
                StringBuilder y = new StringBuilder();
                for(int i = 0; i < x.length(); i++)
                    y.append(Character.toLowerCase(x.charAt(i)));
                s1.add(y.toString());
            }
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0)
        {
            String [] a = sc.nextLine().split( "\\s+");
            TreeSet <String> s = new TreeSet <> (Arrays.asList(a));
            for(String x : s){
                StringBuilder y = new StringBuilder();
                for(int i = 0; i < x.length(); i++)
                    y.append(Character.toLowerCase(x.charAt(i)));
                s2.add(y.toString());
            }
        }
        for(String x : s1)
            if(!s2.contains(x)) System.out.print(x + " ");
        System.out.println("");
        for(String x : s2)
            if(!s1.contains(x)) System.out.print(x + " ");
    }
}
