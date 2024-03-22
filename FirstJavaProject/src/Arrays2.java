public class Arrays2 {


    public static void main(String[] args){

        double[] myList = {10.2, 20.3, 30.6, 40.5, 50.7};

        double total = 0;

        double max = myList[0];

        for (double number:myList){
            if (max < number){
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println("Result: " + total);
        System.out.println("Largest number: " + max);


        //Multidimensional Arrays

        String[][] cities = new String[3][3];

        cities[0][0] = "Ankara";
        cities[0][1] = "Bolu";
        cities[0][2] = "Sakarya";
        cities[1][0] = "Kocaeli";
        cities[1][1] = "Eskişehir";
        cities[1][2] = "İstanbul";
        cities[2][0] = "Sivas";
        cities[2][1] = "Rize";
        cities[2][2] = "Muğla";

        for (int i = 0; i <= 2; i++){

            System.out.println("---------------");
            for (int j = 0; j <= 2; j++){
                System.out.println(cities[i][j]);
            }

        }

    }

}
