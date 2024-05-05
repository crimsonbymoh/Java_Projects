import java.util.Scanner;

public class TableValues {
	public static void main(String[]  args) {

           Scanner input = new Scanner(System.in);



		int[] values = {1, 2, 3, 4, 5};

	System.out.println("N\tN^2\tN^3\tN^4");

	for (int n : values) {
		
		System.out.println(n + "\t" + (int)Math.pow(n, 2) + "\t" + (int)Math.pow(n, 3) + "\t" + (int)Math.pow(n, 4));
			}

		}

	}