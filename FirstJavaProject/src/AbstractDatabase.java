
public abstract class AbstractDatabase {
	
	public void add() {
		System.out.println("Bread");
	}
	public void delete() {
		System.out.println("Bread is out");
	}

	abstract void update();
	abstract void get();
}
