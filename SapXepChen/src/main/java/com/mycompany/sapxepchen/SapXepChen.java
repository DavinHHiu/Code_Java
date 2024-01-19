/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepchen;
import java.util.*;

public class SapXepChen 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n = sc.nextInt(), buoc = 0;
        for(int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for(int i = 0; i < n; i++){
            int key = a.get(i);
            int j = i - 1;
            
            while(j >=0 && a.get(j)  > key){
                a.set(j + 1, a.get(j));
                --j;
            }
            a.set(j + 1, key);
            System.out.print("Buoc " + buoc + ": ");
            for(int x = 0; x <= i; x++) System.out.print(a.get(x) + " ");
            System.out.println();
            ++buoc;
        }
    }
}
