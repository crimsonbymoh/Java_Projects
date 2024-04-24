import java.util.Scanner;
 
public class SevenSegmentDisplay { 
 
	public static void main(String[] args) {  

		for(int count = 0; count < 10; count++ ) {

	Scanner scanner = new Scanner(System.in); 
 
	System.out.print("Enter Digits to display: ");  

	String digitToDisplay = scanner.nextLine();  

	switch(digitToDisplay) 
		
		{
  
      		 case "1111110":  
			System.out.println(" __\n|  | \n|__|"); 
			 break; 
 
     		 case "0110000": 
			System.out.println("   \n  |\n  |");  
			break; 
 
      		 case "1101101":
			 System.out.println(" __ \n __|\n|__ ");  
			 break; 
 
     		 case "1111001": 
			System.out.println(" __\n __|\n __|");  
			break;  

      		 case "0110011": 
			System.out.println("   \n|__|\n   |");  
			break;  

     		 case "1011011": 
			System.out.println(" __ \n|__ \n __|");  
			break; 
 
      		 case "1011111": 
			System.out.println(" __ \n|__ \n|__|");  
			break;  

      		 case "1110000": 
			System.out.println(" __ \n   |\n   |");
			break; 
 
      		 case "1111111":
			System.out.println(" __ \n|__|\n|__|"); 
			break; 
 
     		 case "1110011": 
			 System.out.println(" __ \n|__|\n __|");
			 break; 

		}
	    }


	}
}
