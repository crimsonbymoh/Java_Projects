public class PalindromeChecker{

	public static boolean isPalindrome(int number){

		String digits = "" + number; // "11211"
		
		String numberInReverse = "";

		for(int index = digits.length()-1; index >= 0; index--){
	
			numberInReverse = numberInReverse + digits.charAt(index);
		
		} 

		return digits;
	}





}