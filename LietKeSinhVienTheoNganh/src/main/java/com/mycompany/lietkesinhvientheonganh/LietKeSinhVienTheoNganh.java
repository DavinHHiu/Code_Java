/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietkesinhvientheonganh;
import java.util.*;

public class LietKeSinhVienTheoNganh 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String truyVan = chuanHoa(sc.nextLine());
            System.out.println("DANH SACH SINH VIEN NGANH "+truyVan.toUpperCase()+":");
            for(SinhVien x : ds) {
                if(x.getNganh().equals(truyVan)) System.out.println(x);}
        }
    }
    
    public static String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            ans.append(t.toLowerCase());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
