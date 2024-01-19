/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dayngoacdungdainhat;
import java.util.*;

public class DayNgoacDungDaiNhat
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            System.out.println(check(sc.nextLine()));
        }
    }
    
    public static int check(String s)
    {
        int res = 0;
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == ')'){
                st.pop();
                if(!st.isEmpty())
                    res = Math.max(res, i - st.peek());
                if(st.isEmpty()) st.push(i);
            } else st.push(i);
        }
        return res;
    }
}
