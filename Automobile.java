class Automobile{
	int wheel;
	String capacity;
	String type;
	
	Automobile(int wheel, String capacity, String type){
		this.wheel = wheel;
		this.capacity = capacity;
		this.type = type;
	}

	void display(){
		System.out.println("No of Wheels : " + wheel);
		System.out.println("Capacity : " + capacity);
		System.out.println("Type : " + type);
	}

}