/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.duaxedap;
import java.util.*;
import java.text.*;

public class DuaXeDap 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <VanDongVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            VanDongVien tmp = new VanDongVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(VanDongVien x : ds) System.out.println(x);
    }
}
