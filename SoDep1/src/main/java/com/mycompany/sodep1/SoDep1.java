/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sodep1;

import java.util.*;

public class SoDep1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean check(String s)
    {
        int len = s.length();
        for(int i = 0; i <= len/2; i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8') return false;
            if(s.charAt(i) != s.charAt(len - i - 1)) return false;
        }
        for(int i = len/2 + 1; i < len; i++)
            if(s.charAt(i) != '0' && s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        return true;
    }
}
