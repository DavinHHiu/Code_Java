/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxeptheothutuxuathien;
import java.util.*;

public class SapXepTheoThuTuXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n = Integer.parseInt(sc.nextLine()), a[] = new int[n];
            HashMap <Integer, Integer> map = new HashMap <>();
            TreeSet <Pair<Integer, Integer>> set = new TreeSet <>();
            for(int i = 0; i < n; i++)
            {
                a[i] = Integer.parseInt(sc.next());
                if(!map.containsKey(a[i])) map.put(a[i], 1);
                else map.put(a[i], map.get(a[i]) + 1);
            }
            Set <Integer> s = map.keySet();
            for(Integer x : s)
            {
                Pair <Integer, Integer> tmp = new Pair(x, map.get(x));
                set.add(tmp);
            }
            for(Pair <Integer, Integer> p : set) {
                int cnt = p.getSecond();
                while(cnt-->0) System.out.print(p.getFirst() + " ");
            }
        }
    }
}
