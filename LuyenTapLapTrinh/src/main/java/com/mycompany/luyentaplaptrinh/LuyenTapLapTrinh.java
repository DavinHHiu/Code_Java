/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.luyentaplaptrinh;
import java.util.*;
import java.io.*;

public class LuyenTapLapTrinh 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList <SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            String ten = sc.nextLine();
            int a, b;
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            SinhVien tmp = new SinhVien(ten, a, b);
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(SinhVien x : ds)
            System.out.println(x);
    }
}
