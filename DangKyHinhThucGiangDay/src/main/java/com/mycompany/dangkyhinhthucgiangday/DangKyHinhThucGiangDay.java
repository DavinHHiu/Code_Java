/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dangkyhinhthucgiangday;
import java.util.*;
import java.io.*;

public class DangKyHinhThucGiangDay
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList <MonHoc> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            MonHoc tmp = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(MonHoc x : ds) 
            if(!x.getHinhThucDayTH().equals("Truc tiep"))
                System.out.println(x);
    }
}
