/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachcanh.dungloppair;
import java.util.*;

public class DanhSachCanhDungLopPair
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Pair<Integer, Integer>> list = new ArrayList <>();
        int n = sc.nextInt();
        int [][] a = new int [n + 1][n + 1];
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1 && i < j)
                {
                    Pair <Integer, Integer> tmp = new Pair<>(i, j);
                    list.add(tmp);
                }
            }
        for(Pair<Integer, Integer> p : list) 
            System.out.println(p);
    }
}
