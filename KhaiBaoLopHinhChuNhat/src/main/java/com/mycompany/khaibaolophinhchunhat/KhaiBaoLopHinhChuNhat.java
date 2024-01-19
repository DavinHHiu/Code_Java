/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.khaibaolophinhchunhat;
import java.util.*;

public class KhaiBaoLopHinhChuNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt(), rong = sc.nextInt();
        String mau = sc.next();
        if(dai <= 0 || rong <= 0) System.out.print("INVALID");
        else
        {
            HinhChuNhat hcn = new HinhChuNhat(dai, rong, mau);
            System.out.print((int)hcn.chuVi() +  " " + (int)hcn.dienTich() + " " + hcn.getMau());
        }
    }
}
