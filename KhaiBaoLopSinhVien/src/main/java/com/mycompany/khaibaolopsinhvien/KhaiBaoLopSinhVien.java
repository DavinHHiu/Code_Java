/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.khaibaolopsinhvien;

import java.util.*;
import java.text.*;
import java.math.*;

public class KhaiBaoLopSinhVien
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        BigInteger a;
       
        
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        System.out.println(sv.toString());
    }
}
