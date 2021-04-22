package exchange2;
import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	InputFromConsoleClass() {
		scanner = new Scanner(System.in);
	}
	public ExchangeType inputAll() {
		ExchangeType ex = new ExchangeType();
		//ex.w = inputWon; //example
		//ex.type = type;
		
		return ex; //한번에 리턴하기
	}
	
	protected void finalize() {
		scanner.close();
	}
	
	public double inputWon() {
		double w;
		System.out.print("*받은 원화 입력 : ");
		w = scanner.nextInt();
		return w;
		
	}
	public int inputType() {
		int type;
		System.out.print("### 원화 선택 (1: USD, 2: EUR, 3: JPY, 4: END THE SESSION) : ");
		type = scanner.nextInt();
		return type;
	}
}
