import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        CreditCard card = new CreditCard("Yinlimu","HSBC","1-2-3333",10000,10000);
        System.out.println(card.getCustomer());

        CreditCard card2 = new CreditCard("Sunny","AmericanExpress","6-66-6666",10000,10000);
        System.out.println(card2.getCustomer());
        System.out.println(card2.getBalance());
        card2.makePayment(10001);
        card2.makePayment(1000);
        System.out.println(card2.getBalance());
    }
}
