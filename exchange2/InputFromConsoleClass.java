package exchange2;

import java.util.Scanner;

public class InputFromConsoleClass {
	ExchangeType extype = new ExchangeType();
	Scanner scanner = null;
	InputFromConsoleClass() {
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}
	
	public double inputWon(ExchangeType extype) {
		System.out.print("*���� ��ȭ �Է� : ");
		extype.w = scanner.nextInt();
		return extype.w;
	}
	public int inputType(ExchangeType extype) {
		System.out.print("ȯ���� ���� ���� (0:����, 1:USD, 2:EUR, 3:JPY) ? ");
		extype.type = scanner.nextInt();
		return extype.type;
	}
}

