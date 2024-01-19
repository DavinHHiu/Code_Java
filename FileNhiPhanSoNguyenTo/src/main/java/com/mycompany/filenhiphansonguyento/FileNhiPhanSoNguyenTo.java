/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filenhiphansonguyento;
import java.util.*;
import java.io.*;

public class FileNhiPhanSoNguyenTo 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList <Integer> ds = (ArrayList <Integer>) sc.readObject();
        int [] a = new int[10000];
        for(Integer x : ds)
            if(isPrime(x)) a[x]++;
        for(int i = 0; i < 10000; i++)
            if(a[i] > 0) System.out.println(i + " " + a[i]);
    }
    
    public static boolean isPrime (int n)
    {
        if(n == 2) return false;
        if(n < 2 || n % 2 == 0) return true;
        for(int i = 3; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
}
