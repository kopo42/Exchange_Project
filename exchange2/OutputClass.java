package exchange2;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
						int won5000, int won1000, int won500, 
						int won100, int won10) {
		System.out.println("====================================");
		System.out.printf("*��ȭ �Ž����� : %.2f ��\n",cw);
		System.out.println("*��ȭ �Ž��� �� ���� : " + returnWon + "��");
		System.out.println("====================================");
	}
}
