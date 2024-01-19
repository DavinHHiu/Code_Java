/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filetinhtong;
import java.util.*;
import java.io.*;

public class FileTinhTong {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans  = 0;
        while(sc.hasNext())
        {
            String tmp = sc.next();
            try{
                ans = ans + Integer.parseInt(tmp);
            }
            catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(ans);
    }
}
