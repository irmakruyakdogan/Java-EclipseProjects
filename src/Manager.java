
public class Manager extends Employee{
	
	private int num_employees;

	public Manager(String name, String department, int salary, int num_employees) {
		// extends, super - miras alma
		
		super(name, department, salary);
		this.num_employees = num_employees;
		
	}
	
	public void raiseSalary(int amount) {
		
		System.out.println(amount + " tl increase has been made");
		
	}

	@Override
	public void showInfos() {
		// override
		
		/*System.out.println("İnformations ");
		System.out.println("Name: " + getName());
		System.out.println("Department: " + getDepartment());
		System.out.println("Salary: " + getSalary());
		*/
		
		super.showInfos();
		 
		System.out.println("Employees: " + this.num_employees);
		
	}

	@Override
	public String toString() {
		return "Manager Object";
		
	}

}
