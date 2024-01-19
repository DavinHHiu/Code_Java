/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangkenhapkho;
import java.util.*;

public class BangKeNhapKho
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <MatHang> ds = new ArrayList<>();
        Map <String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            String ten = sc.nextLine(), tmp = vietTat(ten, map);
            String ma = tmp + String.format("%02d", map.get(tmp));
            MatHang t = new MatHang(ten, ma, Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(t);
        }
        for(MatHang x : ds) System.out.println(x);
    }
    
    public static String vietTat(String s, Map <String, Integer> map)
    {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder();
        String t = st.nextToken();
        kq.append(Character.toUpperCase(t.charAt(0)));
        t = st.nextToken();
        kq.append(Character.toUpperCase(t.charAt(0)));
        if(map.containsKey(kq.toString())){
            int tanSo = map.get(kq.toString());
            ++tanSo;
            map.put(kq.toString(), tanSo);
        } else map.put(kq.toString(), 1);
        return kq.toString(); 
    }
}
