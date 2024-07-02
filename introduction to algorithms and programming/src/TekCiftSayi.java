import java.util.Scanner;

public class TekCiftSayi {
    //Girilen tam sayının tek mi çift mi olduğunu bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tam sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println(sayi + " sayısı çifttir");
        }else {
            System.out.println(sayi + " sayısı tektir");
        }

    }

}
