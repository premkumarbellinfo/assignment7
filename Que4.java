package assignment7;

import java.io.File;

import jxl.Workbook;
import jxl.write.*;



public class Que4 {

	public static void main(String[] args) throws Exception {
		String fileName = "que4.xls";
		
		String path = System.getProperty("user.dir");
		
		String absPath = path + File.separator+ fileName;
		File f = new File(absPath);
		WritableWorkbook  myexcel = Workbook.createWorkbook(f);
		WritableSheet mysheet = myexcel.createSheet("mysheet", 0);
		String []arr = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		for(int i=0; i<arr.length;i++){
			Label l = new Label(0,i,arr[i]);
			mysheet.addCell(l);
			
		}
		myexcel.write();
		myexcel.close();
		System.out.println("finished");
	}

}
