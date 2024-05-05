import java.util.Arrays;
import java.util.Scanner;


	public class  oddNumbersIndex {
	
		public static void main(String[]  args){

		int[] array = {10,5, 7, 20, 15,30,45,76,18,23};

		int[] result = oddNumber(array);

		System.out.println(Arrays.toString(result));

		}

	public static int[] oddNumber(int[] array){
		int[] oddNum = new int [array.length];


		for(int counter = 0; counter < array.length; counter = counter+2){

			oddNum[counter] = array[counter];
		}
		return oddNum;


	}


	}