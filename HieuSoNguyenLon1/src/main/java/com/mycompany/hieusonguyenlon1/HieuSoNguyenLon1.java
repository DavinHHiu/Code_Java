/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hieusonguyenlon1;

import java.util.*;
import java.math.*;

public class HieuSoNguyenLon1
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- > 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger hieu = a.subtract(b).abs(), max = a.max(b);
            String ans = hieu.toString(), MAX = max.toString();
            int zero = MAX.length() - ans.length();
            while(zero-- > 0) System.out.print("0");
            System.out.println(ans);
        }
    }
}
