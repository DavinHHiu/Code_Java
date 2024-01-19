/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dientichtamgiac;
import java.util.*;

public class DienTichTamGiac 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Triangle ABC = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()) ,new Point(sc.nextDouble(), sc.nextDouble()));
            if(ABC.check()) System.out.println(String.format("%.2f", ABC.tinhDienTich()));
            else System.out.println("INVALID");
        }
    }
}
