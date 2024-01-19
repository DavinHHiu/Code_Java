/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.capsonguyentotrongfile2;
import java.util.*;
import java.io.*;
public class CapSoNguyenToTrongFile2 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds1 = (ArrayList <Integer>) sc1.readObject();
        ArrayList <Integer> ds2 = (ArrayList <Integer>) sc2.readObject();
        TreeSet <Integer> set = new TreeSet <>();
        for(Integer x : ds1){
            if(isPrime(x) && ds1.contains(1000000 - x) && isPrime(1000000 - x) && x < 1000000 - x  && !ds2.contains(x) && !ds2.contains(1000000 - x))
                set.add(x);
        }
        for(Integer x : set) System.out.println(x + " " + (1000000 - x));
    }
    
    public static boolean isPrime(Integer n)
    {
        if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2)
            if(n % i == 0) return false;
        return true;
    }
}
