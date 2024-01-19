/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boisonhonhatcuansonguyenduongdautien;

import java.util.*;
import java.math.*;

public class BoiSoNhoNhatCuaNsoNguyenDuongDauTien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            BigInteger n = sc.nextBigInteger();
            BigInteger i = new BigInteger("1");
            BigInteger j = new BigInteger("1");
            BigInteger ans = lcm(i, n);
            while(true){
                if(i.compareTo(n) == 1) break;
                ans = lcm(i, ans);
                i = i.add(j);
            }
            System.out.println(ans);
        }
    }
    
    public static BigInteger lcm(BigInteger a, BigInteger b)
    {
        return a.multiply(b).divide(a.gcd(b));
    }
}
