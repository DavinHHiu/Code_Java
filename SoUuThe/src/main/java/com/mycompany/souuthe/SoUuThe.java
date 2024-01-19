/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.souuthe;

import java.util.*;

public class SoUuThe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
    public static String check(String s)
    {
        int chan = 0, le = 0;
        if(s.charAt(0) == '0') return "INVALID";
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8') ++chan;
            else if(s.charAt(i) == '1' || s.charAt(i) == '3' || s.charAt(i) == '5' || s.charAt(i) == '7' || s.charAt(i) == '9') ++le;
            else return "INVALID";
        }
        if(chan == le) return "NO";
        if(chan > le && chan % 2 == 0) return "YES";
        if(le > chan && le % 2 == 1) return "YES";
        return "NO";
    }
}
