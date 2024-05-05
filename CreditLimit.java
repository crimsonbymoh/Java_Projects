import java.util.Scanner;

  public class CreditLimit {
      
    public  static  void main(String[] args) {
     
       Scanner scanner = new Scanner (System.in);

       
       System.out.println("Enter Account number:");
       
       int accountNumber = scanner.nextInt();
     
       System.out.println("Enter balance at the beginning of the month:");
       
       int beginningBalance = scanner.nextInt();

       
       System.out.print("Enter total of all credits applied this month: ");

       int credits = scanner.nextInt();
       

       System.out.print("Enter total of all items charged this month:");

       int charges = scanner.nextInt();

       System.out.print("Enter allowed credit limit: ");
       
       int creditLimit = scanner.nextInt();


       int newBalance = beginningBalance + charges - credits;

       System.out.println("New Balance: " + newBalance);

       if ( newBalance > creditLimit) {
      
        System.out.println("Credit limit exceeded");

        }


   

       
        

                   

         
                   


            }
       }