/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chuanhoahoten;

import java.util.*;

public class ChuanHoaHoTen {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = Integer.parseInt(sc.nextLine());
       while(t-- > 0)
       {
           int n = Integer.parseInt(sc.nextLine());
           String s = sc.nextLine();
           if(n == 1) System.out.println(chuanHoa1(s));
           else System.out.println(chuanHoa2(s));
       }
    }   
    public static String chuanHoa1(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            if(!st.hasMoreTokens()){
                StringBuilder tmp = new StringBuilder();
                tmp.append(Character.toUpperCase(t.charAt(0)));
                for(int i = 1; i < t.length(); i++)
                    tmp.append(Character.toLowerCase(t.charAt(i)));
                tmp.append(" ");
                kq.insert(0, tmp);
                break;
            }
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                kq.append(Character.toLowerCase(t.charAt(i)));
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public static String chuanHoa2(String s){
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder(), Ho = new StringBuilder();
        if(st.hasMoreTokens()) {
            String ho = st.nextToken();
            Ho.append(Character.toUpperCase(ho.charAt(0)));
            for(int i = 1; i < ho.length(); i++) 
                Ho.append(Character.toLowerCase(ho.charAt(i)));
        }
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                kq.append(Character.toLowerCase(t.charAt(i)));
            kq.append(" ");
        }
        kq.append(Ho);
        return kq.toString().trim();
    }
}
