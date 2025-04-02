package com.alok.demo;

import com.alok.reverse.ResverseNumber;

public class MainPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPalindrome p= new IsPalindrome();
		p.setNum(1271);
		boolean t=p.checkPalindrome();
		System.out.print(t);

	}

}
