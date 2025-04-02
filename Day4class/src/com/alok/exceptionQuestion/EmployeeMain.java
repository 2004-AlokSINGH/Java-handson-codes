//package com.alok.exceptionQuestion;
//
//public class EmployeeMain {
//
//	public static void main(String[] args) throws AgeCheckedException, PhoneCheckedException {
//		
//		
//		Employee employee = new Employee("ZYZ", 13, 22, 1234567890L);
//
//	}
//
//




package com.alok.exceptionQuestion;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		try {
			Employee employee = new Employee("ZYZ", 89, 22, 1234567880L);
		} catch (AgeCheckedException e) {
			System.out.println(e.getMessage());
			System.out.println("age checked Exception");
			
		} catch(PhoneCheckedException ee) {
			System.out.println(ee.getMessage());
			System.out.println("phone number exception");
		}

	}

}
