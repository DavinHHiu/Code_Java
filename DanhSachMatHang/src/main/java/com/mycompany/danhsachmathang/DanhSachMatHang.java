/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachmathang;
import java.util.*;
import java.text.*;

public class DanhSachMatHang
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <MatHang> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            MatHang tmp = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(MatHang x : ds){
            System.out.println(x);
        }
    }
}
