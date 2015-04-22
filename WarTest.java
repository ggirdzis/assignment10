/*Gretchen Girdzis
CS110
Assignment 5
Card Problem*/

/**
   This program demonstrates the Card class to determine whether two cards are equal based 
   on rank.
*/

//Import Scanner
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
//Class
public class WarTest
{
   //Main
   public static void main(String[] args)
   {
      Random rand = new Random();
      
      ArrayList<Card> cardArray = new ArrayList<Card>(); 
      ArrayList<Card> player1 = new ArrayList<Card>();
      ArrayList<Card> player2 = new ArrayList<Card>();
      
      //Create deck of cards     
      for(int i = 1; i < 13+1; i++)
      {
         for(int j = 1; j < 4+1; j++)
         {
            Card card = new Card(j,i);
            cardArray.add(card);
            
         }
      }
      
        
      //Shuffle
      Collections.shuffle(cardArray);
      System.out.println("*************");
      
       
      int c = 0;
      Card card2;
      while(c < 26)
      {
            
            card2 = cardArray.get(c);
            player1.add(card2);
            c++;
      }
      
      Card card3;
      while(c < 52)
      {
            card3 = cardArray.get(c);
            player2.add(card3);
            c++;
      
      }
      
      int count = 0;
    
         
               for(int i = 0; (i < player2.size()) && (i < player1.size()); i++)
               {
                  
                  System.out.println("_____________");
                  System.out.println(count);
                  System.out.println(player1.get(i));
                  System.out.println(player2.get(i));
                  
                  
                  System.out.println("_____________");
                  count++;
                  
                  if(player1.get(i).equals(player2.get(i)))
                  {
                     System.out.println(player1.get(i).toString() + " has the same rank as " + player2.get(i).toString() 
                     + " with a rank of: "+player1.get(i).getRank());
                     System.out.println("The cards are equal.");
                     if(player1.get(i+1).getRank() < player2.get(i+1).getRank())
                     {
                        player2.add(player1.get(i));
                        player2.add(player1.get(i+1));
                        player1.remove(i);
                        player1.remove(i+1);
                        
                     }
                     
                     if(player2.get(i+1).getRank() < player1.get(i+1).getRank())
                     {
                        player1.add(player2.get(i));
                        player1.add(player2.get(i+1));
                        player2.remove(i);
                        player2.remove(i+1);
                        
                     }
                     
                     

                     
                  } 
                  
                  else if(player1.get(i).getRank() < player2.get(i).getRank())
                  {
                     player2.add(player1.get(i));
                     player1.remove(i);
                    
                     
                  
                  }
                  
                  else if(player2.get(i).getRank() < player1.get(i).getRank())
                  {
                     player1.add(player2.get(i));
                     player2.remove(i);
                    
                  
                  }
        
                  else 
                  {
                     System.out.println("There are two different ranks. The cards are not equal.");
                  }
                  
                 
                }  
                
                
              if (player1.size() == 0)
                 System.out.println("Player 2 Wins");
               
              if (player2.size() == 0)
                 System.out.println("Player 1 Wins");                          
              
               System.out.println(player2.size());
                  System.out.println(player1.size());
                  
                  if(player1.size() > player2.size())
                     System.out.println("1 Wins");
                  if(player2.size() > player1.size())
                     System.out.println("2 Wins");   
                
                
               
              
         
      }
     
      
      
      
      
          
       
   
   
   


}
