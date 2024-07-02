import java.util.Scanner;

public class TamKatSayi {
    //Klavyeden girilen a sayısının yine klavyeden girilen b sayısına tam bölünüp bölünmediğini veren program

    public static void main(String[] args) {

        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir a sayısı girin: ");
        a = scanner.nextDouble();
        System.out.println("Bir b sayısı girin: ");
        b = scanner.nextDouble();

        if (a % b == 0){
            System.out.println(a + " sayısı " + b + " sayısına tam bölünür");
        } else{
            System.out.println(a + " sayısı " + b + " sayısına tam bölünmez");
        }

    }
}
