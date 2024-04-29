import java.util.*;

import java.util.Scanner;

public class StudentGrades{

	public static void main(String... args){

	Scanner crimson = new Scanner(System.in);
	
	int score = 0;

	int count = 0;

	System.out.print("Enter The Number Of Students: ");
	
	int numberOfStudents = crimson.nextInt();
	
	System.out.print("Enter The Number Of Subjects: ");
	
	int numberOfSubjects = crimson.nextInt();
		
	System.out.println("Saving! >>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Saved Successfully!");

	System.out.println("  ");
		
	
	int[][] scores = new int[numberOfStudents][numberOfSubjects];

	int[] position = new int[numberOfStudents];

	for (int i = 0; i < numberOfStudents; i++) {

	
	position[i] = i + 1;
		
	for (int j = 0; j < numberOfSubjects; j++) {
	
		System.out.println("Entering scores for student " + (i + 1) + ":");
		
		System.out.println("Enter score for subject " + (j + 1) );
		
		score = crimson.nextInt();

		scores[i][j] = score;

		count += 1;
	
		if (score < 1 || score > 100) {

                System.out.println("Invalid Score! Enter Correct Score.");
		
		}

		System.out.println("Saving! >>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Saved Successfully!");

	System.out.println("  ");
		
     }

  }
	System.out.print("""

	============================================================
	STUDENT\t""");

        for (int j = 0; j < numberOfSubjects; j++) {

        System.out.printf("	SUB%-2s", (j + 1) + "");
	
	}

	System.out.print("\tTOT\tAVG\tPOS");

	System.out.print("\n============================================================\n");

	
	

        for (int j = 0; j < scores.length; j++) {

        System.out.print("Student " + (j + 1));

			double total = 0;

			double average = 0;

	for(int k = 0; k < numberOfSubjects; k++){
		
	System.out.printf("\t  " + scores[j][k]);

			total += scores[j][k];

			average = total / numberOfSubjects;


		}
            	
		System.out.printf("	%.2f" , total);

		System.out.printf("	%.2f" , average);
 
		System.out.println();

        	}

		System.out.print("\n============================================================\n");

		System.out.print("\n============================================================\n");
	}

}

