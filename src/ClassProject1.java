import java.util.Scanner;

public class ClassProject1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vize notu giriniz: ");
		int vize = scan.nextInt();
		System.out.println("Final notu giriniz: ");
		int finale = scan.nextInt();
		
		int result = (vize*40)/100 + (finale*60)/100;
		System.out.println("Ortalama: " + result);
		
		if (result <= 49) {
			System.out.println("FF");
		}
		else if (49 < result && result <= 75) {
			System.out.println("CB");
		}
		else {
			System.out.println("AA");
		}
		

	}

}
