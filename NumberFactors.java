import java.util.Scanner;
	public class NumberFactors{
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter A Number");
	
	int number = scanner.nextInt();

	int factor = 0;

	int counter = 1;

	while( counter <= number ) {

	if(number % counter == 0){
		

		factor++;	
	}
	counter++;
		
	}

		System.out.println(factor);
	


	}

}