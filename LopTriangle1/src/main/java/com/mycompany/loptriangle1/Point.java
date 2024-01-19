/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loptriangle1;
import java.util.*;

public class Point 
{
    private double x, y;
        
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc)
    {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    
    public double distance(Point o)
    {
        return Math.sqrt((this.x - o.x) * (this.x - o.x) + (this.y - o.y) * (this.y - o.y));
    }
}
