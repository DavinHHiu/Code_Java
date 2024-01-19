/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trenhatgianhat;
import java.util.*;
import java.text.*;

public class TreNhatGiaNhat 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Nguoi> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            Nguoi tmp = new Nguoi(sc.next(), sc.next());
            ds.add(tmp);
        }
        Collections.sort(ds);
        System.out.println(ds.get(0) + "\n" + ds.get(n - 1));
    }
}
