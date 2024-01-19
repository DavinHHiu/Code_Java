/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filesokhacnhau2;
import java.util.*;
import java.io.*;

public class FileSoKhacNhau2 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        InputStream is = new FileInputStream("DATA.IN");
        int [] a = new int[100000];
        int i = -1;
        while((i = is.read()) != -1)
        {
            a[is.read()]++;
        }
        for(int j = 0; j < 100000; j++)
            System.out.println(j + " " + a[j]);
    }
}
