class Drivers{
	public static void main(String[] s){
		Cars car = new Cars(4, "light", "car", "sedan", "diesel");
		Bus bus = new Bus(4, "heavy", "volvo", 72);
		FlyingCar fly = new FlyingCar(4, "light", "car", "Porsche", "petrol", "air");
		SportsCar sports = new SportsCar(4, "light", "car", "Sports Car", "diesel", 120);
		car.display();
		bus.display();
		fly.display();
		sports.display();
		
		
	}
}