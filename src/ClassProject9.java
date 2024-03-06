import java.util.ArrayList;

public class ClassProject9 {

	public static void main(String[] args) {
		// ArrayList
		
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("The Weeknd");
		groups.add("Adele");
		groups.add("Lana Del Rey");
		groups.add("Post Malone");
		
		System.out.println("1. index: " + groups.get(1));
		System.out.println("3. index: " + groups.get(3));
		
		//System.out.println("ArrayList length: " + groups.size());
		
		//groups.remove("Lana Del Rey");
		
		System.out.println(groups.indexOf("Post Malone"));
		
		for (int i = 0; i < groups.size(); i++) {
			System.out.println(groups.get(i));
		}
		
		//foreach
		
		for (String s:groups) {
			System.out.println(s);
		}

	}

}
