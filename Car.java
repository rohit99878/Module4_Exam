class Car{
	private int year;
	private String make;
	private double speed;
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	
	void accelerate(){
		this.speed+=1;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public double getSpeed(){
		return this.speed;
	}
	
}