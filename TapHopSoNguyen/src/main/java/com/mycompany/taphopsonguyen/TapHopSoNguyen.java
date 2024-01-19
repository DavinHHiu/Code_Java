/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.taphopsonguyen;

import java.util.*;

public class TapHopSoNguyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt() , nb = sc.nextInt();
        TreeSet <Integer> A = new TreeSet<>(), B = new TreeSet<>();
        for(int i = 0; i < na; i++){ 
            int x = sc.nextInt();
            A.add(x);
        }
        for(int i = 0; i < nb; i++){
            int x = sc.nextInt();
            B.add(x);
        }
        for(int x : A)
            if(B.contains(x)) System.out.print(x + " ");
        System.out.println("");
        for(int x : A)
            if(!B.contains(x)) System.out.print(x + " ");
        System.out.println("");
        for(int x : B)
            if(!A.contains(x)) System.out.print(x + " ");
    }
}
