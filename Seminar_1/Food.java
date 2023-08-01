package Seminar_1;

import java.util.Calendar;

public class Food extends Product {
    
    private double weight;

    public Food (String name, int price, int quantity, Calendar bestBefore, double weight) {
    super(name, price, quantity, bestBefore);
    this.weight = weight;
   }
   public double getWeight() {
    return weight;
   }

   @Override
    public String toString() {
        return "\n"+getName() + " Цена: " + getPrice() + " Количество: " + getQuantity() + " Объем: " + getWeight() + " Годен до: " + getBestBefore().get(Calendar.DAY_OF_MONTH) + "." + getBestBefore().get(Calendar.MONTH) + "." + getBestBefore().get(Calendar.YEAR);
    }

}
