/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.catdoi;

import java.util.*;

public class CatDoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            System.out.println(catdoi(sc.nextLine()));
        }
    }
    
    public static String catdoi(String s)
    {
        StringBuilder kq = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i)){
                case '0':
                    kq.append('0');
                    break;
                case '1':
                    kq.append('1');
                    break;
                case '8':
                    kq.append('0');
                    break;
                 case '9':
                    kq.append('0');
                    break;
                 default:
                     return "INVALID";
            }
        }
        long n = Long.parseLong(kq.toString());
        if(n == 0) return "INVALID";
        return String.valueOf(n);
    }
}
