/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.songuyentotronghaifilenhiphan;
import java.util.*;
import java.io.*;

public class SoNguyenToTrongHaiFileNhiPhan 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds1 = (ArrayList <Integer>) sc1.readObject();
        ArrayList <Integer> ds2 = (ArrayList <Integer>) sc2.readObject();
        int fre1 [] = new int [10005], fre2 [] = new int [10005];
        for(Integer x : ds1) fre1[x]++;
        for(Integer x : ds2) fre2[x]++;
        for(int i = 2; i < 10000; i++)
            if(isPrime(i) && ds1.contains(i) && ds2.contains(i))
                System.out.println(i + " " + fre1[i] + " " + fre2[i]);
    }
    
    public static boolean isPrime(int n)
    {
        if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2)
            if(n % i == 0) return false;
        return true;
    }
}
