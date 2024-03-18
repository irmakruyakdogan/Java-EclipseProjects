
public class MysqlDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("Bread is updated");
		
	}

	@Override
	void get() {
		System.out.println("Bread recevied the data");
		
	}

}
