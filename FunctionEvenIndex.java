	
public class FireDrill{
public static int evenNumbersIndex(int[] numbers) {

			int counter = 0;

			int evenNumbers = numbers[0];

		for (int i =  0; i < numbers.length; i++ ) {

				counter++;

			if ( numbers[i] %  2 == 0) {

				evenNumbers = numbers[i];

				}

			 
		}
		
	return evenNumbers ; 
	}

}