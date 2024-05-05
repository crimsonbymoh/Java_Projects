import java.util.Scanner;
public class KataEvenOdd{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter A number To Check for True Or False: ");

	int number1 = input.nextInt();
	
	Kata number = new Kata();

	boolean result = number.isEvenOrOdd(number1);

	System.out.println("The result is: " + result);

	
	

	

	
    }
}