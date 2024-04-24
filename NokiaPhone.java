import java.util.Scanner;
	public class NokiaPhone{
	
	public static void main (String[] args) {
	
	String prompt = """
	LIST OF MENU FUCTIONS!!!
	Press 
	1 -> PHONEBOOK
	2 -> MESSAGES
	3 -> CHAT
	4 -> CALL REGISTER
	5 ->  TONES
	6 ->  SETTINGS
	7 -> CALL DIVERT
	8 -> GAMES
	9 ->  CALCULATOR
	10 ->  REMINDERS
	11 -> CLOCK
	12 ->  PROFILES
	13 -> SIM SERVICES
	""" ;

	
	System.out.println(prompt);
	Scanner  input = new Scanner(System.in);
	int userInput = input.nextInt();

	switch(userInput) {
		case 1: System.out.println("PHONEBOOK");
			
			String phonebookPrompt = """
			Press 
			1.-> Search
			2.-> Services Nos
			3.-> Add Name
			4.-> Erase
			5.-> Edit
			6.->Assign Tone
			7.->Send B'Card
			8.->Options
			9.-> Speed Dials
			10.->Voice Tags
			""" ;
	
 			System.out.println(phonebookPrompt);
			Scanner  inputPhoneBook = new Scanner(System.in);
			int userPhoneBook = inputPhoneBook.nextInt();

			switch(userPhoneBook) {
	
	
			case 1: System.out.println("Search"); break;
	
			case 2: System.out.println ("Service Nos"); break;
	
      			case 3: System.out.println ("Add Name"); break;
		
			case 4: System.out.println ("Erase"); break;

			case 5: System.out.println ("Edit"); break;
	
			case 6: System.out.println ("Assign Tone"); break;

			case 7: System.out.println ("Send B'Card"); break;

			case 8: System.out.println ("Options"); 

				String Options = """
				Press
				1-> Type Of View
				2-> Memory
				""" ;

				System.out.println(Options);

				Scanner  inputOptions = new Scanner(System.in);

				int userOptions = inputOptions .nextInt();

					switch(userOptions) {

				case 1: System.out.println ("Type Of View"); break;
		
				case- 2: System.out.println ("Memory"); break;

				default: System.out.println ("Whatever You Conceive Him To Be"); break ;

					} 
				break;

			case 9: System.out.println ("Speed Dials"); break;

			case 10: System.out.println ("Voice Tags"); break;
	
			default: System.out.println ("You no get sense"); break;

			}
			break;

		case 2: System.out.println ("MESSAGES"); 

			String messagesPrompt = """
			Press 
			1.-> Write Messages
			2.-> Inbox
			3.-> Outbox
			4.-> Picture Messages
			5.-> Templates
			6.-> Smileys
			7.-> Message Settings
			8.-> Info Service
			9.-> Voice Mailbox Number
			10.->Service Command Editor
				""" ;

	System.out.println(messagesPrompt);
	Scanner  inputMessagePrompt = new Scanner(System.in);
	int userInputMessage = inputMessagePrompt.nextInt();

	switch(userInputMessage) {
	
		case 1: System.out.println("Write Messages"); break;
	
		case 2: System.out.println ("Inbox"); break;
	
      		case 3: System.out.println ("Outbox"); break;
	
		case 4: System.out.println ("Picture Messages"); break;

		case 5: System.out.println ("Templates"); break;
	
		case 6: System.out.println ("Smileys"); break;
		
		case 7: System.out.println ("Message Settings"); 

			String MessageSettings = """
			Press
			1-> Set
			2-> Common 
			""" ;

				
			System.out.println(MessageSettings);

			Scanner  inputMessageSettings = new Scanner(System.in);
	
			int userMessageSettings = inputMessageSettings.nextInt();

			switch(userMessageSettings) {
			case 1: System.out.println ("Set"); 

				String Set = """
				Press
				1-> Message Centre Number
				2-> Messages Sent As
				3-> Message Validity
				""" ;

				System.out.println(Set);

				Scanner  inputSet = new Scanner(System.in);
	
				int userSet = inputSet.nextInt();

				switch(userSet) {
				case 1: System.out.println ("Message Centre Number"); break;

				case 2: System.out.println ("Messages Sent As"); break;
		
				case 3: System.out.println ("Message Validity"); break;

				default: System.out.println ("Find Solace In Your Solitary Solitude"); break;

						} break;

				case 2: System.out.println("Common"); 

					String Common = """
					Press
					1-> Delivery Reports
					2-> Reply Via Same Centre
					3-> Character Support
					""" ;
	
					System.out.println(Common);

					Scanner  inputCommon = new Scanner(System.in);
	
					int userCommon = inputCommon.nextInt();

					switch(userCommon) {

					case 1: System.out.println ("Delivery Reports"); break;

					case 2: System.out.println ("Reply Via Same Centre"); break;
		
					case 3: System.out.println ("Character Support"); break;

					default: System.out.println ("Find Solace In Your Solitary Solitude"); break;

					}



			default: System.out.println ("Find Solace In Your Solitary Solitude"); break;

			}
				break;



	
		case 8: System.out.println ("Info Service"); break;
	
		case 9: System.out.println ("Voice Mailbox Number"); break;

		case 10: System.out.println ("Service Command Editor"); break;
	
		default: System.out.println ("Find Solace In Your Solitary Solitude"); break;
	
		}
			break;
	
      		case 3: System.out.println ("CHAT"); 
		
			String chat = """
			Press 
			  Chat
			""" ;

			System.out.println(chat);

			int userInputChat = input.nextInt();

			switch(userInputChat) {

			case 1: System.out.println ("Chat"); break;
	
			default: System.out.println ("Make Peace With God"); break;
		
				}
	
		case 4: System.out.println ("CALL REGISTER"); 

			String callRegister = """
		Press 
		1.-> Missed Calls
		2.-> Received Calls
		3.-> Dialled Calls
		4.-> Erase Recent Call Lists
		5.-> Show Call Duration
		6.-> Show Call Costs
		7.-> Call Cost Settings
		8.-> Prepaid Credit 
		""" ;

			
	System.out.println(callRegister);

	Scanner  inputCallRegister = new Scanner(System.in);

	int userInputCallRegister = inputCallRegister.nextInt();

	switch(userInputCallRegister)
 
		{
	
		case 1: System.out.println("Missed Calls"); break;
	
		case 2: System.out.println ("Received Calls"); break;
	
      		case 3: System.out.println ("Dialled Calls"); break;
	
		case 4: System.out.println ("Erase Recent Call Lists"); break;

		case 5: System.out.println ("Show Call Duration");

				String showCallDuration = """
				Press 

				1.-> Last Call Duration 
				2.-> All Calls Duration
				3.-> Received Calls Duration
				4.-> Dialled Calls Duration
				5.-> Clear Timers


				""" ;
				
						
				System.out.println(showCallDuration);

				Scanner  inputShowCallDuration = new Scanner(System.in);

				int userInputShowCallDuration = inputShowCallDuration.nextInt();

				switch(userInputShowCallDuration) {

				
	
				case 1: System.out.println("Last Call Duration"); break;
	
				case 2: System.out.println ("All Calls Duration"); break;
	
      				case 3: System.out.println ("Recieved Calls Duration"); break;
	
				case 4: System.out.println ("Dialled Calls Duration"); break;

				case 5: System.out.println ("Clear Timers"); break;
	
				default: System.out.println ("Make Peace With God"); 
		
				}
				break;



				
	
		case 6: System.out.println ("Show Call Costs"); 

				String showCallCost = """
				Press 

				1.-> Last Call Cost
				2.-> All Calls Cost
				3.-> Clear Counters


				""" ;

				System.out.println(showCallCost);

				Scanner  inputShowCallCosts = new Scanner(System.in);

				int userInputShowCallCosts = inputShowCallCosts.nextInt();

				switch(userInputShowCallCosts) {

				
	
				case 1: System.out.println("Last Call Cost"); break;
	
				case 2: System.out.println ("All Calls Cost"); break;
	
      				case 3: System.out.println ("Clear Counters"); break;
	
				
	
				default: System.out.println ("Make Peace With God"); 
		
				}
					break;

				
				

		case 7: System.out.println ("Call Cost Settings");

				String callCostSettings = """
				Press 

				1.-> Call Cost Limit
				2.-> Show Costs In

				""" ;

				System.out.println(callCostSettings);

				Scanner  inputCallCostSettings = new Scanner(System.in);

				int userInputCallCostSettings = inputCallCostSettings.nextInt();

				switch(userInputCallCostSettings) {

				
	
				case 1: System.out.println( "Call Cost Limit"); break;
	
				case 2: System.out.println ("Show Costs In"); break;
	
				default: System.out.println ("Make Peace With God"); 
		
				}
					break;

		

		case 8: System.out.println ("Prepaid Credits"); break;
	
		default: System.out.println ("Find Solace In Your Solitary Solitude"); break;

		}

		case 5: System.out.println ("TONES"); 

			String tones = """
			Press 
	
			1.-> Ringing Tone
			2.-> Ringing Volume
			3.-> Incoming Call Alert
			4.-> Composer
			5.-> Message Alert Tone
			6.-> Keypad Tones
			7.-> Warning And Game Tones
			8.-> Vibrating Alert
			9.-> Screen Saver
	
			""" ;
	
	System.out.println(tones);

	Scanner  inputTones = new Scanner(System.in);

	int userTones = inputTones.nextInt();
	
	switch(userTones)
 
		{
	
		case 1: System.out.println("Ringing Tone"); break;
	
		case 2: System.out.println ("Ringing Volume"); break;

		case 3: System.out.println ("Incoming Call Alert"); break;

		case 4: System.out.println ("Composer"); break;

		case 5: System.out.println ("Message Alert Tone"); break;

		case 6: System.out.println ("Keypad Tones"); break;

		case 7: System.out.println ("Warning And Game Tones"); break;

		case 8: System.out.println ("Vibrating Alert"); break;

		case 9: System.out.println ("Screen Saver"); break;

	
      		default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
		}
			break;

		case 6: System.out.println ("SETTINGS"); 

				
			String Settings = """
			Press 
	
			1.-> Call Settings
		
			2.-> Phone Settings
		
			3.-> Security Settings
		
			4.-> Restore Factory Settings
	
	
			""" ;
	
	System.out.println(Settings);

	Scanner  inputSettings = new Scanner(System.in);

	int userSettings = inputSettings.nextInt();

	switch(userSettings)
 
		{
	
		case 1: System.out.println("Call Settings"); 

					
			String callSettings = """
			Press 
	
				1.-> Automatic Redial
				2.-> Speed Dialling
				3.-> Call Waiting Options
				4.-> Own Number Sending
				5.-> Phone Line In Use
				6.-> Automatic Answer
	
	
				""" ;

	
	
			System.out.println(callSettings);

			Scanner  inputCallSettings = new Scanner(System.in);

			int usercallSettings = inputCallSettings.nextInt();

			switch(usercallSettings)
 
			{
	
			case 1: System.out.println("Automatic Redial"); break;
	
			case 2: System.out.println ("Speed Dialling"); break;

			case 3: System.out.println ("Call Waiting Options"); break;

			case 4: System.out.println ("Own Number Sending"); break;

			case 5: System.out.println ("Phone Line In Use"); break;

			case 6: System.out.println ("Automatic Answer"); break;

		
	
      			default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
			}
				break;

		case 2: System.out.println ("Phone Settings");

			String PhoneSettings = """
			Press 

			1.-> Language
			2.-> Cell Info Display
			3.-> Welcome Note
			4.-> Network Selection
			5.-> Lights
			6.-> Confirm SIM Service
	
			""" ;
	
		System.out.println(PhoneSettings);

		
		Scanner  inputPhoneSettings = new Scanner(System.in);

		
		int userPhoneSettings = inputPhoneSettings.nextInt();

		switch(userPhoneSettings)
 
			{
	
			case 1: System.out.println("Language"); break;
	
			case 2: System.out.println ("Cell Info Display"); break;

			case 3: System.out.println ("Welcome Note"); break;

			case 4: System.out.println ("Netwrork Selection"); break;

			case 5: System.out.println ("Lights"); break;

			case 6: System.out.println ("Confirm SIM Service"); break;

		
	
      			default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
			}
				break;

				
		case 3: System.out.println ("Security Settings"); 

				String SecuritySettings = """
				Press 

				1.-> PIN Code Request
				2.-> Call Barring Service
				3.-> Fixed Dialling
				4.-> Closed User Group
				5.-> Phone Security
				6.-> Change Access Codes
	
				""" ;
	
			System.out.println(SecuritySettings);
		
			Scanner  inputSecuritySettings = new Scanner(System.in);


			int userSecuritySettings = inputSecuritySettings.nextInt();

			switch(userSecuritySettings)
 
			{
	
			case 1: System.out.println("PIN Code Request"); break;
	
			case 2: System.out.println ("Call Brring Service"); break;

			case 3: System.out.println ("Fixed Dialling"); break;

			case 4: System.out.println ("Closed User Group"); break;

			case 5: System.out.println ("Phone Security"); break;

			case 6: System.out.println ("Change Access Codes"); break;

		
	
      			default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
			}
				break;
	
					

		case 4: System.out.println ("Restore Factory Settings"); break;

		default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
		}
			break;


		case 7: System.out.println ("CALL DIVERT"); break;

		case 8: System.out.println ("GAMES"); break;
	
		case 9: System.out.println ("CALCULATOR"); break;

		case 10: System.out.println ("REMINDERS"); break;
	
		case 11: System.out.println ("CLOCK");

				String clock = """
				Press 
				1.-> Alarm Clock
				2.-> Clock Settings
				3.-> Date Setting
				4.-> Stop Watch
				5.-> Countdown Timer
				6.-> Auto Update Of Date And Time
				""" ;
	
				System.out.println(clock);

				Scanner  inputClock = new Scanner(System.in);

				int userClock = inputClock.nextInt();

				switch(userClock)
 
				{
	
				case 1: System.out.println("Alarm Clock"); break;
	
				case 2: System.out.println ("Clock Settings"); break;

				case 3: System.out.println ("Date Setting"); break;

				case 4: System.out.println ("Stop Watch"); break;

				case 5: System.out.println ("Countdown Timer"); break;

				case 6: System.out.println ("Auto Update Of Date And Time"); break;

				default: System.out.println ("Whatever You Conceive Him To Be"); break;
		
				}
					break;
	
		case 12: System.out.println ("PROFILES"); break;
	
		case 13: System.out.println ("SIM SERVICES"); break;
	
		default: System.out.println ("Find Solace In nYour Solitary Solitude"); break;
	
		}

	

	

	
		
	
	}


}	