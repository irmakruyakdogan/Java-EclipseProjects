public class MainOver {

    public static void main (String[] args) {

        //OgretmenCreditManager ogretmenCreditManager = new OgretmenCreditManager();
        //System.out.println(ogretmenCreditManager.calculate(2500));

        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new OgretmenCreditManager(), new TarimCreditManager()};
        for (BaseCreditManager creditManager : creditManagers){
            System.out.println(creditManager.calculate(2500));
        }
    }

}
