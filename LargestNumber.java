import java.util.Scanner;

public class LargestNumber {
	public static void main(String[]  args) {
		Scanner input = new Scanner(System.in);
		
		int largest = 0 ;
		int counter = 1;

		while ( counter <= 10 ) {

		System.out.print("Enter Integer" + counter + ": " );

		int number = input.nextInt();

		if (number > largest) {
		
		largest = number;
		}
			counter++;
		}

		System.out.println("The largest integer is: " + largest);

		}

	}
		