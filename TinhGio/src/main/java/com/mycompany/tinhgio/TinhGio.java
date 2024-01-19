package com.mycompany.tinhgio;
import java.util.*;
import java.text.*;

public class TinhGio 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <NguoiChoi> ds =  new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++)
        {
            NguoiChoi tmp = new NguoiChoi(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(NguoiChoi x : ds) System.out.println(x);
    }
}
