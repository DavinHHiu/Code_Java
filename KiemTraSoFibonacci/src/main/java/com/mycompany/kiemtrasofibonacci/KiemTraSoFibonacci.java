/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kiemtrasofibonacci;

import java.util.*;

public class KiemTraSoFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = Integer.parseInt(sc.nextLine());
        long [] f = new long[93];
        f[0] = 0; f[1] = 1; f[2] = 1;
        for(int i = 3; i < 93; i++)
            f[i] = f[i - 1] + f[i - 2];
        while(t-- > 0)
        {
            System.out.println(checkFibonacci(sc.nextLong(), f));
        }
    }
    
    public static String checkFibonacci(long n, long [] f)
    {
        for(int i = 0; f[i] <= n; i++)
            if(n == f[i]) return "YES";
        return "NO";
    }
}
