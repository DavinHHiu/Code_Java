/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daotu;
import java.util.*;

public class DaoTu
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(daotu(s));
        }
    }
    
    public static String daotu(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens())
        {
            StringBuilder tmp = new StringBuilder();
            tmp.append(st.nextToken());
            kq.append(tmp.reverse());
            kq.append(" ");
        }
        return kq.toString();
    }
}
