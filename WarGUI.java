import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
Jeff Maynard
CS110
Card Game of War - GUI
   Represents the card game "war" with a GUI implementation.
*/

public class WarGUI extends JFrame{
   private JPanel leftPanel, rightPanel, bottomPanel;
   private JLabel label;

   public WarGUI(String title){
      super(title);
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new GridLayout(2,2));
      //left panel
      leftPanel = new JPanel();
      leftPanel.setSize(new Dimension(250, 200));
      leftPanel.setBackground(Color.black);
      //right panel
      rightPanel = new JPanel();
      rightPanel.setSize(new Dimension(250, 200));
      rightPanel.setBackground(Color.blue);
      //bottom panel
      bottomPanel = new JPanel();
      bottomPanel.setSize(new Dimension(500, 100));
      bottomPanel.setBackground(Color.green);
      //add
      add(leftPanel, BorderLayout.NORTH);
      add(rightPanel, BorderLayout.NORTH);
      add(bottomPanel, BorderLayout.SOUTH);
   }
   public static void main(String[] args){
      WarGUI frame = new WarGUI("WAR!");
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}