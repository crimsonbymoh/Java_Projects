 
public class TaskEight{

	public static void main(String[]  args){


	int counter = 1;

	int count = 1;

	int multiple1 = 4;

	int multiple2 = 8;

	int sum = 0;

	int sum2 = 0;

	
	
	for( int i = 0; i < 5; i++) {

	counter = multiple1 * counter;

	sum += counter ;
	 	
	}	
	
	for (int j = 0; j < 5; j++) {

	count = count * multiple2;

	sum2 += count ;
	}
	
	int totalSum = sum + sum2;
	
	System.out.printf("%d " ,totalSum);
	


}

}