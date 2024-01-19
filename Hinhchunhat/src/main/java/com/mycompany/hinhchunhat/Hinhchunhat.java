/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hinhchunhat;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Hinhchunhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int chieuDai, chieuRong, chuVi, dienTich;
        chieuDai = sc.nextInt();
        chieuRong = sc.nextInt();
        if(chieuDai <= 0 || chieuRong <= 0) System.out.println(0);
        else
        {
            chuVi = (chieuDai + chieuRong) * 2;
            dienTich = chieuDai * chieuRong;
            System.out.println(chuVi + " " +  dienTich);
        }
    }
}


 