/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rutgonxaukytu;
import java.util.*;

public class RutGonXauKyTu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder t = new StringBuilder();
        String s = sc.nextLine();
        t.append(s);
        int i = 0;
        while(i < t.length() - 1)
        {
            if(t.charAt(i) == t.charAt(i + 1)) {
                t.delete(i, i + 2);
                if(i > 0) i -= 2;
                if(i == 0) continue;
            }
            i++;
        }
        if(t.isEmpty()) System.out.print("Empty String");
        else System.out.print(t);
    }
}
