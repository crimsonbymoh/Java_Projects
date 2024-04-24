import java.util.Scanner;

	public class SumDisplayed {

	public static void main( String[]  args){

	Scanner input = new Scanner(System.in);

	char option;

	do {


		System.out.print("Enter the first number: ");

		int number1 = input.nextInt();

		System.out.print("Enter The second number: ");

		int number2 = input.nextInt();

		int sum = number1 + number2;

		System.out.println("Sum of numbers: " + sum);

		System.out.print("Do you  want to continue Y/N? ");

		option = input.next().charAt(0);

		System.out.println();

		}
		while(option =='Y' || option == 'y');








	}







}