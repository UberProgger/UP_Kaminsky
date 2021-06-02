/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package up_kaminsky;

public class Person
{
    protected int buy_sum;
    private String dateOfBirth;
    private String fullName;
    private String email;
    private String adress;
    private boolean privilege = true;
    
    public void setBuy_sum(int buy_sum){
        this.buy_sum = buy_sum;
    }
    
    public int getBuy_sum(){
        return buy_sum;
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return fullName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }

    public void Privilege(){
      if(buy_sum > 5000){
        privilege = true;
      }
      else 
        privilege = false; 
    }

    public void printInformation(){
      System.out.println("ФИО заказчика: " + fullName);
      System.out.println("Сумма: " + buy_sum);
      System.out.println("Дата рождения: " + dateOfBirth);
      System.out.println("Email: " + email);
      System.out.println("Адрес: " + adress);
      System.out.println("Постоянный клиент: " + privilege);
    }
}
