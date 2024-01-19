/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tapturiengcuahaixau;

import java.util.*;

public class TapTuRiengCuaHaiXau 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String [] a = sc.nextLine().split("\\s+");
            String [] b = sc.nextLine().split("\\s+");
            Set <String> s1 = new HashSet <>(Arrays.asList(a));
            Set <String> s2 = new HashSet <>(Arrays.asList(b));
            for(String x : s1)
                if(!s2.contains(x)) System.out.print(x + " ");
            System.out.println("");
        }
    }
}
