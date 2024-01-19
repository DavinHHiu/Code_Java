/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sothuannghichtrongfile;
import java.util.*;
import java.io.*;

public class SoThuanNghichTrongFile
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds1 = (ArrayList <Integer>) sc1.readObject();
        ArrayList <Integer> ds2 = (ArrayList <Integer>) sc2.readObject();
        int [] tanSo1 = new int[1000005];
        int [] tanSo2 = new int[1000005];
        for(Integer x : ds1)
            tanSo1[x]++;
        for(Integer x : ds2)
            tanSo2[x]++;
        int in = 10;
        for(int i = 0; i <= 1000000; i++)
        {
            if(in == 0) break;
            if(isTN(i) && tanSo1[i] != 0 && tanSo2[i] != 0)
            {
                System.out.println(i + " " +(tanSo1[i] + tanSo2[i]));
                in--;
            }
        }
    }
    
    public static boolean isTN(Integer n)
    {
        String s = n.toString();
        if(s.length() <= 1 || s.length() % 2 == 0) return false;
        for(int i = 0; i <= s.length() / 2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
            if((s.charAt(i) - '0') % 2 == 0) return false;
        }
        return true;
    }
}
