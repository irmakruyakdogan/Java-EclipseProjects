
public class ClassProject10 {

	public static void main(String[] args) {
		// String Class and Methods
		
		String string = "Luna";
		String string_2 = new String("Luna");
		
		System.out.println(string_2.length());
		
		System.out.println("0. index: " + string_2.charAt(1));
		System.out.println(string_2.charAt(string_2.length()-1));

		System.out.println(string_2.startsWith("L"));
		System.out.println(string_2.endsWith("s"));
	}

}
