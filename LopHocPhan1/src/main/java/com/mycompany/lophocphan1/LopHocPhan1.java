/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lophocphan1;
import java.util.*;

public class LopHocPhan1 
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
        for(int i = 0; i < m; i++)
        {
            String t = sc.nextLine();
            int in = 1;
            System.out.print("Danh sach nhom lop mon ");
            for(MonHoc x : ds) 
            {
               
                if(x.getMa().equals(t))
                {
                    while(in-->0) System.out.println(""+x.getTen()+":");
                    System.out.println(x);
                }
            }
        }
    }
}
