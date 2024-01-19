/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepdoichotructiep;
import java.util.*;

public class SapXepDoiChoTrucTiep 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> a = new ArrayList <>();
        int n = sc.nextInt(), buoc = 1;
        for(int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a.get(i) > a.get(j))
                {
                    int tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
            System.out.print("Buoc " + buoc + ": ");
            for(Integer x : a) System.out.print(x + " ");
            System.out.println("");
            ++buoc;
        }
    }
}
