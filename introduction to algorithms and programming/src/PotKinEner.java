import java.util.Scanner;

public class PotKinEner {
    // Klavyeden kütlesi, hızı ve yerden yüksekliği girilen maddenin potansiyel ve kinetik enerjisini hesaplayan program

    public static void main(String[] args) {

        double m, v, h, ek, ep;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kütle girin: ");
        m = scanner.nextDouble();
        System.out.println("Hız girin: ");
        v = scanner.nextDouble();
        System.out.println("Yükseklik girin: ");
        h = scanner.nextDouble();

        ep = m*9.8*h;
        ek = m*Math.pow(v, 2)/2;
        System.out.println("Potansiyel enerji: " + ep);
        System.out.println("Kinetik enerji: " + ek);

    }

}
