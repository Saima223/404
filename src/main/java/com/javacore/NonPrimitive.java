package com.javacore;

public class NonPrimitive {
	public static void main(String[] args) {
		//Write a code to check if a string contains the word `"Java"`.
		String s = "I love Java.";
		System.out.println(s.contains("Java"));

		/*What method is used to get the length of a string?
		Q. Which method is used to convert a string to lowercase?*/
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		
        String str = "Hello Java";
        int[] arr = {1, 2, 3, 4};

        System.out.println("String: " + str);
        
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
