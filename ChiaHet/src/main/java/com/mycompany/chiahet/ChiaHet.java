/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chiahet;
import java.util.*;
import java.math.*;

public class ChiaHet
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(check(a, b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(BigInteger a, BigInteger b)
    {
        BigInteger c;
        if(a.compareTo(b) == 1) {
            c = a.divide(b);
            if(c.multiply(b).compareTo(a) == 0) return true;
            return false;
        }
        else {
            c = b.divide(a);
            if(c.multiply(a).compareTo(b) == 0) return true;
            return false;
        }
    }
}
