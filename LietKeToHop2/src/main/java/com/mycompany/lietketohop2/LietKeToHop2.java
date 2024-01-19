/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietketohop2;

import java.util.*;

public class LietKeToHop2
{
    private static int n, k, count = 0;
    private static int [] c;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        c = new int[n];
        c[0] = 0; toHop(1);
        System.out.println();
        System.out.print("Tong cong co "+count+" to hop");
    }
    
    public static void toHop(int i)
    {
        for(int j = c[i - 1] + 1; j <= n - k + i; j++)
        {
            c[i] = j;
            if(i == k) process();
            else toHop(i + 1);
        }
    }
    
    public static void process()
    {
        ++count;
        for(int i = 1; i <= k; i++)
            System.out.print(c[i]);
        System.out.print(" ");
    }
}
