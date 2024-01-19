/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hieucuahaitaptu;
import java.util.*;
import java.io.*;

public class WordSet
{
    private TreeSet <String> set = new TreeSet <>();
    
    public WordSet (){}
    
    public WordSet(String file) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext())
        {
            this.set.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet difference(WordSet o)
    {
        WordSet dif = new WordSet();
        for(String x : this.set)
            if(!o.set.contains(x)) dif.set.add(x);
        return dif;
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for(String x : this.set) out.append(x + " ");
        return out.toString().trim();
    }
}
