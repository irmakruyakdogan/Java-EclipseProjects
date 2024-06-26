import java.util.Scanner;
public class Main {
    // Klavyeden bir kenar uzunluğu ve o kenara ait yüksekliği girilen üçgenin alanını hesaplayan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kenar uzunluğu girin: ");
        int a = scanner.nextInt();
        System.out.println("Yükseklik girin: ");
        int h = scanner.nextInt();

        int alan = a*h/2;
        System.out.println("Üçegin alanı: " + alan);

    }
}