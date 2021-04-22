package exchange2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	ExchangeType extype = new ExchangeType();
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriteClass() {
		String filename = "C:\\Users\\J\\Desktop\\source\\demo1.csv";
		try {
			File file = new File(filename);
			if(file.exists() == true) {
				isFileExist = true;
			} else if(file.exists() == false){
				isFileExist = false;
			}
			fw = new FileWriter(filename, true);					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void headerWrite() throws IOException {
		String head = "";
		if(isFileExist == false) {
			head = "날짜," + "환전대상," + "금액," + "환전결과," + "거스름돈" + "\n";
			fw.write(head);
		} else if(isFileExist == true){
			head = "";
		}
	}
	
	public void dataWrite(ExchangeType extype) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + extype.exchange_type + "," + extype.w + "," 
								+ extype.exchangeResult + "," + extype.cw + "\n";
		fw.write(result);
	}	
}














