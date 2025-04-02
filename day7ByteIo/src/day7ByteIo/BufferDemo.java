package day7ByteIo;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferDemo {
	
	public static void main (String args[]) {
		
		
		try {
			BufferedOutputStream bfo=new BufferedOutputStream(System.out);
			
			byte arr[]= {'a','l'};
			
			bfo.write(arr);
			
			
		}catch(IOException e) {
			System.out.println("e");
		}
	}

}
