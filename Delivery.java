	public class Delivery{
		public static int Successful(int user){

	int result = 0;
	
	if(user < 50){

	 result = user * 160 + 5000;
	
	}
	
	if(user == 50 && user <= 59){
	result = user * 200 + 5000;
	}

	if( user == 60 && user <= 69){
	 result = user * 250 + 5000;
	}
		
	if(user >= 70){

	 result = user * 500 + 5000;

	}
	return result;

}




	}