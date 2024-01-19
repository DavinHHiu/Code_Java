/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangketienluong;
import java.util.*;

public class BangKeTienLuong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <NhanVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        long tong = 0;
        for(int i = 1; i <= n; i++)
        {
            NhanVien tmp = new NhanVien(i, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            ds.add(tmp);
        }
        for(NhanVien x : ds)
        {
            System.out.println(x);
            tong += x.getThucLinh();
        }
        System.out.println("Tong chi phi tien luong: "+tong+"");
    }
}
