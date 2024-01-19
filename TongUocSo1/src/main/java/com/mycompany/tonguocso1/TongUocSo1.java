/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tonguocso1;

import java.util.*;

public class TongUocSo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), a[] = new int [2000005];
        // Sang nguyen to
        
        for(int i = 0; i <= 2000000; i++)
            a[i] = i;
        for(int i = 2; i * i <= 2000000; i++)
            if(a[i] == i)
            {
                for(int j = i * i; j <= 2000000; j += i)
                    a[j] = i;
            }
        
        long sum = 0;
        while(t-- > 0)
        {
            int n = sc.nextInt();
            while(n > 1)
            {
                sum += a[n];
                n /= a[n];
            }
        }
        System.out.println(sum);
    }
}
