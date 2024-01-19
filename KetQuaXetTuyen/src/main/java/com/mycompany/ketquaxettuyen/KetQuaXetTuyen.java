
package com.mycompany.ketquaxettuyen;
import java.util.*;
import java.text.*;

public class KetQuaXetTuyen 
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <ThiSinh> ds = new ArrayList <>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
        {
            ThiSinh tmp = new ThiSinh(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        for(ThiSinh x : ds) System.out.println(x);
    }
}
