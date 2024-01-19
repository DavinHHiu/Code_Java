/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrannhiphan;
import java.util.*;

public class MaTranNhiPhan
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), soMot = 0;
        int [][] a = new int[n + 1][3];
        for(int i = 0; i < n; i++){
             int count = 0;
             for(int j = 0; j < 3; j++){
                 a[i][j] = sc.nextInt();
                 if(a[i][j] == 1) ++count; 
             }
      
             if(count >= 2) ++soMot;
         }
        System.out.println(soMot);
        }
}
