/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachgiangvientheobomon;
import java.util.*;

public class DanhSachGiangVienTheoBoMon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <GiangVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n ; i++)
        {
            GiangVien tmp = new GiangVien(i, sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String truyVan = vietTat(sc.nextLine());
            System.out.println("DANH SACH GIANG VIEN BO MON "+truyVan+":");
            for(GiangVien x : ds)
                if(x.getMaBoMon().equals(truyVan)) System.out.println(x);
        }
    }
    
    public static String vietTat(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            ans.append(Character.toUpperCase(t.charAt(0)));
        }
        return ans.toString();
    }
}
