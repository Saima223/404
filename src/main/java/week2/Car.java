package week2;

 class Car {
	void startEngine() {
		System.out.println("Engine started");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
	}
	
	 class Vehical extends Car {
		void drive() {
			System.out.println("car is driving");
		}
	 }

}

