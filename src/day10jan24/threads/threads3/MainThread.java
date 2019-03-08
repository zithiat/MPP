package day10jan24.threads.threads3;

import java.util.*;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Inside main  ");
//		int i;
//		for (i = 1; i <= 10; i++) {
//			PrimeThread p = new PrimeThread(i);
//			p.start();
//		}
		
		SortedMap<Integer, List<Integer>> list = new TreeMap<Integer, List<Integer>>();
		for (int i = 0; i < 5; i++) {
			List<Integer> subList = new ArrayList<Integer>();
			FindPrimeNumberThread fpn = new FindPrimeNumberThread((i * 2000) + 1, (i + 1) * 2000, i);
			fpn.start();
			subList = fpn.getPrimeList();
			list.put(i, subList);
			Thread.sleep(500);
		}
		Thread.sleep(1000);
		System.out.println(list);
	}
}
