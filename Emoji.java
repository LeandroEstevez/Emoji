/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author leandroestevez
 */
public class Emoji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        int width = 500;
        int height = 500;
        
        frame.setSize(width, height);
        
        frame.setTitle("Emoji");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EmojiComponent face = new EmojiComponent();
        
        class WinkListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                face.wink();

            }
           
        }
        
        JButton button = new JButton("Wink");
        
        ActionListener listener = new WinkListener();
        
        button.addActionListener(listener);
        
        frame.add(face);
        
        frame.add(button);
        
        frame.setVisible(true);
        
    }
    
}
