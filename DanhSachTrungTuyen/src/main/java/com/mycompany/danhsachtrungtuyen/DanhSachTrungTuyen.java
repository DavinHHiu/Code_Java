/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachtrungtuyen;
import java.util.*;
import java.io.*;

public class DanhSachTrungTuyen 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList <ThiSinh> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            ThiSinh tmp = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(ds);
        double max = ds.get(chiTieu - 1).getTong();
        System.out.println(String.format("%.1f", max));
        for(ThiSinh x : ds)
        {
            x.setTrangThai(max);
            System.out.println(x);
        }
    }
}
