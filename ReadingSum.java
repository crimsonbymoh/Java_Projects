import java.util.Scanner;

public class ReadingSum {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number: ");

               int number = scanner.nextInt();

		int sum = 0;
		int inputValue;

		while ( sum < number) {

		System.out.print("Enter an integer value: ");
		
		inputValue = scanner.nextInt();

			sum += inputValue;
		}
			System.out.println("Sum of entered integers is greater than the target number");
	
		System.out.println("Final Sum:" + sum);
		}
	}