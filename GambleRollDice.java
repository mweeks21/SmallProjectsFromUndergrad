//This is a gambling dice roll game
//You "roll" the dice -roll simulated using Random(); two dice rolled
//Michelle Campbell CompSci 1301

import java.util.*;
public class GambleRollDice{
   public static void main(String[] args){
      Scanner input = new  Scanner(System.in);
      char c = input.nextLine().charAt(0);
         Random rand = new Random();
         int a=0, b=0;
         int l = 0, w = 0;
         int tries = 0;
      System.out.println("Do you want to roll?  Type y or n.");
         while(c != 'n'){ 
              a = rand.nextInt(6) + 1;
              b = rand.nextInt(6) + 1;
              l++;
              tries++;
              System.out.println("Values are: "+ a+ " \t " +b);
                  if(a+b==7 && tries==1) w += 20;
                  tries++;
                  if(a+b==7 && tries>1) w += 10;
                  System.out.println("Do you want to roll?  Type y or n.");
                  c = input.nextLine().charAt(0);
               }   
                  System.out.println("You have won $" +w);
                  System.out.println("You have lost $" +l);    
   }   
}
   