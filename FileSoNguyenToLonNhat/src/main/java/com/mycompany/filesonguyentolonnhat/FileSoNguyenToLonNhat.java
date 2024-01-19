/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filesonguyentolonnhat;
import java.util.*;
import java.io.*;

public class FileSoNguyenToLonNhat
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> ds = (ArrayList<Integer>) sc.readObject();
        int [] a = new int[1000005];
        int count = 0;
        for(Integer x :ds)
        {
            if(isPrime(x)) a[x]++;
        }
        for(int i = 1000000; i >= 0; i--)
            if(a[i] > 0){ 
                System.out.println(i + " " + a[i]);
                count++;
                if(count == 10) break;
            }
    }
    
    public static boolean isPrime (int n)
    {
        if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2)
            if(n % i == 0) return false;
        return true;
    }
}
