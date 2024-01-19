/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepbanggiaxangdau;
import java.util.*;

public class SapXepBangGiaXangDau 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <DonHang> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            DonHang tmp = new DonHang(sc.next(), Long.parseLong(sc.next()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(DonHang x : ds) System.out.println(x);
    }
}
