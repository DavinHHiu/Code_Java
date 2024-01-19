/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filedanhsachsinhvien2;
import java.util.*;
import java.text.*;
import java.io.*;

public class FileDanhSachSinhVien2 
{
    public static void main(String[] args) throws ParseException, FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList <SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            SinhVien tmp = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        for(SinhVien x : ds) System.out.println(x);
    }
}
