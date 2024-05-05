public class arrayDoubleLength{

	public static void main(String... args){

	int[] arrayInput = {458};

	int[] result = processArray(arrayInput);

	System.out.println(java.util.Arrays.toString(result));

	}

	public static int[] processArray(int[] input) {

		String numberStr = Integer.toString(input[0]);

		int[]  outputArray = new int[2 * numberStr.length()];

		for (int i = 0, j = 0; i < numberStr.length(); i++) {
		
			int digit = Character.getNumericValue(numberStr.charAt(i));

				outputArray[j++] = digit;

				outputArray[j++] = digit * 2;

		}

		return outputArray;


	}




}