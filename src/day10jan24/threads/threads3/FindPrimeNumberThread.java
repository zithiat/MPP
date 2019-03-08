package day10jan24.threads.threads3;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class FindPrimeNumberThread extends Thread {
	int startNum, endNum;
	long threadNum;
	List<Integer> primeList = new ArrayList<Integer>();
	
	public FindPrimeNumberThread(int startNum, int endNum, long threadNum) {
		this.startNum = startNum;
		this.endNum = endNum;
		this.threadNum = threadNum;
	}
	
	public void run() {
		for (int i = startNum; i <= endNum; i++) {
			if (isPrime(i)) {
				primeList.add(i);
			}
		}
	}
	
	boolean isPrime(int n) {
		boolean f = true;
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				f = false;
				break;
			}
		}
		return f;
	}

	public List<Integer> getPrimeList() {
		return primeList;
	}
}
