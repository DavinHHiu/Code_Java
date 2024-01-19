/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.diachiemail;

import java.util.*;

public class DiaChiEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        Map <String, Integer> map = new HashMap<>();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            String ch = chuanHoa(s);
            if(map.containsKey(ch)){
                int tmp = map.get(ch); 
                map.put(ch, tmp + 1);
            }
            else map.put(ch, 1);
            System.out.print(ch);
            if(map.get(ch) > 1) System.out.print(map.get(ch));
            System.out.println("@ptit.edu.vn");
        }
    }
    
    public static String chuanHoa(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken();
            if(!st.hasMoreTokens()){
                StringBuilder ten = new StringBuilder();
                for(int i = 0; i < t.length(); i++)
                    ten.append(Character.toLowerCase(t.charAt(i)));
                kq.insert(0, ten);
                break;
            }
            kq.append(Character.toLowerCase(t.charAt(0)));
        }
        return kq.toString() ;
    }
}
