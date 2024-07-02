import java.util.Scanner;

public class TamBolenSayi {
    //Klavyeden girilen pozitif bir a tamsayısının tam bölenlerini hesaplayıp listeleyen program
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tamsayı girin: ");
        a = scanner.nextInt();

        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }

    }
}
