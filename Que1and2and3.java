package assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Que1and2and3 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		String fileName = "assignment7.txt";
		
		String path = System.getProperty("user.dir");
		
		String absPath = path + File.separator+ fileName;
		BufferedWriter bw = new BufferedWriter(new FileWriter(absPath));
		
		bw.write(text);
		bw.close();
		
		
		BufferedReader br = new BufferedReader(new FileReader(absPath));
		String line;
		String b = null;
		while((line = br.readLine())!= null){
			 b = line;
			System.out.println(line);
			
		}
		
		String[] arr = b.split(" ");
		System.out.println("Number of words in the file is: "+arr.length );
		System.out.println("enter which word should be replaced");
		String repBefore = scan.next();
		System.out.println("enter the replaced word ");
		String repAfter = scan.next();
		b = b.replaceAll(repBefore, repAfter);
		
		
		BufferedWriter bwAfter = new BufferedWriter(new FileWriter(absPath));
		
		bwAfter.write(b);
		bwAfter.close();
		
		
		
	}
		
	   
	    

	}


