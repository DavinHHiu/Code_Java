/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sapxepthoigian;
import java.util.*;

public class SapXepThoiGian
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <ThoiGian> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            ThoiGian tmp = new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(ThoiGian x : ds)
            System.out.println(x);
    }
}
