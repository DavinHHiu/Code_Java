/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tichhaidoituongmatran;
import java.util.*;

public class Matrix 
{
    private int x, y;
    private int [][] a;
    
    public Matrix(int x, int y)
    {
        this.x = x;
        this.y = y;
        a = new int [x][y];
    }
    
    public void nextMatrix(Scanner sc)
    {
        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++)
                a[i][j] = sc.nextInt();
    }
    
    public Matrix mul(Matrix o)
    {
        Matrix tich = new Matrix(this.x, o.y);
        for(int i = 0; i < this.x; i++)
            for(int j = 0; j < o.y; j++)
                for(int k = 0; k < this.y; k++)
                    tich.a[i][j] += this.a[i][k] * o.a[k][j]; 
        return tich;
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < this.x; i++){
            for(int j = 0; j < this.y; j++)
                out.append(this.a[i][j] + " ");
            out.append("\n");
        }
        return out.toString().trim();
    }
}
