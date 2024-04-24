import java.util.Scanner;

	public class FactorialValue{

	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);

	int numb;

	int factor = 1;

	System.out.print("Enter a number of your choice: ");

	numb = scanner.nextInt();

	for(int i=1; i<=numb; i++) {

		factor *= i;

	    }

	System.out.println("Factorial Value: " + factor);






	}


}