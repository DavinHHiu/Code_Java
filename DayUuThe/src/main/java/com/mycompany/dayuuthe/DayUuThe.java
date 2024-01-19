/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dayuuthe;
import java.util.*;

public class DayUuThe 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            if(check(sc.nextLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int chan = 0, le = 0, len = 0;
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            char c = t.charAt(t.length() - 1);
            if(c == '1' || c == '3' || c == '5' || c == '7' || c == '9') ++le;
            else ++chan;
            ++len;
        }
        if(len % 2 == 0 && chan > le) return true;
        if(len % 2 == 1 && chan < le) return true;
        return false;
    }
}
