import java.util.Arrays;

public class EvenOddNumbers {

	public static int[] replaceEvenOddWithBinary(int[] numbers) {
        
        	int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
  
           	 if (numbers[i] % 2 == 0) {

                	result[i] = 0;
            	 } 

	    	  else  if (numbers[i] % 2 != 0) {

                  result[i] = 1;
            	 }
		}

       		 return result;
    	}

    public static void main(String[] args)  {
    
        int[] sampleNumbers = {4, 5, 8, 8, 8, 2, 9};

	System.out.println("Sample Input : " + Arrays.toString(sampleNumbers));
        
        int[] output = replaceEvenOddWithBinary(sampleNumbers);
        
        
        System.out.println("Sample Output: " +Arrays.toString(output));
        
	}
}

