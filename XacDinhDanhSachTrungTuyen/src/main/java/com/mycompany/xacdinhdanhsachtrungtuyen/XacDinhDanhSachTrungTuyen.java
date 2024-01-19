/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xacdinhdanhsachtrungtuyen;
import java.util.*;

public class XacDinhDanhSachTrungTuyen 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <ThiSinh> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            ThiSinh tmp = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());
        double diem = ds.get(m - 1).getTong();
        System.out.println(String.format("%.1f", diem));
        for(ThiSinh x : ds)
        {
            x.setTrangThai(diem);
            System.out.println(x);
        }
    }
}
