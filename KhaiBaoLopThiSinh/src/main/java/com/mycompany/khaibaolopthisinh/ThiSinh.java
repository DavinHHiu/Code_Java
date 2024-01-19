/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolopthisinh;

public class ThiSinh {
    private String name, birth;
    private float t1, t2, t3, sum;
    
    public ThiSinh(String name, String birth, float t1, float t2, float t3)
    {
        this.name = name;
        this.birth = birth;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.sum = t1 + t2 + t3;
    }
    
    public String toString()
    {
        return name + " " + birth + " " + String.format("%.1f", sum);
    }
}
