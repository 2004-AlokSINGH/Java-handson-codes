
public class MainAccount {

	public static void main(String[] args) {
		
		
		ThreadAccount obj1 = new ThreadAccount();
		obj1.setName("manan");
		obj1.run();
		
		
		ThreadAccount obj2 = new ThreadAccount();
		obj2.setName("chirag");
		obj2.run();

	}

}
