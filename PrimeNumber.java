//User inputs a number and the computer checks/tests to see if it is a prime number or not
//Michelle Campbell CompSci 1301
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
				int input = scan.nextInt();
		
			System.out.println("Is: " + input + " Prime? " +isPrime(input));
	}
	public static Boolean isPrime(int input) {
		for(int i=2; i<(input/2); i++) {
			if(input%i==0) {
			return false;
		}
		}
			return true;
	}
	}


