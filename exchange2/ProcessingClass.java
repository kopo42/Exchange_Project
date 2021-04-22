package exchange2;

import java.io.IOException;
import java.text.NumberFormat;

public class ProcessingClass {
	OutputClass outClass = null;
	FileWriteClass FileOut = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
		FileOut = new FileWriteClass();
	}
	
	public void returnWon(double cw) {
		int cwResult;
		cwResult = (int)cw;
		int won10000, won5000, returnWon;
		int won1000, won500, won100, won10;
		
		returnWon = (int)(cw/10)*10;
		won10000 = cwResult/10000;
		won5000 = cwResult/5000;
		won1000 = cwResult/1000;
		won500 = cwResult%1000/500;
		won100 = cwResult%500/100;
		won10 = cwResult%100/10;

		outClass.printWon(cw, returnWon, won10000, 
				won5000, won1000, won500, won100, won10);
	}
	public double exchangeUSD(double w) throws IOException {
		double exchangeResult; //ȯ�� ���
		double ex_rate; //ȯ�� ó�� ����
		int usd; //ȯ�� ����� ������
		int cw = 0; 
		ex_rate = ConstValueClass.EX_RATE_USD;
		exchangeResult = w / ex_rate ;
		System.out.printf("*�޷��� ȯ�� ��� : %.2f �޷�\n", exchangeResult);

		usd = (int)exchangeResult; 
		System.out.println("*�޷� ���� : " + usd + "�޷�");

		System.out.println("-100�޷� : "+ usd/100 + "��");
		System.out.println("-50�޷� : " + usd%100/50 + "��");
		System.out.println("-20�޷� : " + usd%100%50/20 + "��");
		System.out.println("-10�޷� : " + usd%100%50%20/10 + "��");
		System.out.println("-5�޷� : " + usd%100%50%20%10/5 + "��");
		System.out.println("-2�޷� : " + usd%100%50%20%10%5/2 + "��");
		System.out.println("-1�޷� : " + usd%100%50%20%10%5%2/1 + "��");
		cw = (int) (w - usd * ex_rate);
		FileOut.headerWrite();
		FileOut.dataWrite("USD", w, usd, cw);
		return cw;
	}
	public double exchangeEUR(double w) throws IOException {
		double exchangeResult; //ȯ�� ���
		double ex_rate; //ȯ�� ó�� ����
		int usd; //ȯ�� ����� ������
		int eur;
		double cw = 0; 
		ex_rate = ConstValueClass.EX_RATE_EUR; //���� ȯ���� ����
		exchangeResult = w / ex_rate ; //���� ȯ���� ���� ��

		System.out.printf("*���η� ȯ�� ��� : %.2f ����\n", exchangeResult);

		eur = (int)exchangeResult; 
		System.out.println("*���� ���� : " + eur + "����");

		System.out.println("-100���� : "+ eur/100 + "��");
		System.out.println("-50���� : " + eur%100/50 + "��");
		System.out.println("-20���� : " + eur%100%50/20 + "��");
		System.out.println("-10���� : " + eur%100%50%20/10 + "��");
		System.out.println("-5���� : " + eur%100%50%20%10/5 + "��");
		System.out.println("-2���� : " + eur%100%50%20%10%5/2 + "��");
		System.out.println("-1���� : " + eur%100%50%20%10%5%2/1 + "��");
		cw = w - eur * ex_rate;
		FileOut.headerWrite();
		FileOut.dataWrite("EUR", w, eur, (int) cw);
		return cw;
	}
	public double exchangeJPY(double w) throws IOException {
		double exchangeResult; //ȯ�� ���
		double ex_rate; //ȯ�� ó�� ����
		int jpy;
		double cw = 0; 
		ex_rate = ConstValueClass.EX_RATE_JPY * 100; //��ȭ ȯ���� ����
		exchangeResult = w / ex_rate ; //���� ȯ���� ���� ��

		System.out.printf("*��ȭ�� ȯ�� ��� : %.2f ��\n", exchangeResult);

		jpy = (int)exchangeResult; 
		System.out.println("*��ȭ ���� : " + jpy + "��");

		System.out.println("-10000�� : "+ jpy/10000 + "��");
		System.out.println("-5000�� : " + jpy%10000/5000 + "��");
		System.out.println("-2000�� : " + jpy%10000%5000/2000 + "��");
		System.out.println("-1000�� : " + jpy%10000%5000%2000/1000 + "��");
		System.out.println("-500�� : " + jpy%10000%5000%2000%1000/500 + "��");
		System.out.println("-100�� : " + jpy%10000%5000%2000%1000%500/100 + "��");
		System.out.println("-50�� : " + jpy%10000%5000%2000%1000%500%100/50 + "��");
		System.out.println("-10�� : " + jpy%10000%5000%2000%1000%500%10%50/10 + "��");
		System.out.println("-5�� : " + jpy%10000%5000%2000%1000%500%10%50%10/5 + "��");
		System.out.println("-1�� : " + jpy%10000%5000%2000%1000%500%10%50%10%5/1 + "��");
		cw = w - jpy * ex_rate;
		FileOut.headerWrite();
		FileOut.dataWrite("JPY", w, jpy, (int) cw);
		return cw;
	}
}
