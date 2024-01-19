/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsothutucaccapdaungoac;
import java.util.*;

public class DanhSoThuTuCacCapDauNgoac
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            Stack <Integer> st = new Stack <>();
            int cnt = 1;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '(')
                {
                    st.add(cnt);
                    System.out.print(cnt + " ");
                    ++cnt;
                }
                else if(s.charAt(i) == ')')
                {
                    System.out.print(st.peek() + " ");
                    st.pop();
                }
            }
            System.out.println();
        }
    }
}
