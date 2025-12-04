package week2;

public class MethodLoading {
	int sum (int a, int b) {
		return a + b;
	}
	double sum (double a, double b, double c) {
		return a + b + c;
	}
	float sum(float a, float b, float c, float d) {
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		MethodLoading obj = new MethodLoading();
		System.out.println(obj.sum(2, 2));
		System.out.println(obj.sum(2.44, 2.33, 2.3));
		System.out.println(obj.sum(2.4f, 2.3f, 2.3f));
		
		
		 
		
	}

}
