import java.util.Scanner;

  public class SquareOfNumbers {
      
    public  static  void main(String[] args) {
     
       Scanner scanner = new Scanner (System.in);


       System.out.print("Enter the first integer:");

       int num1 = scanner.nextInt();

       System.out,print("Enter the second integer:");

       int num2 = scanner.nextInt();
       
       int square1 = num1 * num1;

       int square2 = num2 * num2;

       System.out.println("Square of the first number": square1);

       System.out.println("Square of the second number": square2);

       int sumOfSquares = square1 + square2;

       System.out.println("Sum of the squares:" sumOfSquares);

       int differenceOfSquares = square1 - square2;

       System.out.println("Difference of the squares:" differenceOfSquares);

       
        

                   

         
                   


            }
       }