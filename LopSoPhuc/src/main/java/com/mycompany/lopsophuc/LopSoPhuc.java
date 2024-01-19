/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lopsophuc;
import java.util.*;

public class LopSoPhuc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C = A.congSoPhuc(B).nhanSoPhuc(A);
            SoPhuc D = A.congSoPhuc(B);
            D = D.nhanSoPhuc(D);
            System.out.println(C + ", " + D);
        }
    }
}
