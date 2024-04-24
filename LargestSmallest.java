import java.util.Scanner;

	public class LargestSmallest{
	
	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);

	int number;

	int max = Integer.MIN_VALUE;

	int min = Integer.MAX_VALUE;

	char option;

	do {

		System.out.print("Enter The number: ");

		number = scanner.nextInt();

		if(number > max) {

			max = number;
	
		}
			if(number < min) {

		      min = number;
		}

		System.out.print("Do you want to continue Y/N? ");

		option = scanner.next().charAt(0);

		}
		
		while (option=='Y' || option== 'y');

		System.out.println("Largest Number: " + max);

		System.out.println("Smallest Number: " + min);


	}

}