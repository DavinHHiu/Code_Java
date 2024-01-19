 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tinhcuocdienthoaicodinh;
import java.util.*;
import java.text.*;

public class TinhCuocDienThoaiCoDinh
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
            Tinh.setTinh(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        
        int m = Integer.parseInt(sc.nextLine());
        ArrayList <CuocGoi> ds = new ArrayList <>();
        for(int i = 0; i < m; i++)
            ds.add(new CuocGoi(sc.nextLine()));
        for(CuocGoi x : ds) System.out.println(x);
    }
}
