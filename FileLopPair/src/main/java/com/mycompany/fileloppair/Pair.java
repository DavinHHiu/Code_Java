/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fileloppair;

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
        return this.first + " " + this.second;
    }
    
    private boolean check(Integer n)
    {
        if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2)
            if(n % i == 0) return false;
        return true;
    }
    
    public boolean isPrime()
    {
        return check((Integer)this.first) && check((Integer)this.second);
    }
}
