import java.util.Scanner;

	public class ValueOfPower{

	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);

	System .out.println("Enter The Number: ");

	int numb = scanner.nextInt();

	System.out.println("Enter The Power Of The Number: ");

	int power = scanner.nextInt();

	int result = 1;

	if (power >=1) {

		for(int i = 1; i<= power; i++) {

		  result = result * numb;
		}

		System.out.println(result);

		}

	}

}