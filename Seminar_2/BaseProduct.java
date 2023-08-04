package Seminar_2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import Seminar_2.delivery.Beverage;
import Seminar_2.delivery.Food;
import Seminar_2.delivery.Hot_beverage;
import Seminar_2.delivery.Product;



public class BaseProduct {

    public ArrayList <Product> getBase(){
        ArrayList <Product> myList = new ArrayList<>();
        myList.add(new Food(324, "Twix", 230, 1340, new GregorianCalendar(2023, 10, 4, 0, 0), 40));
        myList.add(new Food(534, "Mars", 180, 238, new GregorianCalendar(2023, 10, 7, 0, 0), 40));
        myList.add(new Food(645, "Snicers", 230, 759, new GregorianCalendar(2023, 11, 2, 0, 0), 120));
        myList.add(new Beverage(124, "Sprite", 250, 100, new GregorianCalendar(2023, 10, 4, 0, 0), 0.33));
        myList.add(new Beverage(432, "Pepsi", 480, 250, new GregorianCalendar(2023, 10, 7, 0, 0), 0.5));
        myList.add(new Hot_beverage(542, "Latte", 1450, 15, new GregorianCalendar(2023, 11, 2, 0, 0), 0.4, 80));
        myList.add(new Hot_beverage(644, "Espresso", 1360, 12, new GregorianCalendar(2023, 10, 4, 0, 0), 0.4, 95));
        myList.add(new Beverage(746, "Apple juice", 1230, 84, new GregorianCalendar(2023, 10, 7, 0, 0), 1));
        return myList;
        
    }
    
}
