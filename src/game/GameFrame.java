/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JFrame;

/**
 *
 * @author Mahmuda_Munny
 */
public class GameFrame extends JFrame {
 
	
    GameFrame()
    {
        GamePanel panel = new GamePanel();
       
       this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
          
        //this.pack();
          this.setSize(1300,750);
        this.setVisible(true);
       this.setLocationRelativeTo(null);
 
    }		

}

