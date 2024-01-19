/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepmatran;
import java.util.*;
import java.io.*;

public class SapXepMaTran
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            ArrayList <Integer> ds = new ArrayList <>();
            int [][] a = new int[n][m];
            for(int i = 0 ; i < n; i++){
                for (int j = 0; j < m; j++){
                    a[i][j] = Integer.parseInt(sc.next());
                    if(j == k - 1) ds.add(a[i][j]);
                }
            }
            Collections.sort(ds);
            for(int i = 0 ; i < n; i++){
                for (int j = 0; j < m; j++){
                    if(j == k - 1) System.out.print(ds.get(i) + " ");
                    else System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
