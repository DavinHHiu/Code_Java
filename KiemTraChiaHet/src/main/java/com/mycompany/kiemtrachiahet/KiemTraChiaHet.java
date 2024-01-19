/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kiemtrachiahet;
import java.util.*;
import java.math.*;
import java.io.*;

public class KiemTraChiaHet
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("7");
            BigInteger c = new BigInteger("13");
            BigInteger d = new BigInteger("0");
            if(a.mod(b).equals(d) && a.mod(c).equals(d)) System.out.println("Both");
            else if(a.mod(b).equals(d) && !a.mod(c).equals(d)) System.out.println("Div 7");
            else if(a.mod(c).equals(d) && !a.mod(b).equals(d)) System.out.println("Div 13");
            else System.out.println("None");
        }
    }
}
