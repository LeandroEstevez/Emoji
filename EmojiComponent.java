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
    
    private  SmilyFace smilyEmoji;
    
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D g2 = (Graphics2D) g;
        
        smilyEmoji = new SmilyFace(g2);
        
        smilyEmoji.draw();
        
    }
    
    public void wink() {
        
        smilyEmoji.wink();
        
    }
    
}
