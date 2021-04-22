package exchange2;
import java.io.IOException;

public class MoneyExchange {
	public static void main(String[] args) throws IOException {		
		
		ExchangeType extype; //선언만, 생성은 반복문 내에서
		FileWriteClass FileOut = new FileWriteClass();
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileOut.headerWrite();
		do {
			extype = new ExchangeType();
			extype.w = inputConsole.inputWon(extype);
			extype.type = inputConsole.inputType(extype);
			
			if (extype.type == ConstValueClass.EX_TYPE_USD) {
				extype.cw = pc.exchangeUSD(extype);
				FileOut.dataWrite(extype);
			} else if (extype.type == ConstValueClass.EX_TYPE_EUR) {
				extype.cw = pc.exchangeEUR(extype);
				FileOut.dataWrite(extype);
			} else if (extype.type == ConstValueClass.EX_TYPE_JPY) {
				extype.cw = pc.exchangeJPY(extype);
				FileOut.dataWrite(extype);
			} 
			pc.returnWon(extype);
		} while(extype.type != ConstValueClass.EX_TYPE_EXIT);
		FileOut.fileClose();
	}
}















































