/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filehello;
import java.util.*;
import java.io.*;

public class FIleHello {

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNext())
        {
            String tmp = sc.nextLine();
            System.out.println(tmp);
        }
    }
}
