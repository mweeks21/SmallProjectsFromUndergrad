//A coin flip is simulated with a $10 wager.  Math.random() used to simulate the random coin flip.  
//If the coin "lands" on heads, you win $10.  If the coin "lands" on tails, you lose $10.  
//Michelle Campbell CompSci 1301
import java.util.*;
public class CoinFlip{
 public static void main(String[]args){
   int heads = 0;
   int tails = 0;
      for(int i = 0; i < 100; i++){
         if(Math.random() >=0.5)
            heads += 10;
         else
            tails-= 10;
      }   
   if((heads + tails)>0)
      System.out.println("You win $" + (heads+tails));
   else if((heads+tails) == 0)
      System.out.println("It's a tie!");
   else
      System.out.println("You lost $" + (Math.abs(tails+heads)));
                     
   }
}   
      