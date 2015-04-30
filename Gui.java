/*Gretchen Girdzis
CS110
Assignment 10
GUI*/


//Import GUI elements
import java.awt.*;
import javax.swing.*;
import java.awt.Button;
import java.awt.event.*;


/**

   The Gui class simulates the flipping of two cards - a simplified version of the GUI, as there is a
   disconnect between the actual game and the GUI. Could not get functionality. 

*/


public class Gui extends JFrame
{

   //Fields
   //Declare ImageIcons for front and back, JButton for button, and pictures of cards
   private ImageIcon front,front2;
   private ImageIcon back, back2;
   private JButton button; 
   private JLabel pic, pic2;
  
   /**
      The constructor takes in a string for the name of the window.
      @param s String to name window.
   */
   public Gui(String s)
   {
      //Call super to JFrame
      super(s);
      
      //Set layout
      setLayout(new FlowLayout());
 
      //Create back and front of card as ImageIcon
      back = new ImageIcon("back.jpg");
      front = new ImageIcon("cardpics/aceh.jpg");
      
      //Add these icons
      pic = new JLabel(front);
      add(pic);
      
      //Create button
      button = new JButton("Flip");
      ButtonListener e = new ButtonListener();
      
      //Add button
      button.addActionListener(e);
      add(button);

      //Create back and front of second card as ImageIcon
      back2 = new ImageIcon("back.jpg");
      front2 = new ImageIcon("cardpics/acec.jpg");
      
      //Add these icons
      pic2 = new JLabel(front2);
      add(pic2);
      
      
      
   
   }
   
   /**
      The ButtonListener class sets the image icons based on the button.
      
   */
  
  
   class ButtonListener implements ActionListener
   {
      /**
         This method performs actions to change images from the user pushing the button.
         @param e The event from the pushing of the button.
      */
      public void actionPerformed(ActionEvent e) 
      {
         //If both cards are the back of the card       
         if(pic.getIcon() == back && pic2.getIcon()==back2)
         {
            //Change them to their front picture
            pic.setIcon(front);
            pic2.setIcon(front2);
         }
         //Otherwise, change to back pictures
         else
         {
             pic.setIcon(back);
             pic2.setIcon(back2);;
            
               
         }
      }
   }
   

      /**
         The main method creates and instance of Gui and passes the title for the Gui window
         as a parameter. 
      */
  
   
      public static void main(String[] args)
      {
         //Create Gui
         Gui gui = new Gui("Gretchen's Game of Cards (First Stage of War)");
         
         //Exit on close
         gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         //Set visible true and pack
         gui.setVisible(true);
         gui.pack();

      
      }
   
   
   
   
   }

  



