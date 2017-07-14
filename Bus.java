class Bus extends Automobile{
	int passengers;
	Bus(int wheel, String capacity, String type, int passengers){
		super(wheel, capacity, type);
		this.passengers = passengers;
	}

	void display(){
	super.display();
	System.out.println("Passengers : " + passengers);
	}
}