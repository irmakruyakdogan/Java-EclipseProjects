
public class ClassProject13 {

	public static void main(String[] args) {
		
		AbstractDatabase abstractDatabase = new MysqlDatabase();
		AbstractDatabase abstractDatabase2 = new MongoDatabase();
		
		abstractDatabase.add();
		abstractDatabase2.add();
		
		abstractDatabase.update();
		abstractDatabase2.update();
		
		abstractDatabase.delete();

	}

}
