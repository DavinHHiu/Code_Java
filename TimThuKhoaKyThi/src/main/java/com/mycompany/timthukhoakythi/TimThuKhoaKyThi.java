/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.timthukhoakythi;
import java.util.*;

public class TimThuKhoaKyThi 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <ThiSinh> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        double max = 0;
        for(int i = 1; i <= n; i++)
        {
            ThiSinh tmp = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            max = Math.max(max, tmp.getTong());
            ds.add(tmp);
        }
        for(ThiSinh x : ds) 
            if(x.getTong() == max) System.out.println(x);
    }
}
