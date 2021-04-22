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
		System.out.print("*받은 원화 입력 : ");
		extype.w = scanner.nextInt();
		return extype.w;
	}
	public int inputType(ExchangeType extype) {
		System.out.print("환전할 종류 선택 (0:종료, 1:USD, 2:EUR, 3:JPY) ? ");
		extype.type = scanner.nextInt();
		return extype.type;
	}
}

