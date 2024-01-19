/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietkesinhvientheolop;
import java.util.*;

public class LietKeSinhVienTheoLop 
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
            String truyVan = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+truyVan+":");
            for(SinhVien x : ds)
                if(x.getLop().equals(truyVan)) System.out.println(x);
        }
    }
}
