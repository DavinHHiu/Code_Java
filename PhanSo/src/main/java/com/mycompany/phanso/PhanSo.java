/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phanso;

import java.util.Scanner;

public class PhanSo {
    
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        LopPhanSo ps = new LopPhanSo(sc.nextLong(), sc.nextLong());
        ps.rutGon();
        System.out.print(ps);
    }
    
}
