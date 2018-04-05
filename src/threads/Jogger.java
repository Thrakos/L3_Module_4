package threads;

public class Jogger implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			System.out.println("Arman");
			System.out.print(" is the best");
		}

	}

}
