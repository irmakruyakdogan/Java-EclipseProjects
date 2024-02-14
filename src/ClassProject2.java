import java.util.Scanner;

public class ClassProject2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 2000;
		int islem;
		
		System.out.println("1: Bakiye görüntüle");
		System.out.println("2: Para yatırma");
		System.out.println("3: Para çekme");
		System.out.println("4: Çıkış");
		
		islem = scan.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + " Tl'dir.");
			break;
		case 2:
			System.out.println("Yatırılacak miktarı girin: ");
			int miktar = scan.nextInt();
			
			bakiye += miktar;
			System.out.println("Bakiyeniz: " + bakiye + " Tl'dir.");
			break;
		case 3:
			System.out.println("Çekilecek miktarı girin: ");
			miktar = scan.nextInt();
			break;
		case 4:
			System.out.println("Çıkış yapılıyor...");
			break;
		default:
			System.out.println("Geçersiz işlem!");
			break;
		
		
		
		
		
		}

	}

}
