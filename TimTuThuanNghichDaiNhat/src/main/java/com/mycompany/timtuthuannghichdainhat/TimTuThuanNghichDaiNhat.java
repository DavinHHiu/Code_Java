/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.timtuthuannghichdainhat;
import java.util.*;

public class TimTuThuanNghichDaiNhat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Integer> map = new LinkedHashMap <>();
        int max = 0;
        while(sc.hasNext())
        {
            String tmp = sc.next();
            if(isTN(tmp))
            {
                max = Math.max(max, tmp.length());
           
                if(!map.containsKey(tmp)) map.put(tmp, 1);
                else map.put(tmp, map.get(tmp) + 1);
            }
        }
        Set <String> set = map.keySet();
        for(String x : set) 
            if(x.length() == max) System.out.println(x + " " + map.get(x));
    }
    
    public static boolean isTN(String s)
    {
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return true;
    }
}
