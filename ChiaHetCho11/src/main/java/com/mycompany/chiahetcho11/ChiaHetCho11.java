/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chiahetcho11;
import java.util.*;
import java.math.*;

public class ChiaHetCho11
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            BigInteger soBiChia = new BigInteger("11");
            BigInteger soChia = sc.nextBigInteger();
            BigInteger thuong = soChia.divide(soBiChia);
            if(thuong.multiply(soBiChia).compareTo(soChia) == 0)
                System.out.println(1);
            else System.out.println(0);
        }
    }
}
