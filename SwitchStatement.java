import java.util.Scanner;
	public class SwitchStatement{
	
	public static void main (String[] args) {

	String prompt = """
	WELCOME!!!
	Press 
	1 -> For English
	2 -> For Yoruba
	3 -> For Hausa
	""" ;


	System.out.println(prompt);
	Scanner  input = new Scanner(System.in);
	int userInput = input.nextInt();

	switch(userInput) {
	case 1 -> System.out.println("English");
	
	
	case 2 -> System.out.println ("Yoruba");
	
      	case 3 -> System.out.println ("Hausa");
	
	default -> System.out.println ("You no get sense");
	
	}

	String englishPrompt = """
	Press 
	1 -> For Balance Enquiry
	2 -> For Sim Retrieval 
	3 -> To Speak To An Agent
	""" ;
	
 	System.out.println(englishPrompt);
	Scanner  inputKeyboard = new Scanner(System.in);
	int userInput1 = inputKeyboard.nextInt();
	

	switch(userInput1) {
	case 1 -> System.out.println("Your Balance is: ####");
	
	case 2 -> System.out.println("Dial *556# To Retrieve");
	
	case 3 -> System.out.println("Wait While Your Call Is Connecting....");          
         }
	
	String yorubaPrompt = """
	Press 
	1 -> Fun Ayewo owo re
	2 -> Fun Ati Gba Sim re 
	3 -> Lati Ba Asoju Soro
	""" ;
	
	System.out.println(yorubaPrompt);
	Scanner inputBoard = new Scanner(System.in);
	int userInput2 = inputBoard.nextInt();
	

	switch(userInput2) {
	case 1 -> System.out.println("Balance re je: ####");
	
	case 2 -> System.out.println("Te *556# Lati Gba Sim Re");
	
	case 3 -> System.out.println("Duro Ki Ipe re Jasi Odo Asoju....");
	
	} 

	/**String hausa = """
	Press 
	1 -> For Balance Enquiry
	2 -> For Sim Retrieval 
	3 -> To Speak To An Agent
	""" ;
		
	int userOne = input.nextInt();
	
	switch(userOne) {
	case 1 -> System.out.println("Your Balance is: ####");
	
	case 2 -> System.out.println("Dial *556# To Retrieve");
	
	case 3 -> System.out.println("Wait While Your Call Is Connecting....");
	
	} **/





}

}