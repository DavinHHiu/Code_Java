/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.solama;
import java.util.*;

public class SoLaMa
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            int thapPhan = 0;
            for(int i = s.length() - 2; i >= 0; i--)
            {
                if(trans(s.charAt(i)) < trans(s.charAt(i + 1))) 
                    thapPhan -= trans(s.charAt(i));
                else thapPhan += trans(s.charAt(i));
            }
            System.out.println(thapPhan + trans(s.charAt(s.length() - 1)));
        }
    }
    
    public static int trans(char c)
    {
        if(c == 'I') return 1;
        else if(c == 'V') return 5;
        else if(c == 'X') return 10;
        else if(c == 'L') return 50;
        else if(c == 'C') return 100;
        else if(c == 'D') return 500;
        return 1000;
    }
}
