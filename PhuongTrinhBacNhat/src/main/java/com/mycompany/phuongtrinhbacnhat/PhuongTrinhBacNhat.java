/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phuongtrinhbacnhat;

import java.util.*;
/**
 *
 * @author ASUS
 */
public class PhuongTrinhBacNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, ans;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0)
         {
                if(b == 0) System.out.println("VSN");
                else System.out.println("VN");
         }
        else{
            ans = -b / a;
            System.out.printf("%.2f", ans);
        }
    }
}
