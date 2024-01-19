/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lopintset;
import java.util.*;

public class IntSet {
    private TreeSet <Integer> set = new TreeSet <>();
    
    public IntSet() {}
    
    public IntSet(int [] x)
    {
        for(int i : x) this.set.add(i);
    }
    
    public IntSet union(IntSet o)
    {
        IntSet ans = new IntSet();
        for(Integer x : this.set) ans.set.add(x);
        for(Integer x : o.set) ans.set.add(x);
        return ans;
    }
    
    public String toString()
    {
        String output = "";
        for(Integer x : this.set) output += x + " ";
        return output.trim();
    }
}
