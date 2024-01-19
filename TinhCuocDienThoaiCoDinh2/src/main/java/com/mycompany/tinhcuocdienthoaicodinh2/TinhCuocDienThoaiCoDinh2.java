/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhcuocdienthoaicodinh2;
import java.util.*;
import java.text.*;

public class TinhCuocDienThoaiCoDinh2 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <CuocGoi> ds = new ArrayList <>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            Vung.setVung(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++)
        {
            CuocGoi tmp = new CuocGoi(sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(CuocGoi x : ds) System.out.println(x);
    }
}
