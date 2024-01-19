/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uocsonguyentolonnhat;

import java.util.*;

public class UocSoNguyenToLonNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong(), max = 0;
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                while(n % i == 0)
                {
                    max = (max > i) ? max : i;
                    n /= i;
                }
            }
            if(n > 1) max = n;
            System.out.println(max);
        }
    }
}
