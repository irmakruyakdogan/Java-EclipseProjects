
public class ClassProject11 {

	public static void main(String[] args) {
		// Inheritance
		
		//Employee employee = new Employee("Irmak Rüya AKDOĞAN", "It Systems and Technologies", 5000);
		
		//employee.showInfos();

		Manager manager = new Manager("Irmak Rüya AKDOĞAN", "It Systems and Technologies", 5000, 16);
		//manager.showInfos();
		
		//manager.raiseSalary(500);
		
		Employee employee = new Manager("Luna<3", "IT", 600, 5);
		
		System.out.println(manager);
		
	}

}
