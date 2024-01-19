        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietketohop1;
import java.util.*;

public class LietKeToHop1 
{
    private static int count = 0, n, k;
    private static int [] c;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        c = new int[k + 1];
        c[0] = 0; toHop(1);
        System.out.print("Tong cong co "+count+" to hop");
    }
    
    public static void toHop(int i)
    {
        for(int j = c[i - 1] + 1; j <= n - k + i; j++){
            c[i] = j;
            if(i == k) process();
            else toHop(i + 1);
        }
    }
    
    public static void process(){
        for(int i = 1; i <= k; i++)
            System.out.print(c[i] + " ");
        System.out.println();
        ++count;
    }
}
