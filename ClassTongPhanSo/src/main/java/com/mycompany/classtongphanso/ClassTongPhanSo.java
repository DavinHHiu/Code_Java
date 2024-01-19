/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classtongphanso;
import java.util.*;

public class ClassTongPhanSo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextInt(), sc.nextInt());
        PhanSo y = new PhanSo(sc.nextInt(), sc.nextInt());
        System.out.print(x.cong(y));
    }
}
