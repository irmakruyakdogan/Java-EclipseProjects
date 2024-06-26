import java.util.Scanner;

public class UcgeninAlaniSin {

    // Klavyeden iki kenarı ve derece cinsinden aradaki açısı girilen üçgenin alanını hesaplayan program
    public static void main(String[] args) {

        double a, b, aci, alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a kenarı giriniz: ");
        a = scanner.nextDouble();
        System.out.println("b kenarı giriniz: ");
        b = scanner.nextDouble();
        System.out.println("İki kenar arasındaki açıyı giriniz: ");
        aci = scanner.nextDouble();

        alan = a * b * Math.sin(Math.toRadians(aci)) / 2;
        System.out.printf("\nÜçgenin alanı: %.2f\n", alan);
    }
}
