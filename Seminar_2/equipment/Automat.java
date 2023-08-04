package Seminar_2.equipment;

import java.util.ArrayList;

import Seminar_2.delivery.Product;

public class Automat {
    
    public Product findProduct(ArrayList<Product> list_products, String name){
        for (Product el : list_products){
            if (el.getName().equals(name)){
                return el;
            }
        }
        return null;
    }
}
