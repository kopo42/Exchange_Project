package exchange2;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
						int won5000, int won1000, int won500, 
						int won100, int won10) {
		System.out.println("====================================");
		System.out.printf("*원화 거스름돈 : %.2f 원\n",cw);
		System.out.println("*원화 거스름 돈 지급 : " + returnWon + "원");
		System.out.println("====================================");
	}
}
