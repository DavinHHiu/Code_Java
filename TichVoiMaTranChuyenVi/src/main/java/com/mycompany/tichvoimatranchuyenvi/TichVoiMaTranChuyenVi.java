/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tichvoimatranchuyenvi;
import java.util.*;

public class TichVoiMaTranChuyenVi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), test = 1;
        while(t-->0)
        {
            int n = sc.nextInt(), m = sc.nextInt();
            int [][] a = new int [n][m];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < m; j++)
                    a[i][j] = sc.nextInt();
            System.out.println("Test "+test+":");
            tichMaTran(a, n, m);
            ++test;
        }   
    }
    
    public static void tichMaTran(int [][] a, int n, int m)
    {
        int [][] c = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++)
                    c[i][j] += a[i][k] * a[j][k];
            }
        inMaTran(c, n);
    }
    
    public static void inMaTran(int [][] c, int n)
    {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
