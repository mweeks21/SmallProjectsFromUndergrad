//Two dice are rolled- roll simulated using Random().  
//You win when the sum of your dice rolled is equal to 7.  
//When 7 is rolled, the program returns how many rolls it took to attain the desired value.
//Michelle Campbell CompSci 1301

import java.util.*;
public class RollDice{
   public static void main(String[] args){ 
      Random rand = new Random();
      int a=0, b=0;
      int tries = 0;
      while(a + b != 7){   
         for(int i=1; i < 5; i++){
            a = rand.nextInt(6) + 1;
            b = rand.nextInt(6) + 1;
            System.out.println("Values are: "+ a+ " \t " +b);
            tries++;
         }    
      }
   System.out.println("You won after " +tries + " tries.");   
   }
}   