package day7ByteIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fs=new FileInputStream("demo.txt");
			
			int ch;
			while((ch=fs.read())!=-1) {
				System.out.println((char)ch);
			}
		}catch(FileNotFoundException e) {
			System.out.println("file error");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
