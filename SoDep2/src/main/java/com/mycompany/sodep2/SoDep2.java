/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sodep2;

import java.util.*;

public class SoDep2
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            if(s.endsWith("8"))
            {
                if(check(s)) System.out.println("YES");
                else System.out.println("NO");
            } 
            else System.out.println("NO");
        }
    }
    public static Boolean check(String s)
    {
        int len = s.length(), sum = 0;
        for(int i = 0; i <= len/2; i++){
            if(s.charAt(i) != s.charAt(len - i - 1)) return false; 
            sum += Character.getNumericValue(s.charAt(i));
        }
        for(int i = len/2 + 1; i < len; i++) 
            sum += Character.getNumericValue(s.charAt(i));
        if(sum % 10 != 0) return false;
        return true;
    }
}
