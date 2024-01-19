package com.mycompany.tachdoitinhtong;
import java.util.*;
import java.math.*;
import java.io.*;

public class TachDoiTinhTong 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        tachDoiVaTinhTong(sc.nextLine());
    }
    
    public static void tachDoiVaTinhTong(String s)
    {
        if(s.length() == 1) return;
        BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
        BigInteger b = new BigInteger(s.substring(s.length() / 2));
        BigInteger sum = a.add(b);
        System.out.println(sum);
        tachDoiVaTinhTong(sum.toString());
    }
}
