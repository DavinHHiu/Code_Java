/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;
import java.util.*;
import java.math.*;
import java.io.*;

public class Test 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SONNGUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            BigInteger n = sc.nextBigInteger();
            StringBuilder rev = new StringBuilder();
            rev.append(n.toString());
            BigInteger m = new BigInteger(rev.reverse().toString());
            BigInteger GCD = n.gcd(m);
            System.out.println(m + "\n" + GCD + "\n" + n.multiply(m).divide(GCD));
        }
        
    }
    
    
}
