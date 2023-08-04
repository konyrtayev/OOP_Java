package Seminar_2.delivery;

import java.util.Calendar;

public class Food extends Product{
    
    private double weight;

    public Food (int id, String name, int price, int quantity, Calendar bestBefore, double weight) {
    super(id, name, price, quantity, bestBefore);
    this.weight = weight;
   }
   public double getWeight() {
    return weight;
   }

   @Override
    public String toString() {
        return "\n" + "ID: " +getID() + " Товар: " + getName() + " Цена: " + getPrice() + " Количество: " + getQuantity() + " Объем: " + getWeight() + " Годен до: " + getBestBefore().get(Calendar.DAY_OF_MONTH) + "." + getBestBefore().get(Calendar.MONTH) + "." + getBestBefore().get(Calendar.YEAR);
    }
    
}
