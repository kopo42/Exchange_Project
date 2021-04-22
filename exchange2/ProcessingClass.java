package exchange2;

import java.io.IOException;

public class ProcessingClass {
	OutputClass outClass = null;
	FileWriteClass FileOut = new FileWriteClass();
	ExchangeType extype;
	
	ProcessingClass() {
		outClass = new OutputClass();
		FileOut = new FileWriteClass();
		extype = new ExchangeType();
	}
	
	public void returnWon(ExchangeType extype) {
		int cwResult;
		cwResult = (int)extype.cw;
		int won10000, won5000;
		int won1000, won500, won100, won10;
		
		extype.krch = (int)(extype.cw/10)*10;
		won10000 = cwResult/10000;
		won5000 = cwResult/5000;
		won1000 = cwResult/1000;
		won500 = cwResult%1000/500;
		won100 = cwResult%500/100;
		won10 = cwResult%100/10;

		outClass.printWon(extype.cw, extype.krch, won10000, 
				won5000, won1000, won500, won100, won10);
	}
	public double exchangeUSD(ExchangeType extype) throws IOException {
		double ex_rate; //환율 처리 변수
		
		ex_rate = ConstValueClass.EX_RATE_USD;
		extype.exchangeResult = extype.w / ex_rate ;
		
		System.out.println("====================================");
		System.out.printf("*달러로 환전 결과 : %.2f 달러\n", extype.exchangeResult);

		extype.usd = (int)extype.exchangeResult; 
		extype.exchange_type = "USD";
		
		System.out.println("*달러 지급 : " + extype.usd + "달러");
		
		extype.cw = (int) (extype.w - extype.usd * ex_rate);

		return extype.cw;
	}
	public double exchangeEUR(ExchangeType extype) throws IOException {
		double ex_rate; //환율 처리 변수
		
		ex_rate = ConstValueClass.EX_RATE_EUR; //유로 환율로 변경
		extype.exchangeResult = extype.w / ex_rate ; //유로 환율로 계산된 값
		
		System.out.println("====================================");
		System.out.printf("*유로로 환전 결과 : %.2f 유로\n", extype.exchangeResult);

		extype.eur = (int)extype.exchangeResult; 
		extype.exchange_type = "EUR";
		
		System.out.println("*유로 지급 : " + extype.eur + "유로");
		
		extype.cw = extype.w - extype.eur * ex_rate;
		
		return extype.cw;
	}
	public double exchangeJPY(ExchangeType extype) throws IOException {
		double ex_rate; //환율 처리 변수
		
		ex_rate = ConstValueClass.EX_RATE_JPY * 100; //엔화 환율로 변경
		extype.exchangeResult = extype.w / ex_rate ; //유로 환율로 계산된 값
		
		System.out.println("====================================");
		System.out.printf("*엔화로 환전 결과 : %.2f 엔\n", extype.exchangeResult);

		extype.jpy = (int)extype.exchangeResult; 
		extype.exchange_type = "JPY";
		
		System.out.println("*엔화 지급 : " + extype.jpy + "엔");
		
		extype.cw = extype.w - extype.jpy * ex_rate;

		return extype.cw;
	}
}
