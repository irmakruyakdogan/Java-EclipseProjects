//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
         */

        ICustomerDal customerDal = new OracleCustomerDal();

    }
}