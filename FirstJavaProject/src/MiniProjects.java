import java.util.ArrayList;
import java.util.Scanner;

public class MiniProjects {

    public static void main(String[] args){

        //Girilen sayının asal olup olmadığını bulma

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        boolean asal = true;

        if (sayi <= 1){
            System.out.println(sayi + " asal değil");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
            }
        }
        if (asal) {
            System.out.println(sayi + " asaldır");
        }
        else {
            System.out.println(sayi + " asal değildir");
        }



        //Girilen ünlü harfin ince veya kalın sesli olup olmadığını bulma

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ünlü harf giriniz: ");
        String harf = scanner.next();

        if ("eiöü".contains(harf)){
            System.out.println(harf + " ince seslidir");
        }
        else {
            System.out.println(harf + " kalın seslidir");
        }

         */



         //Mükemmel sayı
        // 6 -> 1,2,3

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int result = 0;

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                result += i;
            }
        }
        if (result == number){
            System.out.println(number + " mükemmel sayıdır");
        } else {
            System.out.println(number + " mükemmel sayı değildir");
        }

         */



        //Arkadaş sayılar

        int sayi_1 = 220;
        int sayi_2 = 284;
        int toplam_1 = 0;
        int toplam_2 = 0;

        for (int i = 1; i < sayi_1; i++){
            if (sayi_1 % i == 0){
                toplam_1 += i;
            }
        }
        for (int i = 1; i < sayi_2; i++){
            if (sayi_2 % i == 0){
                toplam_2 += i;
            }
        }
        if ( sayi_1 == toplam_2 && sayi_2 == toplam_1){
            System.out.println("Bu sayılar arkadaştır");
        }
        else{
            System.out.println("Bu sayılar arkadaş değildir");
        }



        //Aranacak sayı

        /*int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6};
        int aranacak = 3;
        boolean result = false;

        for (int sayi : numbers){
            if (sayi == aranacak){
                result = true;
                break;
            }
        }
        if (result){
            System.out.println("sayı mevcut");
        }
        else {
            System.out.println("sayı mevcut değil");
        }

         */
        


        for (int i = 2; i >-1; i--) {
            switch (i){
                case 0:System.out.print("K");
                case 1:System.out.print("L");
                default:System.out.print("M"); }
        }



        System.out.println((1+(int)(Math.random()*100)));

    }

}
