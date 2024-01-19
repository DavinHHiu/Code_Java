/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangthunhapgiaovien;
import java.util.*;

public class BangThuNhapGiaoVien
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <GiaoVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine()), soHT = 0, soHP = 0;
        for(int i = 0; i < n; i++)
        {
            String ma = sc.nextLine();
            String chuc = ma.substring(0,2);
            if(chuc.equals("HT"))
            {
                if(soHT == 1) 
                {
                    sc.nextLine(); sc.nextLine();
                    continue;
                } else soHT++;
            }
            if(chuc.equals("HP"))
            {
                if(soHP == 2) 
                {
                    sc.nextLine(); sc.nextLine();
                    continue;
                } else soHP++;
            }
            GiaoVien tmp = new GiaoVien(ma, sc.nextLine(), Long.parseLong(sc.nextLine()));
            ds.add(tmp);
        }
        for(GiaoVien x : ds) System.out.println(x);
    }
}
