/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emoji;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

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
        
        final int width = 500;
        final int height = 500;
        final EmojiComponent face = new EmojiComponent();
        
        frame.setSize(width, height);
        frame.setTitle("Emoji");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        class EmotionalStateListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(face.getEmotionalState() == 0) {

                    face.happy();
                    face.setEmotionalState(1);
                    face.repaint();

                } else {
                    
                    face.sad();
                    face.setEmotionalState(0);
                    face.repaint();

                }

            }
            
        }
        
        class WinkListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                face.wink();
                
            }    
            
        }
        
//        class MouseClickListener extends MouseAdapter {
//        
//            @Override
//            public void mouseEntered(MouseEvent event) {
//
//                face.closeEyes();
//                face.repaint();
//
//            }
//            
//            @Override
//            public void mouseExited(MouseEvent event) {
//                
//                face.openEyes();
//                face.repaint();
//                
//            }
//        
//        }
//        
//        MouseClickListener listener = new MouseClickListener();
//        
//        face.addMouseListener(listener);

        WinkListener winkListener = new WinkListener();

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JButton button = new JButton("Wink");
        button.addActionListener(winkListener);
        
        face.setPreferredSize(new Dimension(width / 2, height / 2));
        
        panel.add(button, BorderLayout.NORTH);
        panel.add(face, BorderLayout.CENTER);
        
        frame.add(panel);
        
        EmotionalStateListener stateListener = new EmotionalStateListener();
        Timer t = new Timer(2000, stateListener);
        t.start();
        
        frame.setVisible(true);

    }
    
}
