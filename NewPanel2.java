package komputergrafik_7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;


public class NewPanel2 extends javax.swing.JPanel{
    
    public NewPanel2(){
        initComponents();
        this.setPreferredSize(new Dimension(500,500));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0, 0, 205));
        
        GeneralPath gp = new GeneralPath();
        gp.moveTo(60, 120);
        gp.lineTo(80, 120);
        gp.quadTo(90, 140, 100, 120);
        gp.lineTo(160, 120);
        gp.quadTo(170, 140, 180, 120); 
        gp.lineTo(200, 120);
        gp.curveTo(195, 100, 200, 80, 160, 80);
        gp.lineTo(110, 80);
        gp.lineTo(90, 100);
        gp.lineTo(60, 100);
        gp.lineTo(60, 120);
        g2.draw(gp);
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
