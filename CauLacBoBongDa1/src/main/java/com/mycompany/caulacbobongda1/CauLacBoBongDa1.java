/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.caulacbobongda1;
import java.util.*;

public class CauLacBoBongDa1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <CLB> ds1 = new ArrayList <>();
        ArrayList <Tran> ds2 = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            CLB tmp = new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
           ds1.add(tmp);
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++)
        {
            String ma = sc.next();
            for(CLB x : ds1) 
                if(ma.substring(1, 3).equals(x.getMa())) 
                {
                    Tran tmp = new Tran(ma, Long.parseLong(sc.next()), x);
                    ds2.add(tmp);
                    break;
                }
        }
        for(Tran x : ds2) System.out.println(x); 
    }
}
