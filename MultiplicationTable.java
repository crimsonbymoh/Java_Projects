public class MultiplicationTable{
	public static void main(String[]  args){

		int result = 0;

	for (int counter = 1; counter <= 12; counter++) {

		for (int count = 1; count <= 12; count++) {
		result = counter * count;

		System.out.printf("%s x %s = %d\t", count, counter, result);
		}
	System.out.print( "\n");
	}

	}


}