/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filedanhsachsinhvien1;
import java.util.*;
import java.io.*;

public class FileDanhSachSinhVien1 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList <SinhVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(SinhVien x : ds) System.out.println(x);
    }
}
