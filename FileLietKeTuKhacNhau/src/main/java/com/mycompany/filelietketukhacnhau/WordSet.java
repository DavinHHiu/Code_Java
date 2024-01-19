/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filelietketukhacnhau;
import java.util.*;
import java.io.*;

public class WordSet {
    private TreeSet <String> set = new TreeSet<>();     
    public WordSet(String s) throws FileNotFoundException
    {   
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    
    public String toString(){
        StringBuilder ans = new StringBuilder();
        for(String x : set){
            ans.append(x);
            ans.append("\n");
        }
        return ans.toString();
    }
}
