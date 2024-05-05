import java.util.Scanner;
	public class PickNumber{
	
	public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Welcome To Binary Hub");

	System.out.println("How Many Times Would You Like To Play?");

	int playTime = scanner.nextInt();

	int counter  = 0;

	while(counter < playTime) {

	

	System.out.println("Enter Either 0 or 1 ");

	int pickNumber = scanner.nextInt();
	
	if (pickNumber == 0 ) {
	System.out.println("1");
		
		}
	
	if (pickNumber == 1 ) {
	System.out.println("0");
		
		}
		counter++;
	}
	}
}