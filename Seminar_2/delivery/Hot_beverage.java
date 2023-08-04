package Seminar_2.delivery;

import java.util.Calendar;

public class Hot_beverage extends Beverage {

    private int temperature;

    public Hot_beverage(int id, String name, int price, int quantity, Calendar best_before, double volume, int temperature){
        super(id, name, price, quantity, best_before, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\n" + "ID: " +getID() + " Товар: " + getName() + " Цена: " + getPrice() + " Количество: " + getQuantity() + " Объем: " + getVolume() + " Температура: " + getTemperature() + " Годен до: " + getBestBefore().get(Calendar.DAY_OF_MONTH) + "." + getBestBefore().get(Calendar.MONTH) + "." + getBestBefore().get(Calendar.YEAR);
    }
    
}
