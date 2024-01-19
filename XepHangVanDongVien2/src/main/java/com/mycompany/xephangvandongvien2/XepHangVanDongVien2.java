/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xephangvandongvien2;
import java.util.*;
import java.text.*;

public class XepHangVanDongVien2 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <VDV> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            VDV tmp = new VDV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        ds.get(0).setHang(1);
        for(int i = 1; i < n; i++)
        {
            if(ds.get(i).cungHang(ds.get(i - 1))) ds.get(i).setHang(ds.get(i - 1).getHang());
            else ds.get(i).setHang(i + 1);
        }
        for(VDV x : ds) System.out.println(x);
    }
}
