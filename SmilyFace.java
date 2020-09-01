/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.Timer;

/**
 *
 * @author leandroestevez
 */
public class SmilyFace {
    
    public final int faceWidth;
    public final int faceHeight;
    private final int facePositionX;
    private final int facePositionY;
    private Ellipse2D.Double face;
    private QuadCurve2D mouth;
    private Ellipse2D.Double leftEye;
    private Ellipse2D.Double rightEye;
    private int emotionalState;
    
    class WinkOpenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                
            int startRightEyeX = (faceWidth + 125) - 100;
            int startRightEyeY = facePositionY + 50;
        
            rightEye = new Ellipse2D.Double(startRightEyeX, startRightEyeY, 25, 50);
                
        }    
            
    }
    
    public SmilyFace() {

        faceWidth = 250;
        faceHeight = 250;
        facePositionX = 125;
        facePositionY = 125;
        emotionalState = 0;
        
        buildFace();
        buildMouth();
        buildEyes();
        
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
        
        mouth.setCurve(startX, startY, 250, 250, endX, endY);
        
    }
    
    private void buildEyes() {
        
        int startLeftEyeX = facePositionX + 75;
        int startLeftEyeY = facePositionY + 50;
        
        leftEye = new Ellipse2D.Double(startLeftEyeX, startLeftEyeY, 25, 50);
        
        int startRightEyeX = (faceWidth + 125) - 100;
        int startRightEyeY = facePositionY + 50;
        
        rightEye = new Ellipse2D.Double(startRightEyeX, startRightEyeY, 25, 50);
        
    }
    
    public void draw(Graphics2D g2) {
        
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
    
    public int getEmotionalState() {
        
        return emotionalState;
        
    }
    
    public void setEmotionalState(int state) {
        
        emotionalState = state;
        
    }
    
    public void sad() {
        
        mouth = new QuadCurve2D.Double();
        
        int startX = facePositionX + 50;
        int startY = facePositionY + 165;
        
        int endX = startX + 150;
        int endY = startY;
        
        mouth.setCurve(startX, startY, 250, 250, endX, endY);
        
    }
    
    public void happy() {
        
        mouth = new QuadCurve2D.Double();
        
        int startX = facePositionX + 50;
        int startY = facePositionY + 165;
        
        int endX = startX + 150;
        int endY = startY;
        
        mouth.setCurve(startX, startY, 250, 350, endX, endY);
        
    }
    
    public void wink() {
        
        int startRightEyeX = (faceWidth + 125) - 100;
        int startRightEyeY = facePositionY + 50;
        
        rightEye = new Ellipse2D.Double(startRightEyeX, startRightEyeY + 25, 25, 0);
        
        WinkOpenListener winkOpen = new WinkOpenListener();
        
        Timer timer = new Timer(2000, winkOpen);
        timer.setRepeats(false);
        timer.start();
        
    }
    
    public void openEyes() {
        
        int startLeftEyeX = facePositionX + 75;
        int startLeftEyeY = facePositionY + 50;
        
        leftEye = new Ellipse2D.Double(startLeftEyeX, startLeftEyeY, 25, 50);
        
        int startRightEyeX = (faceWidth + 125) - 100;
        int startRightEyeY = facePositionY + 50;
        
        rightEye = new Ellipse2D.Double(startRightEyeX, startRightEyeY, 25, 50);
        
    }
    
}
