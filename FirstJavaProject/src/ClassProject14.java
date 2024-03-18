
public class ClassProject14 {
	
	public static void result() {
		System.out.println("Student");
	}

	public static void main(String[] args) {
		// static
		
		People people = new People();
		People people1 = new People();
		People people2 = new People();
		
		System.out.println("People: " + people.nu_people);
		
		
		System.out.println("People: " + People.result());
		
		result();
	}

}
