/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhtongsolong;
import java.util.*;
import java.io.*;

public class TinhTongSoLong
{

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String tmp = sc.next();
            try{
                int x = Integer.parseInt(tmp);
            }
            catch(NumberFormatException e){
                try{
                   sum += Long.parseLong(tmp);
                }
                catch(NumberFormatException ex){
                    continue;
                }
            }
        }
        System.out.print(sum);
    }
}
