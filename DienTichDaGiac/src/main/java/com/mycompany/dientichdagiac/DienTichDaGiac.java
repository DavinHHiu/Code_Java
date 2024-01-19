/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dientichdagiac;
import java.util.*;

public class DienTichDaGiac 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.nextLine());
            DaGiac dg = new DaGiac(sc, n);
            System.out.println(String.format("%.3f", dg.tinhDienTich()));
//            sc.next();
        }
    }
}
