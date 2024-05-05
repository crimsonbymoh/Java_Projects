import java.util.Scanner;

public class AgeCollector{

	public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	int[] ages = new int[5];

	for (int counter = 0; counter < 5; counter++){

		System.out.println("Enter Age: ");

		int userAge = input.nextInt();

		ages[counter] = userAge;
	}

	for (int count = 0; count < 5; count++){

		System.out.println(ages[count]);

	}

}





}