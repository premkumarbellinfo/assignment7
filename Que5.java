package assignment7;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

class Student{
	private long id;
	private String name;
	private int marks;
	private double fee;
	
	
	
	public Student(long id, String name, int marks, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fee = fee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
public class Que5 {

	public static void main(String[] args) throws Exception{
		String fileName = "que5.xls";
		
		String path = System.getProperty("user.dir");
		
		
		String absPath = path + File.separator+ fileName;
		File f = new File(absPath);
		
		WritableWorkbook  myexcel = Workbook.createWorkbook(f);
		WritableSheet mysheet = myexcel.createSheet("mysheet", 0);
		String []arr ={"id","name","marks","fees"};
		for(int i=0; i<arr.length;i++){
			Label l = new Label(i,0,arr[i]);
			mysheet.addCell(l);
		}
		String []arrID = {"897","898","899","900"};
		for(int i=0;i<arrID.length;i++){
			Label l2 = new Label(0,i+1,arrID[i]);
			mysheet.addCell(l2);
		}
		
		String []arrName = {"prem","rajeev","rohan","Sai"};
		for(int i=0;i<arrName.length;i++){
			Label l3 = new Label(1,i+1,arrName[i]);
			mysheet.addCell(l3);
		}
		String []arrMarks = {"98","99","100","89"};
		for(int i=0;i<arrMarks.length;i++){
			Label l3 = new Label(2,i+1,arrMarks[i]);
			mysheet.addCell(l3);
		}
		String []arrFees = {"400.00","500.00","600.00","700.00"};
		for(int i=0;i<arrFees.length;i++){
			Label l4 = new Label(3,i+1,arrFees[i]);
			mysheet.addCell(l4);
		}
		
		myexcel.write();
		myexcel.close();
		System.out.println("finished");
		
	}

}
