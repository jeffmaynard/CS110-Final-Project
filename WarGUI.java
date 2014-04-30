import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
Jeff Maynard
CS110
Card Game of War - GUI
   Represents the card game "war" with a GUI implementation.
*/

public class WarGUI extends JFrame{
   private War game;
   private JPanel leftPanel, rightPanel;
   private JButton button;

   public WarGUI(String title){
      super(title);
      game = new War();
      setSize(700, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(1,2));
      
      //button
      button = new JButton("ADVANCE");
      button.addActionListener(new ButtonListener());
      //left panel
      leftPanel = new JPanel();
      leftPanel.setSize(new Dimension(250, 200));
      leftPanel.setBackground(Color.black);
      leftPanel.add(new JLabel(new ImageIcon("cardPics/back.jpg")));
      //right panel
      rightPanel = new JPanel();
      rightPanel.setSize(new Dimension(250, 200));
      rightPanel.setBackground(Color.blue);
      rightPanel.add(new JLabel(new ImageIcon("cardPics/back.jpg")));
      //add
      add(leftPanel, BorderLayout.NORTH);
      add(rightPanel, BorderLayout.NORTH);
      add(button, BorderLayout.EAST);
      
   }
   private class ButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){ 
         button = (JButton)(e.getSource());
         // make a move
         if(game.player1.deal().getClass().getName().equals("Card")){
            rightPanel.add(new JLabel(new ImageIcon("cardPics/back.jpg"))); 
         }
      }
   }
   public static void main(String[] args){
      WarGUI frame = new WarGUI("WAR! by Jeff Maynard");
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}