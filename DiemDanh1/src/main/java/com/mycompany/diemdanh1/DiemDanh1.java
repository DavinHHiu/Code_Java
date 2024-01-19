/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diemdanh1;
import java.util.*;

public class DiemDanh1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <SinhVien> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        while(n-->0)
        {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String t = st.nextToken();
            for(SinhVien x : ds) if(x.getMa().equals(t)) x.setdiemCC(st.nextToken());
        }
        
        for(SinhVien x : ds) System.out.println(x);
    }
}
