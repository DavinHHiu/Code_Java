/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dayconcokphantutangdan;
import java.util.*;

public class DayConCoKPhanTuTangDan 
{
    private static int n, k;
    private static ArrayList <Integer> a = new ArrayList<>();
    private static int [] c; 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            c = new int [n + 1];
            for(int i = 0; i < n; i++) a.add(sc.nextInt());
            Collections.sort(a);
            c[0] = 0; toHop(1);
            a.clear();
        }
    }
    
    public static void toHop(int i)
    {
        for(int j = c[i - 1] + 1; j <= n - k + i; j++){
            c[i] = j;
            if(i == k) process();
            else toHop(i + 1);
        }
    }
    
    public static void process()
    {
        for(int i = 1; i <= k; i++)
            System.out.print(a.get(c[i] - 1) + " ");
        System.out.println();
    }
}
