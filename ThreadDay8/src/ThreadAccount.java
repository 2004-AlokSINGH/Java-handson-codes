
public class ThreadAccount implements Runnable {
	
	private static int balance=2000;
	private String name;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public static int getBalance() {
		return balance;
	}




	public static void setBalance(int balance) {
		ThreadAccount.balance = balance;
	}




	@Override
	public void run() {
		
		if(ThreadAccount.balance>800) {
			System.out.println("withdraw start");
			ThreadAccount.balance-=800;
			
		}
		
	}
	
	
	
	
	
	
	
	
	

}
