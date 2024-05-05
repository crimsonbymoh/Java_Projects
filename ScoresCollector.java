import java.util.Scanner;

public class ScoresCollector{

public static void main(String[]  args){

Scanner input = new Scanner(System.in);

int[] scores = new int[10];

for (int counter = 0; counter < 10; counter++){

	System.out.print("Enter A Score: ");

	int userScore = input.nextInt();


	scores[counter] = userScore;


}

for (int count = 0; count < 10; count++){

	System.out.println(scores[count]);


}




}





}