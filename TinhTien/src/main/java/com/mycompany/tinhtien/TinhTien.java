/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhtien;
import java.util.*;

public class TinhTien
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <MatHang> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            MatHang tmp = new MatHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(MatHang x : ds) System.out.println(x);
    }
}
