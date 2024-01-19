/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sotamphan;

import java.util.*;

public class SoTamPhan 
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
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return "NO";
        return "YES";
    }
}
