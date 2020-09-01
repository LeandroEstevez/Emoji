/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author leandroestevez
 */
public class EmojiComponent extends JComponent {
    
    private final SmilyFace smilyEmoji;
    
    public EmojiComponent() {
        
        smilyEmoji = new SmilyFace();
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        smilyEmoji.draw(g2);
        
    }
    
    public void sad() {
        
        smilyEmoji.sad();
        
    }
    
    public void happy() {
        
        smilyEmoji.happy();
        
    }
    
    public int getEmotionalState() {
        
        return smilyEmoji.getEmotionalState();
        
    }
    
    public void setEmotionalState(int state) {
        
        smilyEmoji.setEmotionalState(state);
        
    }
    
    public void wink() {
        
        smilyEmoji.wink();
        
    }
    
}
