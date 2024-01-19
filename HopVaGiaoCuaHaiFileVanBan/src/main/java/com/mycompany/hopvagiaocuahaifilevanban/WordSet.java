package com.mycompany.hopvagiaocuahaifilevanban;
import java.util.*;
import java.io.*;

public class WordSet 
{
    private TreeSet <String> set = new TreeSet <>();
    
    public WordSet(){}
    
    public WordSet(String file) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext())
        {
            this.set.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet union(WordSet o)
    {
        WordSet Union = new WordSet();
        for(String x : this.set) Union.set.add(x);
        for(String x : o.set) Union.set.add(x);
        return Union;
    }
    
    public WordSet intersection(WordSet o)
    {
        WordSet Intersection = new WordSet();
        for(String x : this.set)
            if(o.set.contains(x)) Intersection.set.add(x);
        return Intersection;
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for(String x : this.set) out.append(x + " ");
        return out.toString().trim();
    }
}
