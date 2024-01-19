/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangluongtheophongban;
import java.util.*;

public class BangLuongTheoPhongBan 
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
            NhanVien tmp = new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            ds.add(tmp);
        }
        String maPhongBan = sc.nextLine();
        System.out.println("Bang luong phong "+PhongBan.getInfo(maPhongBan)+":");
        for(NhanVien x : ds)
            if(x.check(maPhongBan)) System.out.println(x);
    }
}
