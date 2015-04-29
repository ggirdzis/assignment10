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

//Class
public class WarTest
{
   //Main
   public static void main(String[] args)
   {
   
      //Create deck
      Deck1 d = new Deck1();
      
      //Shuffle
      d.shuffle();
      ArrayList<Card> deck = new ArrayList<Card>();
      deck = d.getArray();
      
      //Create arraylist to hold player1 cards 
      ArrayList<Card> player1 = new ArrayList<Card>();
      
      //Create arraylist to hols player2 cards
      ArrayList<Card> player2 = new ArrayList<Card>();      
      
       //Add cards for player1
      //First 26 card objects 
      int c = 0;
      Card card2;
      while(c < 26)
      {
            
            card2 = deck.get(c);
            player1.add(card2);
            
            c++;
      }
      
      //Add cards for player2
      //Second 26 card objects
      Card card3;
      while(c < 52)
      {
            card3 = deck.get(c);
            player2.add(card3);
            
            c++;
      
      }
      
      
      
      for(int t = 0; t < deck.size(); t++)
      {
         deck.remove(t);
      }
      
      
      
      
      int i = 0;
      //While each player's deck size does not equal zero
      while((player1.size() > 0) && (player2.size() > 0))
      {
      
      int ct = 0;
      //for(int i = 0;(i<player1.size()) && (i<player2.size());i++)
      
        
         //Display card
         System.out.println("************");
         System.out.println(player1.get(i));
         
         System.out.println(player2.get(i));
         System.out.println("************");
         
         
                 
     
      
      //If two cards are equal
      if(player1.get(i).equals(player2.get(i)))
      {
         
         //While two cards are still equal
         if((player1.size() > 0) && (player2.size() > 0))
         {
              //Use war
              War(player1,player2,i); 
              player1.add(player1.get(i));
              player2.add(player2.get(i));              
              player1.remove(i);
              player2.remove(i);
         }
         //else
            //System.out.println("Done");
      }  
       
      //If player 1 is greater than player 2   
      else if(player1.get(i).greater(player2.get(i)))
      {
      
         player1.add(player2.get(i));
         player1.add(player1.get(i));
         player1.remove(player1.get(i));
         player2.remove(i);
      
      }  
      
      //If player 1 is less than player 2
      else if(player1.get(i).less(player2.get(i)))
      {
         player2.add(player1.get(i));
         player2.add(player2.get(i));
         player2.remove(player2.get(i));
         player1.remove(i);
      
      } 
      
      //Print card size
      System.out.println(player1.size());
      System.out.println(player2.size());
      
      
      //} 
      ct++;
      }
      
      
     
      //Player 2 wins or player 1 wins
      if(player1.size() <= 0)
         System.out.println("Player 2 wins");
         
      else if(player2.size() <= 0)
         System.out.println("Player 1 wins");       
      
                      
              
}      
       //Draw next card method
       public static Card draw(ArrayList<Card> player,int index) 
       {
      
         Card card = player.get(index);
      
         return card;
   
       } 
       
       //War method 
       public static void War(ArrayList<Card> play1,ArrayList<Card> play2,int index)
       {
            //Create table array
            ArrayList<Card> table = new ArrayList<Card>();
           
            //While two cards are equals
            while(play1.get(index).equals(play2.get(index)))
            {   
                
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
                System.out.println("a" + play1.get(index));
                table.add(play2.get(index));
                System.out.println("b" + play2.get(index));
                
                //Remove those cards from both hands
                play1.remove(index);
                play2.remove(index);
                
                //Get next two cards
                
                System.out.println("c" + play1.get(index));
                table.add(play1.get(index));
                System.out.println("d" + play2.get(index));
                table.add(play2.get(index));
                
                
                
                play1.remove(index);
                play2.remove(index);
                
                System.out.println("1" + play1.get(index));
                System.out.println("2" + play2.get(index));

                     
            //If player 1 is greater than player 2
            if(play1.get(index).greater(play2.get(index)))
            {
               for(int t = 0; t < table.size(); t++)
               {
                   play1.add(table.get(t));
                   
                   
               }
               
               
            }  
      
            //If player 1 is less than player 2
            else if(play1.get(index).less(play2.get(index)))
            {
               for(int t = 0; t < table.size(); t++)
               {
                   play2.add(table.get(t));
                 
               }
               
              
                  
            } 
           }
           
           

                
               
                
                
                
                  
                
              
                
            
               
            
       
            
           
            
              
                          
            
           
            
                       
            
            
                 
            
            
            
       }     
            
            /*//Print card
            System.out.println(play1.get(index));
            System.out.println(play2.get(index));
         
         
            //Print they are the same
            System.out.println(play1.get(index).toString() + " has the same rank as " + play2.get(index).toString() 
            + " with a rank of: "+play1.get(index).getRank());
            System.out.println("The cards are equal.");
            
            //Player 1 and 2 draw second cards 
            Card a = draw(play1,index+1);
            Card b = draw(play2,index+1);
            
            //Print second cards
            System.out.println("a: " + a);
            System.out.println("b: " + b);
                     
            //Player 1 and 2 draw third cards         
            Card e = draw(play1,index+2);
            Card f = draw(play2,index+2);
            
            //Print third cards
            System.out.println("e: " + e);
            System.out.println("f: " + f);
            
            //If player 1's third card is greater than player 2's third card
            if(e.greater(f))
            {
                //Player 1 gets all six cards
                play1.add(a);
                play1.add(b);
                play1.add(e);
                play1.add(f);
                play1.add(play1.get(index));
                play1.add(play2.get(index));
                
                //Remove three first instances of what player 1 played
                play1.remove(a);
                play1.remove(e);
                play1.remove(play1.get(index));
                
                //Remove cards from player 2 that player 1 takes
                play2.remove(b);
                play2.remove(f);
                play2.remove(play2.get(index));
      
            }  
       
            //If player 2's third card is greater than player 1's their card
            else if(e.less(f))
            {
                //Player 2 gets all six cards
                play2.add(a);
                play2.add(b);
                play2.add(e);
                play2.add(f);
                play2.add(play1.get(index));
                play2.add(play2.get(index));
                
                //Remove three first instances of what player 2 played
                play2.remove(b);
                play2.remove(f);
                play2.remove(play2.get(index));
                
                //Remove cards from player 2 that player 1 takes 
                play1.remove(a);
                play1.remove(e);
                play1.remove(play1.get(index));

                
            } 
            
            //Go through another war
            else if(e.equals(f))
            {
                System.exit(0);
       
            }
            
       
       } */ 
       
       
       
            

}           
           
    

      
      
          
       
   
   
   



