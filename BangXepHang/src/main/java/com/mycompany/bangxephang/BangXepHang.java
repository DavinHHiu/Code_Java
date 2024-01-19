/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangxephang;
import java.util.*;

public class BangXepHang 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            SinhVien tmp = new SinhVien(sc.nextLine(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            sc.nextLine();  
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(SinhVien x : ds) System.out.println(x);
    }
}
