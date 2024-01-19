/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhdiemtrungbinh;
import java.util.*;
import java.io.*;

public class TinhDiemTrungBinh
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList <SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            SinhVien tmp = new SinhVien(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        ds.get(0).setRank(1);
        for(int i = 1; i < n; i++)
            if(ds.get(i).getTB() == ds.get(i - 1).getTB()) ds.get(i).setRank(i);
            else ds.get(i).setRank(i + 1);
        for(SinhVien x : ds) System.out.println(x);
    }
}
