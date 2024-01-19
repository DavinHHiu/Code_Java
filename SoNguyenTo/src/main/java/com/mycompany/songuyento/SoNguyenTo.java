/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.songuyento;

import java.util.*;

public class SoNguyenTo
{
    
    public static void main ( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
         {
                int n = sc.nextInt();
                if(isPrimeNumber(n)) System.out.println("YES");
                else System.out.println("NO");
         }
    }
    
    public static boolean isPrimeNumber ( int n )
    {
        if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i+= 2)
            if(n % i == 0) return false; 
        return true;
    }
}
