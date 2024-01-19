/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chuanhoavasapxep;
import java.util.*;
import java.io.*;

public class ChuanHoaVaSapXep
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList <HoTen> ds = new ArrayList<>();
        while(sc.hasNext())
        {
            HoTen tmp = new HoTen(sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(HoTen x : ds) System.out.println(x);
    }
}
