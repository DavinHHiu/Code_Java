/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.so0vaso9;
import java.util.*;

public class So0vaSo9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Queue <Integer> q = new LinkedList<>();
        ArrayList <Integer> a = new ArrayList <>();
        //Khoi tao
        q.add(9); a.add(9);
        while(true)
        {
            Integer t = q.poll();
            if(t.toString().length() > 9) break;
            q.add(t * 10); a.add(t * 10);
            q.add(t * 10 + 9); a.add(t * 10 + 9);
        }
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            for(int i = 0; i < a.size(); i++)
            {
                if(a.get(i) % n == 0) {
                    System.out.println(a.get(i));
                    break;
                }
            }
        }
    }
}
