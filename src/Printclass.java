

public class Printclass {
	TypeClass t = new TypeClass();
	
	public void printUSD (TypeClass t) {
		System.out.println("달러 지급 : " + t.usd + " USD");
		//System.out.println("달러 지급 = " + Math.round(usd*100)/100.0 + "USD");
		//Math.round() = 실수의 소수점 첫번째 자리를 반올림하여 정수로 리턴
		System.out.println("100 USD - " + t.usd / 100);
		System.out.println(" 50 USD - " + t.usd % 100 / 50);
		System.out.println(" 20 USD - " + t.usd % 50 / 20);
		System.out.println(" 10 USD - " + t.usd % 20 / 10);
		System.out.println("  5 USD - " + t.usd % 10 / 5);
		System.out.println("  2 USD - " + t.usd % 5 / 2);
		System.out.println("  1 USD - " + t.usd % 2 / 1);
	}
	
	public void printEUR (TypeClass t) {
		System.out.println("유로 지급 : " + t.eur + " EUR");
		System.out.println("500 EUR - " + t.eur / 500);
		System.out.println("200 EUR - " + t.eur % 500 / 200);
		System.out.println("100 EUR - " + t.eur % 200 / 100);
		System.out.println(" 50 EUR - " + t.eur % 100 / 50);
		System.out.println(" 20 EUR - " + t.eur % 50 / 20);
		System.out.println(" 10 EUR - " + t.eur % 20 / 10);
		System.out.println("  5 EUR - " + t.eur % 10 / 5);
		
	}
	
	public void printJPY(TypeClass t) {
		System.out.println("엔화 지급 : " + t.jpy + " JPY");
		System.out.println("10,000 JPY - " + t.jpy / 10000);
		System.out.println(" 5,000 JPY - " + t.jpy % 10000 / 5000);
		System.out.println(" 2,000 JPY - " + t.jpy % 5000 / 2000);
		System.out.println(" 1,000 JPY - " + t.jpy % 2000 / 1000);
	}
	
	public void printWon(TypeClass t, int won10000, int won5000, int won1000, int won500, int won100, int won50, int won10) {
		System.out.println("원화 거스름 : " + t.returnkrw + " KRW");
		System.out.println(" 5,000 KRW - " + won5000);
		System.out.println(" 1,000 KRW - " + won1000);
		System.out.println("   500 KRW - " + won500);
		System.out.println("   100 KRW - " + won100);
		System.out.println("    50 KRW - " + won50);
		System.out.println("    10 KRW - " + won10);
		System.out.println("\n==============================\n");
	}
}
