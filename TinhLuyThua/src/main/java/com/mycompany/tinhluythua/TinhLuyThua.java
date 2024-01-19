/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhluythua;

import java.util.*;
import java.math.*;

public class TinhLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long M = 1000000007;
            if(a == 0 && b == 0) break;
            System.out.println(powMOD(a, b, M));
        }
    }
    
    public static long powMOD(long a, long b, long M)
    {
        if(b == 0) return 1;
        long x = powMOD(a, b / 2, M);
        if(b % 2 == 1) return (((x % M)* (x % M)) % M  * (a % M)) % M;
        else return ((x % M) * (x % M)) % M;
    }
}
