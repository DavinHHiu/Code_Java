/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hieusonguyenlon2;

import java.util.*;
import java.math.*;

public class HieuSoNguyenLon2 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger hieu = a.subtract(b);
        System.out.println(hieu);
    }
}
