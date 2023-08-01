package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Automat {

    List<Product> listProduct = new ArrayList<>();

    public void initProduct(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product el : listProduct) {
            if (el.getName().equals(name)) {
                return el;
            }
        }
        return null;
    }

    public Order createOrder(ArrayList<Product> shoppingList){
        return null;
    }
    
}
