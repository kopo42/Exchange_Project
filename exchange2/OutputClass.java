package exchange2;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
						int won5000, int won1000, int won500, 
						int won100, int won10) {
		System.out.printf("*원화 소수점 금액 : %f\n", cw);
		System.out.println("*원화 거스름 : " + returnWon + "원");
		System.out.println("-10000원 : " + won10000 + "원");
		System.out.println("-5000원 : " + won5000 + "원");
		System.out.println("-1000원 : " + won1000 + "원");
		System.out.println("-500원 : " + won500 + "원");
		System.out.println("-100원 : " + won100 + "원");
		System.out.println("-10원 : " + won10  + "원");
	}
}
