
public class ClassProject6 {
		// OOP (Object Oriented Programming)
	
	public static void main (String[] args) {
		
		Car car_1 = new Car("White", 4);
		//car_1.color = "White";
		//car_1.setColor("White");
		car_1.model = "Fiat Egea";
		car_1.engine = 1.6;
		//car_1.doors = 4;
		//car_1.setDoors(3);
		
		//System.out.println("Color: " + car_1.color);
		//System.out.println("Color: " + car_1.getColor());
		System.out.println("Model: " + car_1.model);
		System.out.println("Engine: " + car_1.engine);
		//System.out.println("Doors: " + car_1.doors);
		//System.out.println("Doors: " + car_1.getDoors());
		
		car_1.showInf();

	}
	

}
