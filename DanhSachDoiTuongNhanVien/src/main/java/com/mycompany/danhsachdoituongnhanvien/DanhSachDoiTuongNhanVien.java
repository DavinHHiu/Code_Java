/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachdoituongnhanvien;
import java.util.*;

public class DanhSachDoiTuongNhanVien 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            NhanVien tmp = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        for(NhanVien x : ds){
            System.out.println(x);
        }
    }
}
