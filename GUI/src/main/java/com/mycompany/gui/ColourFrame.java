/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColourFrame extends JFrame implements ActionListener
{
    private JPanel p;
    private JButton ok;
    private JComboBox <String> chon;
    public ColourFrame(String title) throws HeadlessException
    {
        super(title);
        p = new JPanel();
        ok = new JButton("OK");
        chon = new JComboBox <>();
        chon.addItem("Xanh");
        chon.addItem("Do");
        chon.addItem("Tim");
        chon.addItem("Vang");
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        
        JPanel ps = new JPanel();
        ps.setLayout(new FlowLayout());
        ps.add(ok); ps.add(chon);
        
        add(ps, BorderLayout.SOUTH);
        
        ok.addActionListener(this);
    }
        public void actionPerformed(ActionEvent e)
        {
            String colour = chon.getSelectedItem().toString();
            if(colour.equals("Xanh")) p.setBackground(Color.BLUE);
            if(colour.equals("Do")) p.setBackground(Color.RED);
            if(colour.equals("Tim")) p .setBackground(Color.MAGENTA);
            if(colour.equals("Vang")) p.setBackground(Color.YELLOW);
        }
}
