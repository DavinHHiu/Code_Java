/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dientichhinhtronngoaitieptamgiac;
import java.util.*;

public class DienTichHinhTronNgoaiTiepTamGiac
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Triangle ABC = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if(ABC.isValid()) System.out.println(String.format("%.3f", ABC.tinhDienTichDuongTronNgoaiTiep()));
            else System.out.println("INVALID");
        }
    }
}
