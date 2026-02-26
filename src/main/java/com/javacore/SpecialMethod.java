package com.javacore;

/*constructor 
 * use to initialize obj and 
has same name as class ans 
no return type
*/
public class SpecialMethod {
	
	SpecialMethod(){
		System.out.println("Special method is created who have same name as class");
		System.out.println("have no return type and use to initialize obj");
	}
	public static void main(String[] args) {
		SpecialMethod student = new SpecialMethod();
	}

}
