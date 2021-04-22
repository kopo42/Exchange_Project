package exchange2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriteClass {
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriteClass() {
		try {
			File file = new File("C:\\Users\\J\\Desktop\\source\\demo3.csv");
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("C:\\Users\\J\\Desktop\\source\\demo3.csv", true);					
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
		if(isFileExist == false) {
			String head = "날짜," + "환전대상," + "금액," + "환전결과," + "거스름돈" + "\n";
			fw.write(head);
		}		
	}
	
	public void dataWrite(String exchangetype, double w, int cw, int returnwon) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		
		String result = sdf.format(c.getTime()) + "," + exchangetype + "," + w + "," + cw + "," + returnwon + "\n";
		fw.write(result);
	}	
}














