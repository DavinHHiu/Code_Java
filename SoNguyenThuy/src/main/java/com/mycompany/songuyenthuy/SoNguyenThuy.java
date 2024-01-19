/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.songuyenthuy;
import java.util.*;

public class SoNguyenThuy 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt(), cnt = 0;
            Queue <String> q = new LinkedList <>();
            q.add("4"); 
            q.add("5"); 
            while(cnt < n)
            {
                String t = q.poll();
                System.out.print(t + reverse(t) + " "); ++cnt;
                q.add(t + "4");
                q.add(t + "5");
            }
            System.out.println();
        }
    }  
    
    public static String reverse(String s)
    {
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        return ans.reverse().toString();
    }
}
