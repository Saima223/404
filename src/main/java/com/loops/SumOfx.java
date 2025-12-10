package com.loops;
//Find the sum of first 100 natural numbers.

public class SumOfx {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//huzaifa Q.
				int h = 1;
				for (h++; h <=10; h++) {
					if(h%2==0) {
						continue;
					}
					System.out.println(h);
			}
	}

}
