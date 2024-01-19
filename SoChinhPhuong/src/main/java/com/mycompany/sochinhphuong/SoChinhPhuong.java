/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sochinhphuong;

import java.util.*;

public class SoChinhPhuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Double can = Math.sqrt(n);
            Integer cannguyen = can.intValue();
            if(cannguyen * cannguyen == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
