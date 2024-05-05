import java.util.Scanner;
public class KataSubtract{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");

	int number1 = input.nextInt();

	System.out.print("Enter Second Number: ");
	
	int number2 = input.nextInt();
	
	Kata number = new Kata();

	int result = number.subtract(number1,number2);

	System.out.println("The result is: " + result);

	
	

	

	
    }
}