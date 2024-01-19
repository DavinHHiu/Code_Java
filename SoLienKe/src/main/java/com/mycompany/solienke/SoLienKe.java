/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.solienke;

import java.util.*;

public class SoLienKe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            System.out.println(check(sc.nextLine()));
        }
    }
    
    public static String check(String s)
    {
        for(int i = 0; i < s.length() - 1; i++)
            if(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i + 1))) != 1) return "NO";
        return "YES";
    }
}
