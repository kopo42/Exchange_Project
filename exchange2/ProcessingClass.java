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
		double ex_rate; //ȯ�� ó�� ����
		
		ex_rate = ConstValueClass.EX_RATE_USD;
		extype.exchangeResult = extype.w / ex_rate ;
		
		System.out.println("====================================");
		System.out.printf("*�޷��� ȯ�� ��� : %.2f �޷�\n", extype.exchangeResult);

		extype.usd = (int)extype.exchangeResult; 
		extype.exchange_type = "USD";
		
		System.out.println("*�޷� ���� : " + extype.usd + "�޷�");
		
		extype.cw = (int) (extype.w - extype.usd * ex_rate);

		return extype.cw;
	}
	public double exchangeEUR(ExchangeType extype) throws IOException {
		double ex_rate; //ȯ�� ó�� ����
		
		ex_rate = ConstValueClass.EX_RATE_EUR; //���� ȯ���� ����
		extype.exchangeResult = extype.w / ex_rate ; //���� ȯ���� ���� ��
		
		System.out.println("====================================");
		System.out.printf("*���η� ȯ�� ��� : %.2f ����\n", extype.exchangeResult);

		extype.eur = (int)extype.exchangeResult; 
		extype.exchange_type = "EUR";
		
		System.out.println("*���� ���� : " + extype.eur + "����");
		
		extype.cw = extype.w - extype.eur * ex_rate;
		
		return extype.cw;
	}
	public double exchangeJPY(ExchangeType extype) throws IOException {
		double ex_rate; //ȯ�� ó�� ����
		
		ex_rate = ConstValueClass.EX_RATE_JPY * 100; //��ȭ ȯ���� ����
		extype.exchangeResult = extype.w / ex_rate ; //���� ȯ���� ���� ��
		
		System.out.println("====================================");
		System.out.printf("*��ȭ�� ȯ�� ��� : %.2f ��\n", extype.exchangeResult);

		extype.jpy = (int)extype.exchangeResult; 
		extype.exchange_type = "JPY";
		
		System.out.println("*��ȭ ���� : " + extype.jpy + "��");
		
		extype.cw = extype.w - extype.jpy * ex_rate;

		return extype.cw;
	}
}
