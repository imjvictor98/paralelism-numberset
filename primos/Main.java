package numeros.primos;

public class Main {
	public static void main(String[] args) {
		Set first = new Set(0, 50);
		Set second = new Set(51, 100);
		
		Thread fThread = new Thread(first);
		Thread sThread = new Thread(second);
		
		fThread.start();
		sThread.start();
		
		try {
			fThread.join();
			sThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of primes in range = " + (first.getSum() + second.getSum()));
	}
}
