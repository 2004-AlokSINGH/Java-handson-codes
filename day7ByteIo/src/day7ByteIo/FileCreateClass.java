package day7ByteIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateClass {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fs =null;
			
			fs= new FileOutputStream("demo.txt");
			
			byte[] arr= {'A','L','o','k','\n','S','i','n'};
			
			
			fs.write(arr);
			System.out.println("file created");
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				fs.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
