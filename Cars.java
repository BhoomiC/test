class Cars extends Automobile{
	String carType;
	String fuel;

	Cars(int wheel, String capacity, String type, String carType, String fuel){
		super(wheel, capacity, type);
		this.carType = carType;
		this.fuel = fuel;
	}

	void display(){
		super.display();
		System.out.println("Car Type " + carType);
		System.out.println("Fuel : " + fuel);
	}

}