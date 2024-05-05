import java.util.Scanner;

  public class SalesCommission {
      
    public  static  void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);


	

	System.out.println("Enter the value of item1 sold: ");

	double item1 = scanner.nextDouble();

	System.out.println("Enter the value of item2 sold: ");

	double item2 = scanner.nextDouble();

	System.out.println("Enter the value of item3 sold: ");

	double item3 = scanner.nextDouble();

	System.out.println("Enter the value of item4 sold: ");

	double item4 = scanner.nextDouble();

	
	

	double weeklySalary = 200;

	System.out.println("value of WeeklySalary:" + weeklySalary );

	double grossSales = item1 * 239.99 + item2 * 129.75 + item3 * 99.95 + item4 * 350.89;

	System.out.println("value of grossSales:" + grossSales);

	double commission = grossSales * 0.09;

	System.out.println("value of commission:" + commission);

	double earning = weeklySalary + commission;

	System.out.println("value of earning:" + earning);



	


	
	

	
	

           

            }
       }