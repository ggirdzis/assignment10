/**
 * Representation of a Deck of cards.  
 * Initialized to a standard 52 card deck. 
 *
 * @author Jackie Horton
 */

import java.util.Random;
import java.util.ArrayList;

public class Deck1 extends Card
{
   /** 
   *  Number of cards in standard deck {@value #CARDS_IN_DECK}
   **/
   final int CARDS_IN_DECK = 52;

   /** The collection of Cards */
   private ArrayList<Card> deck = new ArrayList<Card>();
   
   public ArrayList<Card> getArray()
   {
   
      return deck;
      
   
   }
   
   /**
    * Constructs a regular 52-card deck.  Initially, the cards
    * are in a sorted order.  The shuffle() method can be called to
    * randomize the order.  
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
     * Remove and return the top Card on the Deck
     * @return A reference to a Card that was top on the Deck
     */
      
     /** 
     * Return current number of Cards in Deck
     * @return number of Cards in Deck
     */

   public int cardsRemaining()
   {  
      return deck.size();
   }
   
   /** 
     * Randomize the order of Cards in Deck
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
   /** 
     * Determine if Deck is empty
     * @return true if there are no more cards, false otherwise
     */
   
   public boolean isEmpty()
   {
      return (deck.size() == 0);
   }

   
   
  
}

