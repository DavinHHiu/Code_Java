/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filesokhonggiam;
import java.util.*;
import java.io.*;

public class FileSoKhongGiam
{
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds1 = (ArrayList<Integer>) sc1.readObject();
        ArrayList <Integer> ds2 = (ArrayList<Integer>) sc2.readObject();
        int [] a = new int[100000];
        int [] b = new int[100000];
        for(Integer x : ds1){
            if(check(x)) a[x]++;
        }
        for(Integer x : ds2){
            if(check(x)) b[x]++;
        }
        
        for(int i = 0; i < 100000; i++)
        {
            if(a[i] > 0 && b[i] > 0)
                System.out.println(i + " " + a[i] + " " + b[i]);
        }
    }
    
    public static boolean check(int n)
    {
        String tmp = String.valueOf(n);
        if(tmp.length() < 2) return false;
        for(int i = 0; i < tmp.length() - 1; i++)
            if(tmp.charAt(i) > tmp.charAt(i + 1)) return false;
        return true;
    }
}
