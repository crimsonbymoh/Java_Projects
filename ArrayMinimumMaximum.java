

	public class  ArrayMinimumMaximum {
	
	public static void main(String[]  args){

	int[] scores = {10,5, 7, 20, 15,30,45,76,18,23};


	int minimumScore = scores[0];

	int maximumScore = scores[0];

	for (int counter = 0; counter < scores.length ; counter++){


	if (scores[counter] > maximumScore){

		maximumScore = scores[counter];

	}

	if (scores[counter] < minimumScore){

		minimumScore = scores[counter];

	}

	}

 System.out.println("The minimum score in the Array is: " + minimumScore);

 System.out.println("The maximum score in the Array is: " + maximumScore);




}



}