/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhluong;
import java.util.*;

public class TinhLuong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <NhanVien> ds = new ArrayList <>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            PhongBan.setPhongBan(sc.next(), sc.nextLine().trim());
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++)
        {
            NhanVien tmp = new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long .parseLong(sc.nextLine()));
            ds.add(tmp);
        }
        for(NhanVien x : ds) System.out.println(x);
    }
}
