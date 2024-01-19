/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachluutru;
import java.util.*;
import java.io.*;
import java.text.*;

public class DanhSachLuuTru
{
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList <Khach> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            Khach tmp = new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(Khach x : ds) System.out.println(x);
    }
}
