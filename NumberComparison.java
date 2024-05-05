import java.util.Scanner;

  public class NumberComparison {
      
    public  static  void main(String[] args) {
     
       Scanner input = new Scanner (System.in);

       
       System.out.println("Enter the first number:");
       
       int number1 = input.nextInt();
     
       System.out.println("Enter the second number:");
       
       int number2 = input.nextInt();

       double result = compareNumbers(number1, number2);

       System.out.println("Result: " + result);

       if (number1 == number2) {
       return 0;
       }
       else if (number1 > number2) {
       return 1;
       } 
       else {
       return -1;
       }
       


             }
       }