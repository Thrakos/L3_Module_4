package threads;

public class Runner {
	
	public static void main(String[] args) {
		Walker walker = new Walker();
		Thread thing1 = new Thread(walker);
		Thread thing2 = new Thread(()-> {
			for (int i = 0; i < 1000000; i++) {
				System.out.println("Arman");
			}
		});
		thing1.start();
		thing2.start();
	}
}
