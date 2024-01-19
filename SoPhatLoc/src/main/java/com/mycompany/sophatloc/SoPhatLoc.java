/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sophatloc;

import java.util.*;

public class SoPhatLoc 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            int len = s.length();
            if(len < 2)
            {
                System.out.println("NO");
                continue;
            }
            if(s.charAt(len - 1) == '6' && s.charAt(len - 2) == '8') System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
