package welcome;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("SUV", "Mahindra Scorpio");
		Car c3 = new Car("Crossover","Maruti Suzuki S-Cross",2017,"New Delhi");
		Car c4 = new Car("Convertible","Mercedes-AMG SLC 43",2017,"New Delhi",148869.00,12.82);

		System.out.println("Description for first car: ");
		c1.getName();
		System.out.println("Description for second car: ");
		c2.getName();
		System.out.println("Description for third car: ");
		c3.getYear();
		System.out.println("Description for fourth car: ");
		c4.getDescription();
	}

}
