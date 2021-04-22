package exchange2;
import java.io.IOException;
import java.util.Scanner;

public class MoneyExchange {
	public static void main(String[] args) throws IOException {
		double w; //won
		double cw = 0; //change
		int type = 0;
		
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriteClass FileOut = new FileWriteClass();
		
		
		do {
			w = inputConsole.inputWon();
			type = inputConsole.inputType();

			if(type == ConstValueClass.EX_TYPE_USD) {
				cw = pc.exchangeUSD(w);
			} else if (type == ConstValueClass.EX_TYPE_EUR) {
				cw = pc.exchangeEUR(w);
			} else if (type == ConstValueClass.EX_TYPE_JPY) {
				cw = pc.exchangeJPY(w);
			}
			pc.returnWon(cw);
		} while(type != ConstValueClass.EX_TYPE_EXIT);
		
		FileOut.fileClose();
		
	}
}















































