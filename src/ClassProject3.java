import java.util.Scanner;

public class ClassProject3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		
		int sayi = scan.nextInt();
		
		int factorial = 1;
		
		while (sayi >= 1) {
			
			factorial = factorial * sayi;
			sayi--;
			
		}
		System.out.println("Sonuç " + factorial);

	}

}
