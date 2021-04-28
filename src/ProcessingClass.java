

import java.util.Scanner;

public class ProcessingClass {
	TypeClass t = new TypeClass();
	ValueClass v = new ValueClass();
	Printclass printer = new Printclass();
	
	public void EXCHANGE_USD (TypeClass t) {
		t.exchange_type = "USD";
		t.result = t.inputWon / ValueClass.EX_RATE_USD;

		t.usd = (int)t.result; // changing the type of variable
		t.krch = t.inputWon - t.usd * ValueClass.EX_RATE_USD;
		
		printer.printUSD(t);
		//return t.usd;
	}
	
	public void EXCHANGE_EUR (TypeClass t) {
		t.exchange_type = "EUR";
		t.result = t.inputWon / ValueClass.EX_RATE_EUR;
		
		t.eur = (int)t.result; // changing the type of variable
		t.krch = t.inputWon - t.eur * ValueClass.EX_RATE_EUR;
		
		printer.printEUR(t);
		//return t.eur;
	}
	
	public void EXCHANGE_JPY (TypeClass t) {
		double ex_rate;
		t.exchange_type = "JPY";
		
		ex_rate = ValueClass.EX_RATE_JPY * 100;
		t.result = t.inputWon / ex_rate;
		
		t.jpy = (int)t.result; // changing the type of variable
		t.krch = t.inputWon - t.jpy * ex_rate;
		printer.printJPY(t);
		//return t.jpy;
	}
	
	public void CHANGE_KR (TypeClass t) {
		
		int won10000, won5000, won1000;
		int won500, won100, won50, won10;
		
		t.returnkrw = (int)(t.krch / 10) * 10;
		
		won10000 = (int)t.krch / 10000;
		won5000 = (int)t.krch / 5000;
		won1000 = (int)t.krch / 1000;
		won500 = (int)t.krch % 1000 / 500;
		won100 = (int)t.krch % 500 / 100;
		won50 = (int)t.krch % 100 / 50;
		won10 = (int)t.krch % 50 / 10;
		
		printer.printWon(t, won10000, won5000, won1000, won500, won100, won50, won10);
	}
}
