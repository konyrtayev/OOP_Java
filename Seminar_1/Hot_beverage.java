package Seminar_1;

import java.util.Calendar;

public class Hot_beverage extends Beverage {

    private int temperature;

    public Hot_beverage(String name, int price, int quantity, Calendar best_before, double volume, int temperature){
        super(name, price, quantity, best_before, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\n"+getName() + " Цена: " + getPrice() + " Количество: " + getQuantity() + " Объем: " + getVolume() + " Температура: " + getTemperature() + " Годен до: " + getBestBefore().get(Calendar.DAY_OF_MONTH) + "." + getBestBefore().get(Calendar.MONTH) + "." + getBestBefore().get(Calendar.YEAR);
    }
    
}
