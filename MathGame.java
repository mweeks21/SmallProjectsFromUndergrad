//Math practice- addition.  Checks your answer; tells if you are correct,
//and gives the correct sum if the user enters the wrong answer.
//Michelle Campbell CompSci 1301
import java.util.*;
public class MathGame {

    public static void main(String[] args) {

        int count = 0; // Correct
        int correctCount = 0; // Wrong
        String output = ""; // output string is initially empty- I don't know why, but it wasn't working without it
        Scanner input = new Scanner(System.in);

        while (count - correctCount < 3) {

            int number1 = (int)(Math.random() * 25 + 1);
            int number2 = (int)(Math.random() * 25 + 1);
            int number3 = (int)(Math.random() * 25 + 1);
            int number4 = (int)(Math.random() * 25 + 1);


            System.out.print("What is " + number1 + " + " + number2 + "? "); 
                        int answer = input.nextInt();

                  if (number1 + number2 == answer){
                     System.out.println("You are correct!\n");
                     correctCount++;
                  }
                  else
                     System.out.println("Your answer is wrong.\n" + number1
                        + " + " + number2 + " should be " + (number1 + number2) + "\n");
                     count++;
        }
        System.out.println("You earned " + correctCount + " points.");
    }
}

  