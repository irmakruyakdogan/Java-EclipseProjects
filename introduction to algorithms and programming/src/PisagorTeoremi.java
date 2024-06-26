import java.util.Scanner;

public class PisagorTeoremi {
    // Klavyeden iki dik kenarı girilen dik üçgenin hipotenüsünü hesaplayan program

    public static void main(String[] args) {

        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci dik kenarı girin: ");
        a = scanner.nextDouble();
        System.out.println("İkinci dik kenarı girin: ");
        b = scanner.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("\nHipotenüs: %.2f", c);

    }

}
