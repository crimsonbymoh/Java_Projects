import java.util.Scanner;

public class StudentGradeCollector{

public static void main(String[]  args){

Scanner input = new Scanner(System.in);

String[] names = new String[5];

int[] studentGrades = new int[5];

for (int counter = 0; counter < 5; counter++){

System.out.println("Enter Student Name: ");

String name;

name = input.nextLine();

names[counter] = name;


System.out.println("Enter The Student Grade: ");

int studentGrade = input .nextInt();

studentGrades[counter] = studentGrade;

input.nextLine();

}

for (int counter  = 0; counter < 5; counter++){

	System.out.println(names[counter]);

	System.out.println(studentGrades[counter]);

}



}




}

