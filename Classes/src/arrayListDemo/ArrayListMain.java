package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayListMain {

    public static void main(String[] args){

        /*ArrayList numbers = new ArrayList();
        numbers.add(5);
        numbers.add(8);
        numbers.add("Sivas");
        //System.out.println(numbers.size());
        //System.out.println(numbers.get(2));
        //numbers.set(1,56);

        /*numbers.remove(0);
        numbers.clear();
        System.out.println(numbers.get(1));


        for (Object i:numbers){
            System.out.println(i);
        }
         */
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Sivas");
        cities.add("Ankara");
        cities.add("Bolu");

        Collections.sort(cities);

        for (String i:cities){
            System.out.println(i);
        }

    }

}
