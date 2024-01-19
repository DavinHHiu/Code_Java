/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danhsachcanh.dungloppair;

public class Pair <T, S> 
{
    private T first;
    private S second;
    
    public Pair(T first, S second)
    {
        this.first = first;
        this.second = second;
    }
    
    public String toString()
    {
        return "(" + this.first + "," + this.second + ")";
    }
}
