/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JComponent;

/**
 *
 * @author leandroestevez
 */
public class MouthComponent extends JComponent {
    
    private final int faceWidth;
    private final int faceHeight;
    
    public MouthComponent(int faceWidth, int faceHeight) {
        
        this.faceWidth = faceWidth;
        this.faceHeight = faceHeight;
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        QuadCurve2D q = new QuadCurve2D.Double();
        
        int startX = faceWidth / 5;
        int startY = faceHeight / 5;
        
        int endX = faceWidth - startX;
        int endY = faceHeight - startY;
        
        q.setCurve(startX, startY, 50, 50, endX, endY);
        
        g2.setColor(Color.black);
        g2.draw(q);
        
    }
    
}
