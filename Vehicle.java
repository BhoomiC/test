abstract class Vehicle{
	int speed;
	int vin;
	String name;

	Vehicle(String name, int vin, int speed){
		this.name = name;
		this.vin = vin;
		this.speed = speed;
	}

	Vehicle(){
		this.name = "Honda";
		this.vin = 987;
		this.speed = 100;
	}

	void details(){
		System.out.println("Model : " + this.name);
		System.out.println("Registration Number : " + this.vin);
		System.out.println("Price : " + this.speed);
	}

	abstract void drive();
	abstract void inspect();

	
}

class Bike extends Vehicle{
	Bike(String name, int vin, int speed){
		super(name, vin, speed);
	}
	
	void drive(){
	System.out.println("You are driving at " + this.speed + "kmph");
	}

	void inspect(){
	System.out.println("Your bike is working fine!!");
	}
}

class Car extends Vehicle{
	Car(String name, int vin, int speed){
		super(name, vin, speed);
	}

	void drive(){
		System.out.println("You are driving at : " + this.speed + "kmph");
	}

	void inspect(){
		System.out.println("Your car is working fine");
	}
}

class Mechanic{
	public static void main(String[] s){
		Car car = new Car("BMW", 1000, 40);
		car.details();
		car.drive();
		car.inspect();
		Bike bike = new Bike("Harley", 2000, 200);
		bike.details();
		bike.drive();
		bike.inspect();
	}

}

