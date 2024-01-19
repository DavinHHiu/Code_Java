/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lophocphan2;
import java.util.*;

public class LopHocPhan2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <MonHoc> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            MonHoc tmp = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());
        while(m-->0)
        {
            String t = sc.nextLine();
            System.out.println("Danh sach cho giang vien "+t+":");
            for(MonHoc x : ds) if(x.getTenGV().equals(t)) System.out.println(x);
        }
    }
}
