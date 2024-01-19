/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.thietlapdiachiemail2;
import java.util.*;
import java.io.*;

public class ThietLapDiaChiEmail2 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Set <String> set = new LinkedHashSet<>();
        Map <String, Integer> map = new LinkedHashMap <>();
        while(sc.hasNext()) set.add(chuanHoa(sc.nextLine()));
        for(String x : set)
        {
            String tmp = transToEmail(x);
            if(!map.containsKey(tmp)) map.put(tmp, 1);
            else map.put(tmp, map.get(tmp) + 1);
            if(map.get(tmp) == 1) System.out.println(tmp + "@ptit.edu.vn");
            else System.out.println(tmp + map.get(tmp) + "@ptit.edu.vn");
        }
    }
    
    public static String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            ans.append(st.nextToken().toLowerCase());
            ans.append(" ");
        }
        return ans.toString();
    }
    
    public static String transToEmail(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(!st.hasMoreTokens())
            {
                ans.insert(0, t);
                break;
            }
            ans.append(t.charAt(0));
       
        }
        return ans.toString();
    }
}
