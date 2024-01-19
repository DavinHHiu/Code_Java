/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhtongcacchuso;

import java.util.*;

public class TinhTongCacChuSo
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)
        {
            int sum = 0, index = 0;
            String s = sc.nextLine(), str [] = new String[s.length()];
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) <= '9' && s.charAt(i) >= '0') sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                else{
                    str[index] = Character.toString(s.charAt(i));
                    ++index;
                }
            }
            for(int i = 0; i < index - 1; i++){
                for(int j = i + 1; j < index; j++){
                    if(str[i].compareTo(str[j]) > 0){
                        String tmp = str[i];
                        str[i] = str[j];
                        str[j] = tmp;
                    }
                }
            }
             for(int i = 0; i < index; i++){
                 System.out.print(str[i]);
             }
            System.out.println(sum);
        } 
    }
}
