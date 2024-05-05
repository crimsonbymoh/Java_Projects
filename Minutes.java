import java.util.Scanner;

  public class Minutes {
      
    public  static  void main(String[] args) {
     
       Scanner scanner = new Scanner (System.in);

         System.out.println("Enter the number of minutes:");

           int minutes = scanner.nextInt();

             int minuteInAYear = 365 * 60 * 24;
                
              int year = minutes / minuteInAYear;

                int days = ( minutes / 60 / 24 ) %365;

                 System.out.printf("%d minutes is approximately  %d  year and %d days" , minutes, year, days);

                   


            }
       }