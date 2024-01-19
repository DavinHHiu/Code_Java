/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tichhaidoituongmatran;
import java.util.*;

public class TichHaiDoiTuongMaTran
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        System.out.println(a);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
                System.out.println(b);
        System.out.println(a.mul(b));
    }
}
