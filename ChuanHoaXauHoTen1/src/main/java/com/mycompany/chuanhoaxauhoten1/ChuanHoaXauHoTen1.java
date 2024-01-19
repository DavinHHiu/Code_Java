/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chuanhoaxauhoten1;
import java.util.*;

public class ChuanHoaXauHoTen1
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
    public static String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++) 
                kq.append(Character.toLowerCase(t.charAt(i)));
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
