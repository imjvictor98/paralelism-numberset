package numeros.primos;

import java.util.ArrayList;
import java.util.List;

//Project STUB
	//Class
		//Getters and Setters
			//Constructor
				//Methods and Unimplemented methods
	             	

public class Set implements Runnable {
	private int start;
	private int end;
	private int sum;
	
	
	public Set(int start, int end) {
		setStart(start);
		setEnd(end);
	}
	
	
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

	public boolean isPrime(int number) {
		for (int i = 2; i < number; i += 1) 
	        if(number % i == 0) return false;
	    return true;
	}
	
	public List<Integer> primeList() {
		List<Integer> primes = new ArrayList<Integer>();
		int startOfArray = getStart();
		int endOfArray = getEnd();
		
		for (int i = startOfArray; i < endOfArray; i += 1) {
			
			if (isPrime(i)) primes.add(i);
		}
		
		return primes;
	}
	
	public int sumOfPrimes() {
		List<Integer> primes = new ArrayList<Integer>();
		int sum = 0;
		
		primes = primeList();
		
		for (int i = 0; i < primes.size(); i += 1) {
			sum += primes.get(i);
		}
		
		return sum;
	}
	
	@Override
	public void run() {
		int sumAll = 0;
		
		sumAll = sumOfPrimes();
		
		sum += sumAll;
		
	}
}
