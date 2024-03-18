import java.util.Scanner;

public class ClassProject4 {

	public static void main(String[] args) {
		
		int i;
		int result = 0;
		for(i = 0; i <= 10; i++) {
			
			result += i;
			
		}
		System.out.print(result);
		
		//An example of a nested loop;
		
		for (int a = 0; a < 8; a++) {
			
			for (int b = 0; b < 8; b++) {
				
				System.out.println("a= " + a + " b= " + b);
				
			}
			
		}
		
		//Use of Break-Continue expressions
		
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			String x;
			
			System.out.println("Karakter sayısı giriniz: ");
			x = scan.nextLine();
			
			if (x.equals("p")) {
				
				System.out.println("Programdan çıkılıyor...");
				break;
				
			}
			System.out.println("Karakter: " + x);
			
			
		}
		int num = 0;
		while(num < 10) {
			
			if(num==4 || num==7) {
				
				i++;
				continue;
				
			}
			
			System.out.println("num : " + num);
			num++;
			
		}

	}

}
