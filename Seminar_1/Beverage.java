package Seminar_1;

import java.util.Calendar;

public class Beverage extends Product {
    
    private double volume;

    public Beverage (String name, int price, int quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "\n"+getName() + " Цена: " + getPrice() + " Количество: " + getQuantity() + " Объем: " + getVolume() + " Годен до: " + getBestBefore().get(Calendar.DAY_OF_MONTH) + "." + getBestBefore().get(Calendar.MONTH) + "." + getBestBefore().get(Calendar.YEAR);
    }
    
}
