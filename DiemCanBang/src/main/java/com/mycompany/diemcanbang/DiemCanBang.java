/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diemcanbang;
import java.util.*;

public class DiemCanBang 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt(), sum = 0, sumleft = 0, found = 1;
            int [] a = new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            for(int i = 0; i < n; i++)
            {
                sumleft += a[i];
                if(sumleft * 2 - a[i] == sum){
                    System.out.println(i + 1);
                    found = 0;
                    break;
                }
            }
            if(found == 1) System.out.println(-1); 
        }
    }
}
