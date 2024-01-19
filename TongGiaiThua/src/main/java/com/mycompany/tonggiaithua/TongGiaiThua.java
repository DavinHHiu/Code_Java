/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tonggiaithua;

import java.util.*;

public class TongGiaiThua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = n;
        for(int i = n - 1; i >= 1; i--)
            sum = (sum + 1) * i ;
        System.out.println(sum);
    }
}
