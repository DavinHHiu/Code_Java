/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hauto;
import java.util.*;

public class HauTo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            System.out.println(tinh(s));
        }
    }
    
    public static long tinh(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        Stack <Long> stack = new Stack <>();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/") || t.equals("^") || t.equals("%"))
            {
                long a = stack.pop(), b = stack.pop();
                long tmp = 0;
                switch(t)
                {
                    case "+" : tmp = b + a; break;
                    case "-" : tmp = b - a; break;
                    case "*" : tmp = b * a; break;
                    case "/" : tmp = b / a; break;
                    case "^" : tmp = (long)Math.pow(b, a); break;
                    case "%" : tmp = b % a; break;
                }
                stack.push(tmp);
            } else 
                stack.push(Long.parseLong(t));
        }
        return stack.peek();
    }
}
