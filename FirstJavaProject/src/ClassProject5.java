import java.util.Scanner;

public class ClassProject5 {
	
	public static void result(int a, int b, int c) {
		
		System.out.println("Ortalama: " + (a+b+c)/3);
		
	}

	public static void factoriel() {
		// Functions-Methods
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayı: ");
		
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		
		while (sayi > 0) {
			
			faktoriyel *= sayi;
			sayi--;
			
		}
		System.out.println("Faktöriyel: " + faktoriyel);
		
	}
	
	/*public static void main(String[] args) {
		
		factoriel(); //Function call
		result(15, 27, 39);
		
	}
	*/
	
	public static int result_sum(int a) {
		
		return a + 5;
		
	}
	public static int result_mul(int a) {
		
		return a * 2;
		
	}
	public static int result_minus(int a) {
		
		return a - 6;
		
	}
	public static void main(String[] args) {
		
		System.out.println("Sonuç: " + result_sum(result_mul(result_minus(8))));
		
	}
	

}
