import java.util.Scanner;

public class TwoLargestNumbers {
	public static void main(String[]  args) {
		Scanner input = new Scanner(System.in);
		
		int largest1 = 0 ;
		int largest2 = 0;
		int counter = 1;

		while ( counter <= 10 ) {

		System.out.print("Enter Integer" + counter + ": " );

		int number = input.nextInt();

		if (number > largest1) {
		
			largest2 = largest1;
			largest1 = number;
		}

			else if (number > largest2) {

 				largest2 = number;
			}
			counter++;
		}

		System.out.println("The largest integer is: " + largest1);

		System.out.println("The second largest integer is: " + largest2);

		}

	}
		