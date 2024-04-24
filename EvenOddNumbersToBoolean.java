import java.util.Arrays;
public class EvenOddNumbersToBoolean {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 8, 8, 8, 2, 9};

        boolean[] result = replaceEvenOddWithBoolean(numbers);

	System.out.println("Sample Input : " + Arrays.toString(numbers));


	System.out.println("Sample Output : " + Arrays.toString(result));
        
        
    }

    public static boolean[] replaceEvenOddWithBoolean(int[] numbers) {

        boolean[] results = new boolean[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                results[i] = false; 
 
            } else {

                results[i] = true;   
            }
        }
        
        return results;
	}

}