/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lietketheothutuxuathien;
import java.util.*;
import java.io.*;

public class LietKeTheoThuTuXuatHien
{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList <String> ds = (ArrayList <String>) sc1.readObject();
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        Set <String> set1 = new LinkedHashSet <>();
        Set <String> set2 = new HashSet <>();
        while(sc2.hasNext()) set1.add(sc2.next().toLowerCase());
        for(String x : ds)
        {
            StringTokenizer st = new StringTokenizer(x);
            while(st.hasMoreTokens()) set2.add(st.nextToken().toLowerCase());
        }
        for(String x : set1)
            if(set2.contains(x)) System.out.println(x);
    }   
}
