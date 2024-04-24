import java.util.Scanner;

	public class SumOfIntegers{

	public static void main(String[]  args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter An Integer Between 0 and 1000: ");

	int numb = input.nextInt();

	int firstDigit = numb % 10;

	int remainingNumber = numb / 10;

	int secondDigit = remainingNumber % 10;

	remainingNumber = remainingNumber / 10;

	int thirdDigit = remainingNumber % 10;

	remainingNumber = remainingNumber / 10;

	int fourthDigit = remainingNumber % 10;

	int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

	System.out.print("The sum of all digits in " + numb + " is " + sum);
	

	}


}