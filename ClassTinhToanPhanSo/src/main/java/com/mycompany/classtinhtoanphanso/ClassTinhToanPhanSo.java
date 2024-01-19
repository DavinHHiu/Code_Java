/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classtinhtoanphanso;
import java.util.*;

public class ClassTinhToanPhanSo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo C = A.cong(B);
            C = C.nhan(C);
            PhanSo D = A.nhan(B).nhan(C);
            System.out.println(C + " " + D);
        }
    }
}
