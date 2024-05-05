  
public class TaskSix{

	public static void main(String[]  args){


	int counter = 1;

	int count = 1;

	int multiple1 = 4;

	int multiple2 = 8;

	
	
	for( int i = 0; i < 5; i++) {

	counter = multiple1 * counter;

	System.out.printf("%d " ,counter);
	 	
	}	

	for (int j = 0; j < 5; j++) {

	count = count * multiple2;

	System.out.print(" " + count);
	}

	

	


}

}