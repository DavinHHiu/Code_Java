/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sodep3;

import java.util.*;

public class SoDep3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            if(checkThuanNghich(s)){
                if(checkNguyenTo(s)) System.out.println("YES");
                else System.out.println("NO");
            } else System.out.println("NO");
        }
    }
    
    public static boolean checkThuanNghich(String s)
    {
        for(int i = 0; i <= s.length()/2; i++) 
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return true;
    }
    
    public static boolean checkNguyenTo(String s)
    {
        for(int i = 0; i < s.length(); i++)
            if(!nguyenTo(Character.getNumericValue(s.charAt(i)))) return false;
        return true;
    }
    
    public static boolean nguyenTo(int n)
    {
        if(n == 2) return true;
        if(n % 2 == 0 || n < 2) return false;
        for(int i = 3; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
}
