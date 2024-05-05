import java.util.Scanner;
public class KataDivide{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter A Number: ");

	int numberOne = input.nextInt();

	System.out.print("Enter Another Number: ");
	
	int numberTwo = input.nextInt();
	
	Kata number = new Kata();

	float result = number.divide(numberOne,numberTwo);

	System.out.printf("The Result is: %.2f", result);

	
	

	

	
    }
}