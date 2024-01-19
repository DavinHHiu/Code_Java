/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boisochung_uocsochung;

import java.util.*;
import java.math.*;

public class Boisochung_Uocsochung 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger GCD = a.gcd(b);
            BigInteger LCM = a.multiply(b).divide(GCD);
            System.out.println(LCM + " " + GCD);
        }
    }
}
