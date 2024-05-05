 import java.util.Arrays;
import java.util.Scanner;


	public class  evenNumbersIndex {
	
		public static void main(String[]  args){

		int[] array = {10,5, 7, 20, 15,30,45,76,18,23};

		int[] result = evenNumber(array);

		System.out.println(Arrays.toString(result));

		}

	public static int[] evenNumber(int[] array){
		int[] evenNum = new int [array.length];


		for(int counter = 0; counter < array.length; counter = counter+2){

			evenNum[counter] = array[counter];
		}
		return evenNum;


	}


	}