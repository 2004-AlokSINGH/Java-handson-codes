package com.alok.demo;


import com.alok.reverse.ResverseNumber;


public class IsPalindrome {
	
	private boolean isPalindrome;
	private int num;
	

	public boolean isPalindrome() {
		return checkPalindrome();
	}


	public boolean checkPalindrome() {		
		ResverseNumber revNum= new ResverseNumber();
		revNum.setNumber(num);		
		return num==revNum.getResult();
		
	}
	


	public void setNum(int num) {
		this.num = num;
	}




}
