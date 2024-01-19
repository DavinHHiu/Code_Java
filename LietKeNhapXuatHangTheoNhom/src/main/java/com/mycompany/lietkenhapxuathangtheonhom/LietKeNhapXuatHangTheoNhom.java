/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietkenhapxuathangtheonhom;
import java.util.*;

public class LietKeNhapXuatHangTheoNhom
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Hang> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            Hang tmp = new Hang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        String q = sc.next();
        for(Hang x : ds)
            if(x.getMa() == q.charAt(0)) System.out.println(x);
    }
}
