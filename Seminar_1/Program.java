package Seminar_1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args) {
        ArrayList <Product> myList = new ArrayList<>();
        myList.add(new Food("Twix", 230, 1340, new GregorianCalendar(2023, 10, 4, 0, 0), 0));
        myList.add(new Food("Mars", 180, 238, new GregorianCalendar(2023, 10, 7, 0, 0), 0));
        myList.add(new Food("Snicers", 230, 759, new GregorianCalendar(2023, 11, 2, 0, 0), 0));
        myList.add(new Beverage("Sprite", 250, 100, new GregorianCalendar(2023, 10, 4, 0, 0), 0.33));
        myList.add(new Beverage("Pepsi", 480, 250, new GregorianCalendar(2023, 10, 7, 0, 0), 0.5));
        myList.add(new Hot_beverage("Latte", 1450, 15, new GregorianCalendar(2023, 11, 2, 0, 0), 0.4, 80));
        myList.add(new Hot_beverage("Espresso", 1360, 12, new GregorianCalendar(2023, 10, 4, 0, 0), 0.4, 95));
        myList.add(new Beverage("Apple juice", 1230, 84, new GregorianCalendar(2023, 10, 7, 0, 0), 1));
        Automat list = new Automat();
        list.initProduct(myList);

        Hot_automat hot_list = new Hot_automat();
        hot_list.initProduct(myList);

        String name = "Latte";
        System.out.println(list.getProduct(name).toString());

    }
}
