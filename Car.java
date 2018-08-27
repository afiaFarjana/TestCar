package welcome;

public class Car {
	private String type;
	private String model;
	private int year;
	private String region;
	private double cost;
	private double milage;

	public Car() {
		
	}
	public Car(String type, String model) {
		this.type = type;
		this.model = model;
	}
	public Car(String type, String model, int year, String region) {
		this.type = type;
		this.model = model;
		this.year = year;
		this.region = region;
		
	}
	public Car(String type, String model, int year, String region, double cost, double milage) {
		this.type = type;
		this.model = model;
		this.year = year;
		this.region = region;
		this.cost=cost;
		this.milage=milage;
		
		
	}
	
	public void getName() {
		System.out.println("Type: "+type+"\nand name: "+model);
	}
	
	public void getYear() {
		System.out.println("Year of release: "+year);
	}
	public void getMilage() {
		System.out.println("Milage: "+milage);
	}
	public void getCost() {
		System.out.println("Cost of car: "+cost);
	}
	public void getDescription() {
		System.out.println("Type: "+type);
		System.out.println("Model : "+model);
		System.out.println("Year of Release: "+year);
		System.out.println("Region of Release: "+region);
		System.out.println("Cost: "+cost);
		System.out.println("Milage: "+milage);
	}

}
