import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize notu giriniz: ");
        int vize = scanner.nextInt();

        System.out.println("Final notu giriniz: ");
        int f_inal = scanner.nextInt();

        double result = (vize * 0.4) + (f_inal * 0.6);

        System.out.println("Ortalama: " + result);

        if (result>85) {

            System.out.println("AA");
        }
        else if (result<85 && result>80) {

            System.out.println("BA");
        }
        else if (result<80 && result>75) {

            System.out.println("BB");
        }
        else if (result<75 && result>65) {

            System.out.println("CB");
        }
        else if (result<65 && result>60) {

            System.out.println("CC");
        }
        else if (result<60&& result>55) {

            System.out.println("CD");
        }
        else if (result<55 && result>50) {

            System.out.println("DD");
        }
        else{
            System.out.println("FF");
        }

    }
}