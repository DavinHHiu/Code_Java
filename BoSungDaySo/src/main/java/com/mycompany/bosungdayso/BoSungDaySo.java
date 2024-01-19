/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bosungdayso;
import java.util.*;

public class BoSungDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet <Integer> set = new TreeSet<>();
        boolean check = true;
        int  n = sc.nextInt();
        for(int i = 0; i < n; i++)
            set.add(sc.nextInt());
        for(int i = 1; i < set.last(); i++)
            if(!set.contains(i)){
                System.out.println(i);
                check = false;
            }
        if(check) System.out.println("Excellent!");
    }
}
