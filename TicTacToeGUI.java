// GUI for tic tac toe
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGUI extends JFrame
{
   private WarTest game; // the guts
   private JPanel topPanel,gamePanel;  // break up regions
   private JButton [][] buttons;    // grid of buttons
   private JLabel status;  // game status
   private JLabel title;   // static title
   // build the GUI
   public WarGUI()
   {
      setLayout(new GridLayout(2,1));
      // create game instance
      game =new WarTest();
      // setup containers and components
      topPanel = new JPanel();
      topPanel.setBackground(Color.green);
      gamePanel = new JPanel(new GridLayout(500,500));
      buttons = new JButton[500][500];
      for (int r=0;r<500;r++)
         for(int c=0;c<500;c++)
         {
            buttons[r][c] = new TTTButton(r,c," ");
            buttons[r][c].addActionListener(new ButtonListener());
            gamePanel.add(buttons[r][c]);
         }
         
      title = new JLabel("Jackie's Tic Tac Toe Game");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      topPanel.add(title);
         
      status = new JLabel("Game in progress");
      status.setFont(new Font("ARIAL",Font.BOLD,24));
      topPanel.add(status);
      
      add(topPanel);
      add(gamePanel);
   }
}   
   // handle button events
   public class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {     
         char winner;  

         TTTButton source = (TTTButton)(e.getSource());
         // make a move
         if (game.move(source.getRow(),source.getCol()))
         {
            // react
            if (game.getPlayer() == 'o')
               source.setIcon(new ImageIcon("x.jpg"));
            else
               source.setIcon(new ImageIcon("o.jpg"));
            
            winner = game.winner();
            
            if ((winner !='_')||game.getMoves()==9)
               if (winner != '_')
               {
                  status.setText("Winner is " + winner);
                  disableAll();
                 
               }
               else
               {
                  status.setText("It's a tie");
                  disableAll();
               }
              
         }
      }
      // disable all buttons
      // private method of TicTacToe class
      // not static because it accesses instance variables
      private void disableAll()
      {
         for (int r=0;r<Board.SIZE;r++)
            for(int c=0;c<Board.SIZE;c++)
            {
               buttons[r][c].setEnabled(false);
            }
      
      }
   }     


