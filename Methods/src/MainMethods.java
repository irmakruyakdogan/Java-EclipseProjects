//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainMethods {
    public static void main(String[] args) {
        numberFind();
    }

    public static void numberFind(){
        int[] numbers = new int[]{0, 1, 2, 3, 4};
        int finding = 1;
        boolean isThere = false;

        for (int number : numbers){
            if (number == finding){
                isThere = true;
                break;
            }
        }
        if (isThere){
            System.out.println("Number is available");
        } else {
            System.out.println("Number is not available");
        }
    }

}