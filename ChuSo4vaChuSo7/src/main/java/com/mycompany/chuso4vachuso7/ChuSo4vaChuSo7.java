/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.chuso4vachuso7;

import java.util.*;

public class ChuSo4vaChuSo7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.nextLine()));
    }

    public static String check(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '4' || s.charAt(i) == '7') ++count;
        }
        if (count == 4 || count == 7) {
            return "YES";
        }
        return "NO";
    }
}
