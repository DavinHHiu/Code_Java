/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.xephangvandongvien1;
import java.util.*;
import java.text.*;

public class XepHangVanDongVien1 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <VDV> ds = new ArrayList <>();
        ArrayList <VDV> sortedDs = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            VDV tmp = new VDV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
            sortedDs.add(tmp);
        }
        Collections.sort(sortedDs);
        sortedDs.get(0).setHang(1);
        for(int i = 1; i < n; i++)
        {
            if(sortedDs.get(i).cungHang(sortedDs.get(i - 1))) sortedDs.get(i).setHang(sortedDs.get(i - 1).getHang());
            else sortedDs.get(i).setHang(i + 1);
        }
        for(VDV x : ds) System.out.println(x);
    }
}
