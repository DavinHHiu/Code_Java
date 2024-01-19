/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.biensodep;
import java.util.*;

public class BienSoDep
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            if(locPhat(s) || bang(s) || hon(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean locPhat(String s)
    {
        for(int i = 5; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) && c != '6' && c != '8') return false;
        }
        return true;
    }
    
    public static boolean bang(String s)
    {
        if((s.charAt(5) == s.charAt(6) && s.charAt(5) == s.charAt(7)) && s.charAt(9) == s.charAt(10)) return true;
        return false;
    }
    public static boolean hon(String s)
    {
        if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)) return true;
        return false;
    }
}
