package com.loops;
//✅ 12. How does a while loop differ from a do-while loop? 

public class Q12 {
	public static void main(String[] args) {
		int a= 10;
		while(a < 5) {
			System.out.println("won't run");
		}
		
		//do-while loop
		do{
			System.out.println("it'll run");
		}while(a < 5);
	}

}
