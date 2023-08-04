package Seminar_2.delivery;

import java.util.Calendar;

public abstract class Product {
    private int ID;
    private String name;
    private int price;
    private int quantity; 
    private Calendar bestBefore;
    
    public Product (int id, String name, int price, int quantity, Calendar bestBefore) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
   }
   public int getID() {
    return ID;
   }

   public String getName() {
    return name;
   }
   
   public int getPrice() {
       return price;
   }

   public int getQuantity() {
       return quantity;
   }

   public Calendar getBestBefore() {
       return bestBefore;
   }

   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }
}
