/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phantichthuasonguyento;

import java.util.*;

public class PhanTichThuaSoNguyenTo
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), no = 1;
        while(t-- > 0)
        {
            int n = sc.nextInt();
            System.out.print("Test " + no + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                int count = 0;
                while(n % i == 0)
                {
                    n /= i; ++count;
                }
                if(count > 0) System.out.print(i + "(" + count + ") ");
            }
            if(n > 1) System.out.print(n + "(1)");
            System.out.println("");
            ++no;
        }
    }
}
