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
      
      //Create arraylist to hold a deck of cards
      ArrayList<Card> cardArray = new ArrayList<Card>();
      
      //Create arraylist to hold player1 cards 
      ArrayList<Card> player1 = new ArrayList<Card>();
      
      //Create arraylist to hols player2 cards
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
      
       
      //Add cards for player1
      //First 26 card objects 
      int c = 0;
      Card card2;
      while(c < 26)
      {
            
            card2 = cardArray.get(c);
            player1.add(card2);
            c++;
      }
      
      //Add cards for player2
      //Second 26 card objects
      Card card3;
      while(c < 52)
      {
            card3 = cardArray.get(c);
            player2.add(card3);
            c++;
      
      }
      
      
      int count = 0;
      
      //While each player does not have 0 cards, keep playing
      while((player1.size() != 0) && (player2.size() != 0))
      {
                  //Run through the two players' decks
                  for(int i = 0; (i < player2.size()) && (i < player1.size()); i++)
                  {
                  
                  //Get Card object at indexes of player 1 and player 2
                  System.out.println("_____________");
                  System.out.println(count);
                  System.out.println(player1.get(i));
                  System.out.println(player2.get(i));
                  System.out.println("_____________");
                  count++;
                  
                  //If player 1's card equals player 2's card
                  if(player1.get(i).equals(player2.get(i)))
                  {
                     System.out.println(player1.get(i).toString() + " has the same rank as " + player2.get(i).toString() 
                     + " with a rank of: "+player1.get(i).getRank());
                     System.out.println("The cards are equal.");
                     
                     //While these cards are still equal, get the next 2 cards
                     while(player1.get(i).equals(player2.get(i)))
                     {
                        //If second card of player 1 is less than second card of player 2
                        if(player1.get(i+1).getRank() < player2.get(i+1).getRank())
                        {
                           //Player 1 gets both of player 2's cards 
                           //And those cards that player 2 gets, will be removed from player 1's deck
                           player2.add(player1.get(i));
                           player2.add(player1.get(i+1));
                           player1.remove(i);
                           player1.remove(i+1);
                           
                        }
                        
                        //If 
                        if(player2.get(i+1).getRank() < player1.get(i+1).getRank())
                        {
                           player1.add(player2.get(i));
                           player1.add(player2.get(i+1));
                           player2.remove(i);
                           player2.remove(i+1);
                           
                        }
                        
                    } 

                     
                  } 
                  
                  if(player1.get(i).getRank() < player2.get(i).getRank())
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
              }  
                
              if (player1.size() == 0)
                 System.out.println("Player 2 Wins");
               
              else if(player2.size() == 0)
                 System.out.println("Player 1 Wins");                          
              
              
              System.out.println(player1.size());
              System.out.println(player2.size());
                                
                  if(player1.size() > player2.size())
                     System.out.println("1 Wins");
                  if(player2.size() > player1.size())
                     System.out.println("2 Wins");   
                
                
               
              
         
      }
     
      
      
      
      
          
       
   
   
   


}
