/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nhapxuathang;
import java.util.*;

public class NhapXuatHang 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <MatHang> ds1 = new ArrayList <>();
        ArrayList <ThongKe> ds2 = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            MatHang tmp = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds1.add(tmp);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++)
        {
            String ma = sc.next();
            for(MatHang x : ds1) 
                if(x.getMa().equals(ma)) 
                {
                    ThongKe tmp = new ThongKe(x, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
                    ds2.add(tmp);
                    break;
                }
        }
        for(ThongKe x : ds2) System.out.println(x);
    }
}
