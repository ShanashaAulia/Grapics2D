package komputergrafik_7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;


public class NewPanel3 extends javax.swing.JPanel {
    
    public NewPanel3(){
        initComponents();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.orange);
    }
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0, 0, 205));
        
        Polygon panah = new Polygon();
        panah.addPoint(50,100);
        panah.addPoint(100,100);
        panah.addPoint(100,75);
        panah.addPoint(150,125);
        panah.addPoint(100,175);
        panah.addPoint(100,150);
        panah.addPoint(50,150);
        g2.draw(panah);
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
       this.setLayout(layout);
       layout.setHorizontalGroup(
       layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,400,Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,400,Short.MAX_VALUE)
       );

    }
    
}
    
