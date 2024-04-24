

public class ArrayKata{

	public static int maximumIn(int[] numbers){

		int maximumNumber = numbers[0];

		for(int i = 0; i < numbers.length; i++){

		if(numbers[i] > maximumNumber){

		maximumNumber = numbers[i];

		}

    	     }
			return maximumNumber;
	   }


	public static int minimumIn(int[] numbers){

		int minimumNumber = numbers[0];

		for(int i = 0; i < numbers.length; i++){

		if(numbers[i] < minimumNumber){

		minimumNumber = numbers[i];

			

		}

    	     }
			return minimumNumber;

	   }



	public static int sumOf(int[] numbers) {

		int sum = 0;

	for(int i = 0; i < numbers.length; i++) {

		sum += numbers[i];

		}

		return sum;

	}




	public static int sumOfEvenNumbers(int[] numbers) {

	   int sumOfEven = 0;


	   for(int i = 0; i < numbers.length; i++){

	   if ( numbers[i] % 2 == 0) {

	   sumOfEven += numbers[i];

	  	   }
		}

		return sumOfEven;

  	}


	public static int sumOfOddNumbers(int[] numbers) {

	   int sumOfOdd = 0;

	   for(int i = 0; i < numbers.length; i++){

	   if( numbers[i] % 2 != 0 ) {

	   sumOfOdd += numbers[i];


	  }
	}
		   return sumOfOdd;
  }

	public static int evenNumbersIn(int[] numbers) {

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

	public static int oddNumbersIn(int[] numbers) {

			int counter = 0;

			int oddNumbers = numbers[0];

		for (int i = 0; i <numbers.length; i++ ) {

			if ( numbers[i] %  2 != 0) {

				
			}

		}
			return oddNumbers ; 
	}



	public static int numOfOddNumbersIn(int[] numbers) {

			int counter = 0;

			int numOfOddNumbersIn = 0;

		for (int i = 0; i < numbers.length; i++ ) {

			if ( numbers[i] %  2 != 0) {

				counter++;

				}
				
			}
		return counter ;
	}

	

	public static int numOfEvenNumbersIn(int[] numbers) {

			int counter = 0;

			int numOfEvenNumbersIn = 0;

		for (int i = 0; i < numbers.length; i++ ) {

			if ( numbers[i] %  2 == 0) {

				counter++;

				}
				
			}
		return counter ;
		}


}


