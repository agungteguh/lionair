/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adji Prasetiyo
 */
 import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class OS {
   
  public static void OS(String args[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Object rowData[][] = { { 1, "Doni Aria", "Jl.Watumujur No.10 Malang" },
                           { 2, "Desi Fitria", "Jl.Wisma Permai XXI No.12 Surabaya" } 
    };
    
    Object columnNames[] = { "Id", "Name", "Address" };
    JTable table = new JTable(rowData, columnNames);

    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}
