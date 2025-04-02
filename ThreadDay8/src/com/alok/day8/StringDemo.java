package com.alok.day8;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String s1="Alok";
		
		s1.concat("Singh");
		String s2=s1.concat("Singh");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuilder str1=new StringBuilder("alok");
		str1.append("singhPublicis");
		System.out.println(str1);

	}

}
