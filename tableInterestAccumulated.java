//The purpose of this program is to create a table that calculates interest accumulated in savings
//Michelle Campbell CompSci 1301
import java.util.Scanner;
public class tableInterestAccumulated {

   public static void main(String[] args) {
      //variables established or computer gets mad
      int investment = 1000;
      int deposit=0;
      double rateInterest= 0.065; //rate of interest
      int years = 25;
      double currentb = 0; //current balance
      double interest; //interest earned
      double nbalance; //new balance

      System.out.println();
      System.out.println("Year     Deposit     Current Balance     Interest Earned     New Balance    ");
      System.out.println();
         for(int i=1; i<=years; i++)
         {
            //Year one is its own formula, different from the other years
            if(i==1){
               deposit = investment;
               currentb = investment;
            }
               nbalance = currentb * Math.pow((1+rateInterest/100), 1);
               //Math.pow page 171 for exponents and M must be big or it will not work
               interest = nbalance - currentb;

                System.out.printf("%8d  %8d  %16.3f  %16.3f  %16.3f \n",  i , deposit , currentb , interest , nbalance );

                //printf page 272 for alignment by format specifiers
               deposit = 100;
               currentb = nbalance + deposit;
         }

   }
}

