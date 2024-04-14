	public class  LogisticsService {

		public static int calculatePayment(int numberOfDeliveries){

	int result = 0;
	
	if(numberOfDeliveries < 50){

	 result = numberOfDeliveries * 160 + 5000;
	
	}
	
	 if(numberOfDeliveries == 50 && numberOfDeliveries <= 59){
	result = numberOfDeliveries * 200 + 5000;
	}

	if( numberOfDeliveries == 60 && numberOfDeliveries <= 69){
	 result = numberOfDeliveries * 250 + 5000;
	}
		
	if(numberOfDeliveries >= 70){

	 result = numberOfDeliveries * 500 + 5000;

	}
	return result;

}


}