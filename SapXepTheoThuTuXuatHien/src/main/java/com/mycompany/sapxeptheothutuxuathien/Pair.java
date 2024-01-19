/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sapxeptheothutuxuathien;

public class Pair <T, S>  implements Comparable <Pair>
{
    private Integer first;
    private Integer second;
    
    public Pair(Integer first, Integer second)
    {
        this.first = first;
        this.second = second;
    }
    
    public int compareTo(Pair o)
    {
        if(this.second > o.second) return -1;
        if(this.second < o.second) return 1;
        return 0;
    }
    
    public int getSecond()
    {
        return this.second;
    }
    
    public int getFirst()
    {
        return this.first;
    }
    
    public String toString()
    {
        return this.first + " " + this.second;
    }
}
