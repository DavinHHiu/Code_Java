/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chuvitamgiac;
    
public class Point 
{
    private double x, y;
    
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point o)
    {
        return Math.sqrt((this.x - o.x) * (this.x - o.x) + (this.y - o.y) * (this.y - o.y));
    }
}
