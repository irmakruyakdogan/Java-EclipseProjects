public class MainMethods2 {

    public static void main(String[] args) {
        int number = addition(15, 16);
        System.out.println(number);

        int result = addition(1, 2, 3, 5, 8, 54);
        System.out.println(result);
    }

    public static int addition(int... numbers){
        int result = 0;
        for (int number : numbers){
            result += number;
        }
        return result;
    }

}
