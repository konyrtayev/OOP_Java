package Seminar_4;

import java.util.ArrayList;
import java.util.Scanner;

import Seminar_4.buyer.Add_Order;
import Seminar_4.equipment.AddProduct;
import Seminar_4.equipment.Automat;
import Seminar_4.equipment.Hot_automat;
import Seminar_4.shipment.Product;

public class main {
    public static void main(String[] args) {

        ArrayList <Product> list_hot = new ArrayList<>();
        ArrayList <Product> list_food = new ArrayList<>();
        list_food = new Automat().getFood();                                        // Загрузка базы продуктов автомата
        list_hot = new Hot_automat().getHotBeverrage();                             // Загрузка базы продуктов автомата с горячими напитками

        Scanner scan = new Scanner(System.in);
        int idCommand;
        while (true) {
            System.out.print("Для покупок нажмите любую цифру: ");
            idCommand = scan.nextInt();
            scan.nextLine();
            if (idCommand == 548620){                                               // Переход в скрытое меню добавления товара в автомат
                System.out.println("Добавление товара в автомат\n");
                new AddProduct().AddEquipment(list_hot, list_food);
            }
            else {
                new Add_Order().getList_order(list_hot, list_food);               // Передача базы продуктов для оформления заказа    
            }
        }
    }
}
