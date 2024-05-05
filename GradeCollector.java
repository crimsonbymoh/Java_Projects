import java.util.Scanner;

public class GradeCollector{

public static void main(String[]  args){

Scanner input = new Scanner(System.in);

int totalScore = 0;

int average = 0;

String[] names = new String[5];

int[] studentGrades = new int[5];

for (int counter = 0; counter < 5; counter++){

System.out.println("Enter Student Name: ");

String name;

name = input.nextLine();

names[counter] = name;


System.out.println("Enter The Student Grade: ");

int studentGrade = input .nextInt();

totalScore += studentGrade;

studentGrades[counter] = studentGrade;

input.nextLine();

}

average = totalScore / 5;
for (int counter  = 0; counter < 5; counter++){

	System.out.println(names[counter]);

	System.out.println(studentGrades[counter]);

}
System.out.println("\t" + "Name of student" + "\t\t" + "Student grade");

System.out.printf("The Total Score Of The students is: %d%n", totalScore);

System.out.printf("The average score of the students is: %d%n", average);

}




}

