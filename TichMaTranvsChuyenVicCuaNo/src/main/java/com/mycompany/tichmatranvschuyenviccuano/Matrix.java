/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tichmatranvschuyenviccuano;
import java.util.*;

public class Matrix 
{
    private int n, m;
    private int [][] a;
    
    public Matrix(int n, int m)
    {
        this.n = n;
        this.m = m;
        this.a = new int [n][m];
    }
    
    public void nextMatrix(Scanner sc)
    {
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
    }
    
    public Matrix trans()
    {
        Matrix b = new Matrix(this.m, this.n);
        for(int i = 0; i < b.n; i++)
            for(int j = 0; j < b.m; j++)
                b.a[i][j] = this.a[j][i];
        return b;
    }
    
    public Matrix mul(Matrix o)
    {
        Matrix tich = new Matrix(this.n, o.m);
        for(int i = 0; i < this.n; i++)
            for(int j = 0; j < o.m; j++)
                for(int k = 0; k < this.m; k++)
                    tich.a[i][j] += this.a[i][k] * o.a[k][j];
        return tich;
    }
    
    public String toString()
    {
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
                out.append(this.a[i][j] + " ");
            out.append("\n");
        }
        return out.toString().trim();
    }
}
