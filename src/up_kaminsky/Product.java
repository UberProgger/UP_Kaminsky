/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package up_kaminsky;

public class Product
{
    private String name;
    private double price = 5500.5;
    private int quantity;
    private boolean avalbility;
    private double discount;
    Person person = new Person();
    double sum = person.getBuy_sum();

    public void discount(){
      if(sum >= 5000){
        discount = (price * 98) / 100;
      }
      else 
        discount = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity; 
    }
    
    public int getQuantity(){
        return quantity;
    }

    public void setAvalbility(boolean avalbility){
        this.avalbility = avalbility; 
    }
    
    public boolean getAvalbility(){
        return avalbility;
    }

    public void printInformation(){
      System.out.println("Наименование продукта: " + name);
      System.out.println("Скидка: " + discount);
      System.out.println("Количество: " + quantity);
      System.out.println("Доступность: " + avalbility);
    }
}
