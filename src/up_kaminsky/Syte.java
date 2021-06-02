/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package up_kaminsky;

public class Syte
{
    private String domen = "https://bsu.edu.ru";
    private String link = "www.shop.ru";
    private String all_information;
    
    public void all_information(){
        all_information = domen + "_" + link;
    }
    
    public void printAboutObject(){
        
    }
    public void printInformation(){
      System.out.println("Вся информация: " + all_information);
    }
}
