/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dientichdagiac;
import java.util.*;

public class DaGiac 
{
    private ArrayList <Point> d = new ArrayList <>();
    private int dinh;
    
    public DaGiac(Scanner sc, int n)
    {
        this.dinh = n;
        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            Point t = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            this.d.add(t);
        }
        this.d.add(this.d.get(0));
    }
    
   public double tinhDienTich()
   {
       double tich1 = 0, tich2 = 0;
       for(int i = 0; i < dinh; i++)
       {
           tich1 += d.get(i).getX() * d.get(i + 1).getY();
           tich2 += d.get(i).getY() * d.get(i + 1).getX();
       }
       return (tich1 - tich2) / 2;
   }
}
