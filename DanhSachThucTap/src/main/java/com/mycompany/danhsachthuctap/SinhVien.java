package com.mycompany.danhsachthuctap;
import java.util.*;

public class SinhVien implements Comparable <SinhVien>
{
    private String ma, ten, lop, email;

    public SinhVien(String ma, String ten, String lop, String email)
    {
        this.ma = ma;
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }    
    
    public SinhVien(String ma, String xau)
    {
        this.ma = ma;
        StringTokenizer st = new StringTokenizer(xau);
        StringBuilder ten = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(!st.hasMoreTokens())
            {
                this.email = t;
                break;
            }
            ten.append(t + " ");
        }
        this.ten = ten.toString().trim();
    } 

    private String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken().toLowerCase();
            ans.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                ans.append(t.charAt(i));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    
    public String getMa()
    {
        return this.ma;
    }
    
    public String getInfo(String ma)
    {
        return this.ten + " " + this.lop;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + this.lop;
    }
    
    public int compareTo(SinhVien o)
    {
        if(this.ma.compareTo(o.ma) < 0) return -1;
        if(this.ma.compareTo(o.ma) > 0) return 1;
        return 0;
    }
}
