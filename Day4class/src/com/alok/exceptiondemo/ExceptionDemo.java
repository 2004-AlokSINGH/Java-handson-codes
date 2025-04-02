//package com.alok.exceptiondemo;
//
//import java.util.Scanner;
//
//class Divide {
//	
//	public void div(int n1, int n2) {
//		try {
//			int res=n1/n2;
//			System.out.print("try block"+ res);
//			return;
//			
//			
//			
//			
//			
//			
//		}catch(Exception e) {
//			System.out.println("error catch block");
//		}
//		finally{
//			System.out.println("hi  finally");
//		}
//	}
//}
//
//
//public class ExceptionDemo {
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		
//		Divide d= new Divide();
//		d.div(n1, n2);
//
//	}
//
//}
//
//



package com.alok.exceptiondemo;

import java.util.Scanner;

class Divide {
	
	public void div(int n1, int n2) {
		try {
			int res=n1/n2;
			System.out.print("try block"+ res);
			return;
		}
		finally{
			System.out.println("hi  finally");
		}
	}
}


public class ExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		try {
		Divide d= new Divide();
		d.div(n1, n2);
		}catch (Exception e) {
			System.out.println("parent will handle");
		}
		

	}

}


