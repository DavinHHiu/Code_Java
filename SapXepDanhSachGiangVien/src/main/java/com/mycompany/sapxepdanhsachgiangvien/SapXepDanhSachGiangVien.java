/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepdanhsachgiangvien;
import java.util.*;

public class SapXepDanhSachGiangVien 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        ArrayList <GiangVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            GiangVien tmp = new GiangVien(i, sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(GiangVien x : ds) System.out.println(x);
    }
}
