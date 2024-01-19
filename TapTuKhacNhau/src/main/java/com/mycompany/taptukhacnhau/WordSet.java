/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taptukhacnhau;
import java.util.*;

public class WordSet {
    private String xau;
    TreeSet <String> set = new TreeSet<>();
    
    public WordSet(String s)
    {
        this.xau = chuanHoa(s);
        StringTokenizer st = new StringTokenizer(this.xau);
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            this.set.add(t);
        }
    }
    
    public String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            for(int i = 0; i < t.length(); i++)
                kq.append(Character.toLowerCase(t.charAt(i)));
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    public String union(WordSet o)
    {
        TreeSet <String> s = new TreeSet<>();
        StringBuilder ans = new StringBuilder();
        for(String x : o.set)
        {
            s.add(x);
        }
        for(String x : this.set)
        {
            s.add(x);
        }
        for(String x : s)
        {
            ans.append(x + " ");
        }
        return ans.toString().trim();
    }
    
    public String intersection(WordSet o)
    {
        TreeSet <String> s = new TreeSet<>();
        StringBuilder ans = new StringBuilder();
        for(String x : o.set)
        {
            if(this.set.contains(x)) ans.append(x + " ");
        }
        return ans.toString().trim();
    }
}
