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

//Class
public class WarTest
{
   //Main
   public static void main(String[] args)
   {
      //Initialize integers
      int number1;
      int number2;
      int number3;
      int number4;
      
      //Ask user for rank
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a number for a rank from 1-13:");
      number1 = keyboard.nextInt();
      
      //Input validation
      while((number1 <= 0) || (number1 >13))
      {
         System.out.println("Invalid. Enter a number for a rank from 1-13:");
         number1 = keyboard.nextInt();
      

      
      }
      
      
      
      //Ask user for another rank
      System.out.println("Enter another number for a rank from 1-13:");
      number2 = keyboard.nextInt();
      
      //Input validation
      while((number2 <= 0) || (number2 > 13))
      {
         System.out.println("Invalid. Enter a number for a rank from 1-13:");
         number2 = keyboard.nextInt();
      

      }
      
      //Ask user for suit
      System.out.println("Enter a number for a suit from 1-4:");
      number3 = keyboard.nextInt();
      
      //Input validation
      while((number3 <= 0) || (number3 > 4))
      {
         System.out.println("Invalid. Enter a number for a suit from 1-4:");
         number3 = keyboard.nextInt();
      

      }
      
      //Ask user for another suit
      System.out.println("Enter another number for a suit from 1-4:");
      number4 = keyboard.nextInt();
      
      //Input validation
       while((number4 <= 0) || (number4 > 4))
      {
         System.out.println("Invalid. Enter a number for a suit from 1-4:");
         number4 = keyboard.nextInt();
      

      }
      
      //Create two card objects to call in suit and rank integers
      Card myCard = new Card(number3,number1);
      Card myCard2 = new Card(number4,number2);
      
      
      //Print string of both cards through card objects      
      System.out.println(myCard.toString());
      System.out.println(myCard2.toString());
      
      //Using equals method and comparing myCard object to myCard2 object
      //If statement to determine of two cards are equal based on equal ranks
      if(myCard.equals(myCard2))
      {
         System.out.println(myCard.toString() + " has the same rank as " + myCard2.toString() 
         + " with a rank of: " + myCard.getRank());
         System.out.println("The cards are equal.");
      }   
      else 
      {
        System.out.println("There are two different ranks. The cards are not equal.");
      }  
   
   
   }


}