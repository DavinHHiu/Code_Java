/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uocsochiahetcho2;

import java.util.*;

public class UocSoChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            int n = sc.nextInt(), count = 0;
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    if(i % 2 == 0) ++count;
                    if(n / i != i && (n / i) % 2 == 0) ++count;
                }
            }
            if(n % 2 == 0) ++ count;
            System.out.println(count);
        }
    }
}
