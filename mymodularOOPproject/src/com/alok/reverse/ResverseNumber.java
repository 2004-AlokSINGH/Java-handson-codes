package com.alok.reverse;


public class ResverseNumber {
	
	private int number , result;



	public void setNumber(int number) {
		this.number = number;
	}



	public int getResult() {
		result=doreverse();
		return result;
	}
	
	
	private int doreverse() {
	    int ans = 0;
	    while (number > 0) {
	        int digit = number % 10; 
	        ans = ans * 10 + digit;  
	        number = number / 10;    
	    }
	    return ans;
	}


	public static void main(String[] args) {
		

	}

}
