/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dienthoaicucgach;

import java.util.*;

public class DienThoaiCucGach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            System.out.println(dienThoai(sc.nextLine()));
        }
    }
    
     public static String dienThoai(String s)
    {
        StringBuilder kq = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char tmp = Character.toUpperCase(s.charAt(i));
            if(tmp == 'A' || tmp == 'B' || tmp == 'C') kq.append('2');
            else if(tmp == 'D' || tmp == 'E' || tmp == 'F') kq.append('3');      
            else if(tmp == 'G' || tmp == 'H' || tmp == 'I') kq.append('4');   
            else if(tmp == 'J' || tmp == 'K' || tmp == 'L') kq.append('5');   
            else if(tmp == 'M' || tmp == 'N' || tmp == 'O') kq.append('6');     
            else if(tmp == 'P' || tmp == 'Q' || tmp == 'R' || tmp == 'S') kq.append('7');     
            else if(tmp == 'T' || tmp == 'U' || tmp == 'V') kq.append('8');   
            else if(tmp == 'W' || tmp == 'X' || tmp == 'Y' || tmp == 'Z') kq.append('9'); 
        }
        for(int i = 0; i <= kq.length() / 2; i++)
            if(kq.charAt(i) != kq.charAt(kq.length() - i - 1)) return "NO";
        return "YES";
    }
}
     

    

