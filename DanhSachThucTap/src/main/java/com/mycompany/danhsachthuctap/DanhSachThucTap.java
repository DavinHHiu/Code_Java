/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.danhsachthuctap;
import java.util.*;
import java.io.*;

public class DanhSachThucTap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Map <String, String> dsSV = new HashMap <>(); 
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n; i++)
        {
            SinhVien tmp = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            dsSV.put(tmp.getMa(), tmp.getInfo(tmp.getMa()));
        }
        
        Scanner sc2 = new Scanner(new File("DN.in"));
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < m; i++)
            DoanhNghiep.setDoanhNghiep(sc2.nextLine(), sc2.nextLine(), Integer.parseInt(sc2.nextLine()));
        
        
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        Map <String, ArrayList <SinhVien>> map = new HashMap<>();
        int k = Integer.parseInt(sc3.nextLine());
        for(int i = 0; i < k; i++)
        {
            StringTokenizer st = new StringTokenizer(sc3.nextLine());
            String maSV = st.nextToken(), maDN = st.nextToken(); 
            SinhVien tmp = new SinhVien(maSV, dsSV.get(maSV));
            for (Map.Entry<String, ArrayList <SinhVien>> entry : map.entrySet()) {
                    entry.getValue().add(tmp);
                  
        }
      
        }
    }
}
