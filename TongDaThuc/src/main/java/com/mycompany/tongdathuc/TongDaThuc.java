/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tongdathuc;
import java.util.*;

public class TongDaThuc
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            while(t-->0){
                DaThuc p = new DaThuc(sc.nextLine());
                DaThuc q = new DaThuc(sc.nextLine());
                DaThuc r = p.cong(q);
                System.out.println(r);
            }
    }
}
