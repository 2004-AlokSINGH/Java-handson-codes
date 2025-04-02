package com.alok.factpalindrome;

import com.alok.reverse.MainReverse;
import com.sujata.oop.Factorial;
import com.alok.demo.IsPalindrome;


public class factPalindrome {
	
	private int num,ans;
	



	public void setNum(int num) {
		this.num = num;
	}



	public int getAns() {
		return ans;
	}
	
	public int isPalindromefact() {
		IsPalindrome p= new IsPalindrome();
		Factorial f=new Factorial();
		
		p.setNum(121);
		if(p.isPalindrome()) {
			f.setNumber(num);
			return f.getFactorial();
		}else {
			return 0;
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
