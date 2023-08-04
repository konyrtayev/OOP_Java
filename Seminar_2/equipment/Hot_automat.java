package Seminar_2.equipment;

import java.util.ArrayList;

import Seminar_2.delivery.Hot_beverage;
import Seminar_2.delivery.Product;

public class Hot_automat extends Automat {

    public Product findProduct(ArrayList<Product> list_products, String name, double volume, int temperature){
        for (Product el : list_products){
            if (el instanceof Hot_beverage){
                if ((((Hot_beverage) el).getName().equals(name))&&(((Hot_beverage) el).getVolume() == (volume))&&(((Hot_beverage) el).getTemperature() == temperature)){
                    return el;
                }
            }
        }
        return null;
    }
    
}
