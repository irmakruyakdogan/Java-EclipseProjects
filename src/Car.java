
public class Car {
	//Fields
	//Properties
	
	private String color;
	public String model;
	public double engine;
	private int doors;
	
	// Constructors
	public Car(String color, int doors) {
		
		this.color = color;
		this.doors = doors;
		
	}
	
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		}
		else {
			
			System.out.println("Number of doors can only be 2 or 4");
			
		}
		
		this.doors = doors;
	}

	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void showInf() {
		
		System.out.println("Color: " + this.color);
		System.out.println("Doors: " + this.doors);
		
	}

}
