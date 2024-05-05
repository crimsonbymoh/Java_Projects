import java.util.Scanner;

public class PurchaseCalculatorThree{

	public static void main(String[]  args){

		Scanner scanner = new Scanner(System.in);

		System.out.println(" WElCOME TO E-STORE: ");
	
		System.out.print(" Please Enter Customer Name:  ");

		String name = scanner.nextLine();


		System.out.print(" Please Enter Percentage Discount:  ");

		int percentageDiscount = scanner.nextInt();

	



		int counter = 1 ;

		int totalCost = 0 ;
	
	        
		while (counter < 1000)  {

		System.out.print(" Please Enter cost for item "+ counter + " or -1 to quit : " );
		int itemPrice = scanner.nextInt();
		
		if (itemPrice == -1)
		break;
		totalCost += itemPrice;
		counter++;

		}

		System.out.printf(" Customer Name: %s\n Number of Items Bought: %d\n Percentage Discount: %d\n Original cost: %d", name, counter - 1, percentageDiscount, totalCost);


		double discount = totalCost * percentageDiscount / 100;
	
		double discountedCost = totalCost - discount;

	
		if (totalCost >= 200) {

			System.out.printf( "%s%.2f", " \n Discounted Cost: ", discountedCost);
			
			}

		else if (totalCost <= 200) {
		
		System.out.printf( "\n" + " Discounted Cost: 0 (no discount added)  ");
		
		}

		System.out.println( "\n" + " Thanks For Your Patronage  "); 
	
		}


	}
