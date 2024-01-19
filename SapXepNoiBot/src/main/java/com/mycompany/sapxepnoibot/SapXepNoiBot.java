/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepnoibot;
import java.util.*;

public class SapXepNoiBot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n = sc.nextInt(), buoc = 1;
        for(int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    int tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);
                    swapped = true;
                }
            }
             if(!swapped) break;
            System.out.print("Buoc " + buoc + ": ");
            for(int x : a) System.out.print(x + " ");
            System.out.println("");
            ++buoc;
        }
    }
}
