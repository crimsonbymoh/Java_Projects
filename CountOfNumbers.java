import java.util.Scanner;

	public class CountOfNumbers{

	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);
	
	int number,

	   countPositive = 0,

	   countNegative = 0,

	   countZero = 0;

	char option;

	do {

		System.out.print("Enter A Number: ");

		number = scanner.nextInt();

		if(number > 0) {
	
			countPositive++;
		}
		
		else if(number < 0) {

			countNegative++;
		}

		else {

			countZero++;
		}

		System.out.print("Do You want to continue Y/N? ");
		
		option = scanner.next().charAt(0);
	}

	while (option=='Y' || option =='y');

	System.out.println("Positive Numbers: " + countPositive);
	System.out.println("Negative Numbers: " + countNegative);
	System.out.println("Zero Numbers: " + countZero);
		
		
  }

}