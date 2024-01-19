/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.soxacach;

import java.util.*;
import java.math.*;

public class SoXaCach
{
    private static int n;
    private static int [] hv = new int [15];
    private static boolean [] ok = new boolean [15];
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for(int i = 0; i <= n; i++) ok[i] = true;
            hoanVi(1);
        }
    }
    
    public static void hoanVi(int i)
    {
        for(int j = 1; j <= n; j++){
            if(ok[j]){
                hv[i] = j;
                if(i == n) process();
                else{
                    ok[j] = false;
                    hoanVi(i + 1);
                    ok[j] = true;
                }
            }
        }
    }
    
    public static boolean check(){
        for(int i = 1; i < n; i++)
            if(Math.abs(hv[i] - hv[i + 1]) == 1) return false;
        return true;
    }
    
    public static void process(){
        if(check()){
            for(int i = 1; i <= n; i++)
                System.out.print(hv[i]);
            System.out.println();
        }
    }
}
