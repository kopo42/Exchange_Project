package exchange2;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
						int won5000, int won1000, int won500, 
						int won100, int won10) {
		System.out.printf("*��ȭ �Ҽ��� �ݾ� : %f\n", cw);
		System.out.println("*��ȭ �Ž��� : " + returnWon + "��");
		System.out.println("-10000�� : " + won10000 + "��");
		System.out.println("-5000�� : " + won5000 + "��");
		System.out.println("-1000�� : " + won1000 + "��");
		System.out.println("-500�� : " + won500 + "��");
		System.out.println("-100�� : " + won100 + "��");
		System.out.println("-10�� : " + won10  + "��");
	}
}
