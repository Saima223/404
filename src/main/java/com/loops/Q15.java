package com.loops;

import java.util.Scanner;

/*In what real-life scenarios is a while loop more useful than a for loop?
--> when you don't know the number of iteration 
	it needs a boolean condition to decide whether to continue running
*/

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		int a =5;

		while (true) {
		    System.out.print("Enter password: ");
		    password = sc.nextLine();
		    
		    if (password.equals("open123")) break;
		    System.out.println("Wrong password, try again.");
		}
		
	//Q14.Can a while loop run 0 times? Explain. --> if condition false on the 1st check
		while(a <= 1) {
			System.out.println("won't run");
		}
	}

}
