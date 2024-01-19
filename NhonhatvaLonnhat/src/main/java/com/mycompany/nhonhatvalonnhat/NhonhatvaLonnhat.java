/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nhonhatvalonnhat;

import java.util.*;
import java.math.*;

public class NhonhatvaLonnhat 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            TreeSet <BigInteger> set = new TreeSet<>();
            if(n == 0) break;
            while(n-- > 0)
            {
                BigInteger x = sc.nextBigInteger();
                set.add(x);
            }
            if(set.size() == 1){
                System.out.println("BANG NHAU");
                set.clear();
                continue;
            } else {
                System.out.print(set.first() + " " + set.last());
                System.out.println("");
                set.clear();
            }
        }
    }
}
