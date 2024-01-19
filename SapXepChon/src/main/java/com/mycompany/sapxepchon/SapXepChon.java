/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepchon;
import java.util.*;

public class SapXepChon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList<>();
        int n = sc.nextInt(), buoc = 1;
        for(int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for(int i = 0; i < n - 1; i++)
        {
            int min_id = i;
            for(int j = i + 1; j < n; j++)
                if(a.get(j) < a.get(min_id))
                    min_id = j;
            int tmp = a.get(i);
            a.set(i, a.get(min_id));
            a.set(min_id, tmp);
            System.out.print("Buoc " + buoc + ": ");
            for(Integer x : a) System.out.print(x + " ");
            System.out.println("");
            ++buoc;
        }
    }
}
