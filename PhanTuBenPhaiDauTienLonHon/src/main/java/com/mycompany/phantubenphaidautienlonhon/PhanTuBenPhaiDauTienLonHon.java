/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phantubenphaidautienlonhon;
import java.util.*;

public class PhanTuBenPhaiDauTienLonHon
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] ans = new int[n];
            Stack <Integer> st = new Stack<>();
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = n - 1; i >= 0; i--)
            {
                while(!st.isEmpty() && a[i] >= st.peek()) st.pop();
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
                st.push(a[i]);
            }
            for(int i = 0; i < n; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
