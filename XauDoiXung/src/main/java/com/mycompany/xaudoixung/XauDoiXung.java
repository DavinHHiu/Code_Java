/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xaudoixung;

import java.util.*;

public class XauDoiXung 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            System.out.println(check(sc.nextLine()));
        }
    }
    
    public static String check(String s)
    {
        int count = 0;
        for(int i = 0; i < s.length() / 2; i++)
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) ++count;
        if(count == 1) return "YES";
        if(count == 0 && s.length() % 2 == 1) return "YES";
        return "NO";
    }
}