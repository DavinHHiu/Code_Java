/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tongchuso;
import java.util.*;
import java.io.*;

public class TongChuSo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> a = (ArrayList <String>) sc.readObject();
        for(String x : a)
        {   
            process(x);
        }
    }
    
    public static void process(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(sb.length() == 0 && s.charAt(i) == '0') continue;
            if(Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
        }
        long sum = 0;
        for(int i =0; i < sb.length(); i++)
            sum += Long.parseLong(sb.charAt(i) + "");
        System.out.println(sb + " " + sum);
    }
}
