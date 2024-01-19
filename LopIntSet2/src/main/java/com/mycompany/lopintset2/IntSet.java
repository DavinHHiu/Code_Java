/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lopintset2;
import java.util.*;

public class IntSet 
{
    private TreeSet <Integer> set = new TreeSet<>();
    
    public IntSet(){}
    
    public IntSet(int [] a)
    {
        for(int x : a) this.set.add(x);
    }
    
    public IntSet intersection(IntSet o)
    {
        IntSet s = new IntSet();
        for(Integer x : this.set)
            if(o.set.contains(x)) s.set.add(x);
        return s;
    }
    
    public String toString()
    {
        String outPut = "";
        for(Integer x : this.set) outPut += x + " ";
        return outPut.trim();
    }
}
