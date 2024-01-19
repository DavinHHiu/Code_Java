/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ghepma;
import java.util.*;
import java.io.*;

public class GhepMa
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <String> ds1 = (ArrayList<String>) sc1.readObject();
        ArrayList <Integer> ds2 = (ArrayList<Integer>) sc2.readObject();
        TreeSet <String> set = new TreeSet<>();
        for(String x : ds1){
            for(Integer i : ds2){
                set.add(x + i);
            }
        }
        for(String x : set)
            System.out.println(x);
    }
}
