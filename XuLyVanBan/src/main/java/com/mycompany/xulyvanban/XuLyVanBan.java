/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xulyvanban;
import java.util.*;

public class XuLyVanBan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder vanBan = new StringBuilder();
        while(sc.hasNext())
        {
            vanBan.append(sc.nextLine());
        }
        System.out.println(xuLyVanBan(vanBan.toString()));
    }
    
    public static String chuanHoaCau(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        String t = st.nextToken().toLowerCase();
        ans.append(Character.toUpperCase(t.charAt(0)));
        for(int i = 1; i < t.length(); i++) 
            ans.append(t.charAt(i));
        ans.append(" ");
        while(st.hasMoreTokens())
        {
            ans.append(st.nextToken().toLowerCase());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    
    public static String xuLyVanBan(String s)
    {
        StringTokenizer st = new StringTokenizer(s, ".?!");
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            ans.append(chuanHoaCau(st.nextToken()));
            if(st.hasMoreTokens()) ans.append("\n");
        }
        return ans.toString();
    }
}
