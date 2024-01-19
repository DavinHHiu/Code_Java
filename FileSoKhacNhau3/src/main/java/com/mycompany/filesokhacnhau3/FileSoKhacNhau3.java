/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filesokhacnhau3;
import java.util.*;
import java.io.*;

public class FileSoKhacNhau3 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> ds = (ArrayList <Integer>) sc.readObject();
        int [] a = new int[1000];
        for(Integer x : ds) a[x]++;
        for(int i = 0; i < 1000; i++)
            System.out.println(i + " " + a[i]);
    }
}
