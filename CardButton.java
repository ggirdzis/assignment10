import javax.swing.*;
// Represents a button specialized for TICTACTOE
// Each button know's it r,c coordinates
public class CardButton extends JButton
{  
   private Card r;
   private Card c;
   // constructor
   public CardButton(Card r,Card c,String s)
   {
      super(s);
      this.r=r;
      this.c=c;
   }
   //getters
   public Card getCard1()
   {
      return r;
   }
   public Card getCard2()
   {
      return c;
   }
}