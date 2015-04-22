/*Gretchen Girdzis
CS110
Assignment 5
Challenge 3 - Card class*/

/**
   The Card class simulates a deck of cards.
*/

//Class
public class Card
{
   //Fields
   //Constants for the different suits
   public final int SPADE = 1; 
   public final int CLUB = 2;
   public final int HEART = 3; 
   public final int DIAMOND = 4;
   
   //Constants for the different ranks
   public final int ACE = 1;
   public final int TWO = 2;
   public final int THREE = 3;
   public final int FOUR = 4;
   public final int FIVE = 5;
   public final int SIX = 6;
   public final int SEVEN = 7;
   public final int EIGHT = 8;
   public final int NINE = 9;
   public final int TEN = 10;
   public final int JACK = 11; 
   public final int QUEEN = 12;
   public final int KING = 13; 
   
   //Rank and suit
   private int rank;
   private int suit;
   
   /**
      Constructor initializes suit and rank.
      @param The suit of the card.
      @param The rank of the card.
   */
   public Card(int aSuit, int aRank)
   {
      suit = aSuit;
      rank = aRank;
      
   }
   
   /**
      The getSuit method takes the suit and returns it as a number.
      @return The suit number.
   */

   public int getSuit()
   {
      //Switch statement to get suit
      switch(suit)
      {
        case SPADE:
         suit = 1;
         break; 
        
        case CLUB:
         suit = 2;
         break;
         
        case HEART:
         suit = 3;
         break;
         
        case DIAMOND:
         suit = 4;
         break;  
      
      }
      
      //Return suit
      return suit;
   }
   
   /**
      The getRank method takes the rank and returns it as a number.
      @return The rank number.
   */
   
   
   public int getRank()
   {
      //Switch statement to get rank
      switch(rank)
      {
      
         case ACE:
            rank = 1;
            break;
         case TWO:
            rank = 2;
            break;
         case THREE:
            rank = 3;
            break;
         case FOUR:
            rank = 4;
            break;
         case FIVE:
            rank = 5;
            break;
         case SIX:
            rank = 6;
            break;
         case SEVEN:
            rank = 7;
            break;
         case EIGHT:
            rank = 8;
            break;
         case NINE:
            rank = 9;
            break;
         case TEN:
            rank = 10;
            break;               
                     
         case JACK:
            rank = 11;
            break;
          
         case QUEEN:
            rank = 12;
            break;
            
         case KING:
            rank = 13;
            break;         
            
      }
      //Return rank
      return rank;
     
   }
   
   /**
      toString method 
      @return A string indicating the card's suit and rank.
   */
   
   public String toString()
   {  
      //Initialize strings
      String suitString = "";
      String rankString = "";
      
      //Switch statement for suit
      switch(suit)
      {
         case SPADE:
            suitString = ("SPADE");
            break;
         case CLUB:
            suitString = ("CLUB");
            break;
         case HEART:
            suitString = ("HEART");
            break;
         case DIAMOND:
            suitString = ("DIAMOND");
            break;         
      }
      //Switch statement for rank
      switch(rank)
      {
         case ACE:
            rankString = ("ACE");
            break;
         case TWO:
            rankString = "2";
            break;
         case THREE:
            rankString = "3";
            break;
         case FOUR:
            rankString = "4";
            break;
         case FIVE:
            rankString = "5";
            break;
         case SIX:
            rankString = "6";
            break;
         case SEVEN:
            rankString = "7";
            break;
         case EIGHT:
            rankString = "8";
            break;
         case NINE:
            rankString = "9";
            break;
         case TEN:
            rankString = "10";
            break;   
         case JACK:
            rankString = "JACK";                  
            break;  
         case QUEEN:
            rankString = "QUEEN";
            break;     
         case KING:   
            rankString = "KING";
            break;      

      
      
      
      
      
   }
      //Define string
      String str = "Suit: " + suitString + " " +
                   "Rank: " + rankString;
    
      //Return string
      return str;             
   }
   
   /**
      The equals method compares the rank with another object's rank of the Card class.
      @param otherCard Card class object.
      @return The status of the boolean from the if statements in the method.
   */
   
   public boolean equals(Card otherCard)
   {
      boolean status;
      
      if(rank==(otherCard.getRank()))
      {
         status=true;
      }
      else
      {
         status=false;
      }
      return status;
   
   }
}

