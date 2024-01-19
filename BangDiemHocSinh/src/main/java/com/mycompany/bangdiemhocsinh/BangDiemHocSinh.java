/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bangdiemhocsinh;
import java.util.*;

public class BangDiemHocSinh
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <HocSinh> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            HocSinh tmp = new HocSinh(i, sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(HocSinh x : ds) System.out.println(x);
    }
}
