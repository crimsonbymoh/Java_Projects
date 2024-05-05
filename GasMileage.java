import java.util.Scanner;

  public class GasMileage {
      
    public  static  void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        int totalMiles = 0;
        
        int totalGallons = 0;

	int totalTrips = 0;


           
		
		System.out.print("Enter miles driven or -1 to stop: ");
		int miles = input.nextInt();
		while  (miles == -1) {
			break;
		}
		
		System.out.print("Enter gallons used: ");
			int gallons = input.nextInt();

		while  (gallons == -1) {
			break;
		}
			
			double mpg =  miles / gallons;

  			System.out.println("Miles per gallon for this trip: " + mpg);

					totalMiles = miles;
					totalGallons = gallons;
					totalTrips++;

			double combinedMPG =  totalMiles / totalGallons ; 
                        totalTrips = totalTrips + 1;

		System.out.println("Combined miles per gallon for all trips: " + combinedMPG);
		
			

		if (totalTrips == 0) {

			System.out.println("No trips recorded ");
		}  
			else {
				System.out.println("Total number of trips: " + totalTrips );
		}


            

            }
	}