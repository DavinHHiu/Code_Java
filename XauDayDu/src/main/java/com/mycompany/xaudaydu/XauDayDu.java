/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xaudaydu;
import java.util.*;

public class XauDayDu 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int [] ok = new int [125];
            String s = sc.nextLine();
            if(s.length() < 26)
            {
                System.out.println("NO"); continue;
            }
            int k = Integer.parseInt(sc.nextLine()), cnt = 0;
            for(int i = 0; i < s.length(); i++)
                for(int j = 'a'; j <= 'z'; j++)
                    if(s.charAt(i) == (char)j) ok[j] = 1;
            for(int j = 'a'; j <= 'z'; j++) 
                if(ok[j] == 0) cnt++;
            if(cnt <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
