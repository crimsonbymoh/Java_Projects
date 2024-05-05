import java.util.Scanner;

	public class PurchaseCalculator{

	public static void main(String[]  args){

	Scanner scanner = new Scanner(System.in);

	System.out.println(" WElCOME TO E-STORE: ");
	
	System.out.print(" Please Enter Name:  ");

	String name = scanner.nextLine();

	int counter = 1 ;

	int totalCost = 0 ;
	

	while(counter <= 10) {

	System.out.print(" Please Enter Price for item " + counter + ": ");

	int itemPrice = scanner.nextInt();

	totalCost += itemPrice;

		counter ++;

		}

	System.out.printf(" Customer Name: " + name + "\n" +  " Original Cost: " +  totalCost + "\n");

	int discount = totalCost * 10 / 100;
	
	int discountedCost = totalCost - discount;

	
	if (totalCost >= 200) {

		System.out.println(" Discounted Cost : " + discountedCost);
			
			}

	else if (totalCost <= 200) {
		
	System.out.println(" Discounted Cost: 0 (no discount added)  ");
		
		}

	System.out.println(" Thanks For Your Patronage  "); 
	
	}


}
