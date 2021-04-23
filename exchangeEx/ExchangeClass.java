package exchangeEx;

public class ExchangeClass {
	static double EX_RATE = 0;
	static double EX_RATE1 = 1133.60;
	static double EX_RATE2 = 1328.08;
	static double EX_RATE3 = 1019.31;
	
	public static int EXCHANGE_USD (double EX_RATE, int type, int won) {
		EX_RATE = EX_RATE1;
		
		double result = won / EX_RATE;
		double change = result % 1;
		
		int usd; //define your variables before use!
		usd = (int)result; // changing the type of variable
		return usd;
	}
	
	public static int EXCHANGE_EUR (double EX_RATE, int type, int won) {
		
		EX_RATE = EX_RATE2;
		
		double result = won / EX_RATE;
		double change = result % 1;
		
		int eur; 
		eur = (int)result; 

		return eur;
	}
	
	public static int EXCHANGE_JPY (double EX_RATE, int type, int won) {
		
		EX_RATE = EX_RATE3;
		
		double result = won / EX_RATE;
		double change = result % 1;
	
		int jpy;	 
		jpy = (int)result; 

		return jpy;
	}
	
	public static int CHANGEWON (int won, double EX_RATE) {
		double result = won / EX_RATE;
		double change = result % 1;
		double changewon = change * EX_RATE;
		int krch;
		krch = (int)changewon - (int)changewon % 10;
		return krch;
	}

}
