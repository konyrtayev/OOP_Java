package Seminar_2;

import java.util.ArrayList;

import Seminar_2.buyer.Add_Order;
import Seminar_2.delivery.Product;

public class main {
    public static void main(String[] args) {

        ArrayList <Product> list_products = new ArrayList<>();

        list_products = new BaseProduct().getBase();
        new Add_Order().getList_order(list_products);
    }
    
}
