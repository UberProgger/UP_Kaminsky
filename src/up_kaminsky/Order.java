/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package up_kaminsky;

class Order
{
  private int number;
  private String delivery_per;
  private int cost;
  private String payment;

  public void setNumber(int number){
    this.number = number;
  }
  public int getNumber(){
    return number;
  }
  public void setDelivery_per(String delivery_per){
    this.delivery_per = delivery_per;
  }
  public String getDelivery_per(){
    return delivery_per;
  }
  public void setCost(int cost){
    this.cost = cost;
  }
  public int getCost(){
    return cost;
  }
  public void setPayment(String payment){
    this.payment = payment;
  }
  public String getPayment(){
    return payment;
  }

  public void printInformation(){
      System.out.println("Номер доставки: " + number);
      System.out.println("Дата доставки курьером: " + delivery_per);
      System.out.println("Цена: " + cost);
      System.out.println("Способ оплаты: " + payment);

    }

}
