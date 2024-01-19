/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachdoanhnghiepnhansinhvienthuctap2;
import java.util.*;

public class DanhSachDoanhNghiepNhanSinhVienThucTap2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <DoanhNghiep> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            DoanhNghiep tmp = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            int a = Integer.parseInt(sc.next()), b = Integer.parseInt(sc.next());
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DoanhNghiep x : ds)
                if(x.getSoSinhVien() >= a && x.getSoSinhVien() <= b) System.out.println(x);
        }
    }
}
