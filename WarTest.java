/*Gretchen Girdzis
CS110
Assignment 10
War Driver*/

/**
   This program demonstrates the Deck class to simulate a game of war. Cards are compared
   to determine which player gets cards. Originally, the player with the higher cards takes both cards 
   drawn for a round. If these cards tie, the players draw another face down, and then another face down,
   and then another face up. This determines who takes all cards that have been draw. If those cards 
   are equal in rank, another "war" occurs, where three more cards are put down and the third is compared
   again for each player. 
*/

//Import Scanner
import java.util.Scanner;
//Import Random
import java.util.Random;
//Import ArrayList
import java.util.ArrayList;

//Class
public class WarTest
{
   /**
      The main method tests the functionality of the war game.
      
   
   */
   public static void main(String[] args)
   {
   
      //Create deck
      Deck1 d = new Deck1();
      
      //Shuffle
      d.shuffle();
      
      //Create array of Card objects
      ArrayList<Card> deck = new ArrayList<Card>();
      
      //This deck equals the deck that is created in Deck1 class
      deck = d.getArray();
      
      //Create arraylist to hold player1 Card objects
      ArrayList<Card> player1 = new ArrayList<Card>();
      
      //Create arraylist to hols player2 Card objects
      ArrayList<Card> player2 = new ArrayList<Card>();      
      
      //Add cards for player1
      //First 26 card objects 
      int c = 0;
      Card card2;
      while(c < 26)
      {
            
            //Get Card at specific index in deck
            card2 = deck.get(c);
            //Add this Card to the player1 array
            player1.add(card2);
            //Increment c
            c++;
      }
      
      //Add cards for player2
      //Second 26 card objects
      Card card3;
      while(c < 52)
      {
            //Get Card at specific index in deck
            card3 = deck.get(c);
            //Add this Card to the player2 array
            player2.add(card3);
            //Increment c
            c++;
      
      }
      
      
      //Remove cards from the main deck
      for(int t = 0; t < deck.size(); t++)
      {
         deck.remove(t);
      }
      
      
      //Initialize i as the index
      int i = 0;
      final int MIN_CARDS = 3;
      
      //While each player's deck size is greater than three
      while((player1.size() > MIN_CARDS) && (player2.size() > MIN_CARDS))
      {
      
      
      
        
         //Display player 1 card
         System.out.println("************");
         System.out.println("Player 1: " + player1.get(i));
         
         //Diplay player 2 card
         System.out.println("Player 2: " + player2.get(i));
         System.out.println("************");
         
         
                 
     
      
      //If two cards are equal
      if(player1.get(i).equals(player2.get(i)))
      {
         
         
              //Go through War calling War method
              War(player1,player2,i); 
              
         
      }  
       
      //If player 1 is greater than player 2   
      else if(player1.get(i).greater(player2.get(i)))
      {
      
         //Player 1 gets player 1's card and player 2's card
         player1.add(player2.get(i));
         player1.add(player1.get(i));
         
         //Remove both instances of that first card from both hands
         player1.remove(player1.get(i));
         player2.remove(i);
      
      }  
      
      //If player 1 is less than player 2
      else if(player1.get(i).less(player2.get(i)))
      {
         //Player 2 gets player 1's card and player 2's card
         player2.add(player1.get(i));
         player2.add(player2.get(i));
         //Remove both instances of that first card from both hands
         player2.remove(player2.get(i));
         player1.remove(i);
      
      } 
      
      //Print card size
      System.out.println("Player 1 Cards Remaining: " + player1.size());
      System.out.println("Player 2 Cards Remaining: " + player2.size());
      
      
       
      
      }
      
      
     
      //Player 2 wins or player 1 wins
      if(player1.size() > player2.size())
         System.out.println("Player 1 wins");
         
      else if(player2.size() > player1.size())
         System.out.println("Player 2 wins");       
      
                      
      }  
          
      /**
         The draw method returns a card at a specific index.
         @param player Arraylist of card objects representing a player.
         @param index The index to get specified Card.
         @return The card in specified arraylist at specified index.
      
      */
      public static Card draw(ArrayList<Card> player,int index) 
      {
      
         Card card = player.get(index);
      
         return card;
   
      } 
       
      /**
         The War method simulates a war, where two cards tie and more cards must be drawn.
         @param play1 Player 1's hand.
         @param play2 Player 2's hand.
         @param index The index to specify cards within the hand arraylists.
         
      
      */ 
      public static void War(ArrayList<Card> play1,ArrayList<Card> play2,int index)
      {
            //Create table array
            ArrayList<Card> table = new ArrayList<Card>();
           
            //While two cards are equal
            while(play1.get(index).equals(play2.get(index)))
            {   
                
                //Print that they have the same rank
                System.out.println(play1.get(index).toString() + " has the same rank as " + play2.get(index).toString() 
                + " with a rank of: "+play1.get(index).getRank());
                System.out.println("The cards are equal.");

                //Add original tying cards
                table.add(play1.get(index));
                table.add(play2.get(index));
                
                //Remove from both hands
                play1.remove(index);
                play2.remove(index);
                 
                
                //Get next two cards
                table.add(play1.get(index));
                System.out.println("Player 1 Face Down: " + play1.get(index));
                table.add(play2.get(index));
                System.out.println("Player 2 Face Down: " + play2.get(index));
                
                //Remove those cards from both hands
                play1.remove(index);
                play2.remove(index);
                
                //Get next two cards
                System.out.println("Player 1 Face Down: " + play1.get(index));
                table.add(play1.get(index));
                System.out.println("Player 2 Face Down: " + play2.get(index));
                table.add(play2.get(index));
                 
                
                //Remove those cards from both hands
                play1.remove(index);
                play2.remove(index);
                
                
                //Print next cards
                System.out.println("Player 1 Face Up" + play1.get(index));
                System.out.println("Player 2 Face Up" + play2.get(index));

                     
            //If player 1 is greater than player 2
            if(play1.get(index).greater(play2.get(index)))
            {
               //Go through table cards
               for(int t = 0; t < table.size(); t++)
               {
                   //Add them to player 1's deck
                   play1.add(table.get(t));
                   
                   
               }
               
               
            }  
      
            //If player 1 is less than player 2
            else if(play1.get(index).less(play2.get(index)))
            {
               //Go through table cards
               for(int t = 0; t < table.size(); t++)
               {
                   //Add them to player 2's deck
                   play2.add(table.get(t));
                 
               }
               
              
                  
            } 
           }
              
            
      }     
            
            

}           
           
    

      
      
          
       
   
   
   



