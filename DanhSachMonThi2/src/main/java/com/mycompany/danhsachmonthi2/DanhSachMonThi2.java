/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachmonthi2;
import java.util.*;
import java.io.*;

public class DanhSachMonThi2 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        TreeSet <MonThi> set = new TreeSet <>();
        while(sc.hasNext())
        {
            MonThi tmp = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            set.add(tmp);
        }
        for(MonThi x : set) 
            System.out.println(x);
    }
}
