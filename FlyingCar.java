class FlyingCar extends Cars{
	String mode;
	FlyingCar(int wheel, String capacity, String type, String carType, String fuel, String mode){
		super(wheel, capacity, type, carType, fuel);
		this.mode = mode;
	}

	void display(){
		super.display();
		System.out.println("You are in flying car!! Have areat time!");
	}

}