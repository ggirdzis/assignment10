/*Gretchen Girdzis
CS110
Assignment 10
Deck class*/

//Import random and arraylist
import java.util.Random;
import java.util.ArrayList;

/**
   The Deck1 class extends Card as it is Card, plus a little bit more - creating 52 cards objects.
*/

public class Deck1 extends Card
{
   /** 
      Number of cards in standard deck
   **/
   final int CARDS_IN_DECK = 52;

   /** 
      The collection of Cards arraylist
   */
   private ArrayList<Card> deck = new ArrayList<Card>();
   
   
   
   /**
      Constructs a regular 52-card deck.   
   */
    
   public Deck1()
   {        
            super(0,0);
            freshDeck();
   }
   
  
   /**
      Create a new collection of 52 cards, in sorted order
   */
   public void freshDeck()
   {
      
      for(int i = 1; i < 13+1; i++)
      {
         for(int j = 1; j < 4+1; j++)
         {
            
            deck.add(new Card(j,i));
            
         }
      }
          
   }
   
    
   /**
      The getArray method returns the deck of 52 cards.
      @return The deck.
   */
   public ArrayList<Card> getArray()
   {
   
      return deck;
      
   
   }
   

   
   /** 
      Randomize the order of Cards in the deck..
   */
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i);
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp);
      }      
   }
   
   
   
   
  
}

