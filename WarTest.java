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
   
      Deck1 d = new Deck1();
      d.shuffle();
      ArrayList<Card> deck = new ArrayList<Card>();
      deck = d.getArray();
      System.out.println(d.getArray());
      
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
      
      int ct = 0;
      for(int i = 0; i < player1.size(); i++)
      {
         System.out.println(ct);
         System.out.println("************");
         System.out.println(player1.get(i));
         
         System.out.println(player2.get(i));
         System.out.println("************");
         ct++;
      }
      
     
      int count = 0;  
               
     /* //While each player does not have 0 cards, keep playing
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
                  
                  System.out.println(" 1--- " + player1.get(i));
                  System.out.println(" 2--- " + player1.get(i+1));
                  
                  System.out.println(" 1--- " + player2.get(i));
                  System.out.println(" 2--- " + player2.get(i+1));
                   
                  if(player1.get(i+1).greater(player2.get(i+1)))
                  {
                      player1.add(player2.get(i));
                      player1.add(player2.get(i));
                      player2.remove(i);
                      player2.remove(i+1);
                      
                  
                  }  
                   
               
              }  
                
              
            }   */ 
               
}
}           
           
    

      
      
          
       
   
   
   



