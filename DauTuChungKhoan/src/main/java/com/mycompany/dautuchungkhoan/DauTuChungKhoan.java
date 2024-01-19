/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dautuchungkhoan;
import java.util.*;

public class DauTuChungKhoan 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a = new int [n];
            int [] ans = new int [n];
            Stack <Integer> st = new Stack<>();
            st.push(-1);
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                while(!st.isEmpty() && st.peek() != -1 && a[i] >= a[st.peek()]) st.pop();
                ans[i] = i - st.peek();
                st.push(i);
            }
            for(int i = 0; i < n; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
