    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tinhtiendien;
import java.util.*;

public class KhachHang implements Comparable <KhachHang>
{
    private String ma, loai, ten;
    private double chiSoCu, chiSoMoi, soDien, tienTrongDinhMuc, tienVuotDinhMuc, dinhMuc, thue, tongTien;
    
    public KhachHang(int i, String ten, String xau)
    {
        this.ma = "KH" + String.format("%02d", i);
        this.ten = chuanHoa(ten);
        StringTokenizer st = new StringTokenizer(xau);
        this.loai = st.nextToken();
        this.chiSoCu = Double.parseDouble(st.nextToken());
        this.chiSoMoi = Double.parseDouble(st.nextToken());
        this.soDien = this.chiSoMoi - this.chiSoCu;
        this.dinhMuc = tinhDinhMuc();
        this.tienTrongDinhMuc = tinhTienTrongDinhMuc();
        this.tienVuotDinhMuc = tinhTienVuotDinhMuc();
        this.thue = this.tinhTienVuotDinhMuc() * 5 / 100;
        this.tongTien = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.thue;
    }
    
    private long tinhDinhMuc()
    {
        if(this.loai.equals("A")) return 100;
        if(this.loai.equals("B")) return 500;
        return 200;
    }
    
    private long tinhTienTrongDinhMuc()
    {
        if(this.soDien < this.dinhMuc) return (long)(this.soDien) * 450;
        return (long)this.dinhMuc * 450;
    }
    
    private long tinhTienVuotDinhMuc()
    {
        if(this.soDien > this.dinhMuc) return (long)(soDien - dinhMuc) * 1000;
        return 0;
    }
    
    private String chuanHoa(String ten)
    {
        StringTokenizer st = new StringTokenizer(ten);
        StringBuilder ans = new StringBuilder();
        while(st.hasMoreTokens())
        {
            String t = st.nextToken().toLowerCase();
            ans.append(Character.toUpperCase(t.charAt(0)));
            for(int i = 1; i < t.length(); i++)
                ans.append(t.charAt(i));
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    
    public int compareTo(KhachHang o)
    {
        if(this.tongTien > o.tongTien) return -1;
        if(this.tongTien < o.tongTien) return 1;
        return 0;
    }
    
    public String toString()
    {
        return this.ma + " " + this.ten + " " + (long)this.tienTrongDinhMuc + " " + (long)this.tienVuotDinhMuc + " " + (long)this.thue + " " + (long)this.tongTien;
    }
}
