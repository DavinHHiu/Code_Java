/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fileloaibosonguyen;
import java.util.*;
import java.io.*;

public class FileLoaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList <String> list = new ArrayList <>();
        while(sc.hasNext())
        {
            String tmp = sc.next();
            try{
                int x = Integer.parseInt(tmp);
            }
            catch(NumberFormatException e){
                list.add(tmp);
            }
        }
        Collections.sort(list);
        for(String x : list)
            System.out.print(x + " ");
    }
}
