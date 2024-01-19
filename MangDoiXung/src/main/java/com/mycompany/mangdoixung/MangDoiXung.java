/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mangdoixung;

import java.util.*;

public class MangDoiXung
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            ArrayList <Integer> list = new ArrayList <> ();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
                list.add(sc.nextInt());
            if(check(list)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(ArrayList <Integer> a)
    {
        for(int i = 0; i <= a.size()/2; i++)
            if(a.get(i) != a.get(a.size() -1 - i)) return false;
        return true;
        
    }
}
