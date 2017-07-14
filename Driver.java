class Driver{
	public static void main(String[] s){
		Car c1 = new Car();
		Car c2 = new Car();
		c1.accelerate(20);
		System.out.println(c1.spped);
		c1.brake(2);	
		System.out.println(c1.speed);
	}
}