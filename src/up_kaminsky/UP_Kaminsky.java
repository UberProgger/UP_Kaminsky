
package up_kaminsky;


public class UP_Kaminsky {

    public static void main(String[] args) {
    Managere manager = new Managere();
    manager.setName("Vasya");
    manager.printInformation();
    
    Courier courier = new Courier();
    courier.setDel_place("Belgorod");
    courier.setDel_terms("12 of april");
    courier.setName("Oleg");
    courier.setPhone(6575);
    courier.printInformation();

    Order order = new Order();
    order.setNumber(243242);
    order.setDelivery_per("Belgorod");
    order.setDelivery_per("22 of april");
    order.setCost(55566);
    order.setPayment("Card");
    order.printInformation();

    Person person = new Person();
    person.setBuy_sum(55555);
    person.setDateOfBirth("22 01 1988");
    person.setFullName("Mongol Oleg Antonovich");
    person.setEmail("mongol@mail.ru");
    person.setAdress("Belgorod");
    person.Privilege();
    person.printInformation();

    Syte syte = new Syte();
    syte.all_information();
    syte.printInformation();

    Product product = new Product();
    product.setName("Refregetaor");
    product.discount();
    product.setQuantity(25);
    product.setAvalbility(true);
    product.printInformation();

  }
}
