/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;

/**
 *
 * @author leandroestevez
 */
public class SmilyFace {
    
    private final int faceWidth;
    private final int faceHeight;
    private final int facePositionX;
    private final int facePositionY;
    private Ellipse2D.Double face;
    private QuadCurve2D mouth;
    private Ellipse2D.Double leftEye;
    private Ellipse2D.Double rightEye;
    private Graphics2D g2;
    
    public SmilyFace(Graphics2D g2) {

        faceWidth = 250;
        faceHeight = 250;
        facePositionX = 125;
        facePositionY = 125;
        this.g2 = g2;
        
    }
    
    private void buildFace() {
        
        face = new Ellipse2D.Double(facePositionX, facePositionY, faceWidth, faceHeight);
        
    }
    
    private void buildMouth() {
        
        mouth = new QuadCurve2D.Double();
        
        int startX = facePositionX + 50;
        int startY = facePositionY + 165;
        
        int endX = startX + 150;
        int endY = startY;
        
        mouth.setCurve(startX, startY, 250, 350, endX, endY);
        
    }
    
    private void buildEyes() {
        
        int startLeftEyeX = facePositionX + 75;
        int startLeftEyeY = facePositionY + 50;
        
        leftEye = new Ellipse2D.Double(startLeftEyeX, startLeftEyeY, 25, 50);
        
        int startRightEyeX = (faceWidth + 125) - 100;
        int startRightEyeY = facePositionY + 50;
        
        rightEye = new Ellipse2D.Double(startRightEyeX, startRightEyeY, 25, 50);
        
    }
    
    public void draw() {
        
        buildFace();
        buildMouth();
        buildEyes();
        
        g2.drawString("Just a fucking emoji", 180, 50);
        
        Color faceColor = new Color(255, 204, 51);
        g2.setColor(faceColor);
        g2.fill(face);
        g2.draw(face);
        
        g2.setColor(Color.black);
        g2.draw(mouth);
        
        g2.setColor(Color.black);
        g2.fill(leftEye);
        g2.fill(rightEye);
        g2.draw(leftEye);
        g2.draw(rightEye);
        
    }
    
    public void wink() {
        
        double height = rightEye.getHeight();
        double width = rightEye.getWidth();
        double x = rightEye.getX();
        double y = rightEye.getY();
        
        rightEye = new Ellipse2D.Double(x, y, width, 0);
        
        g2.setColor(Color.black);
        g2.draw(rightEye);
        
        rightEye = new Ellipse2D.Double(x, y, width, height);
        
        g2.setColor(Color.black);
        g2.draw(rightEye);
        
    }
    
    
    
}
