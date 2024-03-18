
public class MongoDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("Mongo is updated");
		
	}

	@Override
	void get() {
		System.out.println("Mongo recevied the data");
		
	}

}
