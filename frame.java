/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package komputergrafik_7;




import javax.swing.JFrame;

public class frame {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
        frame.setTitle("Komputer Grafik Pert 7");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
       MainPanel1 mainPanel = new MainPanel1();
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
  
    
    }
}
