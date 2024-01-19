/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diemtuyensinh;
import java.util.*;
import java.io.*;

public class DiemTuyenSinh 
{

    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList <ThiSinh> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            ThiSinh tmp = new ThiSinh(i, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(ThiSinh x : ds) System.out.println(x);
    }
}
