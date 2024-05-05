import java.util.Scanner;
	public class LuckyNumber{
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);


	System.out.println("Welcome To SportyBet ");

	/***System.out.println("How Many Times would you Like To Play The Game? ");

	int numberOfTimes = scanner.nextInt();

	System.out.println(" Get Ready And.......Play!!! ");***/

	int num = 13 ;
	int counter = 0;

	while(counter != num) {
	
	System.out.println("Enter Number:  ");

	int number = scanner.nextInt();
	
	

	if (number == num) {
	System.out.println("You Are Correct");

		break;
	}

	else if(number < num) {
	System.out.println("Number Is Too Low");
	}

	else if(number > num) {
	System.out.println("The Number Is Too High");
	} 
		counter++;
		
	

	}


	}
}