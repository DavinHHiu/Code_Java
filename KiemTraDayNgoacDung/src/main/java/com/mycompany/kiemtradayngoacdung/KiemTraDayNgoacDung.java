/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kiemtradayngoacdung;
import java.util.*;

public class KiemTraDayNgoacDung 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            if(check(sc.nextLine())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s)
    {
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') st.push(c);
            else if(!st.isEmpty() && c == ')' && st.peek() == '(') st.pop();
            else if(!st.isEmpty() && c == ']' && st.peek() == '[') st.pop();
            else if(!st.isEmpty() && c == '}' && st.peek() == '{') st.pop();
            else return false;
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
