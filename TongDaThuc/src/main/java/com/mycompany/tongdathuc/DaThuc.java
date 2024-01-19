/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tongdathuc;
import java.util.*;

public class DaThuc 
{
    private long [] e = new long [10005];
    
    public DaThuc(){}
    
    public DaThuc(String s)
    {
        StringTokenizer st = new StringTokenizer(s, " +");
        while(st.hasMoreTokens())
        {
             StringTokenizer sr = new StringTokenizer(st.nextToken(), "*x^");
             long heSo = Long.parseLong(sr.nextToken());
             long soMu = Long.parseLong(sr.nextToken());
             this.e[(int)soMu] = heSo;
        }
    }
    
    public DaThuc cong(DaThuc o)
    {
        DaThuc tong = new DaThuc();
        for(int i = 0; i < 10001; i++)
            tong.e[i] = this.e[i] + o.e[i];
        return tong;
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for(int i = 10000; i >= 0; i--)
        {
            if(this.e[i] != 0) 
            {   
                out.append(""+this.e[i]+"*x^"+i+"");
                out.append(" + ");
            }
        }
        return out.delete(out.length() - 3, out.length()).toString();
    }
}
