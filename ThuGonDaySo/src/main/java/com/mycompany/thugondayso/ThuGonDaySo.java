/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thugondayso;
import java.util.*;
import java.math.*;

public class ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n = sc.nextInt(), k = 0;
        for(int i = 0; i < n; i++)
            a.add(sc.nextInt());
        while(k < a.size() - 1){
            if((a.get(k) + a.get(k + 1)) % 2 == 0){
                a.remove(k + 1);
                a.remove(k);
                if(k > 0) k -= 2;
                if(k == 0) continue;
            }
            k += 1;
        }
        System.out.println(a.size());
    }
}
