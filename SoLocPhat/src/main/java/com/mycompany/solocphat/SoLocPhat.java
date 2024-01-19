/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.solocphat;
import java.util.*;

public class SoLocPhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            ArrayList <String> a = new ArrayList<>();
            int n = Integer.parseInt(sc.nextLine());
            locPhat(n, a);
            System.out.println(a.size());
            for(int i = a.size() - 1; i >= 0; i--)
                System.out.print(a.get(i) + " ");
            System.out.println();
        }
    }
    
    public static void locPhat(int n, ArrayList <String> a)
    {
       Queue <String> q = new LinkedList<>();
       q.offer("6"); a.add("6");
       q.offer("8"); a.add("8");
       while(true)
       {
           String t = q.poll(), c = t + "6";
           if(c.length() > n) break;
           q.offer(t + "6"); a.add(t + "6");
           q.offer(t + "8"); a.add(t + "8");
       }
    }
}
