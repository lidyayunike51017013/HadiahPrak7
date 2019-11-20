/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahteori1;

/**
 *
 * @author ASUS
 */
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
public class HadiahTeori1 extends JFrame{
    JTextField Kata = new JTextField("");
JButton Satu = new JButton("1");
JButton Dua = new JButton("2");
JButton Tiga = new JButton("3");
JButton Empat = new JButton("4");
JButton Lima = new JButton("5");
JButton Enam = new JButton("6");
JButton Tujuh = new JButton("7");
JButton Delapan = new JButton("8");
JButton Sembilan = new JButton("9");
JButton Nol = new JButton("0");
JButton Titik = new JButton(".");
JButton Hapus= new JButton("CE");
    
public HadiahTeori1(){
    super("SCRIPT APLIKASI JAVA ");
    setSize (300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(Kata, BorderLayout.NORTH);
        JPanel pane = new JPanel();
    GridLayout family = new GridLayout(4, 3, 0, 0);
    pane.setLayout(family);
    pane.add(Tujuh); pane.add(Delapan); pane.add(Sembilan); 
    pane.add(Empat); pane.add(Lima); pane.add(Enam);
    pane.add(Satu); pane.add(Dua); pane.add(Tiga); 
    pane.add(Nol); pane.add(Titik); pane.add(Hapus);
    add(pane);
    setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HadiahTeori1 frame = new HadiahTeori1();
    }  
}
